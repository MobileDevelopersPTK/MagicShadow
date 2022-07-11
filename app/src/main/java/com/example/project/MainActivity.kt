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
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
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

    var checkedState1 by remember { mutableStateOf(false) }
    var checkedState2 by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        _TopAppBar.MainButtonTopAppBar(text = "Введите данные о себе")
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Spacer(modifier = Modifier.height(15.dp))
            _EditText.OutlinedTextFieldText("Имя")
            _EditText.OutlinedTextFieldText("Фамилия")
            _Text.Text15Regular(text = "Необязательные", textAlign = TextAlign.Left)
            Spacer(modifier = Modifier.height(10.dp))
            _EditText.OutlinedTextFieldText("Ник")
            Row(
                modifier = Modifier
                    .height(30.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = checkedState1,
                    onCheckedChange = { checkedState1 = !checkedState1 },
                    colors  = CheckboxDefaults.colors(
                        checkedColor = Color(0xff, 0xb6, 0xc1),
                        checkmarkColor = Color.Red,
                        uncheckedColor = Color.Black)
                )
                _Text.TextCheckbox(text = "Скрыть имя и фамилию для всех", color = Color.Red, TextDecoration.None)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Checkbox(
                    checked = checkedState2,
                    onCheckedChange = { checkedState2 = !checkedState2 },
                    colors  = CheckboxDefaults.colors(
                        checkedColor = Color(0x8B8B8B),
                        checkmarkColor = Color.Black,
                        uncheckedColor = Color.Black)
                )
                Column(modifier = Modifier.padding(0.dp, 15.dp)) {
                    _Text.TextCheckbox(text = "Согласен со следующими документами:", color = Color.Black, TextDecoration.None)
                    Spacer(modifier = Modifier.height(8.dp))
                    _Text.TextCheckbox(text = "- политика конфеденциальности", color = Color.Blue, TextDecoration.Underline)
                    Spacer(modifier = Modifier.height(8.dp))
                    _Text.TextCheckbox(text = "- обработка персональных данных", color = Color.Blue, TextDecoration.Underline)
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            _Button.MainButton(text = "Зарегистрироваться")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProjectTheme {
        MainTopAppBar()
    }
}