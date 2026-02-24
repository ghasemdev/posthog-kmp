package com.parsomash.kmp.posthog

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform