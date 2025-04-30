<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class Product
{ 
    public static function all() 
    { 
        return session('product', []); 
    } 
 
    public static function create($data)
    {
        $product = session('product', []);

        // Cek apakah produk sudah ada
        foreach ($product as $item) {
            if ($item['name'] === $data['name']) {
                return response()->json(['message' => 'Nama Produk telah Tersedia !'], 400);
            }
        }

        $data['id'] = count($product) + 1;
        $product[] = $data;
        session(['product' => $product]);

        return $data;
    }

    public static function updateStock($id, $quantity)
    {
        $products = session('product', []);

        foreach ($products as &$product) {
            if ($product['id'] == $id) {
                // Kurangi stok produk
                if ($product['stock'] >= $quantity) {
                    $product['stock'] -= $quantity;
                    session(['product' => $products]);
                    return true;
                } else {
                    return false; // Stok tidak mencukupi
                }
            }
        }

        return null; // Produk tidak ditemukan
    }

} 
