package dao.vo;
import java.io.File;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@SuppressWarnings("deprecation")
public class SimpleTableAccess {
	
	SessionFactory sf;
	ServiceRegistry sr;
	
	SimpleTableAccess() {
		try {
			////////////////4. x 대에서 사용하던 방법 /////////////////////
			// sessionFactory 초기화
			Configuration cf = new Configuration();
			File file = new File("src/main/resources/hibernate.cfg.xml");
			System.out.println(file.getPath());
			System.out.println(cf.addFile(file));
			sr = new ServiceRegistryBuilder().applySettings(cf.getProperties()).build();
			sf = cf.buildSessionFactory(sr);
		} catch(HibernateException e){
			e.printStackTrace();
		}
	}
	
	public SessionFactory getSessionFactory(){
		return this.sf;
	}

}
