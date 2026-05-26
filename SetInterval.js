let count = 1;

setInterval(() => {

    console.log(count);

    count++;

}, 3);

//set inteval

function displayNumbers() {

    let number = 1;

    let timer = setInterval(() => {

        console.log(number);

        number++;

        if(number > 10) {
            clearInterval(timer);
        }

    }, 1000);

}

displayNumbers();

//show time
function showTime() {

    setInterval(() => {

        let currentTime = new Date();

        console.log(currentTime.toLocaleTimeString());

    }, 1000);

}

showTime();

//even numbers
function displayEvenNumbers() {

    let number = 2;

    setInterval(() => {

        console.log(number);

        number = number + 2;

    }, 2000);

}

displayEvenNumbers();

//10 to 0 level

function countdownTimer() {

    let count = 10;

    let timer = setInterval(() => {

        console.log(count);

        count--;

        if(count < 0) {

            clearInterval(timer);

            console.log("Countdown Finished");

        }

    }, 1000);

}

countdownTimer();