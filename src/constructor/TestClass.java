package constructor;

public class TestClass {

	public static void main(String[] args) {
		
		
		
		/*SBIATM sbi1 = new SBIATM ();
	
		SBIATM sbi2 = new SBIATM (1299);*/	
	
		
		SBIATM sbi3 = new SBIATM (59142684,144,"06/12",5734);	
		System.out.println(sbi3.cardNo);
	    System.out.println(sbi3.CVV);
        System.out.println(sbi3.expiry);
        System.out.println(sbi3.pin);

	}

}
