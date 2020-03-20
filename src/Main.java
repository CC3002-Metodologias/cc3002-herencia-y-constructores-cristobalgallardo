public class Main {

    public static void main(String[] args) {
        Persona p1 = new Estudiante("Pedro","DIE", 21);
        Persona p2 = new Academico("Alexandre","Academico", 40, "Metodologias Supremas ");
        Persona p3 = new Persona("Juan", "Choro", 27);
        System.out.println("Pedro");
        p1.comer();
        p1.dormir();
        System.out.println(p1.hacerLoSuyo());
        System.out.println("Alexandre");
        p2.comer();
        p2.dormir();
        System.out.println(p2.hacerLoSuyo());
        System.out.println(p2.publicarPaper());
        System.out.println("Juan");
        p3.comer();
        p3.dormir();


    }
}
