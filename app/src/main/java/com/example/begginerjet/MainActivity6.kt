package com.example.begginerjet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.begginerjet.ui.theme.BegginerjetTheme

class MainActivity6 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BegginerjetTheme {
                var name by remember {
                    mutableStateOf("")
                }
                var names by remember {
                    mutableStateOf(listOf<String>())
                }
                // A surface container using the 'background' color from the theme
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)) {
                    Row(modifier = Modifier.fillMaxWidth())
                    {
                        OutlinedTextField(value = name ,
                            onValueChange = {text ->
                                name = text
                            })
Button(onClick = {
    if (name.isNotBlank()) {
        names = names + name
    }
  }) {
    Text(text = "Add")
    
}
                    }
                 LazyColumn{
                     items(names){currentName->
                         Text(text = currentName)

                     }
                 }
                }
            }
        }
    }
}
