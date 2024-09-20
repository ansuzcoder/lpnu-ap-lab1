# Лабораторна робота №1: Основи Java

- Університет: Національний університет "Львівська Політехніка"
- Дисципліна: Прикладне програмування
- Номер ЛР: 1
- Варіант: 1

## 1. Компіляція
Компіляція програми відбувається через:
```
javac Main.java lab1.FibonacciNumber.java
```
## 2. Використання
Запуск програми відбувається наступним чином:
```
java Main N
```
де `N` - кількість чисел Фібоначчі.
## 3. Результат виконання програми
Після запуску, програма обрахує перші `N` чисел Фібоначчі, які представлені
окремим класом `lab1.FibonacciNumber`. Цей клас містить у собі інформацію про позицію
та значення певного числа з ряду, а також спеціальний метод `isSquare()`, який
перевіряє, чи є число ідеальним квадратом.

Для прикладу, якщо користувач передав `N = 25`, то вивід програми буде наступним:
```
User parsed: 25

Number 1 at position 0 is a perfect square
Number 1 at position 1 is a perfect square
Number 2 at position 2 is not a perfect square
Number 3 at position 3 is not a perfect square
Number 5 at position 4 is not a perfect square
Number 8 at position 5 is not a perfect square
Number 13 at position 6 is not a perfect square
Number 21 at position 7 is not a perfect square
Number 34 at position 8 is not a perfect square
Number 55 at position 9 is not a perfect square
Number 89 at position 10 is not a perfect square
Number 144 at position 11 is a perfect square
Number 233 at position 12 is not a perfect square
Number 377 at position 13 is not a perfect square
Number 610 at position 14 is not a perfect square
Number 987 at position 15 is not a perfect square
Number 1597 at position 16 is not a perfect square
Number 2584 at position 17 is not a perfect square
Number 4181 at position 18 is not a perfect square
Number 6765 at position 19 is not a perfect square
Number 10946 at position 20 is not a perfect square
Number 17711 at position 21 is not a perfect square
Number 28657 at position 22 is not a perfect square
Number 46368 at position 23 is not a perfect square
Number 75025 at position 24 is not a perfect square

Total number of perfect squares: 3
```