package db;

import models.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Entity;
import java.util.List;

public class DBCustomer {

    private static Session session;
    private static Transaction transaction;

}
