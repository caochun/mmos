package info.nemoworks.mmos.storage.mongodb;

import info.nemoworks.mmos.model.Contract;
import info.nemoworks.mmos.model.Customer;
import info.nemoworks.mmos.model.Entity;
import info.nemoworks.mmos.storage.EntityStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class DocumentStorage implements EntityStorage {

    @Autowired
    MongoTemplate mongoTemplate;

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
            return DocumentMapper.INSTANCE.contractDocumentToContract(mongoTemplate.save(DocumentMapper.INSTANCE.contractToContractDocument((Contract) entity)));
        }
        if (entity instanceof Customer) {
            return DocumentMapper.INSTANCE.customerDocumentToCustomer(mongoTemplate.save(DocumentMapper.INSTANCE.customerToCustomerDocument((Customer) entity)));
        }
        return null;
    }
}
