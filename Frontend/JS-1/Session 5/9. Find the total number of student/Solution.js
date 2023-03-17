/**
 * @param {number[][]} arr
 * @return {number}
 */


function matrixSum(arr) {
  // You only need to implement this function.
  sum = 0;
  for(i=0; i<arr.length; i++){
    for(j=0; j<arr[0].length; j++){
      sum += arr[i][j];
    }
  }
  return sum;
}

if (matrixSum([[5, 1], [2, 4]]) != 12)
  console.log("Test fails: Expected 12 for input arr = [[5, 1], [2, 4]]");
else
  console.log("Sample test case for input arr = [[5, 1], [2, 4]] passed!");

module.exports = matrixSum

