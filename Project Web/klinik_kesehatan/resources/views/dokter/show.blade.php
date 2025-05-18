@extends('layouts.app')

@section('content')
<div class="card">
    <div class="card-header">Detail Dokter</div>
    <div class="card-body">
        <h5 class="card-title">{{ $dokter->nama }}</h5>
        <p><strong>Spesialisasi:</strong> {{ $dokter->spesialisasi }}</p>
        <p><strong>No. Telepon:</strong> {{ $dokter->no_telepon }}</p>
        <a href="{{ route('dokter.index') }}" class="btn btn-primary">Kembali</a>
    </div>
</div>
@endsection