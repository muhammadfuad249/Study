<?php
namespace App\Http\Controllers;

use App\Models\Resep;
use App\Models\Kunjungan;
use App\Models\Obat;
use Illuminate\Http\Request;

class ResepController extends Controller
{
    public function __construct()
    {
        $this->middleware('auth');
        // $this->middleware('role:admin,dokter');
    }

    public function index()
    {
        $resep = Resep::with(['kunjungan.pasien', 'obat'])->get();
        return view('resep.index', compact('resep'));
    }

    public function create()
    {
        $kunjungan = Kunjungan::all();
        $obat = Obat::all();
        return view('resep.create', compact('kunjungan', 'obat'));
    }

    public function store(Request $request)
    {
        $request->validate([
            'id_kunjungan' => 'required|exists:kunjungan,id_kunjungan',
            'id_obat' => 'required|exists:obat,id_obat',
            'jumlah' => 'required|integer|min:1',
            'keterangan' => 'nullable|string',
        ]);

        $obat = Obat::findOrFail($request->id_obat);
        if ($obat->stok < $request->jumlah) {
            return redirect()->back()->withErrors(['jumlah' => 'Stok obat tidak cukup.']);
        }

        Resep::create($request->all());
        $obat->stok -= $request->jumlah;
        $obat->save();

        return redirect()->route('resep.index')->with('success', 'Resep berhasil ditambahkan.');
    }

    public function show(Resep $resep)
    {
        $resep->load(['kunjungan.pasien', 'obat']);
        return view('resep.show', compact('resep'));
    }

    public function edit(Resep $resep)
    {
        $kunjungan = Kunjungan::all();
        $obat = Obat::all();
        return view('resep.edit', compact('resep', 'kunjungan', 'obat'));
    }

    public function update(Request $request, Resep $resep)
    {
        $request->validate([
            'id_kunjungan' => 'required|exists:kunjungan,id_kunjungan',
            'id_obat' => 'required|exists:obat,id_obat',
            'jumlah' => 'required|integer|min:1',
            'keterangan' => 'nullable|string',
        ]);

        $obat = Obat::findOrFail($request->id_obat);
        $selisih = $request->jumlah - $resep->jumlah;
        if ($selisih > 0 && $obat->stok < $selisih) {
            return redirect()->back()->withErrors(['jumlah' => 'Stok obat tidak cukup.']);
        }

        $resep->update($request->all());
        $obat->stok -= $selisih;
        $obat->save();

        return redirect()->route('resep.index')->with('success', 'Resep berhasil diperbarui.');
    }

    public function destroy(Resep $resep)
    {
        $obat = Obat::findOrFail($resep->id_obat);
        $obat->stok += $resep->jumlah;
        $obat->save();

        $resep->delete();
        return redirect()->route('resep.index')->with('success', 'Resep berhasil dihapus.');
    }
}