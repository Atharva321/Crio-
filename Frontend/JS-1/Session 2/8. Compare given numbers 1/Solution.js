// Time  : O(1)
// Space : O(1)

/**
 * @param {number} a
 * @param {number} b
 * @param {number} c
 * @return {boolean}
 */

function compareNumbers(a, b, c) {
    // You only need to implement this function.
    return (a===b || b===c) ? true : false;
}

if (compareNumbers(1, 1, 2) !== true)
    console.log("Test fails: Expected true for input a = 1, b = 1 and c = 2");
else
    console.log("Sample test case for input a = 1, b = 1 and c = 2 passed!");

module.exports = compareNumbers;
