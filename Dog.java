package constructor;



 class Animal
 {
	 Animal() {
	        System.out.println("Animal Constructor");
	    }
 }
public class Dog {

	Dog() {
        super();
        System.out.println("Dog Constructor");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
    }

}
