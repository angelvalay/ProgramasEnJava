package poo.interfaces.dragonball;

import javafx.scene.image.Image;

/**
 * Clase para la factoria
 */
public class Fabrica {
    /**
     * Clase para el personaje de Krilin
     */
    private static class Krilin implements Personaje{
        public Image mostrarPersonaje() {
            return new Image("imagenes/krilin/base.png");
        }
    }

    /**
     * Clase para el personaje de Roshi
     */
    private static class Roshi implements Personaje{
        public Image mostrarPersonaje() {
            return new Image("imagenes/roshi/base.png");
        }
    }

    /**
     * Clase para el personaje de Goku
     */
    private static class Goku implements Personaje, Tranformacion,
            Saiyain.Super.Saiyain1,
            Saiyain.Super.Saiyain2, Saiyain.Super.Saiyain3,
            Saiyain.Super.Ozaru, Saiyain.Super.FaseDios.Fase1,
            Saiyain.Super.FaseDios.Fase2,
            Saiyain.Super.FaseDios.UltraInstinto {
        private Image image;
        Goku(){
            this.image = new Image("imagenes/goku/forma_base.png");
        }
        public Image mostrarPersonaje() {
            return image;
        }

        public void toSaiyain1() {
            this.image = new Image("imagenes/goku/superSaiyanBase.jpg");
        }

        public void toSaiyain2() {
            this.image = new Image("imagenes/goku/superSaiyan2.jpg");
        }

        public void toSaiyain3() {
            this.image = new Image("imagenes/goku/SuperSaiyan3.jpg");
        }

        public void toOzaru() {
            this.image = new Image("imagenes/goku/ozaru.jpeg");
        }

        public void toFase1() {
            this.image = new Image("imagenes/goku/superSaiyanDios.png");
        }

        public void toFase2() {
            this.image = new Image("imagenes/goku/superSaiyanAzul.webp");
        }

        public void toUltraInstito() {
            this.image = new Image("imagenes/goku/ultra_instinto.jpg");
        }

        public Personaje tranformar(Tranformaciones tranformacion) {
            switch (tranformacion){
                case OZARU:
                    this.toOzaru();
                    break;
                case SUPER_SAIYAIN_1:
                    this.toSaiyain1();
                    break;
                case SUPER_SAIYAIN_2:
                    this.toSaiyain2();
                    break;
                case SUPER_SAIYAIN_3:
                    this.toSaiyain3();
                    break;
                case SUPER_SAIYAIN_BLUE:
                    this.toFase2();
                    break;
                case SUPER_SAIYAIN_DIOS:
                    this.toFase1();
                    break;
                case SUPER_ULTRA_INSTINTO:
                    this.toUltraInstito();
                    break;
                default:
                    break;
            }
            return this;
        }
    }

    /**
     * Clase para el personaje de Vegetta
     */
    private static class Vegetta implements Personaje, Tranformacion,
            Saiyain.Super.Saiyain1, Saiyain.Super.Saiyain2, Saiyain.Super.Ozaru,
            Saiyain.Super.FaseDios.Fase1,
            Saiyain.Super.FaseDios.Fase2{
        private Image image;
        Vegetta(){
            this.image = new Image("imagenes/vegeta/normal.png");
        }
        @Override
        public Image mostrarPersonaje() {
            return this.image;
        }

        @Override
        public void toSaiyain1() {
            this.image = new Image("imagenes/vegeta/superSaiyanBase.webp");
        }

        @Override
        public void toSaiyain2() {
            this.image = new Image("imagenes/vegeta/SuperSaiyanSegindoGrado.webp");
        }

        @Override
        public void toOzaru() {
            this.image = new Image("imagenes/vegeta/ozaru.jpg");
        }

        @Override
        public void toFase1() {
            this.image = new Image("imagenes/vegeta/dios_1.png");
        }

        @Override
        public void toFase2() {
            this.image = new Image("imagenes/vegeta/dios_2.png");
        }

        @Override
        public Personaje tranformar(Tranformaciones tranformacion) {
            switch (tranformacion){
                case SUPER_SAIYAIN_1:
                    this.toSaiyain1();
                    break;
                case SUPER_SAIYAIN_2:
                    this.toSaiyain2();
                    break;
                case SUPER_SAIYAIN_DIOS:
                    this.toFase1();
                    break;
                case SUPER_SAIYAIN_BLUE:
                    this.toFase2();
                    break;
                case OZARU:
                    this.toOzaru();
                    break;
                default:
                    break;
            }
            return this;
        }
    }

