@extends('layouts.app')

@section('content')
<div class="card">
    <div class="card-header">Detail Obat</div>
    <div class="card-body">
        <h5 class="card-title">{{ $obat->nama_obat }}</h5>
        <p><strong>Stok:</strong> {{ $obat->stok }}</p>
        <p><strong>Harga:</strong> Rp {{ number_format($obat->harga, 2, ',', '.') }}</p>
        <a href="{{ route('obat.index') }}" class="btn btn-primary">Kembali</a>
    </div>
</div>
@endsection