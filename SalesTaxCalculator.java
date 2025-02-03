public class SalesTaxCalculator {
    public static void main(String[] args) {
        // check first argument to see if it is a valid state
        switch (args[0]) {
            case "Indiana" -> {
                Indiana Indiana = new Indiana();
                Indiana.setTax(new NoTax()); // set tax dynamically via setTax method
                Indiana.showTax(Double.parseDouble(args[1])); // print out tax to console
            }
            case "Alaska" -> {
                Alaska Alaska = new Alaska();
                Alaska.setTax(new SevenPercent()); // set tax dynamically via setTax method
                Alaska.showTax(Double.parseDouble(args[1])); // print out tax to console
            }
            case "Hawaii" -> {
                Hawaii Hawaii = new Hawaii();
                Hawaii.setTax(new FourPointFivePercent()); // set tax dynamically via setTax method
                Hawaii.showTax(Double.parseDouble(args[1])); // print out tax to console
            }
            // not valid state, so print to console that it is invalid
            default -> System.out.println("Invalid argument! Not Alaska, Indiana, or Hawaii.");
        }
    }
}
