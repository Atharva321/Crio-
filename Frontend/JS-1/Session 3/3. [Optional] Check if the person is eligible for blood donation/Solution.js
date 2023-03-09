// Time  : O(1)
// Space : O(1)

/**
 * @param {number} age
 * @param {number} weight
 * @return {string}
 */

function checkBloodDonationEligiblity(age, weight) {
  // You only need to implement this function.
  return (age < 18 || weight <= 50) ? (age < 18) ? "UnderAge" : "NotEligible" : "Eligible";
}

if (checkBloodDonationEligiblity(18, 51) !== "Eligible")
  console.log("Test fails: Expected Eligble for input age = 18 and weight = 51");
else
  console.log("Sample test cases for input age = 18, and weight = 51 passed!");


module.exports = checkBloodDonationEligiblity;
