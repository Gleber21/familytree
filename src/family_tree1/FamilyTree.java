package family_tree1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
    private List<Human> familyTree;

    public FamilyTree() {
        familyTree = new ArrayList<>();
    }

    public void addHuman(Human human) {
        this.familyTree.add(human);
    }

public class FamilyTree {
    int ID;
    String FamilyName;
    int countPeople;
    ArrayList<Human> HumansFamily;

    public FamilyTree(int ID, String FamilyName, ArrayList<Human> HumansFamily){
        this.FamilyName = FamilyName;
        this.HumansFamily = HumansFamily;
        this.countPeople = HumansFamily.size();

    }

    @Override
    public String toString() {

        return String.format("\nID Семьи: %d\nФамилия семьи: %s\nКоличество людей: %d", ID, FamilyName, countPeople);
    }
}


