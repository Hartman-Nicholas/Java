package com.company;


import java.io.*;

public class Planner implements Serializable {

    private final String SPACING = "       ";
    private final WeekDaySet daysOfWeek = new WeekDaySet();
    private final TimeDaySet timeOfDay = new TimeDaySet();
    private final String [][] planner = new String [25][8];
    private final CommandsList weekDays = new CommandsList();
    @Serial
    private final static long serialVersionUID = 1L;

    public Planner() {
        viewPlanner();
    }

    public void viewPlanner () {
        for (int i=0; i<25; i++) {
            for(int j=0; j<8; j++) {
                if (i<=0) {
                    planner[i][j] = daysOfWeek.findValue(i,j);
                } else if (j<=0) {
                    planner[i][j] = timeOfDay.findValue(i,j);
                } else if (planner[i][j]==null) {
                    planner[i][j] = SPACING;
                }
            }
        }

        for (String[] row : planner) {
            printRow(row);
        }
    }

    public void addTask (int time, String day, String task) {
       planner[time+1] [dayIndex(day)] = task;
    }

    public int dayIndex (String day) {

        return switch (weekDays.getCommandWord(day)) {
            case SUNDAY -> 1;
            case MONDAY -> 2;
            case TUESDAY -> 3;
            case WEDNESDAY -> 4;
            case THURSDAY -> 5;
            case FRIDAY -> 6;
            case SATURDAY -> 7;
        };
    }

    public boolean checkTask (int time, String day) {
        return !planner[time+1][dayIndex(day)].equals(SPACING);
    }

    public String findTask (int time, String day) {
        return planner[time+1][dayIndex(day)];

    }

    public void removeTask (int time, String day) {
            planner[time+1][dayIndex(day)] = SPACING;

    }

    public boolean checkFile (String filePath) {
        return filePath.endsWith(".txt");
    }

    public void savePlanner (String filePath, Planner planner) throws IOException {

        File saveState = new File(filePath);
        FileOutputStream fos = new FileOutputStream(saveState);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(planner);

        oos.close();

    }

    public Planner load (String filePath) throws IOException, ClassNotFoundException {

        File saveState = new File(filePath);
        FileInputStream fis = new FileInputStream(saveState);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Planner planner = (Planner) ois.readObject();

        ois.close();

        return planner;



    }


    public void printPlanner (String filePath) throws IOException {
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter(filePath));



            for (int i=0; i<25; i++) {
                for(int j=0; j<8; j++) {
                    if (i<=0) {
                        outputWriter.write(planner[i][j] = daysOfWeek.findValue(i,j));
                    } else if (j<=0) {
                        outputWriter.write(planner[i][j] = timeOfDay.findValue(i,j));
                    } else if (planner[i][j]==null) {
                        outputWriter.write(planner[i][j] = SPACING);
                    } else {
                        outputWriter.write(planner[i][j]);
                    }
                }
                outputWriter.newLine();
            }
            outputWriter.flush();
            outputWriter.close();


        }


    private void printRow (String[] row) {
        for (String i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }



}
