@extends('layouts.app')

@section('content')
<div class="card">
    <div class="card-header">Detail Resep</div>
    <div class="card-body">
        <h5 class="card-title">Resep untuk {{ $resep->kunjungan->pasien->nama }}</h5>
        <p><strong>Obat:</strong> {{ $resep->obat->nama_obat }}</p>
        <p><strong>Jumlah:</strong> {{ $resep->jumlah }}</p>
        <p><strong>Keterangan:</strong> {{ $resep->keterangan ?? '-' }}</p>
        <p><strong>Kunjungan:</strong> {{ $resep->kunjungan->tanggal_kunjungan }}</p>
        <a href="{{ route('resep.index') }}" class="btn btn-primary">Kembali</a>
    </div>
</div>
@endsection