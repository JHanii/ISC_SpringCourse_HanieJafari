package ir.freeland.springboot.persistence.lifecycle;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.EntityEntry;
import org.hibernate.engine.spi.SessionImplementor;
import jakarta.persistence.EntityManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HibernateLifecycleUtil {
    private static SessionFactory sessionFactory;
    private static Connection connection;

     public static void tearDown() throws Exception {
        sessionFactory.close();
        connection.close();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }



    public static List<EntityEntry> getManagedEntities(Session session) {    	
        Map.Entry<Object, EntityEntry>[] entries = ((SessionImplementor) session).getPersistenceContext().reentrantSafeEntityEntries();
        return Arrays.stream(entries).map(e -> e.getValue()).collect(Collectors.toList());
    }

    public static List<EntityEntry> getManagedEntities(EntityManager entityManager) {
    	final org.hibernate.engine.spi.SessionImplementor session = entityManager.unwrap( org.hibernate.engine.spi.SessionImplementor.class );
    	final org.hibernate.engine.spi.PersistenceContext pc = session.getPersistenceContext();
        Map.Entry<Object, EntityEntry>[] entries = pc.reentrantSafeEntityEntries();
        return Arrays.stream(entries).map(e -> e.getValue()).collect(Collectors.toList());
    }
    
    public static Transaction startTransaction(Session s) {
        Transaction tx = s.getTransaction();
        tx.begin();
        return tx;
    }

    public static int queryCount(String query) throws Exception {
        try (ResultSet rs = connection.createStatement().executeQuery(query)) {
            rs.next();
            return rs.getInt(1);
        }
    }
}

