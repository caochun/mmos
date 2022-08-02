package info.nemoworks.mmos.model;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface Contract extends Entity {

    Date getDate();

    Map<String, Objects> getContents();

    Customer getCustomer();

    List<Contract> getSubContracts();

}
