package org.powertac.visualizer.domain;

import org.powertac.visualizer.domain.RetailKPIHolder;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author Jurica Babic, Govert Buijs, Erik Kemperman
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Broker {

    private static long idCounter = 0;
    private long id = idCounter++;

    /** Name of the broker */
    private String name;

    private RetailKPIHolder retail = new RetailKPIHolder();

    private double cash = 0;

    protected Broker() {

    }

    public Broker(String name) {
        super();
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public RetailKPIHolder getRetail() {
        return retail;
    }

    public void setRetail(RetailKPIHolder retailKPIHolder) {
        this.retail = retailKPIHolder;
    }

    public static void recycle() {
        idCounter = 0;
    }

}
