@extends('layouts.app')

@section('content')
<div class="card">
    <div class="card-header">Detail Pasien</div>
    <div class="card-body">
        <h5 class="card-title">{{ $pasien->nama }}</h5>
        <p><strong>Alamat:</strong> {{ $pasien->alamat }}</p>
        <p><strong>No. Telepon:</strong> {{ $pasien->no_telepon }}</p>
        <p><strong>Tanggal Lahir:</strong> {{ $pasien->tanggal_lahir }}</p>
        <p><strong>Jenis Kelamin:</strong> {{ $pasien->jenis_kelamin == 'L' ? 'Laki-laki' : 'Perempuan' }}</p>
        <p><strong>Kode QR:</strong></p>
        <div id="qrcode-{{ $pasien->id_pasien }}"></div>
        <a href="{{ route('pasien.index') }}" class="btn btn-primary mt-3">Kembali</a>
    </div>
</div>
<script>
    new QRCode(document.getElementById('qrcode-{{ $pasien->id_pasien }}'), {
        text: '{{ $pasien->id_pasien }}',
        width: 100,
        height: 100
    });
</script>
@endsection