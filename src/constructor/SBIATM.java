package constructor;

public class SBIATM {
	
	long cardNo;
	int CVV;
	String expiry;
	int pin;
	
	public SBIATM() {
		
		System.out.println("This is the first non parametarised constructor of SBIATM class");	
  }
	
	public SBIATM(int cardNo ) {
		
		System.out.println("This is the first parametarised constructor of SBIATM class with cardNo ->" +cardNo);	
	}
		public SBIATM(long cardNo,int CVV,String expiry, int pin)	{
	
			System.out.println("cardNo:" + cardNo + "CVV:" + CVV + "String expiry:" + expiry + "pin:" + pin);
	this.cardNo=cardNo;
	this.CVV=CVV;
	this.expiry=expiry;
	this.pin=pin;
		
	}
}
