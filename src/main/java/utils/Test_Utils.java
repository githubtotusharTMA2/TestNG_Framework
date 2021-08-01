package utils;

import java.util.ArrayList;

import xls_reader.XLS_Reader;

public class Test_Utils
{
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICITLY_WAIT = 20;
	static XLS_Reader reader;
	
	public static ArrayList<Object[]> get_Data_From_Excel()
	{
		ArrayList<Object[]> my_Data = new ArrayList<Object[]>();
		
		try {
			reader = new XLS_Reader("E:\\QA_Infotech\\Training_Works\\Eclipse\\Workspace_2\\Projects\\TestNG_Framework\\src\\main\\java\\excel_file\\data_excel.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		int num_of_rows = reader.getRowCount("Sheet1");
		System.out.println("num_of_rows = " + num_of_rows);

		for(int rownum = 2; rownum <= num_of_rows; rownum++)
		{
			System.out.println("rownum = " + rownum);
			String firstName = reader.getCellData("Sheet1", "firstName", rownum);
			String lastName = reader.getCellData("Sheet1", "lastName", rownum);
			System.out.println("firstName = " + firstName + " and lastName = " + lastName);
			my_Data.add(new Object[] {firstName, lastName});
		}
		
		return my_Data;
	}
}
