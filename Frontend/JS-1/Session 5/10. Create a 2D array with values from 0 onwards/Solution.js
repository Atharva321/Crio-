// Time  : O(n^2)
// Space : O(1)

/**
 * @param {number} size
 * @return {number[][]}
 */


function createMatrixII(size){
  // You only need to implement this function.
  let arr = [];
let rows = size;
let columns = size;

let value = 0;
// creating two-dimensional array
for (let i = 0; i < rows; i++) {
  arr[i] = [];
  for (let j = 0; j < columns; j++) {
    arr[i][j] = value++;
  }
}
return arr;
}

if (JSON.stringify(createMatrixII(2)) !== JSON.stringify([ [ 0, 1 ], [ 2, 3 ] ]))
  console.log("Test fails: Expected [ [ 0, 1 ], [ 2, 3 ] ] for input size = 2");
else
  console.log("Sample test case for input size = 2 passed!");

module.exports = createMatrixII
