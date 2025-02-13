package com.example.myapplication.Componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ColumnasSeparadas(){
    Column(modifier = Modifier.fillMaxSize()){
        Text("1")
        Spacer(modifier = Modifier.height(16.dp))
        Text("2")
        Spacer(modifier = Modifier.height(40.dp))
        HorizontalDivider()
        Text("3")
    }
}