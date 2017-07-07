package JAVA;

public class HW2 {

	public static void main(String[] args) {
		// JSON:JavaScript Object Notation\
		String json="[{\"animal_id\":\"12345\",\"animal_kind\":\"cat\",\"animal_sex\":\"F\"},"+
					"{\"animal_id\":\"67789\",\"animal_kind\":\"pig\",\"animal_sex\":\"M\"}]";
		String[] cat=new String[4];
		String[] dog=new String[4];
		json=json.replace("[","").replace("]", "");//去除[]
		System.out.println(json);
		
		String catData = json.substring(json.indexOf("{"),json.indexOf("}")+1);//取前半部
		String tmp = catData.replace("{", "").replace("}","");
		System.out.println(catData);
		cat = tmp.split(",");
		System.out.println(cat[2]);
		
		
		String dogData = json.replace(catData+"," ,"");//將前面的字串移除取得後半部
		System.out.println(dogData);
		String tmp2 = dogData.replace("{", "").replace("}","");
		dog = tmp2.split(",");
		System.out.println(dog[2]);
		

			
		
	}


	}


