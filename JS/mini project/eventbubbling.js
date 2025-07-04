//event bubling

// let div = document.querySelector("div");
// let ul = document.querySelector("ul");
// let lis = document.querySelectorAll("li");

// div.addEventListener("click", function() {
// console.log("div clicked");
// });
// ul.addEventListener("click", function() {
//     console.log("ul clicked");
//     });
//     for(li of lis){
//     li.addEventListener("click", function() {
//         console.log("li clicked");
//         }) ;
//     };
 let btn = document.querySelector('button');
 let ul = document.querySelector("ul");
 let inp = document.querySelector("input");

 btn.addEventListener("click", function(){
let item = document.createElement("li");
    item.innerText = inp.value;

let delbtn = document.createElement("Button")
  delbtn.innerText = "delete";
  delbtn.classList.add("delete");
  item.appendChild(delbtn);

ul.appendChild(item);
inp.value = "";
 })
 let delbtns = document.querySelectorAll('.delete');
 for( let delbtn of delbtns){
    delbtn.addEventListener("click",function(){
      //  console.log("element deleted");
      let par =this.parentElement;
      console.log(par);
      par.remove();
});
 }