// Display a random quote from the list
var quotes = [
    'A man who doesn\'t spend time with his family can never be a real man.',
    'The best time to plant a tree was 20 years ago. The second best time is now.',
    'If your dreams don\'t scare you, they are too small',
    'If you want to go fast, go alone. If you want to go far, go together.'
];

// Select random quote
function select_quote(input_array) {
    return input_array[Math.floor(Math.random() * input_array.length)];
}

// Display random quote
console.log(select_quote(quotes));