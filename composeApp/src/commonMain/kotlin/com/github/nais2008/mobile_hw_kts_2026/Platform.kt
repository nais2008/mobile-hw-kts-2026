package com.github.nais2008.mobile_hw_kts_2026

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform