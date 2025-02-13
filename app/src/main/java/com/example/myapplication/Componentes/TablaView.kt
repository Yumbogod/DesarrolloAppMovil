package com.example.myapplication.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun TablasView(){
    Column (modifier = Modifier.fillMaxSize()) {
        Text("Hola", modifier = Modifier.background(Color.Blue).weight(7f))
        Text("Adios", modifier = Modifier.background(Color.Red).weight(3f))
    }
}