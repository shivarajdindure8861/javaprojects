const fs=require('fs')
const content='Some data '+new Date()

console.log('writing file')
fs.writeFileSync('./my.txt',content)
console.log('Data Written Successfully')

console.log('Reading File')
const fd=fs.readFileSync('./my.txt','utf-8')
console.log(fd)