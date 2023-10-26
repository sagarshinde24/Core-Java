public abstract class ATM1 {
	abstract void withdraw();
	abstract void deposite();

	class ATM1Driver extends ATM1{
		public void withdraw() {
			System.out.println("Mony withdeaw");
		}
	    public void deposite() {
	    	System.out.println("Mony deposite");
	    }
		
   }
   class main{
   public static void main(String[] args) {
	 ATM1Driver a1 = new ATM1Driver();
       a1.withdraw();
       a1.deposite();
       
	}

   }
}