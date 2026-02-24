package com.github.nais2008.mobile_hw_kts_2026

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.github.nais2008.mobile_hw_kts_2026.navigation.AppNavigation
@Composable
@Preview
fun App() {
    MaterialTheme {
        Surface {
            AppNavigation()
        }
    }
}