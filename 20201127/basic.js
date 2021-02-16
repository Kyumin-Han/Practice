// var num = 32;
// var str = "ABCDE";
// 변수를 선언할 때 let을 사용하는게 좋다

let num = 123;
let str = "hello!";
let num2 = 2.333;

let isChecked = true;

//js에는 따로 변수형이 없다

const PI = 3.14;
const INCH = 2.54;
// 상수는 const로 선언한다

// 기본 자료형
// string, number, boolean, object, null, undefined

// object Type
// 

let score = 123 / str;
// NaN = Not a Number

let arr = []; // 배열
let func = {}; // 객체

console.log(12/0);
console.log(-12/0);

let x1 = 12;
let x2 = 5;

console.log(x1/x2);
// js에서는 실수값으로 나누기 연산을 반환한다
console.log(x1%x2);

console.log(x1**x2);

let num3 = 100;
let str2 = "JavaScript";
let num4 = "12";

console.log(num3 - num4);
console.log(num3 / num4);
console.log(num3 % num4);
console.log(num3 * num4);

// 숫자로 된 문자열은 연산하면
// 문자열이 숫자로 바뀌어서 계산할 수 있다

console.log(num3 + num4);
// 더하기 연산에 문자열이 하나라도 있으면
// 숫자가 문자열로 바뀐다
// 반환하는 결과는 문자열이다

let num5 = num3 + num4;
console.log(num5);

let num6 = (num3 + 33) + num4;
console.log(num6);

let str3 = "Hello!!";
let str4 = "어제 부모님이 \n\"심부름 좀 다녀와\" \t라고 하셨습니다";
let str5 = 'JavaScript';

// 문자열에 특수문자 넣기
// \' = '
// \" = "
// \\ = \
// \n = 줄바꿈
// \t = 탭

let num7 = 100;
let num8 = "100";

console.log(num7 == num8);

console.log(num7 === num8);
// === 연산자는 데이터 타입과 값이 모두 같은지 비교한다

let x = 5;
console.log((x === 5) ? "값과 자료형이 같다" : "값과 자료형이 불일치");

// alert("Hello!!!");
// 경고창 생성

// let score1 = prompt("성적을 입력하세요","(0~100)");
// prompt를 사용하여 입력받은 값은 문자열이다
// console.log(Number(score1));
//Number 함수를 사용하면 숫자로 변환할 수 있다

// console.log(score1);

// 형변환
// 문자 -> 숫자: Number()
// 숫자 -> 문자: String()

let num1 = "123";
console.log(Number(num1));

let num9 = "123ab";
console.log(parseInt(num9));
// parseInt = 정수값으로 바꿔주는 함수
// 문자는 무시하고 숫자만 변환해준다 

let num10 = String(777);
console.log(num10);

console.log(Boolean(1));
console.log(Boolean(0));
console.log(Boolean("Hello"));
console.log(Boolean(""));
// Boolean 함수는 0과 값이 없을때는 제외하고 값이 있으면 true를 반환한다

// Date 객체
// 날짜와 관련된 객체
// getDate() = 날짜 생성
// getDay() = 요일 생성
// getFullYear() = 연도 생성
// getHours() = 시간 생성
// getMinutes() = 분 생성
// getMonth() = 월 생성(0~11을 반환 1을 더해야함)
//

let date = new Date();
console.log(date);

let year = date.getFullYear();
let month = date.getMonth()+1;
let monthDate = date.getDate();
let weekDay = date.getDay();
let hours = date.getHours();
let minutes = date.getMinutes();
let seconds = date.getSeconds();
let times = date.getTime();

console.log(Date.now());

if(hours < 12)
{
    alert("오전입니다.");
}
else
{
    alert("오후입니다.");
}

if(hours < 5)
{
    alert("조금 더 자라");
}
else if(hours < 7)
{
    alert("곧 일어나야지");
}
else if(hours > 9 && hours <= 17)
{
    alert("학교에서 열심히 공부해야지");
}
else if(hours < 18)
{
    alert("이제 집에 가야지")
}
else
{
    alert("저녁먹고 좀 놀다가 공부 좀 하고 자자");
}

let score3 = prompt("성적을 입력하세요");
let grade;
switch(parseInt(score3/10)) 
{
    case 10:
    case 9:
        grade = 'A';
        break;
    case 8:
        grade = 'B';
        break;
    case 7:
        grade = 'C';
        break;
    default:
        grade = 'D';
}

console.log(grade);