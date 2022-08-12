package info.nemoworks.mmos.storage.neo4j;

import info.nemoworks.mmos.model.Contract;
import info.nemoworks.mmos.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NodeMapper {
    NodeMapper INSTANCE = Mappers.getMapper(NodeMapper.class);

    ContractNode contractToContractNode(Contract contract);

    Contract contractNodeToContract(ContractNode contractNode);

    Customer customerNodeToCustomer(CustomerNode customerNode);

    CustomerNode customerToCustomerNode(Customer customer);
}
