public class Animal {
	public void eat() {
		System.out.println("All Animal eat");
	}
	class Harbiours extends Animal{
		public void eat() {
			System.out.println("They are eat plant only");
		}
	}
	class carniours extends Animal{
		public void eat() {
			System.out.println("They are eat animals");
		}
	}
    class ominiours extends Animal{
    	public void eat() {
    		System.out.println("They are eat plant and animals");
    	}
    }
    
   public static void main(String[] args) {
		
    	    Harbiours cow = new Harbiours();
	    cow.eat();
	    
	    carniours lion = new arniours();
	    lion.eat();
	}
   }
