@extends('layouts.app')

@section('content')
<div class="card">
    <div class="card-header">Detail Kunjungan</div>
    <div class="card-body">
        <h5 class="card-title">Kunjungan: {{ $kunjungan->pasien->nama }}</h5>
        <p><strong>Dokter:</strong> {{ $kunjungan->dokter->nama }} ({{ $kunjungan->dokter->spesialisasi }})</p>
        <p><strong>Tanggal:</strong> {{ $kunjungan->tanggal_kunjungan }}</p>
        <p><strong>Diagnosa:</strong> {{ $kunjungan->diagnosa ?? '-' }}</p>
        <p><strong>Status:</strong> {{ $kunjungan->status }}</p>
        <a href="{{ route('kunjungan.index') }}" class="btn btn-primary">Kembali</a>
    </div>
</div>
@endsection