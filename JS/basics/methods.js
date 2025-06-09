// let subject = {
//     eng : 55,
//     math : 90,
//     hindi : 80,
//     phy : 99,
//     getAvg(){
//         let avg = (this.eng + this.math + this.phy)/3
//         //let avg = (eng+math+phy)/3 ) here it shows an error sow we use this keyword
//         console.log(avg);
//     }
// }

// //try and catch
// //the try statement allow yout to define a block of code to be tested for error while it is being executed
// //The catch statement allow you to define a block of code to be esecuted , if an error occurs in the try block
// console.log("hello")
// console.log("hello")
// // console.log(a) {it shows an error a is undefined and our code stooped here ,,so to ourcome her we use (try)}
// try{
//     console.log(a);
// } catch(err){
//     console.log("a is undfined");
// }
// console.log("hello");
// //arrow function
// //implicit function
// const sum =(a)=>{
//     return a*a
// }
// //explict
// const s = (a,b)=>{
//     console.log(a+b);
// } 

// //settimeout 
// // function we usually api calls
// console.log("hi ther!");
// setTimeout(()=>{
//     console.log("apna college");
// },2000);
// console.log("welcome to")

// //setInterval 
// //print after every 2 seconds
//  const id = setInterval(()=>{
//     console.log(" college");
// },3000);
// console.log(id)

// const id2 = setInterval(()=>{
//     console.log("hello world");
// },4000);
// console.log(id2)
// clearInterval(id)//stop the intetrval

const student = {
    name : "shyam",
    marks : 45,
    prop : this, //global scope
    getName : function(){
        console.log(this);
        return this.name;
    },
    getMarks: () => {
        console.log(this);//parents scope
        return this.marks; //it is undefined in output bcz scope of parent object is  global scope

    },
    getInfo1: function(){
        setTimeout(()=>{
            console.log(this);// it paraent obeject ka scope student he
        },2000);
    },
    getInfo2: function(){
        setTimeout(function(){
            console.log(this);
        },3000);
    }

}
//array methd .. foreach
let arr = [1,2,3,4]
// let print = function(el){
//     console.log(el);
// };
arr.forEach((el) =>{
    console.log(el);
});
arr.forEach(function(el){
    console.log(el + "____");})

let arry = [{
name : "shyam",
marks: 98,
},
{
name : "naman",
marks: 90,
},
{
name : "ram",
marks: 93,
},]

arry.forEach((student)=>{
    console.log(student.marks);
})

let gpa = arry.map((el) => {
    return el.marks/10
})

//map 
let num = [1,2,3,4];
let double = num.map(function(student){
    return student*2;
});
//filter
let even = num.filter((n)=>n %2==0)

//every: it print if every element is true or false
//some:  work like oR boolean||

console.log("___ reduce")
//reduce : with 2 variable (accumalator , element);
let result = num.reduce((result ,el) =>{
    console.log(result)
    return result+el;
});

//maximum(>change it to <) or min of an array

function getmaxMin(arraay){
let min = arraay.reduce((min, el) => {
    if(min > el){
    return el;}
    else{
        return min;
    }
});
return min;
}
let arraay =[2,4,5,6,8,98,3,10];
getmaxMin(arraay);

//multiple of 10
let numberss = arraay.filter((el) => el % 10 == 0);
console.log(numberss)

//default parameter
function sum(a,b = 3){
    return a+b;
}
console.log(sum(11)+ + "sum of defsult parameter");