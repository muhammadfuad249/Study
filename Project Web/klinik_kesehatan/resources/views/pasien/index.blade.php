@extends('layouts.app')

@section('content')
<div class="card">
    <div class="card-header">
        Daftar Pasien
        <a href="{{ route('pasien.create') }}" class="btn btn-primary float-end">Tambah Pasien</a>
    </div>
    <div class="card-body">
        @if(session('success'))
            <div class="alert alert-success">{{ session('success') }}</div>
        @endif
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Nama</th>
                    <th>Alamat</th>
                    <th>No. Telepon</th>
                    <th>Tanggal Lahir</th>
                    <th>Jenis Kelamin</th>
                    <th>QR Code</th>
                    <th>Aksi</th>
                </tr>
            </thead>
            <tbody>
                @foreach($pasien as $item)
                    <tr>
                        <td>{{ $item->nama }}</td>
                        <td>{{ $item->alamat }}</td>
                        <td>{{ $item->no_telepon }}</td>
                        <td>{{ $item->tanggal_lahir }}</td>
                        <td>{{ $item->jenis_kelamin }}</td>
                        <td><div id="qrcode-{{ $item->id_pasien }}"></div></td>
                        <td>
                            <a href="{{ route('pasien.show', $item->id_pasien) }}" class="btn btn-info btn-sm">Lihat</a>
                            <a href="{{ route('pasien.edit', $item->id_pasien) }}" class="btn btn-warning btn-sm">Edit</a>
                            <form action="{{ route('pasien.destroy', $item->id_pasien) }}" method="POST" style="display:inline;">
                                @csrf
                                @method('DELETE')
                                <button type="submit" class="btn btn-danger btn-sm" onclick="return confirm('Hapus pasien ini?')">Hapus</button>
                            </form>
                        </td>
                    </tr>
                    <script>
                        new QRCode(document.getElementById('qrcode-{{ $item->id_pasien }}'), {
                            text: '{{ $item->id_pasien }}',
                            width: 50,
                            height: 50
                        });
                    </script>
                @endforeach
            </tbody>
        </table>
    </div>
</div>
@endsection