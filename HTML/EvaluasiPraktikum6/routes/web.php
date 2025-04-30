<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UserController; 
use App\Http\Controllers\ProductController; 
use App\Http\Controllers\BeliController; 

Route::get('/', function () {
    return view('welcome');
});
Route::post('register', [UserController::class, 'register']); 
Route::get('users', [UserController::class, 'index']); 
Route::post('products', [ProductController::class, 'store']); 
Route::get('products', [ProductController::class, 'index']); 
Route::post('belis', [BeliController::class, 'store']); 
Route::get('belis', [BeliController::class, 'index']);
Route::get('products/{id}', [ProductController::class, 'show']);
Route::get('users/{id}', [UserController::class, 'showById']);
Route::get('users/email/{email}', [UserController::class, 'showByEmail']);
Route::delete('users/{id}', [UserController::class, 'destroy']);
Route::delete('products/{id}', [ProductController::class, 'destroy']);
Route::delete('belis/{id}', [BeliController::class, 'destroy']);
Route::delete('users', [UserController::class, 'destroyAll']);
Route::delete('products', [ProductController::class, 'destroyAll']);
Route::delete('belis', [BeliController::class, 'destroyAll']);
