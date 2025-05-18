<?php
namespace App\Http\Controllers;

use App\Models\Kunjungan;
use App\Models\Pasien;
use App\Models\Dokter;
use Illuminate\Http\Request;
use Barryvdh\Dompdf\Facade\Pdf;

class KunjunganController extends Controller
{
    public function __construct()
    {
        $this->middleware('auth');
        // $this->middleware('role:admin,resepsionis,dokter');
    }

    public function index()
    {
        $kunjungan = Kunjungan::with(['pasien', 'dokter'])->get();
        return view('kunjungan.index', compact('kunjungan'));
    }

    public function create()
    {
        $pasien = Pasien::all();
        $dokter = Dokter::all();
        return view('kunjungan.create', compact('pasien', 'dokter'));
    }

    public function store(Request $request)
    {
        $request->validate([
            'id_pasien' => 'required|exists:pasien,id_pasien',
            'id_dokter' => 'required|exists:dokter,id_dokter',
            'tanggal_kunjungan' => 'required|date',
            'diagnosa' => 'nullable|string',
            'status' => 'required|in:Menunggu,Selesai',
        ]);

        Kunjungan::create($request->all());
        return redirect()->route('kunjungan.index')->with('success', 'Kunjungan berhasil ditambahkan.');
    }

    public function show(Kunjungan $kunjungan)
    {
        $kunjungan->load(['pasien', 'dokter']);
        return view('kunjungan.show', compact('kunjungan'));
    }

    public function edit(Kunjungan $kunjungan)
    {
        $pasien = Pasien::all();
        $dokter = Dokter::all();
        return view('kunjungan.edit', compact('kunjungan', 'pasien', 'dokter'));
    }

    public function update(Request $request, Kunjungan $kunjungan)
    {
        $request->validate([
            'id_pasien' => 'required|exists:pasien,id_pasien',
            'id_dokter' => 'required|exists:dokter,id_dokter',
            'tanggal_kunjungan' => 'required|date',
            'diagnosa' => 'nullable|string',
            'status' => 'required|in:Menunggu,Selesai',
        ]);

        $kunjungan->update($request->all());
        return redirect()->route('kunjungan.index')->with('success', 'Kunjungan berhasil diperbarui.');
    }

    public function destroy(Kunjungan $kunjungan)
    {
        $kunjungan->delete();
        return redirect()->route('kunjungan.index')->with('success', 'Kunjungan berhasil dihapus.');
    }

    public function laporan()
    {
        $kunjungan = Kunjungan::with(['pasien', 'dokter'])->get();
        $pdf = Pdf::loadView('kunjungan.laporan', compact('kunjungan'));
        return $pdf->download('laporan_kunjungan.pdf');
    }
}