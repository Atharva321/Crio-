// Time  : O(1)
// Space : O(1)

/**
 * @param {number} a
 * @param {number} b
 * @return {number}
 */
function multiplyTwoDecimals(a, b) {
    // You only need to implement this function.
    return a*b;
}

if (multiplyTwoDecimals(896.78,11.5) !== 10312.97)
    console.log("Test fails: Expected 10312.97 for input a = 896.78 and b = 11.5");
else
    console.log("Sample test case for input a = 896.78 and b = 11.5 passed!");

module.exports = multiplyTwoDecimals;
