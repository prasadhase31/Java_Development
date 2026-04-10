let btn = document.querySelector("button");
let inp = document.querySelector("input");

btn.addEventListener("click", function () {
    console.log(this);
    this.style.backgroundColor = "red"
    console.log("click the button");
});

inp.addEventListener("keydown", function () {
    console.log("key", event.key);
    console.log("code", event.code);
    console.log("key was pressed");
});

inp.addEventListener("keyup", function () {

    console.log("key was released");
});