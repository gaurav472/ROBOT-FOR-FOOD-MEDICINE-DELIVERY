import java.util.Scanner;

public class CovidWardRobot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept grid dimensions from the scanner.
        // The first line of input: Upper right coordinates of the grid.
        // Lower left is assumed to be (0, 0).
        int gridX = scanner.nextInt();
        int gridY = scanner.nextInt();
        scanner.nextLine();  // Consume the remaining newline.

        // Accept the robot's starting position and orientation.
        // Second line of input: "x y D"
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        char direction = scanner.next().charAt(0);
        scanner.nextLine();  // Consume the remaining newline.

        // Accept the movement instructions for the robot.
        String commands = scanner.nextLine().trim();

        // Create the Robot instance with the input data.
        Robot robot = new Robot(x, y, direction, gridX, gridY);

        // Part 5: Process the command instructions.
        robot.executeCommands(commands);

        // Part 6: Output the final position and orientation of the robot.
        System.out.println(robot.getPosition());

        scanner.close();
    }
}