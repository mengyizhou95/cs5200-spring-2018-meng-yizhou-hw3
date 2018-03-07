package edu.northeastern.cs5200;

import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.northeastern.cs5200.function.strToDate;

import edu.northeastern.cs5200.JDM.*;
import edu.northeastern.cs5200.model.*;

@SpringBootApplication
public class JdbcHwApplication {

	public static void main(String[] args) {
		//start app
		SpringApplication.run(JdbcHwApplication.class, args);
		
		//create developer and users
		DeveloperDao developerdao = DeveloperDao.getInstance();
		developer developer0 = new developer(0, "Alice", "Wonder", "alice", "alice", "alice@wonder.com", null, "developer");
		developerdao.createDeveloper(developer0);
		
		developer developer1 = new developer(1, "Bob", "Marley", "bob", "bob", "bob@marley.com", null, "developer");
		developerdao.createDeveloper(developer1);
		
		developer developer2 = new developer(2, "Charles", "Garcia", "charlie", "chalie", "chuch@garcia.com", null, "developer");
		developerdao.createDeveloper(developer2);
		
		developer developer3 = new developer(3, "Dan", "Martin", "dan", "dan", "dan@martin.com", null, "user");
		developerdao.createDeveloper(developer3);
		
		developer developer4 = new developer(4, "Ed", "Karaz", "ed", "ed", "ed@kar.com", null, "user");
		developerdao.createDeveloper(developer4);
		
		//create website for developer
		long time = System.currentTimeMillis();
		WebsiteDao websitedao = WebsiteDao.getInstance();
		Website website0 = new Website();
		Role role0 = new Role(0, developer0, website0, "alice", "Owner");
		Role role1 = new Role(1, developer0, website0, "bob", "Editor");
		Role role2 = new Role(2, developer0, website0, "charlie", "Admin");
		website0 = new Website(0, "Facebook", "an online social media and social networking service", new Date(time), new Date(time), 1234234, developer0, null, new ArrayList<Role>(), null);
		website0.addRole(role0);website0.addRole(role1);website0.addRole(role2);
		websitedao.createWebsiteForDeveloper(developer0.getId(), website0);
		
		Website website1 = new Website();
		role0 = new Role(0, developer1, website1, "bob", "Owner");
		role1 = new Role(1, developer1, website1, "charlie", "Editor");
		role2 = new Role(2, developer1, website1, "alice", "Admin");
		website1 = new Website(1, "Twitter", "an online news and social networking service", new Date(time), new Date(time), 4321543, developer1, null, new ArrayList<Role>(), null);
		website1.addRole(role0);website1.addRole(role1);website1.addRole(role2);
		websitedao.createWebsiteForDeveloper(developer1.getId(), website1);
		
		Website website2 = new Website();
		role0 = new Role(0, developer2, website2, "charlie", "Owner");
		role1 = new Role(1, developer2, website2, "alice", "Editor");
		role2 = new Role(2, developer2, website2, "bob", "Admin");
		website2 = new Website(2, "Wikipedia", "a free online encyclopedia", new Date(time), new Date(time), 3456654, developer2, null, new ArrayList<Role>(), null);
		website2.addRole(role0);website2.addRole(role1);website2.addRole(role2);
		websitedao.createWebsiteForDeveloper(developer2.getId(), website2);
		
		Website website3 = new Website();
		role0 = new Role(0, developer0, website3, "alice", "Owner");
		role1 = new Role(1, developer0, website3, "bob", "Editor");
		role2 = new Role(2, developer0, website3, "charlie", "Admin");
		website3 = new Website(3, "CNN", "an American basic cable and satellite television news channel", new Date(time), new Date(time), 6543345, developer0, null, new ArrayList<Role>(), null);
		website3.addRole(role0);website3.addRole(role1);website3.addRole(role2);
		websitedao.createWebsiteForDeveloper(developer0.getId(), website3);
		
		Website website4 = new Website();
		role0 = new Role(0, developer1, website4, "bob", "Owner");
		role1 = new Role(1, developer1, website4, "charlie", "Editor");
		role2 = new Role(2, developer1, website4, "alice", "Admin");
		website4 = new Website(4, "CNET", "an American media website that publishes reviews, news, articles, blogs, podcasts and videos on technology and consumer electronics", new Date(time), new Date(time), 5433455, developer1, null, new ArrayList<Role>(), null);
		website4.addRole(role0);website4.addRole(role1);website4.addRole(role2);
		websitedao.createWebsiteForDeveloper(developer1.getId(), website4);
		
		Website website5 = new Website();
		role0 = new Role(0, developer2, website5, "charlie", "Owner");
		role1 = new Role(1, developer2, website5, "alice", "Editor");
		role2 = new Role(2, developer2, website5, "bob", "Admin");
		website5 = new Website(5, "Gizmodo", "a design, technology, science and science fiction website that also writes articles on politics", new Date(time), new Date(time), 4322345, developer2, null, new ArrayList<Role>(), null);
		website5.addRole(role0);website5.addRole(role1);website5.addRole(role2);
		websitedao.createWebsiteForDeveloper(developer2.getId(), website5);
		
		//due time
		strToDate convert = new strToDate();
		Date dueDate = convert.strToDate("2018-03-04");
		//due time
		
		//create page for website
		PageDao pagedao = PageDao.getInstance();
		Page page0 = new Page();
		role0 = new Role(0, website4, page0, "alice", "Editor");
		role1 = new Role(1, website4, page0, "bob", "Reviewer");
		role2 = new Role(2, website4, page0, "charlie", "Writer");
		page0 = new Page(0, "Home", "Landing page", dueDate, dueDate, 123434, website4, null, new ArrayList<Role>());
		page0.addRole(role0);page0.addRole(role1);page0.addRole(role2);
		pagedao.createPageForWebsite(website4.getId(), page0);
		
		Page page1 = new Page();
		role0 = new Role(0, website5, page1, "bob", "Editor");
		role1 = new Role(1, website5, page1, "charlie", "Reviewer");
		role2 = new Role(2, website5, page1, "alice", "Writer");
		page1 = new Page(1, "About", "Website description", dueDate, dueDate, 234545, website5, null, new ArrayList<Role>());
		page1.addRole(role0);page1.addRole(role1);page1.addRole(role2);
		pagedao.createPageForWebsite(website5.getId(), page1);
		
		Page page2 = new Page();
		role0 = new Role(0, website2, page2, "charlie", "Editor");
		role1 = new Role(1, website2, page2, "alice", "Reviewer");
		role2 = new Role(2, website2, page2, "bob", "Writer");
		page2 = new Page(2, "Contact", "Addresses, phones, and contact info", dueDate, dueDate, 345656, website2, null, new ArrayList<Role>());
		page2.addRole(role0);page2.addRole(role1);page2.addRole(role2);
		pagedao.createPageForWebsite(website2.getId(), page2);
		
		Page page3 = new Page();
		role0 = new Role(0, website3, page3, "charlie", "Editor");
		role1 = new Role(1, website3, page3, "alice", "Reviewer");
		role2 = new Role(2, website3, page3, "bob", "Writer");
		page3 = new Page(3, "Preferences", "Where users can configure their preferences", dueDate, dueDate, 456776, website3, null, new ArrayList<Role>());
		page3.addRole(role0);page3.addRole(role1);page3.addRole(role2);
		pagedao.createPageForWebsite(website3.getId(), page3);
		
		Page page4 = new Page();
		role0 = new Role(0, website4, page4, "bob", "Editor");
		role1 = new Role(1, website4, page4, "charlie", "Reviewer");
		role2 = new Role(2, website4, page4, "alice", "Writer");
		page4 = new Page(4, "Profile", "Users can configure their personal information", dueDate, dueDate, 567878, website4, null, new ArrayList<Role>());
		page4.addRole(role0);page4.addRole(role1);page4.addRole(role2);
		pagedao.createPageForWebsite(website4.getId(), page4);
		
		//create widget for page
		WidgetDao widgetdao = WidgetDao.getInstance();
		HeadingWidget widget0 = new HeadingWidget(0, "head123", 0, 0, null, null, "Welcom", 0, page0, 2);
		widgetdao.createWidgetForPage(page0.getId(), widget0);
		
		HtmlWidget widget1 = new HtmlWidget(1, "post234", 0, 0, null, null, "<p>lorem</p>", 0, page1, null);
		widgetdao.createWidgetForPage(page1.getId(), widget1);
		
		HeadingWidget widget2 = new HeadingWidget(2, "head234", 0, 0, null, null, "Hi", 1, page2, 2);
		widgetdao.createWidgetForPage(page2.getId(), widget2);
		
		HtmlWidget widget3 = new HtmlWidget(3, "intro456", 0, 0, null, null, "<h1>Hi</h1>", 2, page2, null);
		widgetdao.createWidgetForPage(page2.getId(), widget3);
		
		ImageWidget widget4 = new ImageWidget(4, "image345", 50, 100, null, null, null, 3, page2, "/img/567.png");
		widgetdao.createWidgetForPage(page2.getId(), widget4);
		
		YoutubeWidget widget5 = new YoutubeWidget(5, "video456", 400, 300, null, null, null, 0, page3, "https://youtu.be/h67VX51QXiQ", true, true);
		widgetdao.createWidgetForPage(page3.getId(), widget5);
		
		//Implement updates
		developer0.setEmail("333-444-555");
		developerdao.updateDeveloper(0, developer0);
		
		Widget widget = widgetdao.findWidgetById(2);
		widget.setOrder(3);
		widgetdao.updateWidget(2, widget);
		
		List<Page> page = new ArrayList<Page>();
		page = pagedao.findPagesForWebsite(4);
		for(Page p: page) {
			p.setTitle("CNET" + p.getTitle());
		}
		
		Page swappage = new Page();
		for(Page p: page) {
			String title = p.getTitle();
			if(title == "Home") {
				swappage = p;
			}
		}
		List<Role> roleList = new ArrayList<>();
		roleList = swappage.getRoleList();
		for(Role r : roleList) {
			String name = r.getUsername();
			if(name == "charlie") {
				r.setUsername("Bob");
			}
			if(name == "bob") {
				r.setUsername("charlie");
			}
		}	
		
		//Implement deletes
		developer curdeveloper = developerdao.findDeveloperByUsername("alice");
		curdeveloper.setEmail(null);
		developerdao.updateDeveloper(0, curdeveloper);
		
		Page curpage = new Page();
		curpage = pagedao.findPageById(2);
		widget = widgetdao.findWidgetById(4);
		curpage.removeWidget(widget);
		
		page = pagedao.findPagesForWebsite(2);
		for(Page p : page) {
			Date curDate = p.getUpdated();
			Date latest = new Date(time);
			if(latest.before(curDate)) {
				latest = curDate;
				curpage = p;
			}
		}
		Website website = websitedao.findWebsiteById(2);
		website.removePage(curpage);
		
		websitedao.deleteWebsite(4);
		RoleDao roledao = RoleDao.getInstance();
		roledao.deleteWebsiteRole(4);
	}
}
