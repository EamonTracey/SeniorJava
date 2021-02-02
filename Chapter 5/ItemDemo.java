public class ItemDemo {

    public static void main(String[] args) {

        ItemSales norweiganSynthPopBandAhaSongSales = new ItemSales();
        norweiganSynthPopBandAhaSongSales.initialize(5.99, 10, 5);
        norweiganSynthPopBandAhaSongSales.registerSale(8);
        norweiganSynthPopBandAhaSongSales.displaySales();

        ItemSales zoomieSales = new ItemSales();
        zoomieSales.initialize(149.99, 25, 7.5);
        zoomieSales.registerSale(30);
        zoomieSales.displaySales();

    }

}

/*
Below is the given implementation of ItemSales.
*/

public class ItemSales 
{
    private int numberSold;
    private double sales;
    private double discounts;
    private double itemCost;
    private int bulkMin;
    private double bulkDiscount;
     
    public void initialize(double cost, int bulk, double discount) 
	{
        numberSold = 0;
        sales = 0.0;
        discounts = 0.0;
        itemCost = cost;
        bulkMin = bulk;
        bulkDiscount = discount;
    }
    
    public void displaySales()
	{
        System.out.println(
                "Total Sales revenue is : " + sales + " on the sale of " + numberSold +
                " items with " + discounts + " total discounts awarded.");
    }
    
    public void registerSale(int n)
	{
        
        if(n>0)
		{
            double basicCost = itemCost * n;
            double discountGiven = 0.0;
            numberSold += n;
            if(n >= bulkMin){
                discountGiven = basicCost * bulkDiscount / 100;
            }
            sales += (basicCost - discountGiven);
            discounts += discountGiven;
            
        }
        
    }
}