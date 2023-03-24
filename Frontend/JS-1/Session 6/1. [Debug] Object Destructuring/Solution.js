// Time  : O(1)
// Space : O(1)

/**
 * @return {string}
 */

function getNameAndLocation() {
  let ob = {name: "Crio", location: "Bengaluru"};
  const {name, location} = ob;
  return  name+" "+location;
}

console.log("You can play around with object destructuring. Check whether the variable names used are same or not and try debugging.");

module.exports = getNameAndLocation;
