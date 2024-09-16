import Direction.*

/**
 * Kangaroo class used to instantiate skippy
 * @param initialPosition Initial position of the kangaroo
 */
class Kangaroo(initialPosition: Point = Point(0, 0)) {
  var currPosition: Point = initialPosition // current position of the Kangaroo

  /**
   * Given direction and grid, hop moves the kangaroo to a new position if it's inside the grid's boundary
   * @param direction Direction that appears on the die when rolled
   * @param grid Grid on which it is hopping
   */
  def hop(direction: Direction, grid: Grid): Unit = {
    val startPosition = currPosition
    val newPosition = moveInDirection(startPosition, direction)
    if (!grid.isInsideBoundary(newPosition)) {
      println("Oops, hit the boundary: " + newPosition.toString)
    } else{
      currPosition = newPosition
      println("Hopped to: " + currPosition.toString)
    }
  }

  /**
   * Given a direction and start position, this method returns the new position after moving in the specific direction
   * @param startPosition Starting position
   * @param direction Direction to move in
   * @return
   */
  private def moveInDirection(startPosition: Point, direction: Direction): Point = {
    direction match {
      case N => startPosition.move(0, 1)
      case S => startPosition.move(0, -1)
      case E => startPosition.move(1, 0)
      case W => startPosition.move(-1, 0)
    }
  }

}