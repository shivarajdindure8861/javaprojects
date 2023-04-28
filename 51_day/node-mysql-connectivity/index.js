const mysql=require('mysql')

const connection=mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'root'
})

connection.connect(err =>{
    if(err){
        console.log('Problem in connectivity')
        console.log(err)
        return
    }
    console.log('Connected Successfully')
})
