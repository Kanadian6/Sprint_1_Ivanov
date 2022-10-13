public class StepTracker {

    int[][] dayToMonth = new int[12][30];
    int celSteps = 10000;
    int sumaSteps = 0;

    public void saveStepsDay (int month, int day, int steps) {
        if (steps < 0) {
        } else {
            dayToMonth[month][day] = steps;
            System.out.println(steps + " успешно записано шагов в " + day + " день " + month + " месяца");
        }
    }
    public void statDay (int month) {
        for (int i = 0; i < dayToMonth[month].length ; i++)
            System.out.println((i) + " день: " + dayToMonth[month][i]);
        }
    public void newCelSteps(int cel) {
        if (cel < 0) {
        } else {
            celSteps = cel;
            System.out.println("Цель шагов за день изменена на: " + celSteps + " шагов.");
        }
    }
        public int saveSumSteps (int month) {
            for (int i = 0; i < dayToMonth[month].length; i++) {
                sumaSteps = sumaSteps + dayToMonth[month][i];
            }
            return sumaSteps;
        }
        public int saveMaxStepn(int month) {
        int maxSteps = 0;
        for (int i = 0; i < dayToMonth[month].length; i++) {
            if (dayToMonth[month][i] > maxSteps) {
                maxSteps = dayToMonth[month][i];
            }
        }
        return maxSteps;
    }
    public double srednieSteps(int month){
        double srednieSteps = sumaSteps / dayToMonth[month].length;
        return srednieSteps;
    }
    public int thebestSerStepn(int month){
        int seriesSteps = 0;
        int maxSeriesSteps = 0;
        for (int i = 0; i < dayToMonth[month].length; i++){
            if (dayToMonth[month][i] >= celSteps ){
                seriesSteps ++;
            } else {
                if (seriesSteps > maxSeriesSteps) {
                    maxSeriesSteps = seriesSteps;
                    seriesSteps = 0;
                }
            }
        }
        return maxSeriesSteps;
    }
}


