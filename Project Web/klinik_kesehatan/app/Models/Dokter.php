<?php
namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Dokter extends Model
{
    use HasFactory;

    protected $table = 'dokter';
    protected $primaryKey = 'id_dokter';
    protected $fillable = ['nama', 'spesialisasi', 'no_telepon'];

    public function kunjungan()
    {
        return $this->hasMany(Kunjungan::class, 'id_dokter', 'id_dokter');
    }
}