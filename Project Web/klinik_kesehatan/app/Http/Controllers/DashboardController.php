<?php
namespace App\Http\Controllers;

use App\Models\Pasien;
use App\Models\Kunjungan;
use App\Models\Obat;
use Illuminate\Support\Facades\Auth;

class DashboardController extends Controller
{
    public function __construct()
    {
        $this->middleware('auth');
    }

    public function index()
    {
        $totalPasien = Pasien::count();
        $totalKunjungan = Kunjungan::whereDate('tanggal_kunjungan', today())->count();
        $totalObat = Obat::sum('stok');
        $notifikasi = Kunjungan::where('status', 'Menunggu')->get();

        return view('dashboard', compact('totalPasien', 'totalKunjungan', 'totalObat', 'notifikasi'));
    }
}