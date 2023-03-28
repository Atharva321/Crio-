// Time  : O(n)
// Space : O(n^2)

/**
 * @param {string[]} arr1
 * @param {string[]} arr2
 * @return {string[]}
 */


function generateCombinations(arr1, arr2) {
  // You only need to implement this function
  let arr3 = new Array(arr1.length*arr2.length);
  let k=0;
  for(let i=0;i<arr1.length; i++){
    for(let j=0;j<arr2.length; j++){
      arr3[k++] = arr1[i]+arr2[j];
    }
  }
  return arr3;
}

if (JSON.stringify(generateCombinations(['a', 'c', 'e'], ['b', 'd', 'f'])) !== JSON.stringify( ['ab', 'ad', 'af', 'cb', 'cd', 'cf', 'eb', 'ed', 'ef']))
  console.log("Test fails: Expected ['ab', 'ad', 'af', 'cb', 'cd', 'cf', 'eb', 'ed', 'ef'] for input arr1 = ['a', 'c', 'e'] and arr2 = ['b', 'd', 'f']");
else
  console.log("Sample test case for input arr1 = ['a', 'c', 'e'] and arr2 = ['b', 'd', 'f'] passed!");

module.exports = generateCombinations

