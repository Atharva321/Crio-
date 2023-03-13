/**
* @param {number[]} arr
* @return {number}
*/


function evenCubeSum(arr) {
  // You only need to implement this function.
  let sum = 0;
  for(i=0; i<arr.length; i++){
    if(arr[i] % 2 == 0) sum += (arr[i]*arr[i]*arr[i]);
  }
  return sum;
}

if (evenCubeSum([1, 2, 3, 4]) !== 72)
  console.log("Test fails: Expected 72 for input arr = [1, 2, 3, 4]");
else
  console.log("Sample test case for input arr = [1, 2, 3, 4] passed!");

module.exports = evenCubeSum

