## Введение в автоматизацию тестирования

### Семинар 2.Принципы и паттерны разработки

Реализовать паттерн **Наблюдатель** и покрыть код тестами. 

- ознакомиться с паттерном Наблюдатель, сформулировать бизнес задачу
- создать свой Java Maven проект;
- добавить библиотеки JUnit;
- запрограммировать свою реализацию паттерна
- покрыть проект тестами: использовать абстрактные классы, параметризованные тесты, ЖЦ тестов, написать негативные тесты.

#### Алгоритм реализации паттерна:
- разделить функциональность на две части: Подписчик и Поставщик
- создать интерфейс Подписчик (метод передачи сообщения)
- реализовать подписчиков
- создать интерфейс Поставщик (метод управления подпиской)
- реализовать интерфейс Поставщика