package day22;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginUsingReflections {
	LoginKeywords keys=new LoginKeywords();
	Method[] methods=keys.getClass().getMethods();
	@Test
	public void loginTest() throws IOException, InterruptedException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		
		FileInputStream f=new FileInputStream("E:\\Aug31Batch\\Selenium\\src\\com\\qedge\\keywords\\LoginKeywords.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r=row.next();
			String action=r.getCell(3).getStringCellValue();
			executeActions(action);
		}
	}
	public void executeActions(String action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(int i=0;i<methods.length;i++)
		{
			if(action.equals(methods[i].getName()))
			{
				methods[i].invoke(keys);
				break;
			}
		}
	}
		
}

	