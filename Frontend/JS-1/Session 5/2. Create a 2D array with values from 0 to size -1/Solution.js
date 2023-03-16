// Time  : O(n*n)
// Space : O(n*n)

/**
 * @param {number} size
 * @return {number[][]}
 */


function createMatrix(size) {
  // You only need to implement this function.
  let arr = [];
let rows = size;
let columns = size;

let value = 0;
// creating two-dimensional array
for (let i = 0; i < rows; i++) {
  arr[i] = [];
  for (let j = 0; j < columns; j++) {
    arr[i][j] = j;
  }
}
return arr;
}

if (JSON.stringify(createMatrix(2)) !== JSON.stringify([[0, 1], [0, 1]]))
  console.log("Test fails: Expected [ [ 0, 1 ], [ 0, 1 ] ] for input size = 2");
else
  console.log("Sample test case for input size = 2 passed!");

module.exports = createMatrix
