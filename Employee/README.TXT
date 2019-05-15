-------------------------------------------------------------
This is the project README file. 
Use this file for making notes on your work on this project.
-------------------------------------------------------------

// Populate Payroll set
Payroll newTest = new Payroll();
newTest.enrollEmployee("1200");
newTest.enrollEmployee("1201");
newTest.enrollEmployee("1202");
newTest.enrollEmployee("1203");
newTest.enrollEmployee("1204");
newTest.enrollEmployee("1205");

// check records pre-update
newTest.printEmployees();

// update sales figures
newTest.updateSalesFigures(Sales.getSales());

// check records pro-update
newTest.printEmployees();

// add names to employees
newTest.nameEmployees();