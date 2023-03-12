// Time  : O(1)
// Space : O(1)

/**
 * @param {string} str
 * @param {number} k
 * @return {string}
 */


function kthCharFromEnd(str, k){
  // You only need to implement this function.
  return str[str.length - k];
}

if (kthCharFromEnd("abcdefghi", 2) !== 'h')
  console.log("Test fails: Expected 'h' for input str = 'abcdefghi' and k = 2");
else
  console.log("Sample test case for input str = 'abcdefghi' and k = 2 passed!");

module.exports = kthCharFromEnd

