let number=(a,b,callback)=>
{
   let result =a*b;
    callback(result);
};
number (10,15,function(result)
{
    if(result>100)
    {
        console.log(result+"="+"above 100")
    }
    else
    {
        console.log(result+"="+"is below")
    }
});
