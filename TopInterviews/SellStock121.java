
public class SellStock121 {
	
	

	public static void main(String[] args){
		int[] n = {0,6,-3,7};
		System.out.println(maxProfit(n));
	}
	public static int maxProfit(int[] prices){
		if(prices == null || prices.length < 2){
			return 0;
		}
		int profit = 0, minPrice = prices[0];
		for(int i = 1; i < prices.length; i++){
			profit = Math.max(profit, prices[i] - minPrice);
			minPrice = Math.min(minPrice, prices[i]);
		}
		return profit;
	}	
}