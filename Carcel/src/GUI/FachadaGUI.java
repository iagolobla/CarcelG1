package GUI;

import carcel.FachadaCarcel;
import carcel.Preso;

public class FachadaGUI {

    private FachadaCarcel fa;
    private VPrincipal vp;

    public FachadaGUI(FachadaCarcel fa) {
        this.fa = fa;
        this.vp = new VPrincipal(fa);
    }

    public void iniciaVista() {
        VLogin vl;

        //vl = new VLogin(vp, true, fa);
        vp.setVisible(true);
        //vl.setVisible(true);
    }

    /*-----------------Presos--------------------*/
    public void iniciaGestionPresos() {
        VGestionPresos vgp;

        vgp = new VGestionPresos(vp, true, fa);

        vgp.setVisible(true);
    }

    public void nuevoPreso() {
        VPreso vpr;

        vpr = new VPreso(vp, true, fa);

        vpr.setVisible(true);
    }

    public void modificarPreso(Preso preso) {
        VPreso vpr;
        
        vpr = new VPreso (vp, true, fa, preso);
        
        vpr.setVisible(true);
    }

    /*------------------Celdas------------------*/
    public void iniciaGestionCeldas() {
        VGestionCeldas vgc;

        vgc = new VGestionCeldas(vp, true, fa);

        vgc.setVisible(true);
    }
}
