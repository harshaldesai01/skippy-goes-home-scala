# Simulate Skippy Get Home
This program simulates a kangaroo named Skippy reaching home eventually even after doing random hops around a defined grid.
## Flow:
- Take grid size as an input from user. If it's invalid, throw exception if not, move forward.
- Initialise grid, define home position (grid.home) and start Simulation.


## Simulation:
- Initialise die. 
- Initialise skippy and make it hop until it reaches home.
      Print total hops and die statistics finally.

## Design (classes, their attributes and methods):
### Direction
An enum representing the four cardinal directions:
- **N**: North
- **S**: South
- **E**: East
- **W**: West

### Die
A class that simulates a die with four sides, corresponding to the four directions.

#### Attributes:
- **sides**: Represents the directions (N, S, E, W).
- **totalThrows**: Tracks the total number of times the die has been rolled.
- **directionCounts**: A map that stores the number of times each direction has been rolled.

#### Methods:
- **roll**: Generates a random direction and updates the count for that direction in `directionCounts`, while also incrementing `totalThrows`.
- **updateDirectionCount**: Updates the `directionCounts` for a given direction.
- **printDieStats**: Prints statistics of how many times each direction was rolled.

### Point (case class)
A simple class to represent a position on the grid.

#### Attributes:
- **x**: The x-coordinate.
- **y**: The y-coordinate.

#### Method:
- **move**: Returns a new point by adjusting the x and y coordinates based on a provided movement distance (`dx`, `dy`).

### Grid
A class that defines the grid on which Skippy moves.

#### Attributes:
- **gridStart**: The starting position on the grid.
- **home**: The home position, which is the target destination for Skippy.

#### Method:
- **isInsideBoundary**: Checks if a given position is inside the boundaries of the grid.

### Kangaroo
A class representing Skippy, the kangaroo, and its movements on the grid.

#### Attributes:
- **currPosition**: Stores Skippy’s current position on the grid.
- **totalHops**: Tracks the total number of hops Skippy has made.

#### Methods:
- **hop**: Takes the direction rolled by the die and moves Skippy to a new position on the grid, updating the current position and incrementing `totalHops` if the new position is valid (i.e., inside the grid boundaries).
- **moveInDirection**: Uses a starting position and a direction to calculate Skippy's new position by calling `Point.move`.