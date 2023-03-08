// Time  : O(1)
// Space : O(1)

/**
 * @param {number} side1
 * @param {number} side2
 * @param {number} side3
 * @return {boolean}
 */

function isEquilateralType(side1, side2, side3) {
    // You only need to implement this function.
    return (side1 === side2 && side2 === side3 && side1 > 0) ? true : false; 
}

if (isEquilateralType(1, 1, 1) !== true)
    console.log("Test fails: Expected true for input side1 = 1, side2 = 1 and side3 = 1");
else
    console.log("Sample test case for input side1 = 1, side2 = 1 and side3 = 1 passed!");

module.exports = isEquilateralType;
