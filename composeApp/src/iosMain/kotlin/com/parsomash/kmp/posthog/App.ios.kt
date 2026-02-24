package com.parsomash.kmp.posthog

import PostHog.PostHogSDK
import kotlinx.cinterop.ExperimentalForeignApi

@OptIn(ExperimentalForeignApi::class)
actual fun posthogCapture(event: String) {
    PostHogSDK.shared().capture(event)
}
