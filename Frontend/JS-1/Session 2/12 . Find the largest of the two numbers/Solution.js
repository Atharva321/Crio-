// Time  : O(1)
// Space : O(1)

/**
 * @param {number} a
 * @param {number} b
 * @return {number}
 */

function findLargest(a, b) {
  // You only need to implement this function.
  return a > b ? a : b;
}

if (findLargest(1,2) !== 2)
  console.log("Test fails: Expected 2 for input a = 1 and b = 2");
else
  console.log("Sample test case for input a = 1 and b = 2 passed!");
  
module.exports = findLargest;
