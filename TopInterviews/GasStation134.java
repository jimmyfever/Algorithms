
public class GasStation134 {
	
	

	public static void main(String[] args){
		
	}
	public int canComplete(int[] gas, int[] cost){
		if(gas == null || gas.length == 0 || cost == null || cost.length == 0){
			return -1;
		}

		int start = 0, total = 0, tank = 0;
		for(int i = 0; i < gas.length; i++){
			tank += gas[i] - cost[i];
			total += gas[i] - cost[i];
			if(tank < 0){
				start = i;
				tank = 0;
			}
		}
		return (total < 0) ? -1 : start + 1;
	}	
}