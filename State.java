public abstract class State {
    private String name;
    private SalesTaxBehavior tax;

    public String getName() {
        return name;
    }

    public void setTax(SalesTaxBehavior tax) {
        this.tax = tax;
    }

    public SalesTaxBehavior getTax() {
        return tax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showTax(double value) {
    }
}
