//print command
console.log('hello');
//variables
a=10; //non declared variables
console.log(a);
var a=10; //variables declaration
console.log(a);
{
    var a=90; //value to 90
    console.log(a);
}
console.log(a);
var a=23;
console.log(a);
let b=24;
console.log(b);
{
 let b=23;
    console.log(b);
}
console.log(b);
const v=56;
{ 
    const v= 76;
    console.log(v);
}
console.log(v);
//data type
console.log(typeof(v));
//boolean
let isavailable=true;
console.log(typeof(isavailable));
//undefined
var t;
console.log(t);
//arrays
let arr1=[1,2,3,4,5]
console.log(typeof(arr1));
//js objects
let person={
    name:'hiba',
    age:'20',
    place:'kdk'
}
console.log(person.place);
//array of object
var arr_obj=[{name:"maya",location:"kochi",},{name:"meera",location:"tvm'"}]
console.log(arr_obj[1].location)
//operators
let a1=8;
console.log(a1+=3)
//increment operator
let inc=7;
let inc1=inc++;
console.log(inc1);
console.log(inc);
let inc2=7;
let inc3=++inc;
console.log(inc3);
console.log(inc2);
//conditional statement
if (inc==inc1){
    console.log("the value are equal")
}else{
    console.log("the value are not equal")
}
if((inc==inc1)&&(inc=89)){
    console.log("both are equal and its 89")
}
else{
    console.log("the condition check failed")
}
let re=90;
let ne=100;
let x=(ne-re)+(8**2);
console.log(x)
//functions
function addval(add1,add2){
    var sum=add1+add2;
    console.log(sum);
}
addval(10,20);
for (let i=0;i<10;i++){
console.log(i+1);
}
var arr=["a","b","c","d","e"]
for(let i=0;i<Array.length;i++){
console.log(arr[i])
}
let person_name={name:"joe",age:"78",place:"tvm"}
for(x in person_name){
    console.log(person_name[x]);
}
let k=0;
while(k<10){
    console.log(k+1);
    k++;
}
let k1=1;
do{
    console.log(k1);
    k1++;
} while(k1<=10);
