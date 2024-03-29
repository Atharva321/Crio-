// Time  : O(1)
// Space : O(1)

/**
 * @param {number} num
 * @return {string}
 */

function evenOrOdd(num) {
    // You only need to implement this function.
    return num%2 ? "Odd" : "Even";
}

if (evenOrOdd(2) !== "Even")
    console.log("Test fails: Expected Even for input num = 2");
else
    console.log("Sample test case for input num = 2 passed!");

module.exports = evenOrOdd;
