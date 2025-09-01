package com.artisantek;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {

    /**
     * Creates and configures the Javalin application instance.
     * This method contains the core application configuration and can be used by tests.
     *
     * @return configured Javalin instance (not started)
     */
    public static Javalin createApp() {
        return Javalin.create(config -> {
            // Serve "index.html" from "resources/public" on root path "/"
            config.spaRoot.addFile("/", "/public/index.html", Location.CLASSPATH);
        });
    }

    /**
     * Main method - entry point for the application.
     * Creates the app and starts it on port 5000.
     */
    public static void main(String[] args) {
        Javalin app = createApp().start(5000);

        // Custom log for feature-my-feature branch
        System.out.println("\n[feature-my-feature] Application is running on http://localhost:5000");
        System.out.println("[feature-my-feature] Press Ctrl+C to stop.");

        // Example extra log to trigger pipeline visibility
        System.out.println("[feature-my-feature] Pipeline should detect this code change.");
    }
}


