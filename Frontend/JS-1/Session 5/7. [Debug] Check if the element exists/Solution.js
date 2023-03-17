// Time  : O(nlogn)
// Space : O(1)

/**
 * @param {string[]} arr
 * @param {string} ele
 * @return {boolean}
 */

function debugSortIncludes(arr, ele) {
  arr.sort();
  return (arr.includes(ele));
}

if (debugSortIncludes(['Ram', 'Shyam', 'Amit'], 'Ram') !== true)
  console.log("Test fails: Expected true for input arr = ['Ram', 'Shyam', 'Amit'] and ele = 'Ram'");
else
  console.log("Sample test case for input arr = ['Ram', 'Shyam', 'Amit'] and ele = 'Ram' passed!");


module.exports = debugSortIncludes;
