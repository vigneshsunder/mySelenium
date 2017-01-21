package demo;

public class StringDemo {

	public static void main(String[] args) {
		
		String s = "My name is Vignesh Sunder";
		System.out.println(s.length());
		System.out.println(s.replace(" ", ""));
		String sp[]=s.split(" ",4);
		for(String st:sp){
			System.out.println(st);
		}
		System.out.println(s.startsWith("y n",1));
	}

}
