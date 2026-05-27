let fruitnamess=["apple","orange","Mango","pineapple","Grapes"];


    console.log(fruitnamess);


let arr=[10,20,30,40];
console.log(arr[0]);

let fruitnames=["apple","orange","Mango","pineapple","Grapes"];
fruitnames[1]="Banana";
   console.log(fruitnames);

let arrr=[1,2,3,4,5];
console.log(arrr.length);

let fruitnamesss=[];
fruitnamesss.push("Mango");
console.log()

let colors = ["Blue", "Green"];

colors.unshift("Red");

console.log(colors);

let numbers = [100, 200, 300];

numbers.shift();

console.log(numbers);

let skills = ["HTML", "CSS", "JavaScript"];

console.log(skills.includes("JavaScript"));

let arrs = [10, 20, 30, 40, 50];

console.log(arrs.indexOf(50));

let arr = ["HTML", "CSS", "JS"];

console.log(arr.join("-"));

let arr1 = [1, 2];
let arr2 = [3, 4];

let result = arr1.concat(arr2);

console.log(result);

let numbers = [10, 20, 30, 40, 50];

let result = numbers.slice(1, 4);

console.log(result);

let ar = [1, 2, 3, 4, 5];

arr.splice(1, 2);

console.log(ar);

let a = [1, 2, 5, 6];

arr.splice(2, 0, 100, 200);

console.log(a);

let ard = ["A", "B", "C", "D"];

ard.reverse();

console.log(ard);

let ars = [50, 10, 80, 20];

arr.sort((a, b) => a - b);

console.log(ars);

let as = [5, 2, 9, 1];

as.sort((a, b) => b - a);

console.log(as);

let subjects = ["HTML", "CSS", "JS"];

subjects.forEach(function(value, index) {
    console.log(value, index);
});

let marks = [90, 80, 70, 60, 50];

let total = 0;

for(let i = 0; i < marks.length; i++) {
    total += marks[i];
}

let average = total / marks.length;

console.log("Total Marks:", total);
console.log("Average Marks:", average);