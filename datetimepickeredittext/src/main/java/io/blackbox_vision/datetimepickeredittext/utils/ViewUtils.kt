package io.blackbox_vision.datetimepickeredittext.utils

import android.content.ContextWrapper
import android.view.View
import androidx.fragment.app.FragmentActivity

fun View.getSupportFragmentManager(): androidx.fragment.app.FragmentManager? {
    return when (context) {
        is FragmentActivity -> {
            (context as FragmentActivity).supportFragmentManager
        }
        is ContextWrapper -> {
            ((context as ContextWrapper).baseContext as FragmentActivity).supportFragmentManager
        }
        else -> {
            null
        }
    }
}