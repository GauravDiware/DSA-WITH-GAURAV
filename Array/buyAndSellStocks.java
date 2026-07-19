import java.util.*;
public class buyAndSellStocks{

    public static int predictStackPrice(int StockPrice[]){
        int buying_price = Integer.MAX_VALUE;
        int maxProfit= 0;

        for(int i = 0;i<StockPrice.length;i++){
            if(buying_price < StockPrice[i]){
                int profit = StockPrice[i] - buying_price;
                maxProfit = Math.max(maxProfit , profit);

            }else{
                buying_price = StockPrice[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int StockPrice[] = {7,1,5,3,6,4};
        System.out.println(predictStackPrice(StockPrice));
    }
}