package ChooseLook;

public enum Characteristics {
    RACE("Раса", new String[] {
            "Негр",
            "Сущность в виде гномика",
            "Негроэльф",
            "Негрованоромаруснил"
    }),

    GENDER("Гендер", new String[] {
            "Цисгендерный спермобак",
            "Боевой вертолет",
            "Коммунист",
            "Нога Шарифова"
    }),

    ESTATE("Сословие", new String[] {
            "Купуц",
            "Дворянин",
            "Земледелец",
            "Жрец"
    }),

    COMBAT("Боевой класс", new String[] {
            "Воин",
            "Маг",
            "Разбойник",
            "Вор"
    });

    public String name;
    public String[] subjects;

    Characteristics(String name, String[] subjects) {
        this.name = name;
        this.subjects = subjects;
    }
}
