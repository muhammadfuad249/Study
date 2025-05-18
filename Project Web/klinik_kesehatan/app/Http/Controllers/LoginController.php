<?php
     namespace App\Http\Controllers\Auth;

     use App\Http\Controllers\Controller;
     use Illuminate\Foundation\Auth\AuthenticatesUsers;

     class LoginController extends Controller
     {
         use AuthenticatesUsers;

         protected $redirectTo = '/dashboard';

         public function __construct()
         {
             $this->middleware('guest')->except('logout');
         }

         public function login(Request $request)
        {
            dd($request->all()); // Debugging
            return parent::login($request);
        }

         protected function authenticated(Request $request, $user)
         {
             // Custom logic after authentication
             return redirect()->intended($this->redirectTo);
         }

         protected function loggedOut(Request $request)
         {
             // Custom logic after logout
             return redirect('/login');
         }
         protected function validateLogin(Request $request)
         {
             $this->validate($request, [
                 $this->email() => 'required|string',
                 'password' => 'required|string',
             ]);
         }
     }