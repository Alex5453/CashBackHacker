### Отчет о дефекте

**Название дефекта:** Неверный расчет остатка в методе `remain` класса `CashbackHackService`

**Описание:** Метод `remain` возвращает неправильное значение для суммы 1000 рублей. Ожидается, что при покупке на 1000 рублей остаток будет равен 0, однако фактически метод возвращает 1000.

**Шаги для воспроизведения:**
1. Создать экземпляр `CashbackHackService`.
2. Вызвать метод `remain` с параметром 1000.
3. Ожидать возврат 0, но фактически получаем 1000.

**Ожидаемое поведение:** Метод `remain` должен возвращать 0, когда сумма равна 1000.

**Фактическое поведение:** Метод возвращает 1000.

**Тест, который не прошел:** 
- `shouldReturn0IfAmountIs1000` в классе `CashbackHackServiceTest`.

**Стек вызовов:**
```
java.lang.AssertionError: expected:<0> but was:<1000>
	at org.junit.Assert.fail(Assert.java:89)
	at org.junit.Assert.failNotEquals(Assert.java:835)
	at org.junit.Assert.assertEquals(Assert.java:647)
	at org.junit.Assert.assertEquals(Assert.java:633)
	at ru.netology.service.CashbackHackServiceTest.shouldReturn0IfAmountIs1000(CashbackHackServiceTest.java:17)
```

**Приоритет:** Высокий

**Состояние:** Открыт

**Предложенное решение:** 
Изменить логику метода `remain` в классе `CashbackHackService`, чтобы он возвращал 0, когда сумма равна или превышает 1000 рублей. Пример исправленного кода:

```java
public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount >= boundary) {
            return 0;
        }
        return boundary - amount;
    }
}
```