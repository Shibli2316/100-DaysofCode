// Traversing up the DOM

// let ul = document.querySelector('ul');
// console.log(ul.parentNode.parentNode);
// console.log(ul.parentElement.parentElement);

// const html = document.documentElement;
// console.log(html.parentNode);  // returns #document
// console.log(html.parentElement);  // returns null


// Traversing down the DOM

let ul = document.querySelector('ul');
console.log(ul.childNodes); //indentation between elements are counted as nodes
console.log(ul.lastChild);
console.log(ul.firstChild);

ul.childNodes[1].style.backgroundColor = 'blue'; //we do it this way because the first child is a text

console.log(ul.children);

// Siblings node traversal

// let ul = document.querySelector('ul');
const div = document.querySelector('div');
console.log(div.childNodes);
console.log(ul.previousSibling);
console.log(ul.nextSibling);

console.log(div.childElementCount);