package com.example.begginerjet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.begginerjet.ui.theme.BegginerjetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BegginerjetTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background

                ) {
                    Greeting("Android")


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(modifier = Modifier.background(Color.Red).fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "HI $name!", color = Color.Blue, fontSize = 21.sp, modifier = Modifier
//            .background(
//                Color.DarkGray
//            )
//            .padding(15.dp)
//            .background(Color.LightGray)
        )
        Text(
            text = " what is going on it ! ",
            color = Color.Blue,
            fontSize = 21.sp,
            modifier = Modifier
//            .background(
//                Color.DarkGray
//            )
//            .padding(15.dp)
//            .background(Color.LightGray)
        )

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    BegginerjetTheme {
        Greeting("SKS")

    }
}