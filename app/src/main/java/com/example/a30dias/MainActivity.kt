package com.example.a30dias

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a30dias.data.Suggestion
import com.example.a30dias.ui.theme._30DiasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DiasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun App() {
    val suggestions = listOf(
        Suggestion(stringResource(id = R.string.suggestion1), R.drawable.ic_launcher_foreground),
        Suggestion(stringResource(id = R.string.suggestion2), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion3), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion4), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion5), R.drawable.ic_launcher_foreground),
        Suggestion(stringResource(id = R.string.suggestion6), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion7), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion8), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion9), R.drawable.ic_launcher_foreground),
        Suggestion(stringResource(id = R.string.suggestion10), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion11), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion12), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion13), R.drawable.ic_launcher_foreground),
        Suggestion(stringResource(id = R.string.suggestion14), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion15), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion16), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion17), R.drawable.ic_launcher_foreground),
        Suggestion(stringResource(id = R.string.suggestion18), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion19), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion20), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion21), R.drawable.ic_launcher_foreground),
        Suggestion(stringResource(id = R.string.suggestion22), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion23), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion24), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion25), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion26), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion27), R.drawable.ic_launcher_foreground),
        Suggestion(stringResource(id = R.string.suggestion28), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion29), R.drawable.ic_launcher_background),
        Suggestion(stringResource(id = R.string.suggestion30), R.drawable.ic_launcher_background),
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.app_name)) }
            )
        }
    ) {
        SuggestionList(suggestions = suggestions)
    }
}

@Composable
fun SuggestionList(suggestions: List<Suggestion>) {
    LazyColumn {
        items(suggestions) { suggestion ->
            SuggestionItem(suggestion = suggestion)
        }
    }
}

@Composable
fun SuggestionItem(suggestion: Suggestion) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = suggestion.imageResource),
                contentDescription = null,
                modifier = Modifier.size(200.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = suggestion.text,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
fun PreviewApp() {
    App()
}