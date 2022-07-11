package com.example.project.view.screens.signInUp

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.project.view.component._Button
import com.example.project.view.component._EditText
import com.example.project.view.component._Text
import com.example.project.view.component._TopAppBar

object ConfirmCodeScreen {
    @Composable
    fun Show(){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            _TopAppBar.MainButtonTopAppBar(text = "Введите данные о себе")
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Spacer(modifier = Modifier.height(15.dp))
                _Text.Text16Regular(text = "На ваш телефон отпавлено СМС\n" +
                        "с кодом подтверждения", textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.height(25.dp))
                _EditText.OutlinedTextFieldNumber("Код подтверждения")
                _Button.MainButton(text = "Далее")
            }
        }
    }
}