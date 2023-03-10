// Time  : O(1)
// Space : O(1)

/**
 * @param {string} name1
 * @param {string} name2
 * @return {string}
 */


function findTeamName(name1, name2) {
  // You only need to implement this function.
  return name1[0] + name2[0];
}

if (findTeamName("Rahul", "Kiran") !== "RK")
  console.log("Test fails: Expected 'RK' for input name1 = 'Rahul' and name2 = 'Kiran'");
else
  console.log("Sample test case for input name1 = 'Rahul' and name2 = 'Kiran' passed!");

module.exports = findTeamName;
