package com.yet.spring.core;

public class App {

    public static void main(String[] args) {
        App app = new App();

        app.client = new Client(1, "Петр Иваныч");
        app.eventLogger = new ConsoleEventLogger();

        app.logEvent("Некоё событие для пользователя 1.");
    }

    private Client client;
    private ConsoleEventLogger eventLogger;

    private void logEvent(String msg) {
        String message = msg.replaceAll(String.valueOf(client.getId()), client.getFullName());
        eventLogger.logEvent(message);
    }

}
