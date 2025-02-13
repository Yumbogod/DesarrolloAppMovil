package com.example.myapplication.Compartido

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun ListadoView(){
    Column (modifier = Modifier.fillMaxSize()){
        TerminalView()
        TerminalView()
        TerminalView()
        TarjetaView()
        TarjetaView(Color.Black,Color.DarkGray)
        TarjetaView(fondo = Color.DarkGray)
        TarjetaView(texto = "BBVA", colorTexto = Color.White, fondo = Color.Blue)

    }
}