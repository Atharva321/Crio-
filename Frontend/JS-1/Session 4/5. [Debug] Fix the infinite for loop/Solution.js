// Time  : O(n)
// Space : O(1)

/**
 * @param {number} n
 * @return {number}
 */


function findSum(n) {

  let i = 1;
  let sum = 0;
  while(i <= n){
    sum += i++;
  }
  return sum;
}

if (findSum(3) !== 6)
  console.log("Test fails: Expected 6 for input n = 3");
else
  console.log("Sample test case for input n = 3 passed!");



module.exports = findSum;
