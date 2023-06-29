"""
/**
     Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.+
     Необходимо посчитать и вернуть сумму элементов этого массива.+
     При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами+
     (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
     Если нарушается одно из условий, метод должен вернуть код ошибки.
     Программа должна корректно обработать код ошибки и вывести соответствующее сообщение пользователю.
     Сравнить такой вариант обработки исключений с предыдущим.
     */
"""
from random import sample, choices
from t3 import init_coll,sum_arr


def validate(coll:list[list]):
    ox = len(coll)
    try:
        for i in coll:
            if len(i) != ox:
                return -2
    
        for j in i:
            if j not in [0,1]:
                return -1
    except TypeError:
        return -2
    return (sum_arr(coll))
            
def main():
    a =init_coll(5,sample(range(100),k=10))
    b = init_coll(10,[0,1])
    c = [5]
    assert validate(a) == -1
    assert validate(c) == -2
    assert validate(b) > 1

    for i in [a,b,c]:
        print(i)
        match(validate(i)):
            case -1:
                print("данные")
            case -2:
                print("размерность")
            case _:
                print("всё ок")
    


main()