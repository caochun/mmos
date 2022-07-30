package info.nemoworks.mmos.storage;

import info.nemoworks.mmos.model.Contract;

public interface ContractStorage {

    void saveContract(Contract contract);

    void deleteContract(Contract contract);
}
