/**
 * Main function to take inputs, initialize relevant classes, run simulation and print the results
 */
@main
def main(): Unit = {
  println("Enter dimension of the Grid (>=1):")
  val gridSize: Int = scala.io.StdIn.readInt()
  if(gridSize < 1) throw new IllegalArgumentException("Grid size must be at least 1.")
  val grid: Grid = new Grid(gridSize)
  val homePosition: Point = grid.home

  // Start simulation
  simulate()

  /**
   * Method to initialize skippy and simulate his hops home
   */
  def simulate(): Unit = {
    val die: Die = new Die

    val initialSkippyPosition: Point = Point(0, 0)
    val skippy: Kangaroo = new Kangaroo(initialSkippyPosition)

    // Roll the die and make skippy hop until he's home
    while (!hasReachedHome(skippy.currPosition)) {
      val direction = die.roll()
      skippy.hop(direction, grid)
    }
    println(s"Finished in ${skippy.totalHops} hops!")
    println()
    // Print Die Statistics
    if(die.totalThrows>0){
      die.printDieStats()
    }
  }

  /**
   * Method to check if skippy has reached home
   *
   * @param currSkippyPosition current position of skippy
   * @return true if skippy is at home position
   */
  def hasReachedHome(currSkippyPosition: Point) = {
    currSkippyPosition==homePosition
  }
}

