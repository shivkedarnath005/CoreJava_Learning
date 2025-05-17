package hybrid.inheritance_13;

/*Hybrid inheritance first level Animal
Second level mammal and Dog and MainAnimal class*/

class Dog extends Mammal implements Animal 
{
    @Override
    public void eat() 
    {
        System.out.println("Dog is eating...");
    }

    @Override
    public void sleep() 
    {
        System.out.println("Dog is sleeping...");
    }

    @Override
    public void walk() 
    {
        System.out.println("Dog is walking...");
    }
}

