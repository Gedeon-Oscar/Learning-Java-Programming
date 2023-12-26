public class Couple {
    public Person person1,person2;

    Couple(Person a, Person b){
        this.person1 = a;
        this.person2 = b;
    }

    Person getPerson1(){ return person1; }
    Person getPerson2(){ return person2; }
}
