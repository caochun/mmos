package info.nemoworks.mmos.model;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Contract extends Entity{

    private Date date;

    private Map<String, Objects> contents;

    private Customer customer;

    private List<Contract> subContracts;

}
