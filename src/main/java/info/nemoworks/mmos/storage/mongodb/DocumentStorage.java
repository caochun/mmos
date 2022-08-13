package info.nemoworks.mmos.storage.mongodb;

import info.nemoworks.mmos.model.Contract;
import info.nemoworks.mmos.model.Customer;
import info.nemoworks.mmos.model.Entity;
import info.nemoworks.mmos.storage.EntityStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public class DocumentStorage implements EntityStorage {

    @Autowired
    ContractRepository contractRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Entity get(String id) {
        return null;
    }



    @Override
    public void delete(Entity entity) {

    }

    @Override
    public Entity save(Entity entity) {
        if (entity instanceof Contract) {
            ContractDocument contractDocument = DocumentMapper.INSTANCE.contractToContractDocument((Contract) entity);
            return DocumentMapper.INSTANCE.contractDocumentToContract(contractRepository.save(contractDocument));
        }
        if (entity instanceof Customer) {
            CustomerDocument customerDocument = DocumentMapper.INSTANCE.customerToCustomerDocument((Customer) entity);
            customerDocument = customerRepository.save(customerDocument);
            Customer customer = DocumentMapper.INSTANCE.customerDocumentToCustomer(customerDocument);
            return customer;
        }
        return null;
    }
}
