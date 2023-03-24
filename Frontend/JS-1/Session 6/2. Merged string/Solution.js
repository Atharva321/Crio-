// Time  : O(1)
// Space : O(1)

/**
 * @param {string[]}str
 * @return {string}
 */


function mergedString(str){
  // You only need to implement this function.
  return `${str[0]} ${str[1]} ${str[2]}`;
}

if ((mergedString(['code','for','good','intent'])) !== 'code for good')
  console.log("Test fails: Expected 'code for good' for input str = ['code','for','good', 'intent']");
else
  console.log("Sample test case for input str = ['code','for','good', 'intent'] passed!");


module.exports = mergedString

