package affs;

class Person {
	String name;
	int age;
	String address;
	void introduce(){
		System.out.println("大家好，我叫"+name+"，我今年"+age+"了，我在"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person=new Person();
        person.name="张三";
        person.age=20;
        person.address="USA";
        
        person.introduce();
	}

}
