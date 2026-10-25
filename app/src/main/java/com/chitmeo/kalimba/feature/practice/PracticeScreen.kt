package com.chitmeo.kalimba.feature.practice

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PracticeScreen(
    onBackClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text(
            text = "Practice",
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text("Your quiet moment with music.")

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "C4    D4    E4    F4    G4",
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("Your virtual Kalimba will appear here.")

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedButton(onClick = onBackClick) {
            Text("Back to Home")
        }
    }
}