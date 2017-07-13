package by.training.impls;

import by.training.interfaces.Printer;

public class LaserPrinter implements Printer {
    private final String text;

    public LaserPrinter(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.print(text);
    }
}
