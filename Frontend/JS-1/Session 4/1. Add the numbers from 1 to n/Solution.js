// Time  : O(n)
// Space : O(1)

/**
 * @param {number} n
 * @return {number}
 */


function findSumOfFirstN(n){
  // You only need to implement this function.
  let sum = 0;
  for(i=1; i<=n; i++){
    sum+=i;
  }
  return sum;
}

if (findSumOfFirstN(3) !== 6)
  console.log("Test fails: Expected 6 for input n = 3");
else
  console.log("Sample test case for input n = 3 passed!");


module.exports = findSumOfFirstN
