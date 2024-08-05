package com.nicholas.rutherford.wise.words.quoteslist

import androidx.lifecycle.ViewModel
import com.nicholas.rutherford.wise.words.data.Quote
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuotesListViewModel @Inject constructor(): ViewModel() {

    fun fetchTestList(): List<Quote> {
        return listOf(
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
    }
}