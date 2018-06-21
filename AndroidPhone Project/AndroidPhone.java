import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class AndroidPhone{
	private String phoneName,phoneBrand;
	private int phonePrice,screenSize;
	private boolean isAudioJackPresent;
	private double thickness;

	public void buildPhone(String phoneName,String phoneBrand,int phonePrice,int screenSize,boolean isAudioJackPresent,double thickness){
		this.phoneName=phoneName;
		this.phoneBrand=phoneBrand;
		this.phonePrice=phonePrice;
		this.screenSize=screenSize;
		this.isAudioJackPresent=isAudioJackPresent;
		this.thickness=thickness;
	}
	public void myAwesomePhone(){
		System.out.println("phoneName:"+phoneName);
		System.out.println("phoneBrand:"+phoneBrand);
		System.out.println("phonePrice:"+phonePrice);
		System.out.println("screenSize:"+screenSize);
		System.out.println("isAudioJackPresent?:"+isAudioJackPresent);
		System.out.println("thickness:"+thickness);

	}

	public static void main(String[] args) {
		
		AndroidPhone m=new AndroidPhone();
		String name,brand;
		int price,screenSize;
		boolean isAudioJackPresent;
		double thickness;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter phoneName:");
		name=scan.nextLine();
		System.out.println("Enter phoneBrand:");
		brand=scan.nextLine();
		System.out.println("Enter phonePrice:");
		price=scan.nextInt();
		System.out.println("Enter screenSize:");
		screenSize=scan.nextInt();
		System.out.println("isAudioJackPresent?:");
		isAudioJackPresent=scan.nextBoolean();
		System.out.println("Enter thickness:");
		thickness=scan.nextDouble();
		m.buildPhone(name,brand,price,screenSize,isAudioJackPresent,thickness);
		m.myAwesomePhone();
		scan.close();
	}
}