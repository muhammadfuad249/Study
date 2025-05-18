@extends('layouts.app')

@section('content')
<div class="card">
    <div class="card-header">Tambah Kunjungan</div>
    <div class="card-body">
        <form action="{{ route('kunjungan.store') }}" method="POST">
            @csrf
            <div class="mb-3">
                <label for="id_pasien" class="form-label">Pasien</label>
                <select class="form-select @error('id_pasien') is-invalid @enderror" id="id_pasien" name="id_pasien">
                    @foreach($pasien as $p)
                        <option value="{{ $p->id_pasien }}" {{ old('id_pasien') == $p->id_pasien ? 'selected' : '' }}>{{ $p->nama }}</option>
                    @endforeach
                </select>
                @error('id_pasien') <div class="invalid-feedback">{{ $message }}</div> @enderror
            </div>
            <div class="mb-3">
                <label for="id_dokter" class="form-label">Dokter</label>
                <select class="form-select @error('id_dokter') is-invalid @enderror" id="id_dokter" name="id_dokter">
                    @foreach($dokter as $d)
                        <option value="{{ $d->id_dokter }}" {{ old('id_dokter') == $d->id_dokter ? 'selected' : '' }}>{{ $d->nama }} ({{ $d->spesialisasi }})</option>
                    @endforeach
                </select>
                @error('id_dokter') <div class="invalid-feedback">{{ $message }}</div> @enderror
            </div>
            <div class="mb-3">
                <label for="tanggal_kunjungan" class="form-label">Tanggal Kunjungan</label>
                <input type="datetime-local" class="form-control @error('tanggal_kunjungan') is-invalid @enderror" id="tanggal_kunjungan" name="tanggal_kunjungan" value="{{ old('tanggal_kunjungan') }}">
                @error('tanggal_kunjungan') <div class="invalid-feedback">{{ $message }}</div> @enderror
            </div>
            <div class="mb-3">
                <label for="diagnosa" class="form-label">Diagnosa</label>
                <textarea class="form-control @error('diagnosa') is-invalid @enderror" id="diagnosa" name="diagnosa">{{ old('diagnosa') }}</textarea>
                @error('diagnosa') <div class="invalid-feedback">{{ $message }}</div> @enderror
            </div>
            <div class="mb-3">
                <label for="status" class="form-label">Status</label>
                <select class="form-select @error('status') is-invalid @enderror" id="status" name="status">
                    <option value="Menunggu" {{ old('status') == 'Menunggu' ? 'selected' : '' }}>Menunggu</option>
                    <option value="Selesai" {{ old('status') == 'Selesai' ? 'selected' : '' }}>Selesai</option>
                </select>
                @error('status') <div class="invalid-feedback">{{ $message }}</div> @enderror
            </div>
            <button type="submit" class="btn btn-primary">Simpan</button>
            <a href="{{ route('kunjungan.index') }}" class="btn btn-secondary">Batal</a>
        </form>
    </div>
</div>
@endsection