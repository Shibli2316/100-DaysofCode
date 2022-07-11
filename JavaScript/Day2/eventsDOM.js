// Event listener

const buttontwo = document.querySelector('.btn-2');
function alertBtn(){
    alert('I also love JS');
}

buttontwo.addEventListener("click", alertBtn);


// mouse over button

const newBackgroundColor = document.querySelector('.box-3');
function changeBgColor(){
    newBackgroundColor.style.backgroundColor = 'blue';
}

newBackgroundColor.addEventListener("mouseover", changeBgColor);