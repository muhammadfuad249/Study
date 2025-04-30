<?php

use App\Http\Controllers\MenuController;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\CustomerController;
use App\Http\Controllers\OrderController;

Route::get('/', [MenuController::class,'index']);

Route::resource('menus', MenuController::class);
Route::resource('orders', OrderController::class);
Route::resource('customers', CustomerController::class);
