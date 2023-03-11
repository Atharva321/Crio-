// Time  : O(n)
// Space : O(1)

/**
 * @param {number[]} arr
 * @return {boolean}
 */


function checkNonDecreasing(arr) {
  // You only need to implement this function.
  for(i=0; i<arr.length-1; i++){
    if(arr[i] > arr[i+1]) return false;
  }
  return true;
}

if (checkNonDecreasing([6, 9, 10, 12]) !== true)
  console.log("Test fails: Expected true for input arr = [6, 9, 10, 12]");
else
  console.log("Sample test case for input arr = [6, 9, 10, 12] passed!");

module.exports = checkNonDecreasing

