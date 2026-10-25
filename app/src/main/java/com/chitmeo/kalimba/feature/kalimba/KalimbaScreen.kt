package com.chitmeo.kalimba.feature.kalimba
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

private val WoodColor = Color(0xFF8B5E3C)
private val KeyColor = Color(0xFFE8D6B8)
private val SelectedKeyColor = Color(0xFFD5A35D)

@Composable
fun KalimbaScreen(
    onBackClick: () -> Unit
) {
    var selectedNote by remember { mutableStateOf("C5") }

    val notes = listOf(
        "C4", "D4", "E4", "F4", "G4", "A4", "B4",
        "C5", "D5", "E5", "F5", "G5", "A5", "B5",
        "C6", "D6", "E6"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F0E5))
            .padding(16.dp)
    ) {
        TextButton(onClick = onBackClick) {
            Text("← Back")
        }

        Text(
            text = "Play Kalimba",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text("Tap a key to select a note.")

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(
                    color = WoodColor,
                    shape = RoundedCornerShape(28.dp)
                )
                .padding(12.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(3.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                notes.forEach { note ->
                    val isSelected = note == selectedNote

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(if (isSelected) 190.dp else 150.dp)
                            .background(
                                color = if (isSelected) {
                                    SelectedKeyColor
                                } else {
                                    KeyColor
                                },
                                shape = RoundedCornerShape(6.dp)
                            )
                            .clickable {
                                selectedNote = note
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = note,
                            style = MaterialTheme.typography.labelSmall,
                            color = Color(0xFF493426)
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Selected note: $selectedNote",
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                // Audio playback will be implemented in the next task.
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Play Note")
        }
    }
}