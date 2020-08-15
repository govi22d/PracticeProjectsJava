package spring.example.SpringProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public abstract class BaseRepository {

	StandardServiceRegistry registry;
	SessionFactory sessionFactory;
	public Session OpenSession()
    {
    	 registry = new StandardServiceRegistryBuilder()
    			.configure() // configures settings from hibernate.cfg.xml
    			.build();
        
        sessionFactory = new MetadataSources(registry)
        		.buildMetadata()
        		.buildSessionFactory();
        
        return sessionFactory.openSession();
    }
	
	public void DestroySession(Session session)
    {
		if(session != null)
		{
			session.close();
	        sessionFactory.close();
	        StandardServiceRegistryBuilder.destroy(registry);
		}
    }
	
}
