package koschei.models;

public class Needle7 {
    private Death8 death;

    public Needle7(Death8 death) { // через конфиг.класс 2
        this.death = death;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + death.toString();
    }
}
