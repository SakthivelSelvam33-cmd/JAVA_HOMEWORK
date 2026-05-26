let add=(a,b,callback)=>
{
   let sum=a+b;
   callback(sum);
}
let numbers=(result)=>
{
    console.log("Sum is"+"="+result)
}
add(2,3,numbers);