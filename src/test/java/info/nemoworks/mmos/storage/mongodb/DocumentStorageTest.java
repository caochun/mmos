package info.nemoworks.mmos.storage.mongodb;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import info.nemoworks.mmos.MMOSApplication;
import info.nemoworks.mmos.model.Contract;
import info.nemoworks.mmos.model.Customer;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

@ContextConfiguration(classes = MMOSApplication.class)
@DataMongoTest
@ExtendWith(SpringExtension.class)
public class DocumentStorageTest {

    @Test
    public void test(@Autowired MongoTemplate mongoTemplate) throws JSONException {

        Customer customer = new Customer();
        customer.setName("张三");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "jon doe");
        jsonObject.put("age", "22");
        jsonObject.put("city", "chicago");

//        Contract contract = Contract.builder().date(LocalDateTime.now()).customer(customer).build();
        Contract contract = new Contract();
        contract.setDate(LocalDateTime.now());
        contract.setCustomer(customer);
//        contract.setContents(jsonObject);

        mongoTemplate.save(customer);
        mongoTemplate.save(contract);

        mongoTemplate.findAll(Contract.class).stream().forEach(t -> System.out.println(t));
        mongoTemplate.findAll(Customer.class).stream().forEach(t -> System.out.println(t));

//        // then
//        assertThat(mongoTemplate.findAll(DBObject.class, "abc")).extracting("key")
//                .containsOnly("value");
    }
}
