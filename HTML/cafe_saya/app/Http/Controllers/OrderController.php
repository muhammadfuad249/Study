<?php

namespace App\Http\Controllers;

use App\Models\Customer;  
use App\Models\Menu;  
use App\Models\Order; 
use Illuminate\Http\Request;

class OrderController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $orders = Order::all();
        return view('orders.index', compact('orders'));
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        $menus = Menu::all();
        $customers = Customer::all();
        return view('orders.create', compact('menus','customers'));
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $request->validate([
            'customer_id' => 'required|exists:customers, id', 
            'menu_id'=> 'required exists: menus, id', 
            'quantity'=> 'required integer', 
            'total_price' => 'required numeric', 
        ]);

        //Simpan order
        Order::create($request->all());  
        return redirect()->route('orders.index')->with('success', 'Order created successfully.'); 
    }

    /**
     * Display the specified resource.
     */
    public function show(Order $order)
    {
        return view('orders.show', compact('order')); 
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Order $order)
    {
        $menus = Menu::all();  
        $customers = Customer::all();  
        return view('orders.edit', compact('order', 'menus', 'customers'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Order $order)
    {
        $request->validate([  
            'customer_id' => 'required',  
            'menu_id' => 'required',  
            'quantity' => 'required integer',  
            'total_price' => 'required numeric',  
            ]);  
            $order->update($request->all()); 
            return redirect()->route('orders.index')  ->with('success', 'Order updated successfully'); 
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Order $order)
    {
        $order->delete();  
        return redirect()->route('orders.index')  ->with('success', 'Order deleted successfully'); 
    }
}
