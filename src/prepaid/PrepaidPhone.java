package prepaid;

public class PrepaidPhone {

	private int limit;
	
	public PrepaidPhone(int startLimit) {
		this.limit = startLimit;
	}

	public void makeCall(int min) throws PrepaidException {
		
		if (min > limit) {
			throw new PrepaidException("Przekroczyles limit");
		}
		
		limit -= min;
		System.out.println("Nice talk");
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void addToLimit(int min) {
		limit += min;
		
		//limit = limit + min;
	}
}
