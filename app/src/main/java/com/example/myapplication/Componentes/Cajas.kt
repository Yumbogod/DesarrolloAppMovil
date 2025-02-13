package com.example.myapplication.Componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTimeFilled
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@Preview(showBackground = true)
@Composable
fun CajasView(){
    Box(
        modifier = Modifier.background(Color.Blue).size(64.dp)
    ){
        Image(painter = painterResource(id = R.drawable.alien), contentDescription = "fondo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            alpha = 0.8f
        )
        Text("1", modifier = Modifier.align(Alignment.TopStart), color = Color.White)
        Text("2", modifier = Modifier.align(Alignment.TopCenter), color = Color.White)
        Text("3", modifier = Modifier.align(Alignment.TopEnd), color = Color.White)
        Text("4", modifier = Modifier.align(Alignment.CenterStart), color = Color.White)
        Text("5", modifier = Modifier.align(Alignment.Center), color = Color.White)
        Text("6", modifier = Modifier.align(Alignment.CenterEnd), color = Color.White)
        Text("7", modifier = Modifier.align(Alignment.BottomStart), color = Color.White)
        Text("8", modifier = Modifier.align(Alignment.BottomCenter), color = Color.White)
        Text("9", modifier = Modifier.align(Alignment.BottomEnd), color = Color.White)
        Icon(imageVector = Icons.Default.AccessTimeFilled, contentDescription = "alarma", tint = Color.White)
        Icon(painter = painterResource(id= R.drawable.niggandroid), contentDescription = "icono",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}