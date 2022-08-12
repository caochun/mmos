package info.nemoworks.mmos.storage.neo4j;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ContractRepository extends Neo4jRepository<ContractNode, String> {
}
