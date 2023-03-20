// Time  : O(m*n)
// Space : O(m*n)

/**
 * @param {string} str
 * @param {number} k
 * @return {string}
 */


function repeatString(str, k){
  // You only need to implement this function.
  repeatedString = "";
  while(k>0){
    repeatedString+=str;
    k--;
  }
  // console.log(repeatedString);
  return repeatedString;
}

if (repeatString("!", 3) !== "!!!")
  console.log("Test fails: Expected '!!!' for input str = '!' and k = 3");
else
  console.log("Sample test case for input str = '!' and k = 3 passed!");

module.exports = repeatString
