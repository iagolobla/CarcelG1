package GUI;

import carcel.FachadaCarcel;

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
    
    public void iniciaGestionPresos(){
        VGestionPresos vgp;
        
        vgp = new VGestionPresos(vp, true, fa);
        
        vgp.setVisible(true);
    }
}
