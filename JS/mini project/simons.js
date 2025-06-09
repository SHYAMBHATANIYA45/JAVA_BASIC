let gameSeq = [];
let userSeq = [];
let btns = ["red","green","yellow","purple"];

let started = false;
let level = 0;

let h2 = document.querySelector("h2");


document.addEventListener("keypress",function(){
   if(started == false){
       console.log("Game started");
       started = true;
       levelUp();
    }
});

function gameFlash(btn){
    btn.classList.add("flash");
    setTimeout(function() {
        btn.classList.remove("flash")
    },250);
}

function levelUp(){
   userSeq = [];
level++;
h2.innerText = `Level ${level}`;
//random btn choose
let randIdx = Math.floor(Math.random()*btns.length);
let randColor = btns[randIdx];
let randbtn = document.querySelector(`.${randColor}`)
// console.log(randIdx);
// console.log(randColor);
// console.log(randbtn);
gameSeq.push(randColor);
console.log(gameSeq);
gameFlash(randbtn);
}

function userFlash(btn){
    btn.classList.add("userflash");
    setTimeout(function() {
        btn.classList.remove("userflash")
    },250);
}

function checkAns(idx){
    // console.log("curr level :" ,level);
   //let idx = level -1;
    if(userSeq[idx]===gameSeq[idx]){
        if(userSeq.length == gameSeq.length){
       //levelUp();
       setTimeout(levelUp , 1000);
        }
    }else{
        h2.innerHTML =`Game Over! your score was <b>${level}</b> <br>Press any key to start`;
        document.querySelector("body").style.olor = "red"; 
        setTimeout(function(){
            document.querySelector("body").style.backgroundcolor = "white"; },1500);
        reset();
        }
}

function btnPress(){
   // console.log(this);
  let btn = this;
  userFlash(btn);
  userColor = btn.getAttribute("id")
  userSeq.push(userColor);
  //console.log(userColor);
  checkAns(userSeq.length-1);
}


let allBtns = document.querySelectorAll(".btn");
for(let btn of allBtns){
    btn.addEventListener("click",btnPress);
}
function reset(){
started =false ;
level = 0
gameSeq = [];
userSeq = [];
}
