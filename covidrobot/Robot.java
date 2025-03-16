import java.util.Scanner;

/**
 * Robot class that navigates within a grid-based COVID ward.
 */

class Robot  
{
// Robot's current position and orientation.
    private int x;
    private int y;
    private char direction;
   

 // Maximum boundaries of the grid.
    private final int maxX;
    private final int maxY;
   


  // Array representing the four cardinal directions in clockwise order.
    private final char[] directions = {'N', 'E', 'S', 'W'};


// Constructor to initialize the robot with starting position, direction, and grid boundaries.
    
	public Robot(int x, int y, char direction, int maxX, int maxY) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.maxX = maxX;
        this.maxY = maxY;
    }
	
	    /**
     * Turns the robot 90 degrees to the left.
     */
    public void turnLeft() {
        int index = (getDirectionIndex() + 3) % 4;
        direction = directions[index];
    }


	/**
     * Turns the robot 90 degrees to the right.
     */
    public void turnRight() {
        int index = (getDirectionIndex() + 1) % 4;
        direction = directions[index];
    }

	/**
     * Moves the robot one grid point forward in the direction it is facing.
     * Checks grid boundaries before moving.
     */
    
	public void moveForward() {
        switch (direction) {
            case 'N': if (y < maxY) y++; break;
            case 'E': if (x < maxX) x++; break;
            case 'S': if (y > 0) y--; break;
            case 'W': if (x > 0) x--; break;
        }
    }

    public void executeCommands(String commands) {
        for (char command : commands.toCharArray()) {
            switch (command) {
                case 'L': turnLeft(); break;
                case 'R': turnRight(); break;
                case 'M': moveForward(); break;
                default:
                    // Optionally handle invalid commands here.
                    break;
            }
        }
    }
	
/*** Returns the current position and direction of the robot as a formatted string.
     */
    public String getPosition() {
        return x + " " + y + " " + direction;
    }

    /**
     * Helper method to determine the index of the current direction.
     */
    
 int getDirectionIndex() {
        for (int i = 0; i < directions.length; i++) {
            if (directions[i] == direction) {
                return i;
            }
        }
        return -1; // This should not occur if direction is valid.
    }

}
	