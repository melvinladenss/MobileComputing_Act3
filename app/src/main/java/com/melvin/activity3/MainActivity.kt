package com.melvin.activity3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.melvin.activity3.ui.theme.Activity3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Activity3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayUI(
                        "Text composable",
                        "Displays text and follows the recommended Material Design guidelines.",
                        "Image composable",
                        "Creates a composable that lays out and draws a given Painter class object.",
                        "Row composable",
                        "A layout composable that places its children in a horizontal sequence.",
                        "Column composable",
                        "A layout composable that places its children in a vertical sequence."
                    )
                }
            }
        }
    }
}

@Composable
fun DisplayUI(title1: String, message1: String, title2: String, message2: String, title3: String, message3: String, title4: String, message4: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxSize()
    )
    {
        Column(
            modifier = modifier.fillMaxWidth(0.5f)
        )
        {
            Column(
                modifier
                    .background(Color(0xFFEADDFF))
                    .fillMaxHeight(0.5f)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = title1,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = message1,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
            }

            Column(
                modifier
                    .background(Color(0xFFB69DF8))
                    .fillMaxHeight(1f)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = title3,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = message3,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
            }
        }

        Column(
            modifier = modifier.fillMaxWidth(1f)
        )
        {
            Column(
                modifier
                    .background(Color(0xFFD0BCFF))
                    .fillMaxHeight(0.5f)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = title2,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = message2,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
            }

            Column(
                modifier
                    .background(Color(0xFFF6EDFF))
                    .fillMaxHeight(1f)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = title4,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = message4,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DisplayUIPreview() {
    Activity3Theme {
        DisplayUI(
            "Text composable",
            "Displays text and follows the recommended Material Design guidelines.",
            "Image composable",
            "Creates a composable that lays out and draws a given Painter class object.",
            "Row composable",
            "A layout composable that places its children in a horizontal sequence.",
            "Column composable",
            "A layout composable that places its children in a vertical sequence."
        )
    }
}