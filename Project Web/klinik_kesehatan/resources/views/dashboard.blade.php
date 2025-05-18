@extends('layouts.app')

@section('content')
<div class="row">
    <div class="col-md-4">
        <div class="card text-white bg-primary mb-3">
            <div class="card-body">
                <h5 class="card-title">Total Pasien</h5>
                <p class="card-text">{{ $totalPasien }}</p>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="card text-white bg-success mb-3">
            <div class="card-body">
                <h5 class="card-title">Kunjungan Hari Ini</h5>
                <p class="card-text">{{ $totalKunjungan }}</p>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="card text-white bg-warning mb-3">
            <div class="card-body">
                <h5 class="card-title">Total Stok Obat</h5>
                <p class="card-text">{{ $totalObat }}</p>
            </div>
        </div>
    </div>
</div>

<div class="card">
    <div class="card-header">Notifikasi Kunjungan Menunggu</div>
    <div class="card-body">
        @if($notifikasi->isEmpty())
            <p>Tidak ada kunjungan menunggu.</p>
        @else
            <ul class="list-group">
                @foreach($notifikasi as $item)
                    <li class="list-group-item">{{ $item->pasien->nama }} - {{ $item->tanggal_kunjungan }}</li>
                @endforeach
            </ul>
        @endif
    </div>
</div>

<canvas id="statistikChart" class="mt-4"></canvas>

<script>
    const ctx = document.getElementById('statistikChart').getContext('2d');
    new Chart(ctx, {
        type: 'bar',
        data: {
            labels: ['Pasien', 'Kunjungan', 'Stok Obat'],
            datasets: [{
                label: 'Statistik Klinik',
                data: [{{ $totalPasien }}, {{ $totalKunjungan }}, {{ $totalObat }}],
                backgroundColor: ['#007bff', '#28a745', '#ffc107'],
            }]
        },
        options: {
            scales: {
                y: { beginAtZero: true }
            }
        }
    });
</script>
@endsection