public abstract class State {
    private String name;
    private SalesTaxBehavior tax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTax(SalesTaxBehavior tax) { this.tax = tax; }

    public SalesTaxBehavior getTax() { return tax; }

    /**
     * Prints out the tax of the value inputted to the console for the State
     * @param value amount of money being taxed
     */
    public void showTax(double value) {
        String output = String.format("The sales tax on $%.02f in %s is $%.02f", value, name, tax.compute(value));
        System.out.println(output);
    }
}
