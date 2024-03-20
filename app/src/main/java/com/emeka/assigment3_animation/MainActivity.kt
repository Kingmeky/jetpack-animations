package com.emeka.assigment3_animation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emeka.assigment3_animation.ui.theme.Assigment3_AnimationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assigment3_AnimationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(bottom = 16.dp)
        )
        FourButtonsRow()
    }
}

@Composable
fun FourButtonsRow() {
    Column(modifier = Modifier.fillMaxSize()) {
        Button(onClick = { /* Action for Button 1 */ }, modifier = Modifier.padding(bottom = 8.dp)) {
            Text(text = "Button 1")
        }
        Button(onClick = { /* Action for Button 2 */ }, modifier = Modifier.padding(bottom = 8.dp)) {
            Text(text = "Button 2")
        }
        Button(onClick = { /* Action for Button 3 */ }, modifier = Modifier.padding(bottom = 8.dp)) {
            Text(text = "Button 3")
        }
        Button(onClick = { /* Action for Button 4 */ }) {
            Text(text = "Button 4")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assigment3_AnimationTheme {
        Greeting("Android")
    }
}
