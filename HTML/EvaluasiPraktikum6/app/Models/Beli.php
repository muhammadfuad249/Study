<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class Beli
{ 
    public static function all() 
    { 
        return session('beli', []); 
    } 
    public static function create($data) 
    { 
        $beli = session('beli', []); 
        $data['id'] = count($beli) + 1; 
        $beli[] = $data; 
        session(['beli' => $beli]); 
        return $data; 
    } 
}
