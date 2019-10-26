package excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Test { //엑셀 불러와서 읽기
	
	
	public static void main(String[] args) throws BiffException, IOException { //예외처리
		//엑셀 파일 읽기
		
		File f= new File("excel.xls");
		Workbook wb= Workbook.getWorkbook(f);
		Sheet sh= wb.getSheet(0);//첫번째 시트
		
		int rows = sh.getRows(); //엑셀의 전체 행 알아내기
		
		//행은 정해져 있기에 for 사용
		for(int i =0; i<rows;i++) {//i<rows 작다라고 표현해야함 
			
			Cell cell =sh.getCell(0,i);//(열,행)
			String con = cell.getContents();
			System.out.println(con);
			
			Cell cell2 =sh.getCell(1,i);//(열,행)
			String con2 = cell2.getContents();
			System.out.println(con2);
			
			
		}
		
		
		
		
	}

}
