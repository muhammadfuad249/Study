<?php 

use App\Http\Controllers\DashboardController;
use App\Http\Controllers\PasienController;
use App\Http\Controllers\DokterController;
use App\Http\Controllers\ObatController;
use App\Http\Controllers\KunjunganController;
use App\Http\Controllers\ResepController;
use Illuminate\Support\Facades\Route;
use Illuminate\Support\Facades\Auth;

Route::get('/', function () {
    return redirect()->route('dashboard');
});

// Route::get('/', function () {
//     return Auth::check() ? redirect()->route('dashboard') : redirect()->route('login');
// });

Auth::routes();

Route::middleware('auth')->group(function () {
    Route::get('/dashboard', [DashboardController::class, 'index'])->name('dashboard');
    Route::resource('pasien', PasienController::class);
    Route::resource('dokter', DokterController::class);
    Route::resource('obat', ObatController::class);
    Route::resource('kunjungan', KunjunganController::class);
    Route::resource('resep', ResepController::class);
    Route::get('/kunjungan/laporan', [KunjunganController::class, 'laporan'])->name('kunjungan.laporan');
});

// use App\Http\Controllers\DashboardController;
// use App\Http\Controllers\PasienController;
// use App\Http\Controllers\DokterController;
// use App\Http\Controllers\ObatController;
// use App\Http\Controllers\KunjunganController;
// use App\Http\Controllers\ResepController;
// use Illuminate\Support\Facades\Route;
// use Illuminate\Support\Facades\Auth;

// Route::get('/', function () {
//     return redirect()->route('dashboard');
// });

// // Route::get('/', function () {
// //     return Auth::check() ? redirect()->route('dashboard') : redirect()->route('login');
// // });

// Auth::routes();

// Route::middleware('auth')->group(function () {
//     Route::get('/dashboard', [DashboardController::class, 'index'])->name('dashboard');
//     Route::resource('pasien', PasienController::class);
//     Route::resource('dokter', DokterController::class)->middleware('role:admin');
//     Route::resource('obat', ObatController::class)->middleware('role:admin');
//     Route::resource('kunjungan', KunjunganController::class)->middleware('role:admin,resepsionis,dokter');
//     Route::resource('resep', ResepController::class)->middleware('role:admin,dokter');
//     Route::get('/kunjungan/laporan', [KunjunganController::class, 'laporan'])->name('kunjungan.laporan');
// });
    //  use App\Http\Controllers\DashboardController;
    //  use App\Http\Controllers\PasienController;
    //  use App\Http\Controllers\DokterController;
    //  use App\Http\Controllers\ObatController;
    //  use App\Http\Controllers\KunjunganController;
    //  use App\Http\Controllers\ResepController;
    //  use App\Http\Controllers\RegisterController;
    //  use Illuminate\Support\Facades\Route;
    //  use Illuminate\Support\Facades\Auth;

    //  Route::get('/', function () {
    //     // dd('Auth check: ' . (Auth::check() ? 'Logged in as ' . Auth::user()->email : 'Not logged in'));
    //     return Auth::check() ? redirect()->route('dashboard') : redirect()->route('login');
    // });

    //  Auth::routes();
    // //  Route::get('/test-register', function () {
    // //     return 'Register route test';
    // // })->name('register.create');

    //  Route::middleware('auth')->group(function () {
    //      Route::get('/dashboard', [DashboardController::class, 'index'])->name('dashboard');
    //      Route::resource('pasien', PasienController::class);
    //      Route::resource('dokter', DokterController::class)->middleware('role:admin');
    //      Route::resource('obat', ObatController::class)->middleware('role:admin');
    //      Route::resource('kunjungan', KunjunganController::class)->middleware('role:admin,resepsionis,dokter');
    //      Route::resource('resep', ResepController::class)->middleware('role:admin,dokter');
    //      Route::get('/kunjungan/laporan', [KunjunganController::class, 'laporan'])->name('kunjungan.laporan');
    //      Route::get('/register', [RegisterController::class, 'create'])->name('register.create');
    //      Route::post('/register', [RegisterController::class, 'store'])->name('register.store');
    //  }); -->
// use App\Http\Controllers\DashboardController;
// use App\Http\Controllers\PasienController;
// use App\Http\Controllers\DokterController;
// use App\Http\Controllers\ObatController;
// use App\Http\Controllers\KunjunganController;
// use App\Http\Controllers\ResepController;
// use Illuminate\Support\Facades\Route;

// Route::get('/', function () {
//     return redirect()->route('dashboard');
// });

// Auth::routes();

// Route::get('/dashboard', [DashboardController::class, 'index'])->name('dashboard');

// Route::resource('pasien', PasienController::class);
// // Route::resource('dokter', DokterController::class)->middleware('role:admin');
// // Route::resource('obat', ObatController::class)->middleware('role:admin');
// // Route::resource('kunjungan', KunjunganController::class);
// // Route::resource('resep', ResepController::class);
// Route::get('/kunjungan/laporan', [KunjunganController::class, 'laporan'])->name('kunjungan.laporan');
// Route::resource('dokter', DokterController::class)->middleware('role:admin');
// Route::resource('obat', ObatController::class)->middleware('role:admin');
// Route::resource('kunjungan', KunjunganController::class)->middleware('role:admin,resepsionis,dokter');
// Route::resource('resep', ResepController::class)->middleware('role:admin,dokter');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');
