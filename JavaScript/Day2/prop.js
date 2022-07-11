// Event propogation
window.addEventListener("click", function(){
    console.log('Window');
}, true); //false by default

document.addEventListener("click", function(){
    console.log('Document');
}, true);

document.querySelector('.div2').addEventListener("click", function(){
    // e.stopPropagation();
    console.log('DIV 2');
}, {once: true});

document.querySelector('.div1').addEventListener("click", function(){
    console.log('DIV 1');
}, true);

document.querySelector('button').addEventListener("click", function(e){
    // console.log(e);
    // console.log(e.target);
    console.log(e.target.innerText = 'Clicked');
}, true);