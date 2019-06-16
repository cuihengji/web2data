package user123.app123.recipe3;


import java.util.Date;

import com.web2data.open.RxJuniorStep;
import com.web2data.open.RxResult;
import com.web2data.open.RxTask;
import com.web2data.utility.U;

public class Step2 extends RxJuniorStep {

	@Override
	protected RxTask createTestTask() {
		return new RxTask("https://www.baidu.com", "零壹光年", "3");
	}
	
	
	@Override
	public void execute( RxTask myTask, RxResult result ) {
		
		for (int i = 0; i < 10; i++ ) {
			System.out.print(" Step2 ");
			U.sleepSeconds(1);
		}

//		long startTime = System.currentTimeMillis();
//		
//		for (int i = 1; i <= 100; i++) {
//			
//			   String sql = " insert into test(name) values(?) ";
//			   String companyName = "大连瑞雪科技 " + i;
//			   System.out.print(i);
//			   Object[] hotelTypeRoomParams = new Object[]{companyName};
//               try {
//            	   Integer compayId = myDatabase.insert(sql, hotelTypeRoomParams);
//            	   System.out.println(compayId);
//               } catch (Exception e) {
//            	   e.printStackTrace();
//               }
//		}
//		
//		long endTime = System.currentTimeMillis();
//		long times = endTime - startTime;
//		System.out.println("times: " + times);
//		
//		
//		
//		//SessionThreadLocal.getBrowserSession()._browser.refreshTabWindows();
//		
//		RxBrowser myBrowser = myCrawler.getRxBrowser();
//		
//		
//		myBrowser.open( "http://www.baidu.com/" );
//		
//		U.sleepSeconds( 1 * 3 );
//		
//		RxNode node1 = myBrowser.getNodeByXpath("//*[@id='jgwab']");
//		System.out.println("百度备案号1：" + node1.getText());
//		node1.click(); // 打开新的TabWindow
//		U.sleepSeconds( 1 * 3 );
//		
//				myBrowser.openTabWindow();
//				RxNode node2 = myBrowser.getNodeByXpath("/html/body/div[2]/div/div/div/div[2]/div[1]/a/p");
//				//RxNode node2 = crawler.getNodeByXpath("/html/body/div[1]/div[1]/div/div/ul/li[2]/a");
//				System.out.println("备案号2：" + node2.getText());
//				node2.click(); // 打开新的TabWindow
//				U.sleepSeconds( 1 * 3 );
//				
//						//myBrowser.openTabWindow();
//						RxNode node3 = myBrowser.getNodeByXpath("/html/body/div[2]/div/div/div/div[2]/div[1]/a/p");
//						System.out.println("备案号3：" + node3.getText());
//						//node3.click(); // 打开新的TabWindow
//						U.sleepSeconds( 1 * 3 );
//						myBrowser.closeTabWindow();
//				
//				RxNode node22 = myBrowser.getNodeByXpath("/html/body/div[2]/div/div/div/div[2]/div[1]/a/p");
//				System.out.println("备案号22：" + node22.getText());
//				U.sleepSeconds( 1 * 3 );
//				myBrowser.closeTabWindow();
//		
//		RxNode node11 = myBrowser.getNodeByXpath("//*[@id='jgwab']");
//		System.out.println("百度备案号11：" + node11.getText());
//		
//		U.sleepSeconds( 1 * 3 );
//		myBrowser.close();
//		
//		myTask.setFinishedCode( 200 );
//		
		//System.out.println(" ---------------------- Step2.execute() 2 ---------------------------------" + new Date() );
		
		return;
	}
	
}
