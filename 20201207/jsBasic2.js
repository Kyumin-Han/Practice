// prompt(), parseInt(), alert(), ..

// function add(a, b) {
//     // return a + b;
//     console.log(`함수내 출력 : ${a + b}`);
// }

// let value = add(3, 7);
// add(3, 7);
// add(8, 9);
// console.log(value);

// let num = parseInt(prompt("숫자(n)를 입력하시오")); // 정수형

// let value = addToN(num);

// console.log(`함수의 반환값 : ${value}`);

// // console.log(`sum의 값 : ${sum}`);

// function addToN(n) {
//     let sum = 0;
//     // sum은 함수 안에서만 사용할 수 있는 지역변수
//     // let은 속해있는 함수 안에서만 사용할 수 있다
//     for(let i = 1; i <= n; i++)
//     {
//         sum += i;
//     }
//     console.log(`num : ${num}`);
//     // console.log(`value : ${value}`)
//     // console.log("i: " + i);
//     return sum;
// }

// let value = addToN(10);

// var를 사용하면 기존의 함수를 삭제하고
// 선언된 함수로 다시 함수를 생성하여 사용
// let은 같은 이름의 변수, 함수를 사용하지 못한다.
// 익명 함수는 선언하고 나서 그 이후에 함수로서의 역할을 한다
// 자바스크립트는 위에서부터 순차적으로 처리하기 때문
// let addToN = function (n) {
//     let sum = 0;
//     for(let i = 0; i <= n; i++)
//     {
//         sum += i;
//     }

//     console.log("익명함수");
//     return sum;
// }

// let value2 = addToN(100);
// console.log(`함수의 반환값 : ${value2}`);

// let value3 = addToN(50);
// console.log(`함수의 반환값 : ${value3}`);

// let hello = function () {
//     console.log("Hello!!");
// }

// let hello1 = () => console.log("Hello!!");
// 위의 코드를 아래와 같이 단순하게 나타낼 수 있다

// let double = function(n){
//     return n * 2;
// }

// let double1 = (n1,n2) => n1 * n2;

// let hello = function () {
//     console.log(`Hello!!`);
// }

// function callTenTimes(callback) {
//     for(let i = 0; i < 10; i++)
//     {
//         callback();
//         console.log(`${i}...`);
//     }
// }

// callTenTimes(hello);

// function func() {
//     setTimeout(hello, 3000);
//     // setTimeout(function(){
//     //     console.log("Hello!!");
//     // }, 3000);
//     // (함수, milsecond)
//     // 3초뒤에 hello라는 함수를 실행
// }

// function hello() {
//     console.log("Hello!!...3초후");
// }

// func();
// console.log("종료");

// window.onload = function() {
//     let timeID;
//     let button = document.querySelector("button");

// button.addEventListener("click",stopHello);
// function func() {
//     setInterval(function () {
//         console.log("Hello!!");
//     },3000);
// }

// function stopHello() {
//     clearInterval(timeID);
// }

// func();
// console.log("종료");
// }

// window.onload = function () {
//     let timeID;
//     let button = document.querySelector("button");

//     let pid = document.querySelector("#pid");

//     button.addEventListener("click", stopHello);

//     function displayTime () {
//         timeID = setInterval(function () {
//             let today = new Date();
//             let times = today.toString();
//             pid.innerHTML = times;
//         }, 500);
//     }

//     function stopHello() {
//         clearInterval(timeID);
//     }

//     displayTime();
// }



// let person1 = {
//     name: "홍길동", addr:"지리산", age: 20
// }

// console.log(person1.name);
// person1.addr = "태백산";
// console.log(person1);

// let person2 = new Object();
// person2.name = "홍길동";
// person2.addr = "지리산";
// person2.age = "20";




