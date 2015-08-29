package mainClass;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class FilmJDBCTemplate implements FilmDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	  public void setDataSource(DataSource dataSource) {
	  this.dataSource = dataSource;
	   this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	  public void create(String title,String description) {
			 JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
			  String SQL = "insert into film (title,description,language_id) values (?, ?, 1)";
			  jdbcTemplateObject.update( SQL, title,description);
			 
			
			  
			  return;
		}
	  

}