    /**
     * Clase para el personaje de Gogetta
     */
    private static class Gogetta implements Personaje, Tranformacion,
            Saiyain.Super.Saiyain1, Saiyain.Super.FaseDios.Fase2{
        private Image image;

        public Gogetta() {
            this.image = new Image("imagenes/gogetta/normal.png");
        }

        @Override
        public Image mostrarPersonaje() {
            return image;
        }

        @Override
        public void toSaiyain1() {
            this.image = new Image("imagenes/gogetta/ss_2.jpg");
        }

        @Override
        public void toFase2() {
            this.image = new Image("imagenes/gogetta/blue.jpg");
        }

        @Override
        public Personaje tranformar(Tranformaciones tranformacion) {
            switch (tranformacion){
                case SUPER_SAIYAIN_1:
                    this.toSaiyain1();
                    break;
                case SUPER_SAIYAIN_BLUE:
                    this.toFase2();
                default:
            }
            return this;
        }
    }

    /**
     * Clase para el personaje de Vegito
     */
    private static class Vegito implements Personaje, Tranformacion,
            Saiyain.Super.Saiyain1, Saiyain.Super.Saiyain2, Saiyain.Super.FaseDios.Fase2{
        private Image image;

        public Vegito() {
            this.image = new Image("imagenes/vegitto/normal.png");
        }

        @Override
        public Image mostrarPersonaje() {
            return this.image;
        }

        @Override
        public void toSaiyain1() {
            this.image = new Image("imagenes/vegitto/ss1.png");
        }

        @Override
        public void toSaiyain2() {
            this.image = new Image("imagenes/vegitto/ss2.jpg");
        }

        @Override
        public void toFase2() {
            this.image = new Image("imagenes/vegitto/blue.jpg");
        }

        @Override
        public Personaje tranformar(Tranformaciones tranformacion) {
            switch (tranformacion){
                case SUPER_SAIYAIN_1:
                    this.toSaiyain1();
                    break;
                case SUPER_SAIYAIN_2:
                    this.toSaiyain2();
                    break;
                case SUPER_SAIYAIN_BLUE:
                    this.toFase2();
                    break;
                default:
            }
            return this;
        }
    }

    /**
     * Clase para el personaje de Trunks
     */
    private static class Trunks implements Personaje, Tranformacion,
            Saiyain.Super.Saiyain1, Saiyain.Super.Saiyain2{
        private Image image;

        public Trunks() {
            this.image = new Image("imagenes/trunks/BASE.png");
        }

        @Override
        public Image mostrarPersonaje() {
            return this.image;
        }

        @Override
        public void toSaiyain1() {
            this.image = new Image("imagenes/trunks/ssj.jpg");
        }

        @Override
        public void toSaiyain2() {
            this.image = new Image("imagenes/trunks/ss2.jpg");
        }

        @Override
        public Personaje tranformar(Tranformaciones tranformacion) {
            switch (tranformacion){
                case SUPER_SAIYAIN_1:
                    this.toSaiyain1();
                    break;
                case SUPER_SAIYAIN_2:
                    this.toSaiyain2();
                    break;
                default:
            }
            return this;
        }
    }

