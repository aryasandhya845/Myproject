package constructor;
class Student {

	    Student() {
	        this(101);
	        System.out.println("Default Constructor");
	    }

	    Student(int id) {
	        System.out.println("Parameterized Constructor: " + id);
	    }

	    public static void main(String[] args) {
	        Student s = new Student();
	    }
	}

