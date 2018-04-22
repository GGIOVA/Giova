package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionInstance {
	
	private static SessionFactory sessionFactory;
	
	private SessionInstance() {}
	
	public static Session getSessionInstance() {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		try {
			
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		}catch(Exception e) {
			
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
		return sessionFactory.openSession();
	}

}
