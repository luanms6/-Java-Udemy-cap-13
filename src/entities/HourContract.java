package entities;
import java.util.Date;

public class HourContract {

    private Date date;
    private double valuePerhour;
    private int hours;

    public HourContract(){
    }

    public HourContract(Date date, double valuePerhour, int hours) {
        this.date = date;
        this.valuePerhour = valuePerhour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePerhour() {
        return valuePerhour;
    }

    public void setValuePerhour(double valuePerhour) {
        this.valuePerhour = valuePerhour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return valuePerhour * hours;
    }

}
