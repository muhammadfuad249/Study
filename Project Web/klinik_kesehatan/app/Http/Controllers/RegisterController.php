<?php
     namespace App\Http\Controllers;

     use App\Models\User;
     use Illuminate\Http\Request;
     use Illuminate\Support\Facades\Hash;

     class RegisterController extends Controller
     {
         public function __construct()
         {
             $this->middleware(['auth', 'role:admin']);
         }

         public function create()
         {
             return view('auth.register');
         }

         public function store(Request $request)
         {
             $request->validate([
                 'name' => 'required|string|max:255',
                 'email' => 'required|string|email|max:255|unique:users',
                 'password' => 'required|string|min:8|confirmed',
                 'role' => 'required|in:admin,dokter,resepsionis',
             ]);

             User::create([
                 'name' => $request->name,
                 'email' => $request->email,
                 'password' => Hash::make($request->password),
                 'role' => $request->role,
             ]);

             return redirect()->route('dashboard')->with('success', 'Akun berhasil dibuat.');
         }
     }