package excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Lotto {
	
	
	//13번 열부터 19번 열까지 번호 추출/ 행 은 3번부터 끝까지
	public static void main(String[] args) throws BiffException, IOException { //예외처리
		//엑셀 파일 읽기
		
		File f= new File("lotto.xls");
		Workbook wb= Workbook.getWorkbook(f);
		Sheet sh= wb.getSheet(0);//첫번째 시트
		
		int rows = sh.getRows(); //엑셀의 전체 행 알아내기
		
		//행은 정해져 있기에 for 사용
		for(int i =3; i<rows;i++) {//i<rows 작다라고 표현해야함  i가 4번째 행부터 시작해야함
			
			Cell cell =sh.getCell(13,i);//(열,행)
			String con = cell.getContents();
			System.out.print(con+ " ");
			

			Cell cell2 =sh.getCell(14,i);//(열,행)
			String con2 = cell2.getContents();
			System.out.print(con2+ " ");
			
			Cell cell3 =sh.getCell(15,i);//(열,행)
			String con3 = cell3.getContents();
			System.out.print(con3+ " ");
			
			Cell cell4 =sh.getCell(16,i);//(열,행)
			String con4 = cell4.getContents();
			System.out.print(con4+ " ");
			

			Cell cell5 =sh.getCell(17,i);//(열,행)
			String con5 = cell5.getContents();
			System.out.print(con5+ " ");
			
			Cell cell6 =sh.getCell(18,i);//(열,행)
			String con6 = cell6.getContents();
			System.out.print(con6+ " ");
			
			Cell cell7 =sh.getCell(19,i);//(열,행)
			String con7 = cell7.getContents();
			System.out.println(con7+ " ");
			
			
		}
		
	}
}

