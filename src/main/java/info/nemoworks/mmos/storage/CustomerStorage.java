package info.nemoworks.mmos.storage;


import info.nemoworks.mmos.model.Customer;

public interface CustomerStorage {

    void saveCustomer(Customer customer);

    void deleteCustomer(Customer customer);
}