    /**
     * Clase para el personaje de Gohan
     */
    private static class Gohan implements Personaje, Tranformacion,
            Saiyain.Super.Saiyain1, Saiyain.Super.Saiyain2, Saiyain.Super.Mistico {
        private Image image;

        public Gohan() {
            this.image = new Image("imagenes/gohan/base.jpg");
        }

        @Override
        public Image mostrarPersonaje() {
            return this.image;
        }

        @Override
        public void toSaiyain1() {
            this.image = new Image("imagenes/gohan/ssj.png");
        }

        @Override
        public void toSaiyain2() {
            this.image = new Image("imagenes/gohan/ssj2.gif");
        }

        @Override
        public Personaje tranformar(Tranformaciones tranformacion) {
            switch (tranformacion){
                case SUPER_SAIYAIN_1:
                    this.toSaiyain1();
                    break;
                case SUPER_SAIYAIN_2:
                    this.toSaiyain2();
                    break;
                case MISTICO:
                    this.toMistico();
                default:
            }
            return this;
        }

        @Override
        public void toMistico() {
            this.image = new Image("imagenes/gohan/gohanDefinitivo.jpg");
        }
    }

    /**
     * Clase para el personaje de Freezer
     */
    private static class Freezer implements Personaje, Tranformacion,
            Changlong.OtrasFormas, Changlong.OtrasFormas.Dorado{
        private Image image;
        Freezer(){
            this.image = new Image("imagenes/freezer/primeraForma.jpg");
        }
        @Override
        public void toSegundaForma() {
            this.image = new Image("imagenes/freezer/terceraForma.png");
        }

        @Override
        public void toTerceraForma() {
            this.image = new Image("imagenes/freezer/segundaForma.png");
        }

        @Override
        public void toFormaFinal() {
            this.image = new Image("imagenes/freezer/formaFinal.jpg");
        }

        @Override
        public void toFormaMecha() {
            this.image = new Image("imagenes/freezer/mechaFreezer.png");
        }

        @Override
        public void toDorado() {
            this.image = new Image("imagenes/freezer/freezerDorado.jpg");
        }

        @Override
        public void toDoradoAuntentico() {
            this.image = new Image("imagenes/freezer/freezerDoradoAutentico.webp");
        }

        @Override
        public Image mostrarPersonaje() {
            return this.image;
        }

        @Override
        public Personaje tranformar(Tranformaciones tranformacion) {
            switch (tranformacion){
                case FORMA_BASE:
                    this.image = new Image("imagenes/freezer/primeraForma.jpg");
                    break;
                case FORMA_2:
                    this.image = new Image("imagenes/freezer/segundaForma.png");
                    break;
                case FORMA_3:
                    this.image = new Image("imagenes/freezer/terceraForma.png");
                    break;
                case FORMA_FINAL:
                    this.image = new Image("imagenes/freezer/formaFinal.jpg");
                    break;
                case DORADO:
                    this.image = new Image("imagenes/freezer/freezerDorado.jpg");
                    break;
                case DORADO_AUNTENTICO:
                    this.image =  new Image("imagenes/freezer/freezerDoradoAutentico.webp");
                    break;
                case MECHA:
                    this.image =new Image("imagenes/freezer/mechaFreezer.png");
                    break;
                default:
            }
            return this;
        }
    }

    /**
     * Clase para personaje de KingCold
     */
    private static class KingCold implements Personaje,
            Changlong{

        @Override
        public Image mostrarPersonaje() {
            return new Image("imagenes/kingcold/base.jpg");
        }

        @Override
        public Personaje tranformar(Tranformaciones tranformacion) {
            return this;
        }
    }

    /**
     * Clase para el personaeje de Androide 18
     */
    private static class Androide18 implements Personaje, Androide{
        @Override
        public Image mostrarPersonaje() {
            return new Image("imagenes/androide18/base.jpg");
        }

        @Override
        public Personaje tranformar(Tranformaciones tranformacion) {
            return this;
        }
    }

