// let btn = document.querySelector("button");
// console.dir(btn);
// // btn.onclick = function (){
// //     alert("button was clicked");
// // };
//  function sayHello(){
//     alert("say hello")
// };
// function sayName(){
//     alert("apna college")
// };


// //event listeners
// btn.addEventListener("click",sayHello)
// btn.addEventListener("click",sayName)
let btn = document.querySelector("button");
btn.addEventListener("click" , function(){
    console.log("generate random color")
    let h3 = document.querySelector("h3");
     let randomcolor = getRandomColor();
     h3.innerHTML = randomcolor;
    console.log("color updated ")
    let div = document.querySelector("div");
    div.style.backgroundColor = randomcolor;
});



function getRandomColor(){
    let red = Math.floor(Math.random()*255);
    let green = Math.floor(Math.random()*255);
    let blue = Math.floor(Math.random()*255);
    let Color = `rgb(${red} , ${green},${blue})`;
    return Color;
}


let form = document.querySelector("form");
 //let inp = document.querySelector('input');
form.addEventListener("submit",function(event){
    event.preventDefault();
    let user = document.querySelector('#user')
    let inp = document.querySelector('input');
    let pass = document.querySelector('#pass')
    console.log(user.value)
    console.log(pass.value)
});
