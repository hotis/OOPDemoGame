package oopdemogame;

/**
 * Реализация стратегии атаки Огненным шаром.
 */
public class ОгненнаяАтака implements АтакаСтратегия {
    /**
     * Выполняет атаку мечом по указанной цели.
     *
     * @param атакующий объект, который атакует
     * @param цель      объект, по которому производится атака
     */
    @Override
    public void выполнитьАтаку(Персонаж атакующий, Персонаж цель) {
        System.out.println(атакующий.получитьИмя() + " выпускает огненный шар, нанося " + атакующий.урон + " урона!");
        цель.потерятьЗдоровье(атакующий.урон);
    }
}
