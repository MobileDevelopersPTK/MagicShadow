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
import com.example.project.view.component._TopAppBar

object InputNumberScreen {
    @Composable
    fun Show(){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            _TopAppBar.MainTopAppBar(text = "Введите телефон")
            Spacer(modifier = Modifier.height(20.dp))
            _EditText.OutlinedTextFieldPhone()
            _Button.MainButton(text = "Далее")
        }
    }
}