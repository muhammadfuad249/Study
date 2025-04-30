<?php

use Illuminate\Support\Facades\Route;

// Route::get('/', function () {
//     return view('welcome');
// });
Route::get('/', function () { 
    return view('layouts.profile'); 
})->name('profile'); 
Route::get('/laboratorium', function () { 
    return view('layouts.laboratorium'); 
})->name('laboratorium'); 
Route::get('/kontak', function () { 
    return view('layouts.kontak'); 
})->name('kontak'); 
