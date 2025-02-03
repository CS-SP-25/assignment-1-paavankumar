public class SevenPercent implements SalesTaxBehavior {
    /**
     * Calculates 7% of the price being taxed.
     * @param value Price being taxed
     * @return tax on that price
     */
    @Override
    public Double compute(Double value) {
        return (value * 0.07); // 7% sales tax
    }
}
