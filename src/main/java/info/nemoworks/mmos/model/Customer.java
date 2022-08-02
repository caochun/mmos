package info.nemoworks.mmos.model;

import java.util.List;

public interface Customer extends Entity {

    String getName();

    List<Contract> getContracts();
}
