# Лабораторна робота №2: Робота з класами

- Університет: Національний університет "Львівська Політехніка"
- Дисципліна: Прикладне програмування
- Номер ЛР: 2
- Варіант: 1

## 1. Компіляція
Компіляція програми відбувається через:
```
javac Main.java lab2.Customer.java lab2.Validator.java
```
## 2. Використання
Запуск програми відбувається наступним чином:
```
java Main
```
## 3. Результат виконання програми
### Опція "а"
```
Виберіть опцію:
а) список покупців із заданим іменем
б) список покупців, у яких номер кредитної картки знаходиться в заданому інтервалі
в) кількість та список покупців, які мають заборгованість
а
Олег
<lab2.Customer>{customerId: 4, lastName: Коваленко, firstName: Олег, patronym: Ігорович, address: м. Харків, вул. Свободи, 20, cardNumber: 45678901, balance: -500.0}
<lab2.Customer>{customerId: 6, lastName: Бондаренко, firstName: Олег, patronym: Анатолійович, address: м. Запоріжжя, вул. Перемоги, 15, cardNumber: 67890123, balance: 750.1}
```
### Опція "б"
```
Виберіть опцію:
а) список покупців із заданим іменем
б) список покупців, у яких номер кредитної картки знаходиться в заданому інтервалі
в) кількість та список покупців, які мають заборгованість
б
Введіть початок інтервалу:
10000000
Введіть кінець інтервалу:
50000000
<lab2.Customer>{customerId: 2, lastName: Петрова, firstName: Ольга, patronym: Вікторівна, address: м. Львів, вул. Лесі Українки, 5, cardNumber: 23456789, balance: 2300.5}
<lab2.Customer>{customerId: 3, lastName: Сидоров, firstName: Андрій, patronym: Андрійович, address: м. Одеса, вул. Дерибасівська, 10, cardNumber: 34567890, balance: 1200.0}
<lab2.Customer>{customerId: 4, lastName: Коваленко, firstName: Олег, patronym: Ігорович, address: м. Харків, вул. Свободи, 20, cardNumber: 45678901, balance: -500.0}
```
### Опція "в"
```
Виберіть опцію:
а) список покупців із заданим іменем
б) список покупців, у яких номер кредитної картки знаходиться в заданому інтервалі
в) кількість та список покупців, які мають заборгованість
в
Number of debtors: 2
<lab2.Customer>{customerId: 4, lastName: Коваленко, firstName: Олег, patronym: Ігорович, address: м. Харків, вул. Свободи, 20, cardNumber: 45678901, balance: -500.0}
<lab2.Customer>{customerId: 5, lastName: Гриценко, firstName: Марія, patronym: Юріївна, address: м. Чернівці, вул. Головна, 12, cardNumber: 56789012, balance: -300.25}
```