const product = 
{
    name: "Laptop",
    price: 50000
};

const loggedProduct = new Proxy(product, 
    {
    get(target, property) {
        console.log(`Reading property: ${property}`);
        return Reflect.get(target, property);
    },

    set(target, property, value) 
    {
        console.log(`Writing property: ${property} = ${value}`);
        return Reflect.set(target, property, value);
    }
});


console.log(Reflect.get(loggedProduct, "price"));

Reflect.set(loggedProduct, "price", 55000);


console.log(Reflect.get(loggedProduct, "price"));