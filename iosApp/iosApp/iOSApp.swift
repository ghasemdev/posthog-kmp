import ComposeApp
import SwiftUI

@main
struct iOSApp: App {
    init() {
        MainViewControllerKt.setupPostHog()
    }
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
