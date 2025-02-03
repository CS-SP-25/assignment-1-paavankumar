public class FourPointFivePercent implements SalesTaxBehavior{
    /**
     * Calculates 4.5% of the price being taxed.
     * @param value Price being taxed
     * @return tax on that price
     */
    @Override
    public Double compute(Double value) {
        return (value * 0.045); // 4.5% sales tax
    }
}
