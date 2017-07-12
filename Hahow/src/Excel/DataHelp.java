package Excel;

import java.util.ArrayList;
import java.util.List;

public interface DataHelp {
	//java 8 interface可以實作,前面加上default即可使用getData功能
	//因為介面下可能有多個實作物件,若加了新功能,底下物件都需要更動,故實做介面的話可以避免
	default List<String[]> getData(){
		List<String[]> dataList=new ArrayList<String[]>();
		String[] row1=new String[] {"1","Amy","28"};
		String[] row2=new String[] {"1","Amy","28"};
		String[] row3=new String[] {"1","Amy","28"};
		dataList.add(row1);
		dataList.add(row2);
		dataList.add(row3);
		return dataList;//將這些資料寫進excel
	}

}
