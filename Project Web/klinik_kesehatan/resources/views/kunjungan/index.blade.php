@extends('layouts.app')

@section('content')
<div class="card">
    <div class="card-header">
        Daftar Kunjungan
        <a href="{{ route('kunjungan.create') }}" class="btn btn-primary float-end">Tambah Kunjungan</a>
        <a href="{{ route('kunjungan.laporan') }}" class="btn btn-success float-end me-2">Cetak Laporan</a>
    </div>
    <div class="card-body">
        @if(session('success'))
            <div class="alert alert-success">{{ session('success') }}</div>
        @endif
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Pasien</th>
                    <th>Dokter</th>
                    <th>Tanggal</th>
                    <th>Diagnosa</th>
                    <th>Status</th>
                    <th>Aksi</th>
                </tr>
            </thead>
            <tbody>
                @foreach($kunjungan as $item)
                    <tr>
                        <td>{{ $item->pasien->nama }}</td>
                        <td>{{ $item->dokter->nama }}</td>
                        <td>{{ $item->tanggal_kunjungan }}</td>
                        <td>{{ $item->diagnosa ?? '-' }}</td>
                        <td>{{ $item->status }}</td>
                        <td>
                            <a href="{{ route('kunjungan.show', $item->id_kunjungan) }}" class="btn btn-info btn-sm">Lihat</a>
                            <a href="{{ route('kunjungan.edit', $item->id_kunjungan) }}" class="btn btn-warning btn-sm">Edit</a>
                            <form action="{{ route('kunjungan.destroy', $item->id_kunjungan) }}" method="POST" style="display:inline;">
                                @csrf
                                @method('DELETE')
                                <button type="submit" class="btn btn-danger btn-sm" onclick="return confirm('Hapus kunjungan ini?')">Hapus</button>
                            </form>
                        </td>
                    </tr>
                @endforeach
            </tbody>
        </table>
    </div>
</div>
@endsection