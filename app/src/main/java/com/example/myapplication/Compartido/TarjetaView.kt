package com.example.myapplication.Compartido

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun TarjetaPreview(){
    TarjetaView(Color.Blue,Color.Black)
}

@Composable
fun TarjetaView(colorTexto: Color = Color.Red, fondo: Color = Color.Black, texto:String = "HSBC"){
    Card(colors = CardDefaults.cardColors(contentColor = colorTexto,
        containerColor = fondo)) {
        Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Row(){
                Text(texto + "   ")
                Text("1234 7456 3285 7598")
            }
        }
    }
}