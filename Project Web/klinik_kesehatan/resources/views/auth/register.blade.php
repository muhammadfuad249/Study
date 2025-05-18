@extends('layouts.app')

     @section('content')
     <div class="container">
         <div class="row justify-content-center">
             <div class="col-md-8">
                 <div class="card">
                     <div class="card-header">{{ __('Daftar Akun Baru') }}</div>

                     <div class="card-body">
                         <form method="POST" action="{{ route('register.store') }}">
                             @csrf

                             <div class="mb-3">
                                 <label for="name" class="form-label">{{ __('Nama') }}</label>
                                 <input id="name" type="text" class="form-control @error('name') is-invalid @enderror" name="name" value="{{ old('name') }}" required autofocus>
                                 @error('name')
                                     <div class="invalid-feedback">{{ $message }}</div>
                                 @enderror
                             </div>

                             <div class="mb-3">
                                 <label for="email" class="form-label">{{ __('Email') }}</label>
                                 <input id="email" type="email" class="form-control @error('email') is-invalid @enderror" name="email" value="{{ old('email') }}" required>
                                 @error('email')
                                     <div class="invalid-feedback">{{ $message }}</div>
                                 @enderror
                             </div>

                             <div class="mb-3">
                                 <label for="password" class="form-label">{{ __('Password') }}</label>
                                 <input id="password" type="password" class="form-control @error('password') is-invalid @enderror" name="password" required>
                                 @error('password')
                                     <div class="invalid-feedback">{{ $message }}</div>
                                 @enderror
                             </div>

                             <div class="mb-3">
                                 <label for="password_confirmation" class="form-label">{{ __('Konfirmasi Password') }}</label>
                                 <input id="password_confirmation" type="password" class="form-control" name="password_confirmation" required>
                             </div>

                             <div class="mb-3">
                                 <label for="role" class="form-label">{{ __('Role') }}</label>
                                 <select id="role" class="form-control @error('role') is-invalid @enderror" name="role" required>
                                     <option value="" disabled selected>Pilih Role</option>
                                     <option value="admin" {{ old('role') == 'admin' ? 'selected' : '' }}>Admin</option>
                                     <option value="dokter" {{ old('role') == 'dokter' ? 'selected' : '' }}>Dokter</option>
                                     <option value="resepsionis" {{ old('role') == 'resepsionis' ? 'selected' : '' }}>Resepsionis</option>
                                 </select>
                                 @error('role')
                                     <div class="invalid-feedback">{{ $message }}</div>
                                 @enderror
                             </div>

                             <div class="mb-0">
                                 <button type="submit" class="btn btn-primary">
                                     {{ __('Daftar') }}
                                 </button>
                             </div>
                         </form>
                     </div>
                 </div>
             </div>
         </div>
     </div>
     @endsection