/**
 * @param {string} str
 * @return {number}
 */


function findLongestWordLength(str){
  // You only need to implement this function.
  arr = str.split(' ');
  // console.log(arr);
  length = 0;

  for(i=0; i<arr.length; i++){
    length = length < arr[i].length ? arr[i].length : length;
  }
  return length;
}

if (findLongestWordLength("I live in India") !== 5)
  console.log("Test fails: Expected 5 for input str = 'I live in India'");
else
  console.log("Sample test case for input str = 'I live in India' passed!");

module.exports = findLongestWordLength

