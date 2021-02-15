package db;

import org.example.Customer;

import java.util.List;

public interface CustomerDao {
    public int insert(Customer customer);

    public int alter(Customer customer);

    public int delete(int customerId);

    Customer select(int customerId);

    List<Customer> selectAll();
}
