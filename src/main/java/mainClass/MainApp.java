package mainClass;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;






import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import mainClass.FilmJDBCTemplate;


public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FilmJDBCTemplate filmJDBCTemplate =  (FilmJDBCTemplate)context.getBean("filmJDBCTemplate");   
		context.start();
		Scanner s = new Scanner(System.in);
		  System.out.println("请输入电影名称:");
		  String film_title=s.nextLine();
		  Scanner r = new Scanner(System.in);
		  System.out.println("请输入电影描述:");
		  String de=r.nextLine();
		
		  System.out.println("请输入语言ID");
		  System.out.println("1");
		
		 
		  
		  filmJDBCTemplate.create("film","de");
	      
		  
	      context.stop();
	}

}
