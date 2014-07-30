import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hearthstone.dao.MainListDAO;
import com.hearthstone.model.Card;

public class AppTester {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new FileSystemXmlApplicationContext(
		 * "C:/GHL/MY_WORKSPACE/NetAdmin Workspace _juno/myheartstone/applicationContext.xml"
		 * );
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/appcon.xml");

		MainListDAO mainList = (MainListDAO) context.getBean("MainListDAO");
		// mainList.createCard("sample string");
		List<Card> card = mainList.getCards();
	}
}
