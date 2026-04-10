let btn = document.querySelector("button");

btn.addEventListener("click",function(){
    console.log(this);
    this.style.backgroundColor = "red"
    console.log("click the button");
});