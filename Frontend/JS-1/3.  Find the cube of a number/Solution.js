// Time  : O(1)
// Space : O(1)

/**
 * @param {number} a
 * @return {number}
 */
function findCube(a) {
    // You only need to implement this function.
    return a*a*a;
}


if (findCube(2) !== 8)
    console.log("Test fails: Expected 8 for input a = 2");
else
    console.log("Sample test case for input a = 2 passed!");


module.exports = findCube;
