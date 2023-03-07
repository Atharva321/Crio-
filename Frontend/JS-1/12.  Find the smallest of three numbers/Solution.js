// Time  : O(1)
// Space : O(1)

/**
 * @param {number} a
 * @param {number} b
 * @param {number} c
 * @return {number}
 */
function findSmallest(a, b, c) {
      // You only need to implement this function.
      if(a > b){
          if(b > c) return c;
          return b;
      }
      else if(a > c){
          return c;
      }
      return a;
}

if (findSmallest(1,2,3) !== 1)
    console.log("Test fails: Expected 1 for input a = 1, b = 2 and c = 3");
else
    console.log("Sample test case for input a = 1, b = 2 and c = 3 passed!");

module.exports = findSmallest;
