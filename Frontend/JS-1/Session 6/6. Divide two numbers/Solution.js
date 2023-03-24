// Time  : O(1)
// Space : O(1)

/**
 * @param {number} num
 * @param {number} den
 * @return {number}
 */
function divide(num, den) {
    // You only need to implement this function.
    if(num == 0 && den == 0) return 0;
    return num/den;
}


if (divide(1, 4) !== 0.25)
    console.log("Test fails: Expected 0.25 for input num = 1 and den = 4");
else
    console.log("Sample test case for input num = 1 and den = 4 passed!");


module.exports = divide;
