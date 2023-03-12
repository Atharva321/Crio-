// Time  : O(1)
// Space : O(1)

/**
 * @param {string} name
 * @param {string} dish
 * @return {boolean}
 */


function potluckDish(name, dish) {
  // You only need to implement this function.
  return name[0] + name[name.length - 1] === dish[0] + dish[dish.length - 1];
}

if (potluckDish("Jhony", "Jelly") !== true)
  console.log("Test fails: Expected true for input name = Jhony and dish = Jelly");
else
  console.log("Sample test case for input name = Jhony and dish = Jelly passed!");

module.exports = potluckDish

