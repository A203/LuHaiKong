package affs;

class Person {
	String name;
	int age;
	String address;
	void introduce(){
		System.out.println("��Һã��ҽ�"+name+"���ҽ���"+age+"�ˣ�����"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person=new Person();
        person.name="����";
        person.age=20;
        person.address="USA";
        
        person.introduce();
	}

}
