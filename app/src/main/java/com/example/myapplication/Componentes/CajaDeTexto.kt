package com.example.myapplication.Componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun CajaDeTexto(){
    var n1 by remember {
        mutableStateOf("")
    }
    var n2 by remember {
        mutableStateOf("")
    }
    var result by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Escribe un numero")
        TextField(value=n1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text("primer numero") },
            onValueChange ={
                it ->
                n1 = it
            }
        )
        TextField(value=n2,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text("segundo numero") },
            onValueChange ={
                it ->
                n2 = it
            }
        )
        Button(onClick = {
            result = n1.toInt() + n2.toInt()
        }) {
            Text("Calcular suma")
        }
        Text("Resultado: " + result)

    }
}

