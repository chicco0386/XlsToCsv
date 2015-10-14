package it.zeze.xls;

import org.apache.poi.ss.examples.ToCSV;


public class XlsUtil {
	public static void convertToCSV(){
		System.out.println("convertToCSV entrato");
		String[] args = new String[3];
		args[0] = "C:/Users/yyi3867/Desktop/ZeZe/quotazioni_fantagenius_new.xls";
		args[1] = "C:/Users/yyi3867/Desktop/ZeZe";
		args[2] = ";";
		ToCSV.main(args);
		System.out.println("convertToCSV uscito");
	}
	
	public static void main(String[] args){
		XlsUtil.convertToCSV();
	}
}
