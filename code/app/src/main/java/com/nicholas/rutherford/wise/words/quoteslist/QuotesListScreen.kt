package com.nicholas.rutherford.wise.words.quoteslist

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nicholas.rutherford.wise.words.data.Quote

@Composable
fun QuotesListScreen(quotes: List<Quote>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(14.dp)
    ) {
        quotes.forEach { quote ->
            Text(
                text = quote.title,
                modifier = Modifier.padding(4.dp),
                textAlign = TextAlign.Start
            )
            Text(
                text = quote.author,
                modifier = Modifier.padding(4.dp),
                textAlign = TextAlign.Start
            )
        }
    }
}

@Composable
@Preview
fun QuotesListScreenPreview() {
    val quotes = listOf(
        Quote("The only limit to our realization of tomorrow is our doubts of today.", "Franklin D. Roosevelt"),
        Quote("The purpose of our lives is to be happy.", "Dalai Lama"),
        Quote("Life is what happens when you're busy making other plans.", "John Lennon"),
        Quote("Get busy living or get busy dying.", "Stephen King"),
        Quote("You have within you right now, everything you need to deal with whatever the world can throw at you.", "Brian Tracy"),
        Quote("Believe you can and you're halfway there.", "Theodore Roosevelt"),
        Quote("The only impossible journey is the one you never begin.", "Tony Robbins"),
        Quote("Act as if what you do makes a difference. It does.", "William James"),
        Quote("Success is not how high you have climbed, but how you make a positive difference to the world.", "Roy T. Bennett"),
        Quote("In the end, it's not the years in your life that count. It's the life in your years.", "Abraham Lincoln")
    )

    Column(modifier = Modifier.background(Color.White)) {
        QuotesListScreen(quotes = quotes)
    }
}