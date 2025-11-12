package com.example;

import static spark.Spark.*;

public class SentimentApp {
    public static void main(String[] args) {
        port(8080);

        get("/api/sentiment", (req, res) -> {
            String text = req.queryParams("text");
            res.type("application/json");

            String sentiment = analyzeSentiment(text);
            return String.format("{\"sentiment\": \"%s\"}", sentiment);
        });

        get("/health", (req, res) -> {
            return "OK";
        });
    }

    private static String analyzeSentiment(String text) {
        if (text == null || text.isEmpty()) return "neutral";

        String lowerText = text.toLowerCase();
        if (lowerText.contains("good") || lowerText.contains("great") ||
                lowerText.contains("excellent") || lowerText.contains("happy")) {
            return "positive";
        } else if (lowerText.contains("bad") || lowerText.contains("terrible") ||
                lowerText.contains("awful") || lowerText.contains("sad")) {
            return "negative";
        }
        return "neutral";
    }
}