/**
 * Grid class taking gridSize as an initializer
 * @param gridSize size of the grid
 */
class Grid(val gridSize: Int) {
  val gridStart = new Point(0, 0)
  // North-East corner (home position on the grid)
  val home = new Point(gridSize-1, gridSize-1)
}