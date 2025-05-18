@extends('layouts.app')

@section('content')
<div class="card">
    <div class="card-header">
        Daftar Dokter
        <a href="{{ route('dokter.create') }}" class="btn btn-primary float-end">Tambah Dokter</a>
    </div>
    <div class="card-body">
        @if(session('success'))
            <div class="alert alert-success">{{ session('success') }}</div>
        @endif
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Nama</th>
                    <th>Spesialisasi</th>
                    <th>No. Telepon</th>
                    <th>Aksi</th>
                </tr>
            </thead>
            <tbody>
                @foreach($dokter as $item)
                    <tr>
                        <td>{{ $item->nama }}</td>
                        <td>{{ $item->spesialisasi }}</td>
                        <td>{{ $item->no_telepon }}</td>
                        <td>
                            <a href="{{ route('dokter.show', $item->id_dokter) }}" class="btn btn-info btn-sm">Lihat</a>
                            <a href="{{ route('dokter.edit', $item->id_dokter) }}" class="btn btn-warning btn-sm">Edit</a>
                            <form action="{{ route('dokter.destroy', $item->id_dokter) }}" method="POST" style="display:inline;">
                                @csrf
                                @method('DELETE')
                                <button type="submit" class="btn btn-danger btn-sm" onclick="return confirm('Hapus dokter ini?')">Hapus</button>
                            </form>
                        </td>
                    </tr>
                @endforeach
            </tbody>
        </table>
    </div>
</div>
@endsection