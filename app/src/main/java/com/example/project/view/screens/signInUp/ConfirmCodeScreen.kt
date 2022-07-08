package com.example.project.view.screens.signInUp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
            _TopAppBar.MainButtonTopAppBar(text = "Введите код")
            Spacer(modifier = Modifier.height(25.dp))
            _Text.Text16Regular(text = "На ваш телефон отпавлено СМС\n" +
                    "с кодом подтверждения")
            Spacer(modifier = Modifier.height(25.dp))
            _EditText.OutlinedTextFieldNumber("Код подтверждения")
            _Button.MainButton(text = "Далее")
        }
    }
}