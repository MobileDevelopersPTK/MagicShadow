package com.example.project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project.view.component._Button
import com.example.project.view.component._EditText
import com.example.project.view.component._Text
import com.example.project.view.component._TopAppBar
import com.example.project.view.theme.ProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainTopAppBar()
        }
    }
}

@Composable
fun MainTopAppBar(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        _TopAppBar.MainButtonTopAppBar(text = "Введите данные о себе")
        Spacer(modifier = Modifier.height(25.dp))
        _Text.Text16Regular(text = "На ваш телефон отпавлено СМС\n" +
                "с кодом подтверждения")
        Spacer(modifier = Modifier.height(25.dp))
        _EditText.OutlinedTextFieldNumber("Код подтверждения")
        _Button.MainButton(text = "Далее")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProjectTheme {
        MainTopAppBar()
    }
}