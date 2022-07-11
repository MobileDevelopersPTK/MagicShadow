package com.example.project.view.screens.signInUp

import androidx.compose.foundation.layout.*
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
            Column(
                modifier = Modifier.padding(10.dp)
            ){
                Spacer(modifier = Modifier.height(20.dp))
                _EditText.OutlinedTextFieldPhone()
                _Button.MainButton(text = "Далее")
            }
        }
    }
}