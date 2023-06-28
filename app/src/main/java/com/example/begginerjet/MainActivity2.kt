package com.example.begginerjet

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.begginerjet.ui.theme.BegginerjetTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BegginerjetTheme {
                Greeting2("Android")
                // A surface container using the 'background' color from the theme
//                Surface(
//
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//
//                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String) {
//  Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
//      contentDescription = "Hi done" )
//Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,) {
//    for (i in 1..20)
//
//
//        androidx.compose.material.Icon(imageVector = Icons.Default.Add, contentDescription = "null")
//
//}// LazyColumn
    LazyRow(modifier = Modifier.fillMaxSize()){
items(10){
    androidx.compose.material.Icon(imageVector = Icons.Default.Add, contentDescription = null, modifier = Modifier.size(100.dp))

}
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    BegginerjetTheme {
        Greeting2("Android")
    }
}