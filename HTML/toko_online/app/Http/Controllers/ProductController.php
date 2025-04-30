<?php

namespace App\Http\Controllers;

use App\Models\Product; 
use Illuminate\Http\Request; 
 
class ProductController extends Controller 
{ 
    public function store(Request $request) 
    { 
        $request->validate([ 
            'name' => 'required|string|max:255', 
            'price' => 'required|numeric', 
            'stock'       => 'required|integer|min:1',
            'description' => 'nullable|string', 
        ]);
        $product = Product::create($request->only(['name', 'price', 'stock', 'description'])); 
        return response()->json($product, 201); 
    }
    public function index() 
    { 
        return response()->json(Product::all(), 200); 
    }
    public function show($id)
    {
        $products = Product::all();
        foreach ($products as $product) {
            if ($product['id'] == $id) {
                return response()->json($product, 200);
            }
        }
        return response()->json(['message' => 'Produk tidak ditemukan'], 404);
    }

    public function destroy($id)
    {
        $product = Product::find($id);

        if (!$product) {
            return response()->json(['message' => 'Produk tidak ditemukan!'], 404);
        }

        $product->delete();

        return response()->json(['message' => 'Produk berhasil dihapus'], 200);
    }

    public function destroyAll()
    {
        Product::truncate();

        return response()->json(['message' => 'Semua produk berhasil dihapus'], 200);
    }


} 
