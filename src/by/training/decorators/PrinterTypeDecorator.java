package by.training.decorators;

import by.training.interfaces.Printer;

public class PrinterTypeDecorator implements Printer {
    private final Printer printer;

    private final String BY = " by ";

    public PrinterTypeDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        printer.print();
        StringBuilder builder = new StringBuilder()
                                    .append(BY)
                                    .append(printer.getClass().getSimpleName());
        System.out.print(builder);
    }
}
