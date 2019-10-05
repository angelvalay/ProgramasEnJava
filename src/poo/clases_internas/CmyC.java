package poo.clases_internas;

public class CmyC {
    private CmyC() {

    }

    ImyI facto() {
        return new ImyI() {
            @Override
            public void hola() {

            }
        };
    }
}
