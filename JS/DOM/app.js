let SmallImages = document.getElementsByClassName("oldImg");
for(let i = 0 ; i<SmallImages.length ; i++){
    console.dir(SmallImages[i].src);
}

let links = document.querySelectorAll(".box a")
for(let i = 0 ; i < links.length; i++){
    links[i].style.color = "brown";
}
//assignment
let para = document.createElement('p');
para.innerText = "hey i am red";
document.querySelector('body').append(para)
para.classList.add("red");

let para1 = document.createElement('h3');
para1.innerText = "<h3>hey i am blue<h3>";
document.querySelector('body').append(para1)
para1.classList.add("blue");

// let div = document.createElement("div");
// let h1 = document.createElement("h1");
// let para2 = document.createElement("p");
// h1.innerText = "i am in a div";
// para2.innerText = "mee too";
// div.append(h1);
// div.append(para2);
// div.classList.add("box")

// document.querySelector("body").append(div);

// let button = document.createElement("button")
// let input = document.createElement("input");
// button.innerText = "click me"
// document.querySelector("body").append(input);
// document.querySelector("body").append(button);
// button.setAttribute("id" , "btn");
// input.setAttribute("placeholder" , "username");


// let h1 = document.createElement("h1");
// h1.innerHTML="<u>DOMPractice</u>";
// document.querySelector("body").append(h1);

