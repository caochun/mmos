package info.nemoworks.mmos.storage.neo4j;

import info.nemoworks.mmos.model.Customer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NodeMappertest {

    @Test
    public void fromNodeToEntityTest(){
        CustomerNode customerNode = new CustomerNode();
        customerNode.setName("张三");
        customerNode.setId(101L);

        NodeMapper mapper = NodeMapper.INSTANCE;

        Customer customer = mapper.customerNodeToCustomer(customerNode);

        assertThat(customer.getName().equals("张三"));
        assertThat(customer.getId().equals("101"));

    }
}
