let day=2
console.log(day)

if(day==1){
    console.log("mon")
}
else if(day==2){
    console.log("tue")
}
else if(day==3){
    console.log("wed")
}
else if(day==4){
    console.log("thu")
}
else if(day==5){
    console.log("fri")
}
else if(day==6){
    console.log("sat")
}
else if(day==7){
    console.log("sun")
}
else{
    console.log("Invalid day")
}
switch(day){
    case 1:{
        console.log("mon")
        break;
    }
    case 2:{
        console.log("tue")
        break;
    }
    case 3:{
        console.log("wed")
        break;
    }
    case 4:{
        console.log("thu")
        break;
    }
    case 5:{
        console.log("fri")
        break;
    }
    case 6:{
        console.log("Sat")
        break;
    }
    case 7:{
        console.log("Sun")
        break;
    }
    default:{
        console.log("Invalid day")
    }
    
}