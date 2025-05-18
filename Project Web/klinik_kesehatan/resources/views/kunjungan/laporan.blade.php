<!DOCTYPE html>
<html>
<head>
    <title>Laporan Kunjungan</title>
    <style>
        table { width: 100%; border-collapse: collapse; }
        th, td { border: 1px solid black; padding: 8px; text-align: left; }
        th { background-color: #f2f2f2; }
    </style>
</head>
<body>
    <h2>Laporan Kunjungan Pasien</h2>
    <table>
        <thead>
            <tr>
                <th>Pasien</th>
                <th>Dokter</th>
                <th>Tanggal</th>
                <th>Diagnosa</th>
                <th>Status</th>
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
                </tr>
            @endforeach
        </tbody>
    </table>
</body>
</html>