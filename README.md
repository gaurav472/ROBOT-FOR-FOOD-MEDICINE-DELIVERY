# Running the COVID Robot Navigation Program

This guide will help you clone, compile, and run the COVID Robot navigation program using Java in the command prompt (CMD).

## Clone the Repository

### 1. Open Command Prompt

Press `Win + R`, type `cmd`, and hit `Enter` to open the command prompt.

### 2. Navigate to the Desktop (or preferred location)

To clone the repository in the `Desktop` folder, navigate to it using:

```
cd Desktop
```

### 3. Clone the Repository

Run the following command to clone the repository:

```
git clone https://github.com/gaurav472/ROBOT-FOR-FOOD-MEDICINE-DELIVERY.git
```

## Folder Structure

Ensure that your files are structured as follows:

```
Desktop/
│
└── covidrobot/
    ├── CovidWardRobot.java  # Main class containing the main function
    ├── Robot.java           # Robot class handling navigation logic
```

## Steps to Run the Program

### 1. Navigate to the `covidrobot` Folder

After cloning, navigate to the project folder:

```
cd covidrobot
```

### 2. Compile the Java Files

To compile `CovidWardRobot.java`, use:

```
javac CovidWardRobot.java
```

If there are no errors, it will generate `.class` files in the same directory.

### 3. Run the Program

After successful compilation, run the program using:

```
java CovidWardRobot
```

### 4. Provide Input

The program will prompt you to enter input. Example input:

```
5 5
1 2 N
LMLMLMLMM
```

After entering the input, press `Enter`. The program will then output the final position of the robot.

### 5. Expected Output

Example output based on the given input:

```
1 3 N
```

## Troubleshooting

- If `javac` is not recognized, ensure that Java is installed and added to the system `PATH`.
- Check that both `CovidWardRobot.java` and `Robot.java` are in the same directory before compiling.

## Java Version Requirement

Ensure that Java is installed by running:

```
java -version
```

If Java is not installed, download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-downloads.html) and set up the environment variables accordingly.

---

Now, you are ready to run your COVID Robot navigation program! 🚀
