// Time  : O(1)
// Space : O(1)

/**
 * @param {number} n
 * @return {number}
 */


function findFibonacci(n) {
  // You only need to implement this function.
  let first = 0;
  let second = 1;

  if(n==0) return 0;
  if(n==1) return 1;
  if(n==2) return second;

  for(let i=3; i<=n+1; i++){
    let temp = first + second;
    first = second;
    second = temp;
  }
  // console.log(second);
  return second;
}

if (findFibonacci(5) !== 5)
  console.log("Test fails: Expected 5 for input n = 5");
else
  console.log("Sample test case for input n = 5 passed!");

module.exports = findFibonacci

