<?php
     namespace Database\Seeders;

     use Illuminate\Database\Seeder;
     use App\Models\User;

     class UserSeeder extends Seeder
     {
         public function run()
         {
             User::create([
                 'name' => 'Admin',
                 'email' => 'admin@klinik.com',
                 'password' => bcrypt('password'),
                 'role' => 'admin',
             ]);
             User::create([
                 'name' => 'Dokter',
                 'email' => 'dokter@klinik.com',
                 'password' => bcrypt('password'),
                 'role' => 'dokter',
             ]);
             User::create([
                 'name' => 'Resepsionis',
                 'email' => 'resepsionis@klinik.com',
                 'password' => bcrypt('password'),
                 'role' => 'resepsionis',
             ]);
         }
     }