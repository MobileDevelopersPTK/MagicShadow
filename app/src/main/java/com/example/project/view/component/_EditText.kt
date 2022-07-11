package com.example.project.view.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project.R

object _EditText {
    @Composable
    fun OutlinedTextFieldPhone(){
        val textv = remember {
            mutableStateOf("")
        }


        Box {
            Text(
                text = "+7",
                modifier = Modifier
                    .padding(start = 50.dp)
            )

            OutlinedTextField(
                value = textv.value,
                onValueChange = { textv.value = it },
                textStyle = TextStyle(
                    fontFamily = FontFamily(
                        Font(R.font.ubuntu_regular)
                    ),
                    textAlign = TextAlign.Left,
                    fontSize = 16.sp,
                    color = Color.Black
                ),
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
                    .padding(bottom = 15.dp)
                    .height(55.dp)
            )

        }

    }

    @Composable
    fun OutlinedTextFieldNumber(text: String){
        val textv = remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = textv.value,
            onValueChange = { textv.value = it },
            textStyle = TextStyle(
                fontFamily = FontFamily(
                    Font(R.font.ubuntu_regular)
                ),
                textAlign = TextAlign.Left,
                fontSize = 16.sp,
                color = Color.Black
            ),
            singleLine = true,
            placeholder = { _Text.Text16Regular(text = text)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth()
                .padding(bottom = 15.dp)
                .height(55.dp)
        )
    }

    @Composable
    fun OutlinedTextFieldText(text: String){
        val textv = remember {
            mutableStateOf("")
        }
        androidx.compose.material.OutlinedTextField(
            value = textv.value,
            onValueChange = { textv.value = it },
            textStyle = TextStyle(
                fontFamily = FontFamily(
                    Font(R.font.ubuntu_regular)
                ),
                textAlign = TextAlign.Left,
                fontSize = 16.sp,
                color = Color.Black
            ),
            singleLine = true,
            placeholder = (

                    { _Text.Text16Regular(text = text)}
                    ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth()
                .padding(bottom = 15.dp)
                .height(55.dp)
        )
    }
}