<?php

namespace App\Http\Controllers;

use App\Models\User; 
use Illuminate\Http\Request; 
 
class UserController extends Controller 
{ 
    public function register(Request $request) 
    { 
        $request->validate([ 
            'name' => 'required|string|max:255', 
            'email' => 'required|string|email|max:255|unique:users', 
            'password' => 'required|string|min:8', 
        ]); 
 
        $user = User::create($request->only(['name', 'email', 'password'])); 
        return response()->json($user, 201); 
    } 
 
    public function index() 
    { 
        return response()->json(User::all(), 200); 
    } 
    public function showById($id)
    {
        $users = User::all();
        foreach ($users as $user) {
            if ($user['id'] == $id) {
                return response()->json($user, 200);
            }
        }
        return response()->json(['message' => 'Pengguna tidak ditemukan'], 404);
    }

    public function showByEmail($email)
    {
        $users = User::all();
        foreach ($users as $user) {
            if ($user['email'] == $email) {
                return response()->json($user, 200);
            }
        }
        return response()->json(['message' => 'Pengguna tidak ditemukan'], 404);
    }

    public function destroy($id)
    {
        $user = User::find($id);

        if (!$user) {
            return response()->json(['message' => 'User tidak ditemukan!'], 404);
        }

        $user->delete();

        return response()->json(['message' => 'User berhasil dihapus'], 200);
    }

    public function destroyAll()
    {
        User::truncate(); // Menghapus semua data dalam tabel users

        return response()->json(['message' => 'Semua pengguna berhasil dihapus'], 200);
    }

} 