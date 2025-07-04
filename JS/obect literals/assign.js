let num = Math.floor(Math.random() * 6 )+1;
console.log(num);
const car ={
name: "safari",
model:"smart",
color : [ "white" , "black"],
};
console.log(car.name);
let person = {
    name:"shyam",
    age : "20",
    city: "khargone",
}
person.city = "indore";
person.country = "india";
console.log(person); 

let str = [ "hi i" ," hello"," bye"," !"]

function cocat(str){
let result = "";
for(let i = 0; i<str.length; i++){
    result += str[i];
}
return result;
}
let ans = cocat(str);
console.log(ans);

//assignment function
function numlarger( nm , arr){
    for(let i = 0 ; i<arr.length ; i++){
        if(arr[i]> nm){
            console.log(arr[i])
        }else{
        console.log(arr[i] + " number is smaller than " + nm)
        }
    }
    return;
}
let arr = [7,4,3,2,6,7]
numlarger(3,arr);
console.log("_____")

//unique char

function uniqueChar(ster){
    let ans ="";
    for(let i = 0; i<ster.length;i++){
        let currchar = ster[i];
        if(ans.indexOf(currchar) == -1){
            ans += currchar
        }else{
            
        }
    }
   
return ans;
}
            
let ster = "abcdefghabcd";
console.log(uniqueChar(ster))


function longestCoun( Array){
    let ansIdx = 0;
    
    for(let i = 0; i<Array.length;i++){
      anslen = Array[ansIdx].length;
      let currlen =  Array[i].length;
      if(anslen < currlen){
        ansIdx =i;
      }
    }
    return Array[ansIdx];

}
let Array=["Australia","Germany","UnitedStatesofAmerica"]
console.log(longestCoun(Array));


function countVowels(stri){
let count = 0 ;
for(let i =  0 ; i < stri.length; i++){
    if(
        stri.charAt(i)=="a"||
        stri.charAt(i)=="e"||
        stri.charAt(i)=="i"||
        stri.charAt(i)=="0"||
        stri.charAt(i)=="u"
    ){
       
        count++;
    
    }
}
return count;
}
let stri = "shyambhataniya";
console.log(countVowels(stri));


//arrow funtion 
 const arrayAvg =(arrr) => {
  let total = 0;
  for(let i = 0 ; i < arrr.length;i++){
  total +=arrr[i];
  }
  return total/arrr.length;
 };
 let arrr = [7,4,6,1,7];
 console.log(arrayAvg(arrr ) + " is the average of given array"    );
 let numm =4;
const Iseven = (numm) => numm%2 == 0;

let length=4;
function callback(){
    console.log(this.length)} ;
    const object={
        length:5,
        method(callback)
        {callback();},
    };
    object.method(callback,1,2);
