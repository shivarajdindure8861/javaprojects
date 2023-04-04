const nums=[1,3,2,4,5]
console.log(`0th element ${nums[0]}`)
console.log(`1st element is ${nums[1]}`)
console.log('For loop')
for(let i=0;i<nums.length;i++){
    console.log(`index ${i} -> element is ${nums[i]}`)
}
console.log(`🔥 While Loop 🔥`)
let i = 0
while( i < nums.length) {
    console.log(`Index ${i} -> Element ${nums[i]}`)
    i++
}
console.log(`🔥 Do While Loop 🔥`)
let j = 0;
do {
    console.log(`Index ${j} -> Element ${nums[j]}`)
    j++
} while( j < nums.length )
console.log(`🔥 For In 🔥`)
for (let ind in nums) {
    console.log(`Index ${ind} -> Element ${nums[ind]}`)
}

console.log(`🔥 For Of 🔥`)
for (let el of nums) {
    console.log(`Element ${el}`)
}