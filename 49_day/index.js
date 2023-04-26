import {Buffer} from  'node:buffer';//Es6 module
//const {BUffer} =require('node:buffer') //CommonJs module
const buf1=Buffer.alloc(10);
console.log(buf1)

const buf2=Buffer.from('hello')
console.log(buf2)
console.log(buf2.toString())
buf2.slice(0,2)

const buf3=Buffer.from([1,2,3]);
console.log(buf3)