// Time  : O(1)
// Space : O(1)

/**
 * @param {object[]} arr
 * @return {string}
 */
function maxCapacityType(arr) {
    // You only need to implement this function.
    maxCapType = "";
    cap = -1;
    for(let i=0; i<arr.length; i++){
        if(cap < arr[i].capacity){
            maxCapType = arr[i].type;
            cap = arr[i].capacity;
        }
    }
    return maxCapType;
}


if (maxCapacityType([{color: 'Red', type: 'Station Wagon', capacity: 5}, {color: 'Black', type: 'Sedan', capacity: 4}]) !== 'Station Wagon')
    console.log("Test fails: Expected 'Station Wagon' for input arr = [{color: 'Red', type: 'Station Wagon', capacity: 5}, {color: 'Black', type: 'Sedan', capacity: 4}]");
else
    console.log("Sample test case for input arr = [{color: 'Red', type: 'Station Wagon', capacity: 5}, {color: 'Black', type: 'Sedan', capacity: 4}] passed!");


module.exports = maxCapacityType;

