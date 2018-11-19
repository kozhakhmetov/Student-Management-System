package DataAndStatickClasses;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable, Cloneable {
    private Date time;
    private String action;

    public Log(String action) {
        this.time = new Date();
        this.action = action;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Log{" +
                "time=" + time +
                ", action='" + action + '\'' +
                '}';
    }
}
