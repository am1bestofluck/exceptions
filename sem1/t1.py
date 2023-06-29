"""
принимаем массив, если массив меньше Н то возвращаем -1"""

def task(limit:int,coll:list) -> int:
    return -1 if len(coll) < limit else len(coll)
        

def main():
    a = []
    b = 100
    c = [None]*100500


    assert task(limit=b,coll=a) == -1
    assert task(b,c) == 100500