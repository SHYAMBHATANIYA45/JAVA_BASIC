// alert("this is too easy");
// console.error("error message")
// prompt("enter your name");
// let num = 5;
// if(num%10 == 0){
//     console.log("good")
// }else{
//     console.log("bad")
// }
// let age = prompt("enter your age");
// let name = prompt("enter your name");
// alert(name +" is "+ age + " years old");
// let quarter;
// switch (quarter = "1"){
//     case "1":
//         console.log("j , f , m");
//     break;
//     case "2":
//       console.log("A, M , J");
//       break;
//     case "3":
//       console.log("J, A , S");

// }

// let a = 2
// b= 3
// c = 4
// if(a>b && a>c){
//     console.log( a +" is the lagest number");
// }
//   else if(b>c && b>a){
//     console.log( b +" is the lagest number");
//  }
//   else{
//     console.log(c +" is the lagest number");
//   }
// let str = "aGolden"
// if(str[0]== "A"|| str[0] =="a" && (str.length > 5)){
//     console.log("golden string")

// }
// let num1=32;
// let num2=47852;
// if((num1%10)==(num2%10)){
//     console.log("numbers have the same last digit which is",num1%10);
// }
// else{console.log("numbersdon'thavethesamelastdigit")
// }
// let msg = "hello   ";

// let cars = ["wrv" , "alto" ,"eco" ,"omni"];
// let arr = [7,9,0,-2];
// let ans = arr.slice(0,3)
// let Ans = arr.slice(arr.length-3)
// console.log(ans);
// let stpr = "";

// let n = 15;
// console.log("odd number betwwen 0 to 15 is")
// for(let i = 0 ;i<=n ; i++){
  
//   if(i%2 != 0){
//     console.log(i);
//   }
// }
// let fav = "avatar";
// let guess = prompt("enter movie name ");
// while((guess != fav)){
//   if(guess != "quit"){
//     break;
//   }
//   console.log("wrong");
//   guess = prompt(" enter again movie name");
// }
// let fruits = ["mango" , "apple" , "banana"];
// for(fruit of fruits){
//   console.log(fruit);
// }
// let todo = [];
// let req = prompt("please enter your request");
// while(true){
//   if(req == "quit"){
//     console.log("quitting app");
//     break;
//   }
//   if (req == "list"){
//     console.log("________")
//     for(let i = 0 ; i < todo.length ; i++){
//       console.log(i ,todo[i]);
// } 
// console.log("______");
// }
// else if(req == "add"){
//   let task = prompt("please enter the task you want to add");
//   todo.push(task);
//   console.log("task added")
// }
// else if(req = "delete"){
//   let idx = prompt("enter your index the task you want to delete")
//     todo.splice(idx,1);
//     console.log("task deleted")
  
// }
//  req = prompt("please enter your request");
  
// }

// let arr = [1,2,3,4,5,6,2,3];
// let num = 2
// for(let i = 0 ; i<arr.length ; i++){
//   if(arr[i] == num){
//     // arr.slice(arr[i],1)}
//     arr.splice(i ,1);
//   }
// console.log(arr[i])
// }

// console.log("____________________________________");


//  let number = "285643"
//  let count = 0;
//  for(let i = 0 ; i < number.length ; i++ ){
//   count++;
//   }
//  console.log(count);

//  let nums = 28318;
//  let sum = 0
//  let copy = number;
//  while(copy > 0){
//   digit = copy%10;
//   sum += digit;
//   copy = Math.floor(copy/10);
//  }
//  console.log(sum);
//  console.log("____")

//  let nums1 = prompt("enter your number");
//  let factorial = 1;
//  if(nums1 == 0){
//   console.log("1")
//  }
//  let counts = 1;
//  while(counts<=nums1){
//   factorial *= counts;
//   counts++;
//  }
//  console.log(factorial);
console.log("____")

 let array = [2,5,6,3,2,5,7,8];
 let largest = 0;
 
 for(let i = 0 ; i <=array.length-1; i++)
      {
          if(array[i]>largest){
          largest = array[i];
  }}
  console.log(largest)

