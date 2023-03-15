// Time  : O(n)
// Space : O(1)

/**
 * @param {string} str
 * @return {string}
 */


function reverseString(str){
  // You only need to implement this function.
  arr = str.split('');

  start = 0;
  end = arr.length-1;

  while(start < end){
    temp = arr[start];
    arr[start++] = arr[end];
    arr[end--] = temp;  
  }
  return arr.join('');
}

if (reverseString("abcdefghi") !== "ihgfedcba")
  console.log("Test fails: Expected 'ihgfedcba' for input str = 'abcdefghi'");
else
  console.log("Sample test case for input str = 'abcdefghi' passed!");

module.exports = reverseString
