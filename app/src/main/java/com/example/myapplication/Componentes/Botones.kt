package com.example.myapplication.Componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@Preview(showBackground = true)
@Composable
fun BotonesView(){
    var texto by remember {
        mutableStateOf("Center")
    }
    var cambio by remember {
        mutableStateOf(false)
    }

    Box(modifier = Modifier.fillMaxSize().background(Color.Blue))
    {
        Column (modifier = Modifier.fillMaxHeight().align(Alignment.Center), verticalArrangement = Arrangement.Center){
            HorizontalDivider()
            Row (horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth())
            {
                Text(texto)
                Icon(painter = painterResource(id= R.drawable.niggandroid),
                    contentDescription = "icono",
                )
            }
            HorizontalDivider()
            Button(
                onClick = {
                    if(!cambio){
                        texto = "HOLAAAAAA"
                    }
                    else{
                        texto = "ADIOSSS"
                    }
                    cambio = !cambio
                },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red, contentColor = Color.White)
            ) {
                Text("Cambiar Texto")
            }
        }


        Text(texto,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .background(Color.Black)
                .fillMaxWidth(), color = Color.White, textAlign = TextAlign.Center
        )
        Image(painter = painterResource(id = R.drawable.alien), contentDescription = "fondo",
            contentScale = ContentScale.Crop, modifier = Modifier.align(Alignment.TopEnd)
        )
    }
}