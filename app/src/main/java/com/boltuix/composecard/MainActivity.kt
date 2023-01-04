package com.boltuix.composecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.boltuix.composecard.ui.theme.ComposeCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProductDesign()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeCardTheme {
        ProductDesign()
    }
}


@Preview
@Composable
fun ProductDesign() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(80.dp)
            .shadow(
                elevation = 25.dp,
                ambientColor = Blue,
                spotColor = Cyan,
                shape = RoundedCornerShape(20.dp),
            ),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor =  White),
        elevation = CardDefaults.cardElevation(defaultElevation =  10.dp),
        content = {


            Image(
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = null, // decorative
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
            )

            Column() {//modifier = Modifier.padding(16.dp)
                Text(
                    text = "Title",
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleLarge,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    modifier = Modifier.fillMaxWidth().padding(16.dp,6.dp,16.dp,16.dp),
                    textAlign = TextAlign.Center,
                    text = "Get started with Android (Kotlin, Jet Compose) & IOS (Swift UI), MVVM clean architecture, and Beautiful UI UX design patterns. Get started with Android (Kotlin, Jet Compose) & IOS (Swift UI), MVVM clean architecture, and Beautiful UI UX design patterns. Get started with Android (Kotlin, Jet Compose) & IOS (Swift UI), MVVM clean architecture, and Beautiful UI UX design patterns. Get started with Android (Kotlin, Jet Compose) & IOS (Swift UI), MVVM clean architecture, and Beautiful UI UX design patterns.Sub title Example code for android + composes app developers.",
                    style = MaterialTheme.typography.titleSmall,
                )


                Box {
                    SmallFloatingActionButton(
                        modifier = Modifier.align(Alignment.BottomStart),
                        shape = RoundedCornerShape(0.dp,20.dp,0.dp,0.dp),
                        onClick = { /* do something */ },
                    ) {
                        Icon(Icons.Filled.Add, contentDescription = "Localized description")
                    }
                }
            }

            /*Box(modifier = Modifier.height(200.dp).padding(16.dp)) {
                Text("This is a card view")
            }*/
        }
    )


}
