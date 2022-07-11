package com.example.project.view.screens.signInUp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.project.view.component._TopAppBar

object PrivacyPolicyScreen {
    @Composable
    fun Show(){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            _TopAppBar.MainButtonTopAppBar(text = "Политика конфиденциальности")
            Column(
                modifier = Modifier.padding(10.dp)
            ) {

            }

        }
    }
}