package com.chitmeo.kalimba.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.chitmeo.kalimba.R

@Composable
fun HomeScreen(
    onPlayClick: () -> Unit,
    onLessonsClick: () -> Unit
) {
    BoxWithConstraints(
        modifier = Modifier.fillMaxSize()
    ) {
        val isLandscape = maxWidth > maxHeight

        if (isLandscape) {
            LandscapeHomeContent(
                onPlayClick = onPlayClick,
                onLessonsClick = onLessonsClick
            )
        } else {
            PortraitHomeContent(
                onPlayClick = onPlayClick,
                onLessonsClick = onLessonsClick
            )
        }

    }
}

@Composable
private fun PortraitHomeContent(
    onPlayClick: () -> Unit,
    onLessonsClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("A LITTLE MUSIC, EVERY DAY")

        Spacer(modifier = Modifier.height(8.dp))

        Image(
            painter = painterResource(R.drawable.kalimba),
            contentDescription = "Wooden Kalimba instrument",
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text("Slow down. Play something beautiful.")

        Spacer(modifier = Modifier.height(24.dp))
        /*
        HomeActions(
            onPlayClick = onPlayClick,
            onLessonsClick = onLessonsClick
        )
        */
    }
}

@Composable
private fun LandscapeHomeContent(
    onPlayClick: () -> Unit,
    onLessonsClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text("A LITTLE MUSIC, EVERY DAY")

            Spacer(modifier = Modifier.height(8.dp))

            Text("Kalimba Tutor")

            Spacer(modifier = Modifier.height(8.dp))

            Text("Slow down. Play something beautiful.")

            Spacer(modifier = Modifier.height(16.dp))

            HomeActions(
                onPlayClick = onPlayClick,
                onLessonsClick = onLessonsClick
            )
        }

        Image(
            painter = painterResource(R.drawable.kalimba_landscape),
            contentDescription = "Close-up of wooden Kalimba keys",
            modifier = Modifier
                .weight(1.2f)
                .fillMaxSize(),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
private fun HomeActions(
    onPlayClick: () -> Unit,
    onLessonsClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = onPlayClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Play Kalimba")
        }
        /*
        OutlinedButton(
            onClick = onLessonsClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Explore Lessons")
        */
    }
}
