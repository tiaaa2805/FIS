package org.example;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

public class Main {
    public static void main(String[] args) {
        AnsiConsole.systemInstall();

        String language;

        if (args.length == 0) {
            language = "en";
        } else {
            language = args[0].toLowerCase();
        }
        Greeting gp = new Greeting(language);

        System.out.println(Ansi.ansi()
                .fg(gp.getGreetingColor()).a(gp.getGreeting() + " ")
                .fg(gp.getPersonColor()).a(gp.getPerson() + " ")
                .fg(gp.getPunctuationColor()).a(gp.getPunctuation())
                .reset()
        );

        AnsiConsole.systemUninstall();
    }
}
///trebuue mereu resincuit mergem in Maven din dreapta si dam resincuire
///apoi mai tarziu la mvm clean package trebuie sa ma mut in folderul de baza!!!
///ala cu exec trebuie pus in plugins
