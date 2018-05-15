package db;

import models.Order;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DBOrder {
    private static Session session;
    private static Transaction transaction;

}
