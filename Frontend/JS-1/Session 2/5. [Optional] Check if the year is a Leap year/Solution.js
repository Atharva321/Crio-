// Time  : O(1)
// Space : O(1)

/**
 * @param {number} year
 * @return {string}
 */

function checkLeapYear(year) {
  // You only need to implement this function.
  // CRIO_SOLUTION_START_MODULE_ES6_FOUNDATIONS
  return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) 
  ? "LEAP YEAR" 
  : "COMMON YEAR";
  // CRIO_SOLUTION_END_MODULE_ES6_FOUNDATIONS
}

if (checkLeapYear(2020) !== "LEAP YEAR")
  console.log("Test fails: Expected LEAP YEAR for input year = 2020");
else
  console.log("Sample test case for input year = 2020 passed!");

module.exports = checkLeapYear;
