"""
/**
     * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
     *     Необходимо посчитать и вернуть сумму элементов этого массива.
     *     При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
     *     (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
     *     Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
     */
"""
from random import sample,choices

def init_coll(size_xy:int,base:range):
    out = []
    for i in range(size_xy):
        out.append(choices(base,k=size_xy))
    return out
def validate(in_list):
    ox= len(in_list)
    for i in in_list:
        if not isinstance(i,list):
            return False
        if len(i)!= ox:
            return False
        for q in i:
            if q not in [0,1]:
                return False
    return True
def sum_arr(coll:list[list]):
    out = 0
    for q in coll:
        for w in coll:
            out +=w
    return out

def main():
    b=[1]
    a=init_coll(sample(range(100),5))
    c = init_coll(choices([0,1],k=20),3)
    assert validate(a) == False
    assert validate(b) == False
    assert validate(c) == True