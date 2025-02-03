public class Hawaii extends State {
    public Hawaii() {this.setName("Hawaii");}

    /**
     * Prints out the tax of the value inputted to the console for Hawaii
     * @param value Amount of money being taxed
     */
    @Override
    public void showTax(double value) {
        String output = String.format("The sales tax on $%.02f in %s is $%.02f", value, this.getName(), this.getTax().compute(value));
        System.out.println(output);
    }
}
