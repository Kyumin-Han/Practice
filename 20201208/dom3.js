// window.onload = function() {
//     let output = '';
//     for(let i = 0; i < 10; i++)
//     {
//         output += `<h1>Header - ${i} </h1>`;

//         document.body.innerHTML = output;

//         const headers = document.querySelectorAll('h1');
//         headers[5].style.color = 'red';
//     }
// }

// window.addEventListener('load', function() {
//     let output = "";
    
//     for(let i = 0; i < 256; i++)
//     {
//         output += "<div></div>";
//     }
//     document.body.innerHTML = output;

//     let divs = document.querySelectorAll("div");
//     for(let i = 0; i < divs.length; i++)
//     {
//         divs[i].style.height = "2px";
//         divs[i].style.backgroundColor = `rgb(${i}, ${i}, ${i})`;
//     }
// });

// window.onload = function () {
//     let btn = document.querySelector("button");
//     btn.addEventListener("click", function() {
//         let inputs = document.querySelector("input");
        
//         document.querySelector("div").innerHTML = `input tag의 입력값 : ${inputs.value}`;
//     });
// }

// window.onload = function () {
//     let btn = document.querySelector("button");
//     btn.addEventListener("click", function () {
//         let inputs = document.querySelector("input");

//         let str = "";
//         for(let i = 1; i <= inputs.value; i++)
//         {
//             for(let j = 1; j <= inputs.value - i; j++)
//             {
//                 str += "&nbsp";
//             }

//             for(let j = 1; j <= 2*i-1; j++)
//             {
//                 str += "*"
//             }

//             str += "<br>";
//         }

//         document.querySelector("div").innerHTML = str;
//     });
// }

// window.onload = function() {
//     let btn = document.querySelector("button");
//     btn.addEventListener("click", function() {
//         let inputs = document.querySelector("input");

//        inputs.value = eval(inputs.value);
//     });
// }

window.onload = function() {
    let btn = document.querySelector("button");
    btn.addEventListener("click", function () {
        let input = document.getElementById("in1");
        
        let input2 = document.getElementById("in2");
        
        let str = "";
        for(let i = 1; i <= input.value; i++)
        {
            if(input.value%i == 0)
            {
                str += i + " ";
            }
        }

        input2.value = `${input.value}의 약수>>${str}` ;

        input2.size = str.length + 5;
    })
}