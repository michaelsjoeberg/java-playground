------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

// create and populate map
Elements aMap = new Elements();
aMap.populateMap();

// print table for values
aMap.printMap();

// print table for specific value
aMap.printMapValue("In");

// add map entry and replace existing entry
aMap.addMapEntry("Te", "1 Test 1.111");
aMap.addMapEntry("Be", "4 Berytest 9.999");

// delete map entry
aMap.deleteEntry("Te");

// create reduced map based on argument
aMap.createReducedMap(45);

// add value to element
aMap.addValue("Te", "New Test Value");

// delete value to element
aMap.deleteValue("Te", 3);

// create and populate map, then add new entry, then add new value to entry, then delete value
aMap.populateMap();
aMap.addMapEntry("Te", "1 Test 1.111");
aMap.addValue("Te", "New Test Value");
aMap.deleteValue("Te", 2);