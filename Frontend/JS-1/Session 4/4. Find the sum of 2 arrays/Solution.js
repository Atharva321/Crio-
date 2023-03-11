/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @return {number}
 */


function sumTwoArrays(arr1, arr2) {
  // You only need to implement this function.
  let sum = 0;
  for(i=0; i<arr1.length; i++){
    sum+=arr1[i];
  }
  for(i=0; i<arr2.length; i++){
    sum+=arr2[i];
  }
  return sum;
}

if (sumTwoArrays([2, 3], [1, 2, 3]) !== 11)
  console.log("Test fails: Expected 11 for input arr1 = [2, 3] and arr2 = [1, 2, 3]");
else
  console.log("Sample test case for input arr1 = [2, 3] and arr2 = [1, 2, 3] passed!");

module.exports = sumTwoArrays

