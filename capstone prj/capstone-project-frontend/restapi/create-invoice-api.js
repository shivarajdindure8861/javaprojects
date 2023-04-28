function apiCreateNewInvoice(invoice,form){
    const header={
        'content-type':'aplication/json'
    }
    axios.post('http://localhost:8080/invoice/',invoice,{headers})
                .then(res=>{
                    form.reset()
                    showSuccessMdal()
                })
                .catch(err =>console.log(err))
}
function setUpForm(){
    const formInvoice=document.getElementById('formInvoice')
        formInvoice.onsubmit=ev =>{
            //when form is submitted,this function would be called
            ev.preventDefault()//stop the dafault behaviour of refreshing the page
            console.log(ev)
            //const invoice={id:12,client:'abc',invDt:'2022-01-01',amt:98.02}

            const formData=new formData(ev.target)//ev.target points to form tag in the html 

            for(let key of FormData.keys()){
                console.log(key)//this is mapped to name attribute of the input tags
            }
            for(let val of formData.values()){
                console.log(val)//this is mapped to name atrribute of input of input tags
            }
             // const invoice = { 
                //         client : formData.get('client') ,
                //         invDt: formData.get('invDt'),
                //         amt: formData.get('amt') 
                // }
                const invoice=Object.fromEntries(formData.entries())//you are converting from data to js object
                console.log(invoice)
                apiCreateNewInvoice(invoice,formInvoice)//we are pass from object to reset the form on success
        }

}
setUpForm()

function showSuccessMdal(){
    var myModalE1=document.getElementById('successModal');
    var modal=new bootstrap.Modal(myModalE1)
    modal.show()
}
