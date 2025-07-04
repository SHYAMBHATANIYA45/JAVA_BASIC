
// spreads
/*it print the individual value arr, string ..*/
let arrr = [2,3,4,5]
console.log(...arrr);
//spread in array literals
let arrrr = [1,2,3,4,5]
let newArr =[...arrrr];

let str =[..."shyam"]

//spread with object literal
const data = {
    email : "ironmn@gmail.com",
    pass: 34233,
};
const datacopy = {...data , id: 123,};
console.log(datacopy)
 newArr ={...arrrr};
