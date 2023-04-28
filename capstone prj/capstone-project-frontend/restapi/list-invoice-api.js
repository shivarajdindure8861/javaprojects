function setUpTable(){
    const table=document.getElementById('tableInvoice')
    apiCreateNewInvoice(table)
}
setUpTable()

function populateStaticData(table){
    for(let i=0; i<10;i++){
        const row=table.insertRow()
        row.insertCell(0).innerHTML=i+1
        row.insertCell(1).innerHTML='abc'
        row.insertCell(2).innerHTML=2333
        row.insertCell(3).innerHTML='2023-01-01'
        row.insertCell(4).innerHTML=`<a href='#'>View</a> <a class='ms-2' href='#'>Update</a class='ms-2'>Delete<a></a>`
    }
}
function propulateActualData(table,invoice){
    for(let i=0; i<invoice.length;i++){
        const{id,client,invDt,amt}=invoice[i]
        const updatePageUrl=`./update-invoice.html?id=${id}`

        const row=table.insertRow()
        row.insertCell(0).innerHTML=id
        row.insertCell(1).innerHTML=client
        row.insertCell(2).innerHTML = amt
        row.insertCell(3).innerHTML = invDt
    }
}