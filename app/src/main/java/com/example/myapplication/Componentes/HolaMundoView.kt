package com.example.myapplication.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class MiObjeto(
    val esGrande:Boolean,
    val saludo: String,
    val fontColor: Color,
    val fontsize: TextUnit,
    val maxlines:Int
)

@Preview(showBackground = true)
@Composable
fun HolaMundoView(){
    /*val constante = "Hola Mundo IEST"
    val fontColor:Color = Color(0xFF411414)
    val fontsize:TextUnit = 25.sp
    val maxlines:Int = 2
    val esGrande = false*/

    val miObj = MiObjeto(false,"Adios mundo",Color(0xFF411414),25.sp,2)

    Text(
        miObj.saludo,
        color = miObj.fontColor,
        fontSize = miObj.fontsize,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Serif, 
        maxLines = if (miObj.esGrande) miObj.maxlines else 1,
        overflow = TextOverflow.Ellipsis,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(color = Color(0xFF2D2D2D))
            .padding(20.dp)
            .background(color = Color.Blue)
            .padding(horizontal = 10.dp)
            .background(color = Color.Green)
            .padding(top = 10.dp)
            .background(color = Color.DarkGray)
            .border(width = 5.dp, color = Color.Black)
            .fillMaxSize()
    )
}