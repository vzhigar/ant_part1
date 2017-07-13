package by.training.impls;

import by.training.interfaces.Printer;

public class SublimePrinter implements Printer {
    private final String poster;

    public SublimePrinter(String poster) {
        this.poster = poster;
    }

    @Override
    public void print() {
        System.out.print(poster);
    }
}
