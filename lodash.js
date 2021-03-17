const _ = {
    clamp(num, low, upp){
      var first = Math.max(num, low);
      var second = Math.min(first, upp);
      return second;
    },
    inRange(num, start, end) {
      if (end === undefined) {
        end = start;
        start = 0;
      };
      if (start > end) {
        var temp = start;
        start = end;
        end = temp;
      };
      return ((num >= start) && (num < end));
    },
    words(string) {
      var words = string.split(' ');
      return words;
    },
    pad(string, length) {
      if (string.length >= length){
        return string;
      };
      var startPaddingLength = Math.floor((length - string.length) / 2);
      var endPaddingLength = (length - string.length - startPaddingLength);
      var paddedString = ' '.repeat(startPaddingLength) + string + ' '.repeat(endPaddingLength);
      return paddedString;
    },
    has(object, key) {
      var hasValue = object[key];
      if (hasValue === undefined) {
        return false;
      } return true;
    },
    invert(object) {
      var inverted = {};
      for (var key in object) {
        var value = object[key];
        inverted[value] = key;
      }
      return inverted;
    },
    findKey(object, predicate) {
      for (var key in object) {
        var value = object[key];
        var predicateReturnValue = predicate(value);
        if (predicateReturnValue) {
          return key;
        }
      }
      return undefined;
    },
    drop(array, n = 1) {
      droppedArray =  array.slice(n);
      return droppedArray;
    },
    dropWhile(array, predicate) {
      const rt = (element, index) => {
        return !predicate(element, index, array);
      };
      var DropNumber = array.findIndex(rt);
      var droppedArray = this.drop(array, DropNumber);
      return droppedArray;
    },
    chunk(array, size = 1) {
      arrayChunks = [];
      for (i = 0; i < array.length; i += size) {
        var arrayChunk = array.slice(i, i + size);
        arrayChunks.push(arrayChunk);
      }
      return arrayChunks;
    }
    
  };
  
  console.log(_.clamp(10,5,17));
  
  // Do not write or modify code below this line.
  module.exports = _;