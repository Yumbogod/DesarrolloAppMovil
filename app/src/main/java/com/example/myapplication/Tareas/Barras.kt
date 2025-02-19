package com.example.myapplication.Tareas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)

@Composable
fun Barras(){
    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.weight(1f)) {
            Row(modifier = Modifier.weight(1f).padding(10.dp).fillMaxWidth().background(Color(0xFF080D21))){
            }
            Row(modifier = Modifier.weight(1f).padding(10.dp).fillMaxWidth().background(Color(0xFF29FF67))){
            }
            Row(modifier = Modifier.weight(1f).padding(10.dp).fillMaxWidth().background(Color(0xFF080D21))){
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Column (modifier = Modifier.weight(1f).padding(10.dp).fillMaxHeight().background(Color(0xFF080D21))) {
            }
            Column (modifier = Modifier.weight(1f).padding(10.dp).fillMaxHeight().background(Color(0xFF00BCD4))) {
            }
            Column (modifier = Modifier.weight(1f).padding(10.dp).fillMaxHeight().background(Color(0xFF080D21))) {
            }

        }

    }

}