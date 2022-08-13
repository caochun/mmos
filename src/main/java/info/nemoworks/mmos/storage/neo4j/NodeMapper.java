package info.nemoworks.mmos.storage.neo4j;

import info.nemoworks.mmos.model.Contract;
import info.nemoworks.mmos.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NodeMapper {
    NodeMapper INSTANCE = Mappers.getMapper(NodeMapper.class);

    ContractNode contractToContractNode(Contract contract);

    Contract contractNodeToContract(ContractNode contractNode);

    Customer customerNodeToCustomer(CustomerNode customerNode);

    CustomerNode customerToCustomerNode(Customer customer);

    default String fromLong(Long id) {
        return id.toString();
    }

    default Long fromString(String id) {
        if (id ==null)
            return null;
        else
            return Long.parseLong(id);
    }

}
