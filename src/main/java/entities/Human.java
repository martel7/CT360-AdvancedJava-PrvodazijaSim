package entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Human {

    public String name;
    public List<Integer> ranking;
    public boolean taken = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getRanking() {
        return ranking;
    }

    public void setRanking(List<Integer> ranking) {
        this.ranking = ranking;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }
}
