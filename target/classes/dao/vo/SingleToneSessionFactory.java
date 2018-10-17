package dao.vo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

//// 4.x 대에서 구현되어있던 클래스.... 5.7.3에 포함되어있지 않음
//// 어떻게 변했고, 대체하는 다른 클래스 및 메숴드가 있는건지 찾아보는 중...
//import org.hibernate.service.ServiceRegistryBuilder;

public class SingleToneSessionFactory {
	static SessionFactory sf;
	static StandardServiceRegistryBuilder sr;
	
	static {
		try {
			
////////////////// 4. x 대에서 사용하던 방법 /////////////////////
//			// sessionFactory 초기화
//			Configuration cf = new Configuration();
//			sf = cf.buildSessionFactory();
//			
////			sr = new ServiceRegistryBuilder().applySettings(cf.getProperties()).build();
//////////////////////////////////////////////////////////////
		    // 1. 초기화 메소드에서 SessionFactory를 초기화한다.
		    Configuration cfg = new Configuration();
		    cfg.configure();
		    sf = cfg.buildSessionFactory();
		    
		    // 2. 실제 메소드에서는 sessionFactory에서 Session을 생성해서 사용한다.
		    Session s = sf.openSession();
		    
		    
		    s.close();
		}finally {
			System.out.println("?");
		}
//		}catch{
//			
//		}
	}
	
}
