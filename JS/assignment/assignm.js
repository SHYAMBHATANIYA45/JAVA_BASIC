let nums = [1,2,3,4]
let squr = nums.map(function(num){
   return num*num;
})
let avg = nums.reduce((avg, el)=> avg + el,0)
   let avrg = (avg)/nums.length;
   console.log(avrg)

let newArr = nums.map(function(el){
    return (el+5);
})
console.log(newArr);
let arr = ["shyam" ,"manish" , "ganesh"];
console.log(arr.map((el)=> el.toUpperCase()));

const doubleAndReturnArgs = (arr, ...args) =>[...arr,
   ...args.map((v)=>v*2),
];
console.log(doubleAndReturnArgs([1,2,3],3,4));

let ob1 = [{
   name: "sm",
   sub : "maths",
   marks : 345
}];
let ob2 =[{
   name : "h",
   sub : "eng",
   maths : 453,
}];
let mergeObjects = (ob1 ,ob2) => ({...ob1 , ...ob2});
console.log(mergeObjects({ob1:1,ob2:21}, {c:3,d:4}));
