package com.tahmed30.SpringBootSLF4JLogging;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ColoredSLF4J {

    //ANSI Color set
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_WHITE = "\u001B[37m";
    private static final String ANSI_GREEN = "\u001B[32m";

    //Log Level
    public enum LogLevel{
        INFO(ANSI_BLACK), WARN(ANSI_YELLOW), ERROR(ANSI_RED), DEBUG(ANSI_WHITE), TRACE(ANSI_GREEN);

        private final String colorCode;

        LogLevel(String colorCode) {
            this.colorCode = colorCode;
        }

        public String getColorCode() {
            return colorCode;
        }
    }

    public static void log(LogLevel logLevel, String logMessage){
        log.info(logLevel.getColorCode() + logMessage + ANSI_RESET);
    }

}
