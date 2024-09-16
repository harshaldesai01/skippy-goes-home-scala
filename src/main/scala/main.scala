/**
 * Main function to take inputs, initialize relevant classes, run simulation and print the results
 */
@main
def main(): Unit = {
  println("Enter dimension of the Grid (>=1):")
  var gridSize: Int = scala.io.StdIn.readInt()
  if(gridSize < 1) throw new IllegalArgumentException("Grid size must be at least 1.")
  val grid: Grid = new Grid(gridSize)
  val homePosition: Point = grid.home

  // Start simulation
  simulate()

  /**
   * Method to initialize skippy and simulate his hops home
   */
  def simulate(): Unit = {

  }
}

