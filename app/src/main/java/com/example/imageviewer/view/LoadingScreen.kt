package com.example.imageviewer.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.imageviewer.style.DarkGray
import com.example.imageviewer.style.DarkGreen
import com.example.imageviewer.style.Foreground
import com.example.imageviewer.style.TranslucentBlack

@Composable
fun LoadingScreen(text: String = "") {
    Box(
        modifier = Modifier.fillMaxSize().background(color = TranslucentBlack)
    ) {
        Box(modifier = Modifier.align(Alignment.Center)) {
            Surface(color = DarkGray, shadowElevation = 4.dp, shape = CircleShape) {
                CircularProgressIndicator(
                    modifier = Modifier.size(50.dp).padding(3.dp, 3.dp, 4.dp, 4.dp),
                    color = DarkGreen
                )
            }
        }
        Text(
            text = text,
            modifier = Modifier.align(Alignment.Center).offset(0.dp, 70.dp),
            style = MaterialTheme.typography.bodyLarge,
            color = Foreground
        )
    }
}