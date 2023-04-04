function callHi(msg){
    return 'hi '+msg.toUpperCase()
}
const dt=callHi('abc')
console.log(dt)
function calc(num1,num2,op){
    if(num1 < 10 && num1 > 100) return  '❌ Bad Number'
    if(num2 < -10 && num2 > 10) return '❌ Bad Number'

    if(op == '+') {
        return num1 + num2
    }
    if(op == '-') {
        return num1 - num2
    }
    if(op == '*') return num1 * num2
    if(op == '/') return num1 / num2
}

console.log(calc(3, 45, '+'))
//anonymous function
const sqr1=function(n){
    return n*n
}
//fat arrows 
const sqr2=n=>n*n
console.log(sqr1(2))
console.log(sqr2(2))

