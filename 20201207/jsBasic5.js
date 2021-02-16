window.onload = function (){
    let timeID;
    let button = document.querySelector("button");

    let pid = document.querySelector("#pid");

    button.addEventListener("click", stopHello);

    function displayTime () {
        timeID = setInterval(function () {
            let today = new Date();
            let times = today.toString();
            pid.innerHTML = times;
        }, 500);
    }

    function stopHello () {
        clearInterval(timeID);
    }
    displayTime();
}

