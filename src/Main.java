import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class  Main {
    public static void main(String[] args) throws IOException {
        Filtros filtro = new Filtros();

        File imagem = new File("C://Users//vinif//Downloads//lago-louise.jpg");
        File imagemLagoLouise = new File("C://Users//vinif//Downloads//lago-louise.jpg");

        BufferedImage image = null;
        BufferedImage lago = null;

        image = ImageIO.read(imagem);
        lago = ImageIO.read(imagemLagoLouise);

        int largura = image.getWidth();
        int altura = image.getHeight();

        System.out.println("A altura é " + altura + " pixels");
        System.out.println("A largura é " + largura + " pixels");
        System.out.println("A quantidade total de pixels é " + altura * largura + " pixels");



        filtro.bandaR(lago);
        filtro.bandaG(lago);
        filtro.bandaB(lago);
        filtro.cinzaR(lago);
        filtro.cinzaG(lago);
        filtro.cinzaB(lago);
        filtro.pretoBranco(lago);
        filtro.aumentaTom(lago, "blue", 40);
        filtro.negativo(lago);
        filtro.limiarizacao(lago, 100);
        filtro.addBrilho(lago, 100);
        filtro.multiBrilho(lago, 1.5);

        System.out.println("Finalizado");
    }
}