package com.chitmeo.kalimba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chitmeo.kalimba.ui.theme.KalimbaTheme
import com.chitmeo.kalimba.navigation.AppNavigation
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KalimbaTheme {
                AppNavigation()
            }
        }
    }
}

@Preview()
@Composable
fun GreetingPreview() {
    AppNavigation()
}