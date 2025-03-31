package com.example.myapplication.DataStore

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.List.Viewmodels.ProductViewModel
import com.example.myapplication.List.Viewmodels.StudentViewModel
import com.example.myapplication.List.Views.ProductView

@Preview(showBackground = true)
@Composable
fun ListProductsView(){
    val productViewModel : ProductViewModel = ProductViewModel()
    val studentViewModel: StudentViewModel = StudentViewModel()

    Column (Modifier.fillMaxSize()){
        Text("Balance $")
        LazyColumn {
            items(productViewModel.obtenerProductos()){
                product ->
                ProductView(product)
            }
            item {
                Button(onClick = {}) {
                    Text("Finalizar compra")
                }
            }
        }
    }
}