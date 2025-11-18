package com.inyte13.appcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.inyte13.appcompose.ui.theme.AppComposeTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      miBtnComponent()

    }
  }
}
@Composable
fun miBtnComponent(){
  Box(
    modifier=Modifier.fillMaxSize(),
    contentAlignment= Alignment.Center
  ) {
    val context = LocalContext.current
    Button(onClick = {
      Toast.makeText(context, "Has presionado el botón", Toast.LENGTH_LONG).show()
    }) { Text("¡Púlsame!") }
  }
}
