@extends('layouts.app')

@section('content')
<div class="card">
    <div class="card-header">
        Daftar Resep
        <a href="{{ route('resep.create') }}" class="btn btn-primary float-end">Tambah Resep</a>
    </div>
    <div class="card-body">
        @if(session('success'))
            <div class="alert alert-success">{{ session('success') }}</div>
        @endif
        @if($errors->has('jumlah'))
            <div class="alert alert-danger">{{ $errors->first('jumlah') }}</div>
        @endif
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Pasien</th>
                    <th>Obat</th>
                    <th>Jumlah</th>
                    <th>Keterangan</th>
                    <th>Aksi</th>
                </tr>
            </thead>
            <tbody>
                @foreach($resep as $item)
                    <tr>
                        <td>{{ $item->kunjungan->pasien->nama }}</td>
                        <td>{{ $item->obat->nama_obat }}</td>
                        <td>{{ $item->jumlah }}</td>
                        <td>{{ $item->keterangan ?? '-' }}</td>
                        <td>
                            <a href="{{ route('resep.show', $item->id_resep) }}" class="btn btn-info btn-sm">Lihat</a>
                            <a href="{{ route('resep.edit', $item->id_resep) }}" class="btn btn-warning btn-sm">Edit</a>
                            <form action="{{ route('resep.destroy', $item->id_resep) }}" method="POST" style="display:inline;">
                                @csrf
                                @method('DELETE')
                                <button type="submit" class="btn btn-danger btn-sm" onclick="return confirm('Hapus resep ini?')">Hapus</button>
                            </form>
                        </td>
                    </tr>
                @endforeach
            </tbody>
        </table>
    </div>
</div>
@endsection