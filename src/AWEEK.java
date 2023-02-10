public enum AWEEK {
    DUISHOMBU("Дуйшомбу куну иштейм"),
    SHEISHEMBI("Шейшемби куну жава окуйм"),
    SHARSHEMBI("Шаршемби куну англис тил сабагын окуйм"),
    BEISHEMBI("Бейшемби фитнеске барам"),
    JUMA("Жума куну сузуу сабагына барам"),
    ISHEMBI("Ишемби уй булоом менен сейилдейм"),
    JEKSHEMBI("Жекшемби эс алам");

    private String description;

    AWEEK(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "AWEEK{" +
                " description = " + description +
                '}';
    }
}
