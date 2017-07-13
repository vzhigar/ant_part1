package by.training.decorators;

import by.training.interfaces.Printer;

public class QuotesDecorator implements Printer {
    private final Printer printer;

    private final String QUOTE = "\"";

    public QuotesDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        System.out.print(QUOTE);
        printer.print();
        System.out.print(QUOTE);
    }
}
