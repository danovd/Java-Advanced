function solve(input){
    let arr = []
let obj = {
   
    create: par => {
      
      let element = {};
      
      if(par[0].length === 1){
          element.name = par[0][0];
          
          arr.push(element) 
        }else{
            if(arr.find(e => e.name === par[0][2])){
            element = Object.create(arr.find(e => e.name === par[0][2]));
        }else{
            element = Object.create(arr.find(e => e['unchangedName'] === par[0][2]))
        }
            element[`unchangedName`] = par[0][0];
            arr.push(element);
        }
      

        },
        set: par =>  {
            let name = par[0][0];
            let property = par[0][1];
            let value = par[0][2];    
            
            let e = arr.find(e => e['unchangedName'] === name);
            if(e){
                e[property] = value;
            }else{
                e = arr.find(e => e['name'] === name);
                e[property] = value;
            };
        
            
        },
       // "<key1>:<value1>,<key2>:<value2>…
        print: par => { 
            let name = par[0][0];
        
            let element = arr.find(e => e['unchangedName'] === name);
            let result = [];
            if(element){
                for(let pr in element){
                   if(pr !== 'name' && pr !== 'unchangedName'){
                    result.push(pr + ':' + element[pr]);
                    }
                }
                console.log(result.join(','));
            }else{
                element = arr.find(e => e['name'] === name);
                for(let pr in element){
                    if(pr !== 'name' && pr !== 'unchangedName'){
                     result.push(pr + ':' + element[pr]);
                     }
                 }
                 console.log(result.join(','));
            }
           
          
            
        },
    }

    input.forEach(x => {
        const [command, parameters] = [x.split(' ').splice(0, 1), [x.split(" ").splice(1)]];
        obj[command](parameters);
    })



}





// INPUT DATA:
/*
solve(['create c1',
'create c2 inherit c1',
'set c1 color red',
'set c2 model new',
'print c1',
'print c2']
);
*/

solve(['create pesho','create gosho inherit pesho','create stamat inherit gosho',
'set pesho rank number1','set gosho nick goshko','print stamat'])
/*
solve(['create c1',
'create c2 inherit c1',
'print c1',
'print c2'
]
);

*/
