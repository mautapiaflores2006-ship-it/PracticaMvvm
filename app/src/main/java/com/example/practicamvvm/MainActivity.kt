package com.example.practicamvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.practicamvvm.ui.TeamScreen
import com.example.practicamvvm.ui.theme.PracticaMvvmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticaMvvmTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TeamScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}