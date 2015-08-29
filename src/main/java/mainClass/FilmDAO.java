package mainClass;
import java.util.List;
import javax.sql.DataSource;
public interface FilmDAO {
	public void setDataSource(DataSource ds);
	public void create(String title,String description);

		
		
}
