// let btn = document.querySelector("button");
// let inp = document.querySelector("input");

// btn.addEventListener("click", function () {
//     console.log(this);
//     this.style.backgroundColor = "red"
//     console.log("click the button");
// });

// inp.addEventListener("keydown", function ( ) {
//     console.log("key", event.key); 
//     console.log("code", event.code);
//      console.log("Key Code", event.keyCode);
//     console.log("key was pressed");
// });

inp.addEventListener("keyup", function () {

    console.log("key was released");
});

inp.addEventListener("keydown", function(event) {
    if (event.key === "Enter") {
        console.log("Enter Pressed!");
    }
});



inp.addEventListener("keyup", function(event) {
    console.log("You typed:", event.target.value);
});


let form = document.querySelector("form");

form.addEventListener("submit", function(event) {
    event.preventDefault(); // stop page reload
    console.log("Form Submitted");
});