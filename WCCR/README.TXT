-------------------------------------------------------------
This is the project README file. 
Use this file for making notes on your work on this project.
-------------------------------------------------------------

// test reading file and print output
WCCR rally = new WCCR();
rally.readInEntrants();

// test random number generator
rally.generateTime();

// set time for each entrant
rally.runRally();



// TEST FOR SORTING LIST BY FASTEST TIME
WCCR rally = new WCCR();
rally.readInEntrants();
rally.runRally();
rally.sortEntrantList();

// TEST FOR CATEGORISING ENTRANT RESULT
WCCR rally = new WCCR();
rally.readInEntrants();
rally.runRally();
rally.categorise();