// Time  : O(1)
// Space : O(1)

/**
 * @param {number} r
 * @return {number}
 */
function findAreaOfCricle(r) {
    // You only need to implement this function.
    return Math.PI*r*r;
}


if (findAreaOfCricle(3) !== 28.274333882308138)
    console.log("Test fails: Expected 28.274333882308138 for input r = 3");
else
    console.log("Sample test case for input r = 3 passed!");


module.exports = findAreaOfCricle;

