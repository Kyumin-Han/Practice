// window.onload = function() {
//     let btn = document.querySelector("button");
//     btn.addEventListener("click" , function() {
//         let h1 = document.querySelector("h1");
//         h1.innerHTML = "DOM Programming!!";
    
//         // let img = document.querySelector("img");
//         // img.src="./cinque-terre.jpg";

//         document.querySelector("img").src="./cinque-terre.jpg";

//         // 스타일 변경하기
//         h1.style.backgroundColor = "yellowgreen";
//     });
// }


// html 태그 안에서 onclick으로 정의해주는 경우
// function changeAttr() {    
//     let img = document.querySelector("img");
//     img.src="./cinque-terre.jpg";    
// }

window.onload = function () {
    let pelem = document.querySelector("p");
    // 태그선택

    pelem.style.color = "red";

    // let pelems = document.querySelectorAll("p");
    // let pelems = document.getElementsByTagName("p");
    // let pelems = document.getElementsByClassName("p1");

    // for(let i = 0; i < pelems.length; i++)
    // {
    //     pelems[i].style.backgroundColor = "blue";
    // }
    
    let pelems = document.querySelectorAll("p:nth-child(2n+1)");

    for(let i = 0; i < pelems.length; i++)
    {
        pelems[i].style.backgroundColor = "gold";
    }
}