<?php
namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Pasien extends Model
{
    use HasFactory;

    protected $table = 'pasien';
    protected $primaryKey = 'id_pasien';
    protected $fillable = ['nama', 'alamat', 'no_telepon', 'tanggal_lahir', 'jenis_kelamin'];

    public function kunjungan()
    {
        return $this->hasMany(Kunjungan::class, 'id_pasien', 'id_pasien');
    }
}