This program reads input from the user to determine if the user can ride the rollercoasters and swim in the pools at the amusement park.

The program computes 2 boolean expressions in order to determine what the user is allowed to do:

boolean cannotRide = !(oldEnough && tallEnough);

and

boolean cannotSwim = !(canSwim || hasLifeJacket);

Convert these two lines into their equivalent De Morgan style boolean expressions. Negate the AND in the first statement and negate the OR in the second statement using De Morgan’s Laws.

Your resulting boolean expression for cannotRide should include both oldEnough and tallEnough. Your resulting boolean expression for cannotSwim should include both canSwim and hasLifeJacket.

The resulting program should still be able to successfully determine if the user can ride the rides and swim in the pool.

