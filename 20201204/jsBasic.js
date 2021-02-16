// let : {} scope
// let은 중괄호 안에서만 유효한 변수

// var : 함수 scope

// var num1 = 10; // num1 선언
// var num2;
// console.log("num1 = " + num1);
// if(num1 > 5)
// {
//     let num1 = 33; // num1 선언
//     console.log(`num1(2) = ${num1}`);
// }

// console.log(`num2(1) = ${num2}`);
// console.log(`num1(3) = ${num1}`);

// num2 = 200;
// console.log(`num2(2) = ${num2}`);
// let num1 = 10;
// func();

// function func()
// {
//     let num2 = 200;
//     console.log(num1);
//     console.log("함수내 num2 = "  + num2);
//     let num1;
// }

// console.log("num2 = " + num2);
// console.log("num1 = " + num1);

// let i = "7";
// let k = 7;

// console.log(i - 2); 
// // 문자 - > 숫자로 형 변환
// console.log(i * 2);
// console.log(i / 2);
// console.log(i + 2);
// console.log(i == 7);
// console.log(k === 7);

// parseInt()
// 문자열을 정수로 반환
// 공백이 중간에 있으면 공백 전까지
// 공백이 처음에 있으면 공백을
// 무시하고 정수로 변환

// let str = "";

// for(let i = 2; i <= 9; i++)
// {
//     for(let j = 1; j <= 9; j++)
//     {
//         str += `${i} * ${j} = ${i*j}\t`;
//     }
//     str += "\n";
// }

// console.log(str);

// let str = "";


// let height = parseInt(prompt("높이를 입력하세요"));

// for(let i = 1; i <= height; i++)
// {
//     for(let j = 1; j <= height-i; j++)
//     {
//         str += " ";
//     }
//     for(let j = 1; j <= 2*i-1; j++)
//     {
//         str += "*";
//     }
//     str += "\n";
// }

// console.log(str);

// 배열
// let data1 = new Array();

// for(let i = 0; i < 10; i++)
// {
//     data1[i] = i;
// }

// console.log(`배열 data1의 크기 : ${data1.length}`);
// console.log(`배열 data : ${data1}`);
// data1[19] =99;
// console.log(`배열 data1의 크기 : ${data1.length}`);
// console.log(`배열 data : ${data1}`);
// console.log(`배열1[15] : ${data[15]}`);

// let data2 = new Array(11,22,33,44,55,66,77,88,99,100);
// console.log(`배열 data2의 크기 : ${data2.length}`);
// console.log(`배열 data2 : ${data2}`);

// let data3 = [];
// let data4 = [11,22,33,44,55,66,77,88,99,100];

// for(let i = 0; i < data4.length; i++)
// {
//     console.log(data4[i] + " ");
// }

// for(let j of data4)
// {
//     console.log(j);
// }

// let data5 = [[11,22,33],[44,55,66],[77,88,99],[1,2,3]];

// let str="";
// for(let i = 0; i < data5.length; i++)
// {
//     for(let j = 0; j < data5[i].length; j++)
//     {
//         str += data5[i][j] + "\t"; 
//     }
//     str += "\n";
// }

// console.log(str);

let a = [11,12,25,31,45,69,75,88,93,99];

let b = [17, 27, 33, 41, 53, 67, 79, 85, 87, 91];

let c = [];

// for(let i = 0; i < a.length; i++)
// {
//     c[i] = a[i] + b[i];
// }

// let str = "";

// for(let i = 0; i < c.length; i++)
// {
//     str += c[i] + "\t";
// }

// console.log(str);


// let str2 = "";
// for(let i = 0; i < a.length; i++)
// {
//     if(a[i] >= b[i])
//     {
//         c[i] = a[i];
//     }
//     else
//     {
//         c[i] = b[i];
//     }

//     str2 += c[i] + "\t";
// }

// console.log(str2);

// let str3 = "";

// let i = j = k = 0;

// while(i < a.length && j < b.length)
// {
//     if(a[i] > b[j])
//     {
//         c[k++] = b[j++];
//     }
//     else
//     {
//         c[k++] = a[i++];
//     }
// }

// for(; i < a.length; i++)
// {
//     c[k++] = a[i];
// }

// console.log(c);

// let cars = ["BMW" , "Audi", "현대", "Bentz", "Volvo"];

// let fruits = ["Apple", "Banana", "Peach", "Cherry", "Orange", "Mango"];

// let arr1 = cars.concat(fruits);
// console.log(arr1);

//배열을 문자열로 바꿈
// let str1 = cars.join("-");
// console.log(str1);

//push 가장 뒤쪽에 추가
// cars.push("쌍용");
// console.log(cars);

// cars.pop();
// console.log(cars);

//unshift 가장 앞쪽에 추가
// cars.unshift("쌍용");
// console.log(cars);

//shift 가장 앞쪽것을 삭제
// cars.shift();
// console.log(cars);

//slice 배열을 잘라서 새로운 배열에 할당 한다
// 숫자가 두개있으면 앞의 숫자부터 뒤의 숫자 개수만큼
// let arr4 = arr1.slice(0,5);
// 숫자가 하나있으면 그 숫자부터 끝까지
// let arr4 = arr1.slice(5);
// console.log(arr4);


// splice 앞의 숫자 번째부터 2개를 삭제하고 뒤의 것들을 추가한다
// let arr5 = arr1.splice(5, 0, "Pineapple", "Kiwi");
// console.log(arr1);

let fruits = ["Apple", "Banana", "Peach", "Cherry", "Orange", "Mango"];
let numbers = [56,34,81,90,19,8];

// sort 정렬하는 메소드
// 기본 오름차순 정렬
// 사전순으로, 문자열로 처리해서 비교한다
fruits.sort();
console.log(fruits);

numbers.sort();
console.log(numbers);

numbers.sort(function(a,b){
    // return a-b;
    // 오름차순 정렬

    return b-a;
    // 내림차순 정렬
});
console.log(numbers);