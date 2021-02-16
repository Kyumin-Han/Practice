window.onload = function() {
    let btn1 = document.getElementById("btn1");

    let arr1 = new Array();

    for(let i = 0; i < 10; i++)
    {
        arr1[i] = Math.floor((Math.random()*99) + 1);
    }

    btn1.addEventListener('click', function () {
        let in1 = document.getElementById("in1");

        in1.value = arr1.join();

        in1.size = arr1.join().length;
    })

    let btn2 = document.getElementById("btn2");

    btn2.addEventListener('click', function () {
        arr1.sort(function (a,b) {
            return a - b;
        });

        let in2 = document.getElementById("in2");

        in2.value = arr1.join();

        in2.size = arr1.join().length;
    })
}