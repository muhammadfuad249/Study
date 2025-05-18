<?php
use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateObatTable extends Migration
{
    public function up()
    {
        Schema::create('obat', function (Blueprint $table) {
            $table->id('id_obat');
            $table->string('nama_obat');
            $table->integer('stok');
            $table->decimal('harga', 10, 2);
            $table->timestamps();
        });
    }

    public function down()
    {
        Schema::dropIfExists('obat');
    }
}