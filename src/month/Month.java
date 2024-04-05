package month;

public class Month {
    private final String monthName;
    private final int totalDays;
    private final int workDays;

    public Month(String monthName, int totalDays, int workDays) {
        this.monthName = monthName;
        this.totalDays = totalDays;
        this.workDays = workDays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public int getWorkDays() {
        return workDays;
    }
}

