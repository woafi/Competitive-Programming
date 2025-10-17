function maxProfit(prices) {
    let minPrice = Infinity; // Track the minimum price seen so far
    let maxProfit = 0; // Track the maximum profit possible
    
    for (let price of prices) {
        // Update the minimum price seen so far
        minPrice = Math.min(minPrice, price);
        // Update max profit if selling at current price gives better profit
        maxProfit = Math.max(maxProfit, price - minPrice);
    }
    
    return maxProfit;
}

let prices = [7,1,5,3,6,4];
console.log(maxProfit(prices));