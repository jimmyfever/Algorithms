
public class SellStockII122 {
	
	

	public static void main(String[] args){
		int[] n = {7,1,5,3,6,4};
		System.out.println(maxProfit(n));
	}
	public static int maxProfit(int[] prices){
		int total = 0;
		for(int i = 0; i < prices.length - 1; i++){
			if(prices[i + 1] >= prices[i]){
				total += prices[i + 1] - prices[i];
			}
		}
		return total;
	}	
}