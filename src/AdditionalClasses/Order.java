package AdditionalClasses;

import java.io.Serializable;

public class Order implements Cloneable, Serializable, Comparable {
    private boolean done;
    private String orderName;

    public Order(boolean done, String orderName) {
        this.done = done;
        this.orderName = orderName;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public int compareTo(Object o) {
        return 0; // TODO
    }
}
