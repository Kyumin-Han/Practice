// let person1 = {
//     name: "홍길동", addr:"지리산", age: 20
// }

// console.log(person1.name);
// person1.addr = "태백산";
// person1["age"] = 22;
// console.log(person1);

// let person2 = new Object();
// person2.name = "홍길동";
// person2.addr = "지리산";
// person2.age = "20";

// for in
// for(let key in person2)
// {
//     console.log(`${key} : ${person2[key]}`);
// }

// let obj = {
//     sid: 2020111,
//     major: 'computer programming',
//     isGraduated: true,
//     score: [88, 93, 97, 91, 89],
//     introduce: function () {
//         console.log(`학번 : ${this.sid} , 전공 : ${this.major}, 졸업 : ${this.isGraduated}`);
//     }
// };

// for in
// for(let n in obj) {
//     console.log(`${n} : ${obj[n]}`);
// }

// obj.introduce();

// let height = parseFloat(prompt("키를 입력하시오(Cm단위)"));

// let weight = parseFloat(prompt("체중을 입력하시오(Kg 단위)"));

// let value = bmi(height, weight);
// console.log(`BMI지수(${height},${weight}) : ${value}`);

// value = bmi(175, 79);
// console.log(`BMI지수 : ${bmi(175, 79).toFixed(2)}`);

// function bmi(n, m) {
//     return m/((n/100) ** 2);
// }