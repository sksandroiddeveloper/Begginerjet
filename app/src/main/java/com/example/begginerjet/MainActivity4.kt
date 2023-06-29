package com.example.begginerjet

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.begginerjet.ui.theme.BegginerjetTheme

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BegginerjetTheme {
                Greeting3("Android")
            }
        }
    }
}

@Composable
fun Greeting3(name: String) {

  androidx.compose.material3.Icon(imageVector = Icons.Default.Add, contentDescription = null)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    BegginerjetTheme {
        Greeting3("Android")
    }
}