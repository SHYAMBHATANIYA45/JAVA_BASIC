let student= {
    name : "shyam",
    roll :43,
    class : "btech",

};
const item = {
    price: 100.99,
    discount:50,
    colors : ["red" , "blue"]
};

const post ={
    username : "@shyam",
    content : "this is my fiesrt post",
    likes :134,
    repost: 134,
    tags : ['@shiavm' , '@naman']

}
//js automatically converts object keys to strings
//even if we made the number as a key , the number will be converted to string
let students = {
    1:"a",
    2: "b",
    true :"c",
    null: "d",
    undefined:"e"
};
//  add/update 
const student1 = {
    name : "shyam",
    age : 23 ,
    marks: 97,
    city : "indore"
}
//object of object
//& array of object
const classInfo =[
     {
    
        grade :"A",
        city : "delhi",
    },
    {
        grade :"A",
        city : "delhi",
    },
    {
        grade :"A",
        city : "delhi",
    
}
]

let num3 = Math.random();
console.log(num3);
let num4 = num3*10;
let num5 = Math.floor(num4);
// while(num3 <= 10){
//     num3 = num3+1;
// }
console.log(num5);
 let random =(Math.floor(Math.random()*10)+1);
 //here 10 is use for how range of number that we want to print 

 //guessing game
const max = prompt("enter maximum number");

const randoom = Math.floor(Math.random() * max)+1;

let guess = prompt("guess the number");
while(true){
    if(guess == "quit"){
        console.log("user quit");
        break;
    }
    if(guess == randoom){
        console.log("you are right!");
        break;
    }
    else if(guess<randoom){
       guess = prompt("hint: your guess is too small! please try again")
    }else{
        guess = prompt("hint: your guess is too large! please try again")
    }
    // }else{
    //    guess = prompt("your guess was wrong");
    //
     }
//function expreession
/* >takes one or multiple function as arguments
   >return a function */
   function multipleGreet(funct,n){
    for(let i = 1; i<=n ; i++) {
     funct();
    }
}
    let greet = function(){
        console.log("hello");
    }
   
multipleGreet(greet , 2);

//odd or ev(en 
let even = function(n) {
    console.log(n % 2 !== 0 + "even")
}
let odd = function(n){
    console.log((n%2 == 0)+" odd")
}

function oddorevenFactory(requestr){
    if(request == "even"){
        let even = function(n){
        console.log((n%2 == 0));
    }
    return even;}  
    
    else if(request == "odd"){
        let odd = function(n){
   console.log(!(n%2 == 0));
    }
return odd;
}else{
    console.log("wrong request")
}
}
let request = ""//even
