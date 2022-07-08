package com.example.project.view.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.project.R

object _Text {
    @Composable
    fun TitleToolbar(text: String){
        Text(
            text = text,
            color = Color.Black,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily(Font(R.font.ubuntu_bold)),
            modifier = Modifier.fillMaxWidth()
        )
    }

    @Composable
    fun Text16Regular(text: String){
        Text(
            text = text,
            color = Color.Black,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily(Font(R.font.ubuntu_regular)),
            modifier = Modifier.fillMaxWidth()
        )
    }
}