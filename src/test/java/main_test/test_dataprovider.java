package main_test;

import java.util.Map;

import org.testng.annotations.Test;

import Datautils.Data_Supplier;
import youtube_home.Home_page;
import youtube_home.Youtube_search;

public class test_dataprovider extends Base_test {
	
	
	
	@Test(dataProvider="youtube" , dataProviderClass= Data_Supplier.class)
	
	public void youtbe_action(Map obj) throws Exception{
		
		 Home_page home = new  Home_page(driver);
		 
		// home.click_on_showmore();
//		 home.choose_type((String) obj.get("type"));
		 String choosing_type = (String) obj.get("type");
		 if(choosing_type.equals("Search")) {
			
			 Youtube_search search = new Youtube_search(driver);
			 search.searching_channel((String) obj.get("channel"));
			 
		 }else {
		 home.taking_list((String) obj.get("search_text"));
		 home.selecting_explore((String) obj.get("Explore"));
		 home.open_playlist();
		 
		 
//		 Youtube_search search = new Youtube_search(driver);
//		 search.searching_channel((String) obj.get("channel"));
		 
	}
	}
	

}
