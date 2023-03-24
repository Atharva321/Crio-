// Time  : O(1)
// Space : O(1)

/**
 * @param {number[]} arr
 */
function manipulatingArray(arr) {
    // You only need to implement this function.
    for(let i=0; i<arr.length; i++){
        if(arr[i]%2==0){
            arr[i]+=5;
        }
        else{
            arr[i]*=5;
        }
    }
}

var arr = [9, 1, 7, 4];
if (manipulatingArray(arr) && arr != [45, 5, 35, 9])
    console.log("Test fails: Expected [45, 5, 35, 9] for input arr = [9, 1, 7, 4]");
else
    console.log("Sample test case for input arr = [9, 1, 7, 4] passed!");


module.exports = manipulatingArray;

