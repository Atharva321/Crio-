// Time  :
// Space :

/**
 * @param {string} str
 * @return {boolean}
 */


function checkPalindrome(str){
  // You only need to implement this function.
  start = 0;
  end = str.length - 1;
  while(start < end){
    if(str[start++] != str[end--]) return false;
  }
  return true;
}

if (checkPalindrome("madam") !== true)
  console.log("Test fails: Expected true for input str = 'madam'");
else
  console.log("Sample test case for input str = 'madam' passed!");

module.exports = checkPalindrome

