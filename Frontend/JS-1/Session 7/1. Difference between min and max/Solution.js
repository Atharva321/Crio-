// Time  : O(1)
// Space : O(1)

/**
 * @param {number[]} arr
 * @return {number}
 */
function maxMinDifference(arr) {
    // You only need to implement this function.

    // Approach 1 
    var min = +Infinity;
    var max = -Infinity;
    for(var i = 0 ;i < arr.length;i++){
       min = Math.min(arr[i],min);
       max = Math.max (arr[i],max);
    }
    return max - min;

    // Approach 2(Only valid since the length of array is atleast 1)
    // arr.reduce(function(a, b) {
    //     return Math.max(a, b) - Math.min(a, b);
    // });
}


if (maxMinDifference([9, 1, 3, 4]) !== 8)
    console.log("Test fails: Expected 8 for input arr = [9, 1, 3, 4]");
else
    console.log("Sample test case for input arr = [9, 1, 3, 4] passed!");


module.exports = maxMinDifference;
