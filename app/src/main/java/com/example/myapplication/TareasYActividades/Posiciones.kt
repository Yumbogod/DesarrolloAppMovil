package com.example.myapplication.TareasYActividades

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PosicionesView(){
    Column (modifier = Modifier.background(Color.Red).fillMaxHeight()){
        Row (modifier = Modifier.background(Color.White).weight(1f).fillMaxWidth()){
            Column (modifier = Modifier.weight(1f)){
                Text("Top Start", modifier = Modifier.fillMaxWidth().background(Color.Red),color = Color.White)

            }
            Column (modifier = Modifier.weight(1f).fillMaxHeight().background(Color.Blue),
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("Top",color = Color.White)
            }
            Column (modifier = Modifier.weight(1f).height(50.dp).background(Color(0xFFF100AF)), horizontalAlignment = Alignment.End){
                Text("Top End", color = Color.White)

            }


        }
        Row (modifier = Modifier.background(Color.White).weight(2f).fillMaxWidth()){
            Column (modifier = Modifier.weight(2f).height(150.dp).background(Color.Green), verticalArrangement = Arrangement.Center){
                Text("Center start")

            }
            Column (modifier = Modifier.weight(1f).background(Color.Gray).fillMaxHeight(),
                verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                Text("Center")

            }
            Column (modifier = Modifier.weight(2f).background(Color.Black), horizontalAlignment = Alignment.End){
                Text("Center end",color=Color.White)

            }
        }
        Row (modifier = Modifier.background(Color.White).weight(1f).fillMaxWidth()){
            Column (modifier = Modifier.weight(1f).background(Color.Cyan).fillMaxHeight(), verticalArrangement = Arrangement.Bottom){
                Text("Center start")
            }
            Column (modifier = Modifier.weight(2f).background(Color.DarkGray).fillMaxHeight(), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally){
                Text("Bottom Center")
            }
            Column (modifier = Modifier.weight(1f).background(Color.Yellow).fillMaxHeight(), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.End){
                Text("Bottom End")
            }
        }

    }
}