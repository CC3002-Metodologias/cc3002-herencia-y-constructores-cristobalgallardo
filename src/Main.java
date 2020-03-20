public class Main {

    public static void main(String[] args) {
        Persona p1 = new Estudiante("Pedro","DIE", 21);
        Persona p2 = new Academico("Alexandre","Academico", 40, "Metodologias Supremas ");

        p1.comer();
        p1.dormir();
        System.out.println(p1.hacerLoSuyo());

        p2.comer();
        p2.dormir();
        System.out.println(p2.hacerLoSuyo());
        System.out.println(p2.publicarPaper());


    }
}
