package Excel;

import java.util.ArrayList;
import java.util.List;

public interface DataHelp {
	//java 8 interface�i�H��@,�e���[�Wdefault�Y�i�ϥ�getData�\��
	//�]�������U�i�঳�h�ӹ�@����,�Y�[�F�s�\��,���U���󳣻ݭn���,�G�갵�������ܥi�H�קK
	default List<String[]> getData(){
		List<String[]> dataList=new ArrayList<String[]>();
		String[] row1=new String[] {"1","Amy","28"};
		String[] row2=new String[] {"1","Amy","28"};
		String[] row3=new String[] {"1","Amy","28"};
		dataList.add(row1);
		dataList.add(row2);
		dataList.add(row3);
		return dataList;//�N�o�Ǹ�Ƽg�iexcel
	}

}
