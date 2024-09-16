/**
 * Point class which helps in defining a position
 * @param x x co-ordinate of the point
 * @param y y co-ordinate of the point
 */
case class Point(var x: Int = 0, var y: Int = 0){
  /**
   * Print position of the point
   * @return String position in (x, y) format
   */
  override def toString: String = s"($x, $y)"

  /**
   * Method to move point given distance for each axis
   * @param dx distance on the x-axis
   * @param dy distance on the y-axis
   * @return new Point with the updated position
   */
  def move(dx: Int, dy: Int): Point = Point(x+dx, y+dy)

  /**
   * Checks whether the given point is at the same position
   * @param point2 second point
   * @return true if both x and y co-ordinates match, false otherwise
   */
  def isSamePositionAs(point2: Point): Boolean = {
    x==point2.x && y==point2.y
  }
}