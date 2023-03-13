/**
 * @param {string[]} arr
 * @return {string[] | string}
 */


function debugShiftAndPop(arr) {

  let result =  arr.shift();
  return result;
}

if (debugShiftAndPop(['Football', 'Cycling', 'Wrestling', ' Shooting']) !== 'Football')
  console.log("Test fails: Expected 'Football' for input arr = ['Football', ' Cycling', 'Wrestling', ' Shooting']");
else
  console.log("Sample test case for input arr = ['Football', ' Cycling', 'Wrestling', ' Shooting'] passed!");

module.exports = debugShiftAndPop;

