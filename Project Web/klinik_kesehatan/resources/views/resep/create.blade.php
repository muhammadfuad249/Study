@extends('layouts.app')

@section('content')
<div class="card">
    <div class="card-header">Tambah Resep</div>
    <div class="card-body">
        <form action="{{ route('resep.store') }}" method="POST">
            @csrf
            <div class="mb-3">
                <label for="id_kunjungan" class="form-label">Kunjungan</label>
                <select class="form-select @error('id_kunjungan') is-invalid @enderror" id="id_kunjungan" name="id_kunjungan">
                    @foreach($kunjungan as $k)
                        <option value="{{ $k->id_kunjungan }}" {{ old('id_kunjungan') == $k->id_kunjungan ? 'selected' : '' }}>{{ $k->pasien->nama }} - {{ $k->tanggal_kunjungan }}</option>
                    @endforeach
                </select>
                @error('id_kunjungan') <div class="invalid-feedback">{{ $message }}</div> @enderror
            </div>
            <div class="mb-3">
                <label for="id_obat" class="form-label">Obat</label>
                <select class="form-select @error('id_obat') is-invalid @enderror" id="id_obat" name="id_obat">
                    @foreach($obat as $o)
                        <option value="{{ $o->id_obat }}" {{ old('id_obat') == $o->id_obat ? 'selected' : '' }}>{{ $o->nama_obat }} (Stok: {{ $o->stok }})</option>
                    @endforeach
                </select>
                @error('id_obat') <div class="invalid-feedback">{{ $message }}</div> @enderror
            </div>
            <div class="mb-3">
                <label for="jumlah" class="form-label">Jumlah</label>
                <input type="number" class="form-control @error('jumlah') is-invalid @enderror" id="jumlah" name="jumlah" value="{{ old('jumlah') }}">
                @error('jumlah') <div class="invalid-feedback">{{ $message }}</div> @enderror
            </div>
            <div class="mb-3">
                <label for="keterangan" class="form-label">Keterangan</label>
                <textarea class="form-control @error('keterangan') is-invalid @enderror" id="keterangan" name="keterangan">{{ old('keterangan') }}</textarea>
                @error('keterangan') <div class="invalid-feedback">{{ $message }}</div> @enderror
            </div>
            <button type="submit" class="btn btn-primary">Simpan</button>
            <a href="{{ route('resep.index') }}" class="btn btn-secondary">Batal</a>
        </form>
    </div>
</div>
@endsection