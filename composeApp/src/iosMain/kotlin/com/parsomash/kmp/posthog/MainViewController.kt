package com.parsomash.kmp.posthog

import PostHog.PostHogConfig
import PostHog.PostHogSDK
import androidx.compose.ui.window.ComposeUIViewController
import kotlinx.cinterop.ExperimentalForeignApi

fun MainViewController() = ComposeUIViewController { App() }

@OptIn(ExperimentalForeignApi::class)
fun setupPostHog() {
    val config = PostHogConfig(apiKey = "", host = "")
    PostHogSDK.shared().setup(config)
}
