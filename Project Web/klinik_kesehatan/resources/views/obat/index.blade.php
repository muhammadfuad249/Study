@extends('layouts.app')

@section('content')
<div class="card">
    <div class="card-header">
        Daftar Obat
        <a href="{{ route('obat.create') }}" class="btn btn-primary float-end">Tambah Obat</a>
    </div>
    <div class="card-body">
        @if(session('success'))
            <div class="alert alert-success">{{ session('success') }}</div>
        @endif
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Nama Obat</th>
                    <th>Stok</th>
                    <th>Harga</th>
                    <th>Aksi</th>
                </tr>
            </thead>
            <tbody>
                @foreach($obat as $item)
                    <tr>
                        <td>{{ $item->nama_obat }}</td>
                        <td>{{ $item->stok }}</td>
                        <td>Rp {{ number_format($item->harga, 2, ',', '.') }}</td>
                        <td>
                            <a href="{{ route('obat.show', $item->id_obat) }}" class="btn btn-info btn-sm">Lihat</a>
                            <a href="{{ route('obat.edit', $item->id_obat) }}" class="btn btn-warning btn-sm">Edit</a>
                            <form action="{{ route('obat.destroy', $item->id_obat) }}" method="POST" style="display:inline;">
                                @csrf
                                @method('DELETE')
                                <button type="submit" class="btn btn-danger btn-sm" onclick="return confirm('Hapus obat ini?')">Hapus</button>
                            </form>
                        </td>
                    </tr>
                @endforeach
            </tbody>
        </table>
    </div>
</div>
@endsection