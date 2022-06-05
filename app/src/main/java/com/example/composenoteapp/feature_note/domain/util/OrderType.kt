package com.example.composenoteapp.feature_note.domain.util

sealed class OrderType {
    // 오름차순 or 내림차순
    object Ascending: OrderType()
    object Descending: OrderType()
}
