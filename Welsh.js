//create list for double letters

const welsAlph = {
  a: 1,
  b: 2,
  c: 3,
  ch: 4,
  d: 5,
  dd: 6,
  e: 7,
  f: 8,
  ff: 9,
  g: 10,
  ng: 11,
  h: 12,
  i: 13,
  l: 14,
  ll: 15,
  m: 16,
  n: 17,
  o: 18,
  p: 19,
  ph: 20,
  r: 21,
  rh: 22,
  s: 23,
  t: 24,
  th: 25,
  u: 26,
  w: 27,
  y: 28,
  1: "a",
  2: "b",
  3: "c",
  4: "ch",
  5: "d",
  6: "dd",
  7: "e",
  8: "f",
  9: "ff",
  10: "g",
  11: "ng",
  12: "h",
  13: "i",
  14: "l",
  15: "ll",
  16: "m",
  17: "n",
  18: "o",
  19: "p",
  20: "ph",
  21: "r",
  22: "rh",
  23: "s",
  24: "t",
  25: "th",
  26: "u",
  27: "w",
  28: "y",
};

function isStr1IsGreaterThanOrEqualToStr2(word1, word2) {
  //compare first letters of each word to see if it's greater
  //word1[0] === word2[0]
  //6 < 17 , return false
  //if equals
  //a lot of if statements
  //aba, ab
  //[1,2,1] , [1,2]
  //1 === 1 , true
  //2 === 2, true
  //1 < undefined,
}

function convertToWelshWord(str) {
  //returns an array of letter values
  //ddr = [6,21]
  //nah = [17, 1, 12] ...
}

//maybe need this function or not??
// function findLowestWelshWord(arrayOfWelshWords){

// }

function sort(arrayOfStrings) {
  //["dea"]
  //find the lowest
  //selection sort = push the greatest to the right of the array
  //and repeat n times
}

//dddr
const arrayOfStrings = ["ddr, nah, dea, dd, ngah"];
//const str2 = "dda"
console.log(
  isStr1IsGreaterThanOrEqualToStr2(arrayOfStrings[0], arrayOfStrings[1])
);
