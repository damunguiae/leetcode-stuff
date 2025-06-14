function isPalindrome(x: number): boolean {
    
    let reversedList = [];
    let tenths = 0;
    if(x<0){
        return false;
    }
    let number  = x;
    while(number>0){
        let reminder = number%10;
        number = Math.floor(number/10);
        reversedList.push(reminder)
        tenths ++;
    }
    
    let currentNumber = 0;
    let i = 0;
    while(tenths>0){
        let power = Math.pow(10,tenths)
        currentNumber += power*reversedList[i];
        tenths--;
        i++;
    }
    currentNumber = Math.floor(currentNumber/10);
    return currentNumber == x;
};
