package by.training.impls;

import by.training.interfaces.Printer;

public class MatrixPrinter implements Printer {
    private final String voucher;

    public MatrixPrinter(String voucher) {
        this.voucher = voucher;
    }

    @Override
    public void print() {
        System.out.print(voucher);
    }
}
