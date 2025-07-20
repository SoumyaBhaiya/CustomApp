package com.example.customapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.customapp.ui.theme.CustomAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CustomAppTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background){}

                    BhaiyasHeading("Bhaiyas",
                        "in development",
                        modifier = Modifier.padding(8.dp))

                }
            }
        }
    }

@Composable
fun BhaiyasHeading(message: String, from: String, modifier: Modifier = Modifier){
    Column(verticalArrangement = Arrangement.Center,
        modifier = modifier) {
        Text(
            text = message,
            fontSize = 70.sp,
            lineHeight = 80.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 16.sp,
            modifier = Modifier.padding(18.dp).align(alignment = Alignment.End)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ThePreviewOfHeading() {
    CustomAppTheme {
        BhaiyasHeading("Bhaiyas", "in development")
    }
}