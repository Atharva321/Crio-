/**
 * @param {number} a
 * @param {number} b
 * @return {number}
 */
function remainderOfDivision(a, b) {
    // You only need to implement this function.
    return a%b;
}

if (remainderOfDivision(10,3) !== 1)
    console.log("Test fails: Expected 1 for input a = 10 and b = 3");
else
    console.log("Sample test case for input a = 10 and b = 3 passed!");
    
module.exports = remainderOfDivision;

