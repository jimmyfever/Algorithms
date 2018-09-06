
public class BestTimeToBuyAndSell121 {
	
	

	public static void main(String[] args){
		
	}
	// Kadane's Algorithm
	public int maxProfit(int[] prices){
		if(prices == null || prices.length == 0) return 0;

		int cur = 0, max = 0;
		for(int i = 1; i < prices.length; i++){
			cur = Math.max(0, cur += prices[i] - prices[i - 1]);
			max = Math.max(max, cur);
		}
		return max;
	}	
}