function sum(...args){
    for(let i = 0 ; i<args.length; i++){
        console.log("you gave us " + args[i]);
    }
}
function min(a,b,c){
    console.log(arguments.length);
    arguments.push(1);
}
//destructing
let name = ["shyam" ,"ram","mahesh","niraj" ,"naman"];
// let winner = names[0];
// let runnerup = names[1];
let [winner ,runnerup , secondRunnerup , ...others] = name;
let student ={
  name :"shyam",
  age : 14,
  clss: 9,
  subject :["hindi", "eng", " math"],
  username : "karan@1213"
}
let{username: user , password: key} = student;
