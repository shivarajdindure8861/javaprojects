const engine ={
    rpm:2333,
    isPiston:true,
    make:'abc',
    isTwoStroke:'false'
}
const util={
    fuelCap:7,
    tank:45,
    tyre:'abc'
}
// exports.someObj={
//     engine:engine,
//     util:util
// }
exports.someObj={
    engine,
    util,
    calcObj
}
function calcObj(){
    console.log('Calculating speed')
}