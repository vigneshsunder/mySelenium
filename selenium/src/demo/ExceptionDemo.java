package demo;

public class ExceptionDemo {

	public static void main(String[] args) {
		int i;
		//String j="Vig";
		
		//i=0;
		try{
		i=100/0;
		System.out.println(i);
		}
		catch(Exception e){
			String a=e.getMessage();
			System.out.println(a);
		}
		

	}

}
