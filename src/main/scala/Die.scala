import Direction.*

import scala.collection.mutable
import scala.util.Random

/**
 * Die class having sides, direction hash table and roll function to generate random direction
 */
class Die {
  private val sides = List(N, S, E, W)
  var totalThrows = 0;
  private val directionCounts: mutable.Map[Direction, Int] = mutable.HashMap(
    N -> 0,
    S -> 0,
    E -> 0,
    W -> 0
  )

  /**
   * Method to roll the die and return a random direction
   * @return Random direction out of N, S, E, W
   */
  def roll(): Direction = {
    val direction = Random.shuffle(sides).head
    totalThrows+=1 // update total throws
    updateDirectionCount(direction) // update direction hash table
    direction
  }

  /**
   * Method to update the count of given direction
   * @param direction Direction on the current roll
   */
  private def updateDirectionCount(direction: Direction): Unit = {
    directionCounts.update(direction, directionCounts(direction)+1)
  }

  def printDieStats(): Unit = {
    println("Die statistics:")
    println("Total throws:: " + totalThrows)
    sides.foreach(direction => {
      val percentage = (directionCounts(direction).toDouble / totalThrows) * 100
      print(direction.toString + ": " + f"$percentage%.1f%% ")
    })
  }
}