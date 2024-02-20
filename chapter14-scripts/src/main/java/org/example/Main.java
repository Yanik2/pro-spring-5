package org.example;

import javax.script.ScriptEngineManager;

public class Main {
    public static void main(String[] args) {
        final var scriptEngine = new ScriptEngineManager();
        final var engine = scriptEngine.getEngineByName("JavaScript");
        System.out.println(engine);
        scriptEngine.getEngineFactories()
            .forEach(ef -> {
                final var name = ef.getEngineName();
                final var languageName = ef.getLanguageName();
                final var langVersion = ef.getLanguageVersion();
                System.out.println("name: " + name + "\n langname: " + languageName + "\n langVErsion: " + langVersion);
            });
    }
}