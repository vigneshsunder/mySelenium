package demo;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.PriorityQueue;

import data.ReadDataFromExcel;

public class Demo {
	protected String i;
	int con;
		Demo(int i){
			this.con=i;
		}
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir")+"/src/data");
		System.out.println("This is a Demo");
		Demo d1 = new Demo(1);
		Demo d2 = new Demo(2);
		Demo d3 = new Demo(3);
		Demo d4 = new Demo(4);
		Demo d5 = new Demo(5);
/*		d.vig();
		//d.sun();
		System.setProperty("Vig", "Vignesh");
		System.out.println(System.currentTimeMillis());
		System.out.println(System.getProperty("Vig"));;
		char ch[] = new char[2];
		
		ch[0]='V';
		ch[1]='i';
		//ch[2]='g';
		//ch[3]='n';
		System.out.println(new String(ch));
		Date date = new Date();
		
		System.out.println(DateFormat.getDateTimeInstance().format(date));
		SimpleDateFormat df = new SimpleDateFormat("dd MMM yyyy hh:mm:ss a z");
		System.out.println(df.format(date));*/
		
		ArrayList<Demo> al = new ArrayList<Demo>();
		al.add(d1);
		al.add(d2);
		al.add(d3);
		al.add(d4);
		System.out.println(al.size());
		Iterator i1 = al.iterator();
		while(i1.hasNext()){
			Demo d = (Demo) i1.next();
			System.out.println(d.con);
		}
		Demo d = al.get(1);
		System.out.println(d.con);
		al.remove(1);
		Iterator i2 = al.iterator();
		while(i2.hasNext()){
			Demo de = (Demo) i2.next();
			System.out.println(de.con);
		}
		PriorityQueue<String> q = new PriorityQueue<String>();
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(1);
		System.out.println(".....................");
		ReadDataFromExcel excel = new ReadDataFromExcel();
		String[][] a = excel.ReadExcel();
		
		
		
	}
	void vig(){
		i="Vig";
		sun();

	}
	void sun(){
		i="Sun";
		System.out.println(i);
	}

}


