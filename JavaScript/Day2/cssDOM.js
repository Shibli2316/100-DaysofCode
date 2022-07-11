// Changing css using JavaScript

const title = document.querySelector('#main-heading');
title.style.color = 'red'; // this adds an inline css property of color
console.log(title);

// To change css of list we need a for loop to itterate over the number of list present

const listItem = document.querySelectorAll('.list-items');
for(i=0; i<listItem.length; i++){
    listItem[i].style.fontSize='2rem';
}


// Creating elements

const ul =  document.querySelector('ul');
const li = document.createElement('li');
// Adding elements
ul.append(li)
// Modifying the text
li.innerText='X-men';
// Modifying Attributes
li.setAttribute('id', 'main-heading');
li.removeAttribute('id');
// To know the id of any element
console.log(title.getAttribute('id'));
// Modifying attributes and classes
li.classList.add('list-items');
console.log(li.classList.contains('list-items'));
// Remove elements
li.remove();



// Difference between innerText innerHTML and textContent
const firstListItem = document.querySelector('.list-items');
console.log(firstListItem.innerText);  //Gives back just the text of the specified tag
console.log(firstListItem.textContent); //Gives back the text in the same format as in the html file
console.log(firstListItem.innerHTML);  //Returns text along with the tags in the html file (not suggested to use)
