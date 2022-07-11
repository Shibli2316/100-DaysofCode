// Event Delegation
// It allows users to append a Single event listener to a parent element that adds it to all of its present and future descendants that matches a selector.

document.querySelector('#sports').addEventListener('click', function(e){
    console.log(e.target.getAttribute('id') + ' is clicked');

    const target = e.target;
    if(target.matches('li')){
        target.style.backgroundColor = 'blue';
    }
})

const sports = document.querySelector('#sports');
const newSport = document.createElement('li');
newSport.innerText = 'Rugby';
newSport.setAttribute('id', 'rugby');
sports.appendChild(newSport);