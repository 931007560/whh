import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.ltl.common.utils.DateUtil;
import com.ltl.common.utils.FileUtil;

public class MyTest {

	
	
	@Test
	public void test1() {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		Date date = new Date();
		System.out.println(date);
		String format = sdf.format(date);
		System.out.println(format);
		date.setTime(Long.parseLong(format));
		System.out.println(date);
	}
	
	@Test 
	public void getDateByInitMonthTest() {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		Date date = new Date();
		String date1 = sdf.format(date);
		System.out.println(date1);
		System.out.println("-----------------------------------");
		Date dateByInitMonth = DateUtil.getDateByInitMonth(date);
		String date2 = sdf.format(dateByInitMonth);
		System.out.println(date2);
	}
	
	@Test 
	public void getExtendNameTest() {
		String extendName = FileUtil.getExtendName("123.jsp");
		System.out.println(extendName);
	}
	
	
}
