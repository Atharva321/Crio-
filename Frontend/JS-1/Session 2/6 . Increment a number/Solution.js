// Time  : O(1)
// Space : O(1)

/**
 * @param {number} a
 * @return {number}
 */

function incrementNumber(a) {
    // You only need to implement this function.
    return ++a;
}

if (incrementNumber(2) !== 3)
    console.log("Test fails: Expected 3 for input a = 2");
else
    console.log("Sample test case for input a = 2 passed!");

module.exports = incrementNumber;
