/**
 * Grid class taking gridSize as an initializer
 * @param gridSize size of the grid
 */
class Grid(val gridSize: Int) {
  val gridStart = new Point(0, 0)
  // North-East corner (home position on the grid)
  val home = new Point(gridSize-1, gridSize-1)

  /**
   * Method to check if the given position is inside the boundary of the grid
   * @param position given position
   * @return true if it's inside the boundary, false otherwise
   */
  def isInsideBoundary(position: Point): Boolean = {
    position.x>=0 && position.x<gridSize && position.y>=0 && position.y<gridSize
  }
}