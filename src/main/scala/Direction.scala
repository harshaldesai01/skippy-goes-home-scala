/**
 * Direction enum representing North, South, East and West directions with N, S, E & W respectively
 */
enum Direction {
  case N, S, E, W
  
  override def toString: String = this match{
    case N => "North"
    case S => "South"
    case E => "East"
    case W => "West"
  }
}