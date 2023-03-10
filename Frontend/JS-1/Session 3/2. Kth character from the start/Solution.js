// Time  : O(1)
// Space : O(1)

/**
 * @param {string} str
 * @param {number} k
 * @return {string}
 */


function kthCharFromStart(str, k){
  // You only need to implement this function.
  return str[k-1];
}

if (kthCharFromStart("abcdefghi", 2) !== 'b')
  console.log("Test fails: Expected 'b' for input str = 'abcdefghi' and k = 2");
else
  console.log("Sample test case for input str = 'abcdefghi' and k = 2 passed!");

module.exports = kthCharFromStart
