package com.example.customapp

import android.drm.DrmStore.RightsStatus
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
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
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BhaiyaImage(modifier = Modifier)
                    BhaiyasHeading("Bhaiyas", "in development", modifier = Modifier)
                    GeneralPurposeText(
                        "This is some general purpose text.", modifier = Modifier
                    )
                }
            }
        }
    }
}
@Composable
fun BhaiyasHeading(message: String, from: String, modifier: Modifier = Modifier){
    Column(verticalArrangement = Arrangement.Top,
        modifier = modifier) {
        Text(
            text = message,
            fontSize = 70.sp,
            lineHeight = 26.sp,
            textAlign = TextAlign.Right
        )
        Text(
            text = from,
            fontSize = 16.sp,
            modifier = Modifier.padding(8.dp).align(alignment = Alignment.End)
        )
    }

}

@Composable
fun GeneralPurposeText(sometext:String, modifier: Modifier ){
    Row(horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.Bottom,
        modifier = modifier){
        Text(
            text = sometext,
            fontSize = 30.sp,
            textAlign = TextAlign.Right
        )

    }
}

@Composable
fun BhaiyaImage(modifier: Modifier){
    val image = painterResource(R.drawable.bhaiyas)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier

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
@Preview
@Composable
fun ThePreviewOfImage(){
    CustomAppTheme {
        BhaiyaImage(modifier = Modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun ThePreviewOfText(){
    CustomAppTheme {
        GeneralPurposeText("Some text here", modifier = Modifier)
    }
}