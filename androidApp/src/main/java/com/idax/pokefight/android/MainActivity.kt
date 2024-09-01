package com.idax.pokefight.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.idax.pokefight.Greeting
import com.idax.pokefight.SharedAndroidTesting
import com.idax.pokefight.SharedCommonTesting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingView(Greeting().greet())
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    val value1 = SharedCommonTesting.testing
    val value2 = SharedAndroidTesting.testing
    val value3 = AndroidTesting.testing
    // val value4 = SharedIOSTesting.testing
    val value4 = "SharedIOSTesting class is not available"
    Column(
        modifier = Modifier
            .padding(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Android app",
        )
        Text(text = value1)
        Text(text = value2)
        Text(text = value3)
        Text(text = value4)
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
