package abstarction;

public abstract class Bird1 {
	abstract void Sound(); 
}

class Duck1 extends Bird1{
	void Sound() {	
		System.out.println("Sounds Of Duck");
	}
}

class Owl1 extends Bird1{

	void Sound() {	
		System.out.println("Sounds Of Duck");
	}
}

