package bod;

import java.util.Random;
import java.util.LinkedList;
import java.util.List;

public class Snake {
    public static final String HORIZONTAL = "horizontal";
    public static final String VERTICAL = "vertical";
    //TODO put all of these colors into a properties file to more easily add colors
    public static final String[] COLORS = {"blue", "green", "red", "yellow", "purple", "silver", "gold"};
    private List<Cell> myBody = new LinkedList<>();
    private String myName;
    private double myVelocity;

    public Snake(String name, double velocity, double startX, double startY, String direction){
        myName = name;
        myVelocity = velocity;
        createInitialBody(startX, startY, direction);
    }

    private void createInitialBody(double x, double y, String direction) {
        myBody.add(new Cell(x, y, ))
    }
}
