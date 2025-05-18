<?php
namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Kunjungan extends Model
{
    use HasFactory;

    protected $table = 'kunjungan';
    protected $primaryKey = 'id_kunjungan';
    protected $fillable = ['id_pasien', 'id_dokter', 'tanggal_kunjungan', 'diagnosa', 'status'];

    public function pasien()
    {
        return $this->belongsTo(Pasien::class, 'id_pasien', 'id_pasien');
    }

    public function dokter()
    {
        return $this->belongsTo(Dokter::class, 'id_dokter', 'id_dokter');
    }

    public function resep()
    {
        return $this->hasMany(Resep::class, 'id_kunjungan', 'id_kunjungan');
    }
}