    /**
     * Clase para el personaje de Cell
     */
    private static class Cell implements Personaje, Androide, Androide.BioAndroide{
        private Image image;
        Cell(){
            this.image = new Image("imagenes/cell/primeraForma1.jpg");
        }
        @Override
        public void toEmbrionario() {
            this.image = new Image("imagenes/cell/estadoEmbrionario.webp");
        }

        @Override
        public void toInsectoide() {
            this.image = new Image("imagenes/cell/formaInsectoide.jpg");
        }

        @Override
        public void to1eraForma() {
            this.image = new Image("imagenes/cell/primeraForma1.jpg");
        }

        @Override
        public void to2daForma() {
            this.image = new Image("imagenes/cell/segundaForma.jpg");
        }

        @Override
        public void toPerfecto() {
            this.image = new Image("imagenes/cell/formaPerfecta.webp");
        }

        @Override
        public Image mostrarPersonaje() {
            return image;
        }

        @Override
        public Personaje tranformar(Tranformaciones tranformacion) {
            switch (tranformacion){
                case EMBRIONARIO:
                    this.image = new Image("imagenes/cell/estadoEmbrionario.webp");
                    break;
                case INSECTOIDE:
                    this.image = new Image("imagenes/cell/formaInsectoide.jpg");
                    break;
                case FORMA_1:
                    this.image = new Image("imagenes/cell/primeraForma.jpg");
                    break;
                case FORMA_2:
                    this.image = new Image("imagenes/cell/segundaForma.jpg");
                    break;
                case FORMA_3:
                    this.image = new Image("imagenes/cell/superSaiyanTercerGrado.webp");
                    break;
                case PERFECTA:
                    this.image = new Image("imagenes/cell/formaPerfecta.webp");
                    break;
                default:
            }
            return this;
        }
    }

    /**
     * Constructor con acceso privado
     */
    private Fabrica(){}

    /**
     * Funcion para obtener un personaje de acuerdo a su tranformacion
     * @param personaje Tipo de personaje que se desea obtener
     * @param tranformacion Tipo de transformacion del personaje
     * @return Un personaje para obtener la imagen
     */
    public static Personaje getPersonaje(Personajes personaje, Tranformaciones tranformacion){
        switch (personaje){
            case KRILIN:
                return new Krilin();
            case ROSHI:
                return new Roshi();
            case GOKU:
                return new Goku().tranformar(tranformacion);
            case VEGETTA:
                return new Vegetta().tranformar(tranformacion);
            case GOGETTA:
                return new Gogetta().tranformar(tranformacion);
            case VEGITTO:
                return new Vegito().tranformar(tranformacion);
            case GOHAN:
                return new Gohan().tranformar(tranformacion);
            case TRUNKS:
                return new Trunks().tranformar(tranformacion);
            case FREZER:
                return new Freezer().tranformar(tranformacion);
            case KING_COLD:
                return new KingCold();
            case ANDROIDE_18:
                return new Androide18();
            case CELL:
                return new Cell().tranformar(tranformacion);
            default:
                return null;
        }
    }

    /**
     * Funcion para obtener un personaje en su forma base
     * @param personaje Tipo de personaje que se desea obtener
     * @return Un personaje para obtener la imagen
     */
    public static Personaje getPersonaje(Personajes personaje){
        switch (personaje){
            case KRILIN:
                return new Krilin();
            case ROSHI:
                return new Roshi();
            case GOKU:
                return new Goku();
            case VEGETTA:
                return new Vegetta();
            case GOGETTA:
                return new Gogetta();
            case VEGITTO:
                return new Vegito();
            case GOHAN:
                return new Gohan();
            case TRUNKS:
                return new Trunks();
            case FREZER:
                return new Freezer();
            case KING_COLD:
                return new KingCold();
            case ANDROIDE_18:
                return new Androide18();
            case CELL:
                return new Cell();
            default:
                return null;
        }
    }

}
