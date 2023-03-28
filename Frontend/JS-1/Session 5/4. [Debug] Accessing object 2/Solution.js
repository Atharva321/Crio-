// Time  : O(1)
// Space : O(1)

/**
 * @return {string}
 */

function getFirstItem() {
  const shoppingCart = {"One": "Apple", "Two": "Orange"};
  return shoppingCart.One;
}

console.log("You can use console statements to check how to access properties of an object and try debugging.");

module.exports = getFirstItem;
