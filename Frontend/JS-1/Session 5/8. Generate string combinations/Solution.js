/**
 * @param {string[]} arr1
 * @param {string[]} arr2
 * @return {string[]}
 */


function generateCombinations(arr1, arr2) {
  // You only need to implement this function.
  Sy
  return arr1*arr2;
}

if (JSON.stringify(generateCombinations(['a', 'c', 'e'], ['b', 'd', 'f'])) !== JSON.stringify( ['ab', 'ad', 'af', 'cb', 'cd', 'cf', 'eb', 'ed', 'ef']))
  console.log("Test fails: Expected ['ab', 'ad', 'af', 'cb', 'cd', 'cf', 'eb', 'ed', 'ef'] for input arr1 = ['a', 'c', 'e'] and arr2 = ['b', 'd', 'f']");
else
  console.log("Sample test case for input arr1 = ['a', 'c', 'e'] and arr2 = ['b', 'd', 'f'] passed!");

module.exports = generateCombinations

