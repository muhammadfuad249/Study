<!-- <!DOCTYPE html>
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
</html> -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kafe Skena</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            overflow-x: hidden;
        }
        .sidebar {
            width: 250px;
            height: 100vh;
            background-color: #0d6efd;
            transition: all 0.3s;
        }
        .sidebar.collapsed {
            width: 80px;
        }
        .sidebar .nav-link {
            color: white;
        }
        .sidebar .nav-link:hover,
        .sidebar .nav-link.active {
            background-color: rgba(255, 255, 255, 0.1);
        }
        .sidebar .sidebar-toggle {
            background: none;
            border: none;
            color: white;
            text-align: left;
        }
        .sidebar .nav-text {
            display: inline;
            transition: opacity 0.3s;
        }
        .sidebar.collapsed .nav-text {
            opacity: 0;
            width: 0;
            overflow: hidden;
        }
    </style>
</head>
<body>

<div class="d-flex">
    <!-- Sidebar -->
    <div id="sidebar" class="sidebar d-flex flex-column p-3">
        <button class="sidebar-toggle mb-3" onclick="toggleSidebar()">☰</button>
        <a href="{{ url('/') }}" class="d-flex align-items-center mb-3 text-white text-decoration-none">
            <span class="fs-5 fw-bold nav-text">Kafe Skena</span>
        </a>
        <hr class="text-white">
        <ul class="nav nav-pills flex-column mb-auto">
            <li class="nav-item">
                <a class="nav-link text-white" href="{{ route('menus.index') }}">
                    <i class="bi bi-list"></i> <span class="nav-text">Menu</span>
                </a>
            </li>
            <li>
                <a class="nav-link text-white" href="{{ route('orders.index') }}">
                    <i class="bi bi-cart"></i> <span class="nav-text">Pesanan</span>
                </a>
            </li>
            <li>
                <a class="nav-link text-white" href="{{ route('customers.index') }}">
                    <i class="bi bi-people"></i> <span class="nav-text">Pelanggan</span>
                </a>
            </li>
        </ul>
    </div>

    <!-- Main Content -->
    <div class="flex-grow-1 p-4">
        @yield('content')
    </div>
</div>

<!-- JS untuk toggle sidebar -->
<script>
    function toggleSidebar() {
        document.getElementById('sidebar').classList.toggle('collapsed');
    }
</script>

<!-- Bootstrap Icons (optional, kalau mau pakai ikon) -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
</body>
</html>

