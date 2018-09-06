
public class BestTimeBuySell309 {
	
	public int maxPorfit(int[] prices){
		int sell = 0, preSell = 0, buy = Integer.MIN_VALUE, preBuy;
		for(int price : prices){
			preBuy = buy;
			buy = Math.max(preBuy, preSell-price);
			preSell = sell;
			sell = Math.max(preSell, preBuy+price);
		}
		return sell;
	}
}