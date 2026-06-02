function promises()
{
    return new Promise((resolve,reject)=>
    {
        let promise =false;
        setTimeout(()=>{
            if(promise)
            {
                resolve("success")

            }
            else{
                reject("fail");
            }
        },3000);
    });

}
promises()
    .then((result)=>
    {
        console.log(result);

    })
    .catch((error)=>
    {
        console.log(error)
    })
    .finally(()=>
    {
        console.log("completed")
    });


    //add or even

    function promise()
{
    return new Promise((resolve,reject)=>
    {
        let promise =9;
        setTimeout(()=>{
            if(promise %2==0)
            {
                resolve("even")

            }
            else{
                reject("add");
            }
        },3000);
    });

}
promise()
    .then((result)=>
    {
        console.log(result);

    })
    .catch((error)=>
    {
        console.log(error)
    })
    .finally(()=>
    {
        console.log("completed")
    });

//Marks

function Marks()
{
    return new Promise((resolve,reject)=>
    {
        let mark =20;
        setTimeout(()=>{
            if(mark>=50)
            {
                resolve("PASS")

            }
            else{
                reject("FAIL");
            }
        },3000);
    });

}
Marks()
    .then((result)=>
    {
        console.log(result);

    })
    .catch((error)=>
    {
        console.log(error)
    })
    .finally(()=>
    {
        console.log("completed")
    });