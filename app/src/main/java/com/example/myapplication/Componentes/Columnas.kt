package com.example.myapplication.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ColumnasView(){
    Column(
        modifier = Modifier.padding(20.dp).fillMaxSize().background(color = Color.Gray),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text("Hola",color = Color.Red, modifier = Modifier.background(Color.Blue).fillMaxWidth(), textAlign = TextAlign.Center)
        Text("Adios",color = Color.Yellow, modifier = Modifier.background(Color.Black))
        Column(
            modifier = Modifier.fillMaxSize().background(Color(0xFF5E0D0D)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text("Hasta pronto", color = Color.White)
        }

    }
}