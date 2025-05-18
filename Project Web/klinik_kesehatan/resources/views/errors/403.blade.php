<!DOCTYPE html>
     <html>
     <head>
         <title>Akses Ditolak</title>
         <link href="{{ asset('css/app.css') }}" rel="stylesheet">
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
     </head>
     <body>
         <div class="container mt-5">
             <div class="alert alert-danger">
                 <h1>403 - Akses Ditolak</h1>
                 <p>Anda tidak memiliki izin untuk mengakses halaman ini.</p>
                 <a href="{{ route('dashboard') }}" class="btn btn-primary">Kembali ke Dashboard</a>
             </div>
         </div>
     </body>
     </html>