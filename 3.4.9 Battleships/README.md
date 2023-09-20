The Battleship class represents a single battleship. Each battleship has the instance variables name (the type of ship), power (the power level of this ship’s attack), and health (declines with attacks).

Fill in the methods updateDamage and stillFloating in Battleship.

The damage done by the attacking ship is determined as follows:

If the attack power of the ship is less than 5, the ship inflicts 2 damage

If the attack power of the ship is less than 10, the ship inflicts 7 damage

If the attack power of the ship is 10 or more, the ship inflicts 10 damage

The method updateDamage updates the attacked ship’s health accordingly. In main, you should be able to see that the differing levels of attack power yield different amounts of damage.

stillFloating returns a boolean indiciating if the ship
is still floating. The ship is still floating as long as
the health is greater than 0. While you can use an if statement,
remember you can also directly return the result of a boolean expression

e.g return x > y;

