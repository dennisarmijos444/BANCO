# Proyecto BANCO - NetBeans

Se completo el codigo original. Se conservaron los paquetes Objetos, Interfacez e Implementaciones y los 9 archivos Java del proyecto.

## Para abrir
1. Descomprime el ZIP.
2. En NetBeans abre la carpeta BANCO-main/Account como proyecto Maven.
3. Ejecuta la clase Bank.java.

## Que hace cada archivo
- Objetos/Account.java: atributos y constructor de la cuenta.
- Objetos/SavingAccount.java: cuenta de ahorros y su estado (activa desde $10.000).
- Objetos/ChekingAccount.java: cuenta corriente y sobregiro.
- Implementaciones/Accounts.java: depositos, retiros, intereses, extracto e informacion.
- Implementaciones/SavingAccounts.java: restricciones y comision de cuenta de ahorros.
- Implementaciones/ChekingAccounts.java: retiros con sobregiro y depositos que pagan la deuda.
- Interfacez: las firmas de los metodos que implementan las clases anteriores.
- Bank.java: prueba las dos cuentas desde el main.

## Cambios del original
- Se corrigio el retiro: no puede ser mayor que el saldo en Account.
- Se agregaron los contadores de depositos y retiros.
- Se corrigio el interes mensual: saldo * tasa anual / 12 (la tasa se escribe como decimal: 0.15f equivale a 15%).
- Se corrigio la comprobacion de saldo minimo: una cuenta es activa desde $10.000, inclusive.
- Se completaron las comisiones de ahorros: $1.000 por cada retiro adicional al cuarto.
- Se implementaron las operaciones y el extracto de cuenta corriente.
- Se pasaron los objetos como parametros en las interfaces porque los metodos de Implementaciones trabajan sobre esos objetos.
- Se corrigio el pom.xml para ejecutar Bank y usar Java 17.

Solo se usan clases, herencia, interfaces, @Override, condiciones, operadores, metodos y getters/setters, como en el codigo inicial. Se conservaron nombres originales como ChekingAccount y montthlyStatement para no cambiar el ejercicio.

Nota: el extracto mensual se debe generar una sola vez por cada mes. El ejercicio no pide reiniciar los contadores cada mes.
