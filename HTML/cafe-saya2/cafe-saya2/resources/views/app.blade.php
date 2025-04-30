<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kafe Skena</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384=QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous"> 
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"> 
        </script>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary px-4"> 
    <a class="navbar-brand" href="{{ url('/') }}">Kafe Skena</a>
    <div class="collapse navbar-collapse" id="navbarNav"> 
            <ul class="navbar-nav"> 
                <li class="nav-item"> 
                    <a class="nav-link" href="{{ route('menus.index') }}">Menu</a> 
                </li> 
                <li class="nav-item"> 
                    <a class="nav-link" href="{{ route('orders.index') }}">Pesanan</a> 
                </li> 
                <li class="nav-item"> 
                    <a class="nav-link" href="{{ route('customers.index') }}">Pelanggan</a> 
                </li> 
            </ul> 
        </div> 
    </nav> 
 
    <div class="container mt-4"> 
        @yield('content') 
    </div> 
</body>
</html>