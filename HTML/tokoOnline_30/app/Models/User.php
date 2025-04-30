<?php

namespace App\Models;

// use Illuminate\Contracts\Auth\MustVerifyEmail;
use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Foundation\Auth\User as Authenticatable;
use Illuminate\Notifications\Notifiable;
use Illuminate\Database\Eloquent\Model;

class User
{
    /** @use HasFactory<\Database\Factories\UserFactory> */
    use HasFactory, Notifiable;

    /**
     * The attributes that are mass assignable.
     *
     * @var list<string>
     */
    protected $fillable = [
        'name',
        'email',
        'password',
    ];

    /**
     * The attributes that should be hidden for serialization.
     *
     * @var list<string>
     */
    protected $hidden = [
        'password',
        'remember_token',
    ];

    /**
     * Get the attributes that should be cast.
     *
     * @return array<string, string>
     */
    protected function casts(): array
    {
        return [
            'email_verified_at' => 'datetime',
            'password' => 'hashed',
        ];
    }
    
    public static function all()
    {
        return session('users', []);
    }

    public static function create($data)
    {
        $users = session('users', []);

        // Cek apakah email sudah ada dalam daftar user
        foreach ($users as $user) {
            if (strtolower($user['email']) === strtolower($data['email'])) {
                return response()->json(['message' => 'Email telah Tersedia !'], 400);
            }
        }

        $users = session('users', []); 
        $data['id'] = count($users) + 1; 
        $users[] = $data; 
        session(['users' => $users]); 

        return $data;
    }

}
