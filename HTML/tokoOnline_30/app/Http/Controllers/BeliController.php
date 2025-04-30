<?php

namespace App\Http\Controllers;

use App\Models\Beli; 
use App\Models\Product;
use App\Models\User;
use Illuminate\Http\Request; 
 
class BeliController extends Controller 
{ 
    public function store(Request $request) 
    { 
        $request->validate([
            'user_id'    => 'required|integer',
            'product_id' => 'required|integer',
            'quantity'   => 'required|integer|min:1',
        ]);

        // Cek apakah user_id valid
        $users = User::all();
        $userExists = array_filter($users, fn($user) => $user['id'] == $request->user_id);
        if (!$userExists) {
            return response()->json(['message' => 'User tidak ditemukan!'], 404);
        }

        // Panggil fungsi updateStock()
        $isStockUpdated = Product::updateStock($request->product_id, $request->quantity);

        // Jika produk tidak ditemukan
        if ($isStockUpdated === null) {
            return response()->json(['message' => 'Produk tidak ditemukan!'], 404);
        }

        // Jika stok tidak cukup
        if ($isStockUpdated === false) {
            return response()->json(['message' => 'Stok tidak mencukupi!'], 400);
        }

        // Simpan pembelian
        $purchase = Beli::create($request->only(['user_id', 'product_id', 'quantity']));
        return response()->json($purchase, 201);

        // $request->validate([ 
        //     'user_id' => 'required|integer', 
        //     'product_id' => 'required|integer', 
        //     'quantity' => 'required|integer|min:1', 
        // ]); 

        // // Ambil daftar produk
        // $products = Product::all();
        // $productIndex = array_search($request->product_id, array_column($products, 'id'));

        // // Cek apakah produk tersedia
        // if ($productIndex === false) {
        //     return response()->json(['message' => 'Produk tidak ditemukan'], 404);
        // }

        // // Cek stok produk
        // if ($products[$productIndex]['stock'] < $request->quantity) {
        //     return response()->json(['message' => 'Stok Kurang !'], 400);
        // }

        // // Kurangi stok produk
        // $products[$productIndex]['stock'] -= $request->quantity;
        // session(['product' => $products]);
 
        // $purchase = Beli::create($request->only(['user_id', 'product_id', 'quantity'])); 
        // return response()->json($purchase, 201); 
    } 
 
    public function index() 
    { 
        return response()->json(Beli::all(), 200); 
    } 

    public function destroy($id)
    {
        $beli = Beli::find($id);

        if (!$beli) {
            return response()->json(['message' => 'Pembelian tidak ditemukan!'], 404);
        }

        $beli->delete();

        return response()->json(['message' => 'Pembelian berhasil dihapus'], 200);
    }

    public function destroyAll()
    {
        Beli::truncate();

        return response()->json(['message' => 'Semua pembelian berhasil dihapus'], 200);
    }

} 