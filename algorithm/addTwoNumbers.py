'''
Lists need to be iterable for this method to work. Not on LeetCode
def addTwoNumbers(list1,list2):
    val1 = 0
    val2 = 0
    if ((list1==[]) & (list2==[])):
        return []
    if list1 != []:
        for item1 in list1:
            val1 += item1 * 10 ** (list1.index(item1) + 1)
    if list2 != []:
        for item2 in list2:
            val2 += item2 * 10 ** (list2.index(item2) + 1)
    valSum = str(val1 + val2)
    result = []
    for i in range(len(valSum)):
        result.append(int(valSum[-i-1]))
    while result[0] == 0:
        result.remove(result[0])
    return result
'''
    
