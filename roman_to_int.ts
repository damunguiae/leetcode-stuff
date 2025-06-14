function romanToInt(s: string): number {

    let substractions = {
        "IV":4,
        "IX":9,
        "XL":40,
        "XC":90,
        "CD":400,
        "CM":900,
    }

    let checkPoints = {
        "V":5,
        "X":10,
        "L":50,
        "C":100,
        "D":500,
        "M":1000
    }
    let chars = s.split("");
    let currentNumber = 0;
    let currentCheckPoint=""
    for(let i = chars.length-1;i>=0;i--){
        let currentChar=chars[i]
        if(currentCheckPoint){//a checkpoint was reached before
            let currentCombination = `${currentChar}${currentCheckPoint}`
            let currentSubstranction = substractions[currentCombination]
            if(currentSubstranction){
                currentNumber +=currentSubstranction
                currentCheckPoint = "";
                continue;
            }else{
                currentNumber +=checkPoints[currentCheckPoint]
            }
        }
        
        if(checkPoints[currentChar]){
            currentCheckPoint=currentChar
        }
        else{
            currentNumber++;// current char equivalent can only be I=1
        }

    }
    if(currentCheckPoint){
        currentNumber+=checkPoints[currentCheckPoint]
    }
    return currentNumber;
    
};
