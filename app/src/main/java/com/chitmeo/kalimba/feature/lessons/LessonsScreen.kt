package com.chitmeo.kalimba.feature.lessons

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LessonsScreen(
    onBackClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text(
            text = "Lessons",
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("Start with the basics.")

        Spacer(modifier = Modifier.height(24.dp))

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Lesson 01 — Meet Your Kalimba")
                Text("Beginner · 5 min")
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedButton(onClick = onBackClick) {
            Text("Back to Home")
        }
    }
}