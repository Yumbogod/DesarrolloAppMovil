package com.example.myapplication.List.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.List.models.ProductModel
import com.example.myapplication.R

@Preview(showBackground = true)
@Composable
fun ProductPreview(){
    val product = ProductModel(1,"Hamburguesa",
        "200g de carne de res con tocino, queso, verduras y aderezos",
        320f,
        R.drawable.burger1)
    ProductView(product)
}

@Composable
fun ProductView(producto:ProductModel){
    Column (Modifier.fillMaxWidth()){
        Row (Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.burger1), contentDescription = "",Modifier.width(100.dp))
            Column (Modifier.weight(1f)){
                Text(producto.productName, fontSize = 20.sp)
                Text(producto.desc ?: "", color = Color.DarkGray)
                Text("$${producto.price}0", fontWeight = FontWeight.Bold)
            }
            Column (verticalArrangement = Arrangement.Bottom){
                Button(onClick = {
                    
                }, shape = RoundedCornerShape(0.dp)) {
                    Text("Comprar")
                }
            }


        }
    }
}