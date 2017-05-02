package GUI;

public class FachadaGUI {
    
    private carcel.FachadaCarcel fa;
    private VPrincipal vp;

    public FachadaGUI(carcel.FachadaCarcel fa) {
        this.fa = fa;
        this.vp = new VPrincipal(fa);
    }

    public void iniciaVista() {
        VLogin vl;
        
        vl = new VLogin(vp, true, fa);
        vp.setVisible(true);
        vl.setVisible(true);
    } 
}
