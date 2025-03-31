package com.example.myapplication.List.Viewmodels

import androidx.lifecycle.ViewModel
import com.example.myapplication.List.models.ProductModel
import com.example.myapplication.R

class ProductViewModel() : ViewModel() {
    init {
        //obtenerProductos()

    }
    fun obtenerProductos() : List<ProductModel>{
        var productsList = listOf<ProductModel>(
            ProductModel(1,"hamburguesa sencilla","hamburguesa con carne, pan y queso",150f, R.drawable.burger1),
            ProductModel(1,"hamburguesa premium","hamburguesa con tocino",250f, R.drawable.burger2),
            ProductModel(1,"hamburguesa de queso","hamburguesa con basto queso",180f, R.drawable.burger3),
            ProductModel(1,"hamburguesa sencilla","hamburguesa con carne, pan y queso",150f, R.drawable.burger1),
            ProductModel(1,"hamburguesa premium","hamburguesa con tocino",250f, R.drawable.burger2),
            ProductModel(1,"hamburguesa de queso","hamburguesa con basto queso",180f, R.drawable.burger3),
            ProductModel(1,"hamburguesa sencilla","hamburguesa con carne, pan y queso",150f, R.drawable.burger1),
            ProductModel(1,"hamburguesa premium","hamburguesa con tocino",250f, R.drawable.burger2),
            ProductModel(1,"hamburguesa de queso","hamburguesa con basto queso",180f, R.drawable.burger3),
            ProductModel(1,"hamburguesa sencilla","hamburguesa con carne, pan y queso",150f, R.drawable.burger1)
        )

        return productsList
    }
}