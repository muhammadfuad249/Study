@extends('layouts.app')

@section('title', 'Laboratorium')

@section('content')
<div class="container py-5">
    <h1 class="text-center fw-bold mb-4">Laboratorium</h1>
    <p class="text-center text-muted mb-5">Pilih laboratorium untuk melihat detail dan fasilitas yang tersedia.</p>

    <!-- Dropdown Menu -->
    <div class="mb-4 text-center">
        <select class="form-select w-50 mx-auto" id="labSelector" onchange="showLab(this.value)" placeholder="Pilih Laboratorium">
            <option value="" disabled selected>Pilih Laboratorium</option>
            <option value="startup">Startup Laboratory</option>
            <option value="iot">IOT Laboratory</option>
            <option value="multimedia">Multimedia Laboratory</option>
            <option value="cv">Computer Vision Laboratory</option>
            <option value="ds">Data Science Laboratory</option>
            <option value="micro">Micro Controller Laboratory</option>
            <option value="networking">Computer Network Laboratory</option>
        </select>
    </div>

    <!-- Lab Sections -->
    <div id="labContent">

        <!-- STARTUP LAB -->
        <div id="startup" class="lab-section d-none">
            <div id="carouselStartup" class="carousel slide carousel-fade mb-3" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="{{ asset('images/startup1.jpg') }}" class="d-block w-100 rounded" alt="Startup Lab 1">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/startup2.jpg') }}" class="d-block w-100 rounded" alt="Startup Lab 2">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/startup3.jpg') }}" class="d-block w-100 rounded" alt="Startup Lab 3">
                    </div>
                </div>
            </div>
            <h3 class="text-white fw-bold">Startup Laboratory</h3>
        </div>

        <!-- IOT LAB -->
        <div id="iot" class="lab-section d-none">
            <div id="carouselIot" class="carousel slide carousel-fade mb-3" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="{{ asset('images\IoT (1).jpg') }}" class="d-block w-100 rounded" alt="IOT Lab 1">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images\IoT (2).jpg') }}" class="d-block w-100 rounded" alt="IOT Lab 2">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images\IoT (3).jpg') }}" class="d-block w-100 rounded" alt="IOT Lab 3">
                    </div>
                </div>
            </div>
            <h3 class="text-white fw-bold">IOT Laboratory</h3>
        </div>

        <!-- MULTIMEDIA LAB -->
        <div id="multimedia" class="lab-section d-none">
            <div id="carouselMultimedia" class="carousel slide carousel-fade mb-3" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="{{ asset('images/Mulmed (1).jpg') }}" class="d-block w-100 rounded" alt="Multimedia Lab 1">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/Mulmed (2).jpg') }}" class="d-block w-100 rounded" alt="Multimedia Lab 2">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/Mulmed (3).jpg') }}" class="d-block w-100 rounded" alt="Multimedia Lab 3">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/Mulmed (4).jpg') }}" class="d-block w-100 rounded" alt="Multimedia Lab 4">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/Mulmed (5).jpg') }}" class="d-block w-100 rounded" alt="Multimedia Lab 5">
                    </div>
                </div>
            </div>
            <h3 class="text-white fw-bold">Multimedia Laboratory</h3>
        </div>

        <!-- COMPUTER VISION LAB -->
        <div id="cv" class="lab-section d-none">
            <div id="carouselCv" class="carousel slide carousel-fade mb-3" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="{{ asset('images/CV (1).jpg') }}" class="d-block w-100 rounded" alt="CV Lab 1">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/CV (2).jpg') }}" class="d-block w-100 rounded" alt="CV Lab 2">
                    </div>
                </div>
            </div>
            <h3 class="text-white fw-bold">Computer Vision Laboratory</h3>
        </div>

        <!-- DATA SCIENCE LAB -->
        <div id="ds" class="lab-section d-none">
            <div id="carouselDs" class="carousel slide carousel-fade mb-3" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="{{ asset('images/DS (1).jpg') }}" class="d-block w-100 rounded" alt="DS Lab 1">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/DS (2).jpg') }}" class="d-block w-100 rounded" alt="DS Lab 2">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/DS (3).jpg') }}" class="d-block w-100 rounded" alt="DS Lab 3">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/DS (4).jpg') }}" class="d-block w-100 rounded" alt="DS Lab 4">
                    </div>
                </div>
            </div>
            <h3 class="text-white fw-bold">Data Science Laboratory</h3>
        </div>

        <!-- MICRO CONTROLLER LAB -->
        <div id="micro" class="lab-section d-none">
            <div id="carouselMicro" class="carousel slide carousel-fade mb-3" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="{{ asset('images/Micro (1).jpg') }}" class="d-block w-100 rounded" alt="Micro Controller Lab 1">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/Micro (2).jpg') }}" class="d-block w-100 rounded" alt="Micro Controller Lab 2">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/Micro (3).jpg') }}" class="d-block w-100 rounded" alt="Micro Controller Lab 3">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/Micro (4).jpg') }}" class="d-block w-100 rounded" alt="Micro Controller Lab 4">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/Micro (5).jpg') }}" class="d-block w-100 rounded" alt="Micro Controller Lab 5">
                    </div>
                </div>
            </div>
            <h3 class="text-white fw-bold">Micro Controller Laboratory</h3>
        </div>

        <!-- COMPUTER NETWORK LAB -->
        <div id="networking" class="lab-section d-none">
            <div id="carouselNetworking" class="carousel slide carousel-fade mb-3" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="{{ asset('images/Comnet 1.png') }}" class="d-block w-100 rounded" alt="Computer Network Lab 1">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/comnet 2.png') }}" class="d-block w-100 rounded" alt="Computer Network Lab 2">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/Comnet 3.png') }}" class="d-block w-100 rounded" alt="Computer Network Lab 3">
                    </div>
                    <div class="carousel-item active">
                        <img src="{{ asset('images/comnet 4.png') }}" class="d-block w-100 rounded" alt="Computer Network Lab 4">
                    </div>
                </div>
            </div>
            <h3 class="text-white fw-bold">Computer Network Laboratory</h3>
        </div>

    </div>
</div>

<!-- Script untuk switch tampilan -->
<script>
    function showLab(labId) {
        document.querySelectorAll('.lab-section').forEach(section => {
            section.classList.add('d-none');
        });
        document.getElementById(labId).classList.remove('d-none');
    }
</script>
@endsection
