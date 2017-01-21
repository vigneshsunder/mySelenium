package demo;

public class Demo {
	protected String i;

	public static void main(String[] args) {
		
		System.out.println("This is a Demo");
		Demo d = new Demo();
		d.vig();
		d.sun();
		System.setProperty("Vig", "Vignesh");
		System.out.println(System.currentTimeMillis());
		System.out.println(System.getProperty("Vig"));;
		char ch[] = new char[2];
		
		ch[0]='V';
		ch[1]='i';
		//ch[2]='g';
		//ch[3]='n';
		System.out.println(new String(ch));
		
		
	}
	void vig(){
		i="Vig";

	}
	void sun(){
		i="Sun";
		System.out.println(i);
	}

}


