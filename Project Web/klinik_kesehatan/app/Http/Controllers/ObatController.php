<?php
namespace App\Http\Controllers;

use App\Models\Obat;
use Illuminate\Http\Request;

class ObatController extends Controller
{
    public function __construct()
    {
        $this->middleware('auth');
        // $this->middleware('role:admin');
    }

    public function index()
    {
        $obat = Obat::all();
        return view('obat.index', compact('obat'));
    }

    public function create()
    {
        return view('obat.create');
    }

    public function store(Request $request)
    {
        $request->validate([
            'nama_obat' => 'required|string|max:255',
            'stok' => 'required|integer|min:0',
            'harga' => 'required|numeric|min:0',
        ]);

        Obat::create($request->all());
        return redirect()->route('obat.index')->with('success', 'Obat berhasil ditambahkan.');
    }

    public function show(Obat $obat)
    {
        return view('obat.show', compact('obat'));
    }

    public function edit(Obat $obat)
    {
        return view('obat.edit', compact('obat'));
    }

    public function update(Request $request, Obat $obat)
    {
        $request->validate([
            'nama_obat' => 'required|string|max:255',
            'stok' => 'required|integer|min:0',
            'harga' => 'required|numeric|min:0',
        ]);

        $obat->update($request->all());
        return redirect()->route('obat.index')->with('success', 'Obat berhasil diperbarui.');
    }

    public function destroy(Obat $obat)
    {
        $obat->delete();
        return redirect()->route('obat.index')->with('success', 'Obat berhasil dihapus.');
    }
}