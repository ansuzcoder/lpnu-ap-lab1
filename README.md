# Лабораторна робота №3: Гра "Битва дроїдів"

- Університет: Національний університет "Львівська Політехніка"
- Дисципліна: Прикладне програмування
- Номер ЛР: 3
- Варіант: -

## Результат виконання програми
Приклад бою 1v1:
```
Battle Starts!
Combatant 1: [DROID INFO: [Battle droid {TF-21}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}]]
Combatant 2: [DROID INFO: [Battle droid {DL-02}, droid type: {DEFENDER}]]

DROID INFO: [Battle droid {TF-21}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}] attacks enemy [DROID INFO: [Battle droid {DL-02}, droid type: {DEFENDER}]]
DROID INFO: [Battle droid {DL-02}, droid type: {DEFENDER}] attacks enemy [DROID INFO: [Battle droid {TF-21}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}]]
Droid A HP left: 55
Droid B HP left: 70

DROID INFO: [Battle droid {TF-21}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}] attacks enemy [DROID INFO: [Battle droid {DL-02}, droid type: {DEFENDER}]]
DROID INFO: [Battle droid {DL-02}, droid type: {DEFENDER}] attacks enemy [DROID INFO: [Battle droid {TF-21}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}]]
Droid A HP left: 30
Droid B HP left: 20

DROID INFO: [Battle droid {TF-21}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}] attacks enemy [DROID INFO: [Battle droid {DL-02}, droid type: {DEFENDER}]]
DROID INFO: [Battle droid {DL-02}, droid type: {DEFENDER}] is eliminated...
```

Приклад бою 5v5:
```
DROID INFO: [Battle droid {TF-21}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}] attacks enemy [DROID INFO: [Battle droid {ST-15}, droid type: {DEFENDER}]]
DROID INFO: [Battle droid {RX-99}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}] attacks enemy [DROID INFO: [Battle droid {SD-17}, droid type: {SUPPORT}]]
DROID INFO: [Battle droid {XT-88}, droid type: {COMBAT}, droid spec.: {SUICIDE_BOMBER}] attacks enemy [DROID INFO: [Battle droid {SD-17}, droid type: {SUPPORT}]]
DROID INFO: [Battle droid {SD-17}, droid type: {SUPPORT}] is eliminated...
DROID INFO: [Battle droid {GH-33}, droid type: {DEFENDER}] attacks enemy [DROID INFO: [Battle droid {ST-15}, droid type: {DEFENDER}]]
Request INTERRUPTED. Target is DISCONNECTED.

DROID INFO: [Battle droid {TF-21}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}] attacks enemy [DROID INFO: [Battle droid {TF-21}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}]]
DROID INFO: [Battle droid {RX-99}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}] attacks enemy [DROID INFO: [Battle droid {DL-02}, droid type: {DEFENDER}]]
DROID INFO: [Battle droid {XT-88}, droid type: {COMBAT}, droid spec.: {SUICIDE_BOMBER}] attacks enemy [DROID INFO: [Battle droid {DL-02}, droid type: {DEFENDER}]]
DROID INFO: [Battle droid {DL-02}, droid type: {DEFENDER}] is eliminated...
DROID INFO: [Battle droid {GH-33}, droid type: {DEFENDER}] attacks enemy [DROID INFO: [Battle droid {XT-88}, droid type: {COMBAT}, droid spec.: {SUICIDE_BOMBER}]]
DROID INFO: [Battle droid {XT-88}, droid type: {COMBAT}, droid spec.: {SUICIDE_BOMBER}] is eliminated...
Request INTERRUPTED. Target is DISCONNECTED.

Request INTERRUPTED. Target is DISCONNECTED.
Request INTERRUPTED. Target is DISCONNECTED.
Request INTERRUPTED. Target is DISCONNECTED.
DROID INFO: [Battle droid {GH-33}, droid type: {DEFENDER}] attacks enemy [DROID INFO: [Battle droid {TF-21}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}]]
DROID INFO: [Battle droid {XR-50}, droid type: {SUPPORT}] attacks enemy [DROID INFO: [Battle droid {TF-21}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}]]
DROID INFO: [Battle droid {TF-21}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}] is eliminated...

Request INTERRUPTED. Target is DISCONNECTED.
DROID INFO: [Battle droid {RX-99}, droid type: {COMBAT}, droid spec.: {STORMTROOPER}] attacks enemy [DROID INFO: [Battle droid {ST-15}, droid type: {DEFENDER}]]
DROID INFO: [Battle droid {ST-15}, droid type: {DEFENDER}] is eliminated...
Request INTERRUPTED. Target is DISCONNECTED.
Request INTERRUPTED. Target is DISCONNECTED.
Request INTERRUPTED. Target is DISCONNECTED.

Team-B Eliminated. Interrupting battle.
```