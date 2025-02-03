public class NoTax implements SalesTaxBehavior {
    /**
     * Calculates 0.0% of the price being taxed.
     * @param value Price being taxed
     * @return tax on the price, which will always be $0
     */
    @Override
    public Double compute(Double value) {
        return 0.00; // No sales tax
    }
}
