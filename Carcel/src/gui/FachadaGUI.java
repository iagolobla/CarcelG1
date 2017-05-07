package gui;

public class FachadaGUI {
    
    private carcel.FachadaCarcel fc;
    private VPrincipal vp;

    public FachadaGUI(carcel.FachadaCarcel fc) {
        this.fc = fc;
        this.vp = new VPrincipal(fc);
    }

    public void iniciaVista() {
        VLogin vl;
        
        //vl = new VLogin(vp, true, fc);
        vp.setVisible(true);
        //vl.setVisible(true);
    } 
    
    public void iniciaVTrapicheos(){
        VTrapicheos vt;
        
        vt = new VTrapicheos(vp, true, fc);
        vt.setVisible(true);
        
    }
    
    public void iniciaVGestionEmpleados(){
        VGestionEmpleados vge;
        
        vge = new VGestionEmpleados(vp, true, fc);
        vge.setVisible(true);
        
    }
    
    public void iniciaVGestionPresos(){
        VGestionPresos vgp;
        
        vgp = new VGestionPresos(vp, true, fc);
        vgp.setVisible(true);
        
    }
    
    public void iniciaVGestionCeldas(){
        VGestionCeldas vgc;
        
        vgc = new VGestionCeldas(vp, true, fc);
        vgc.setVisible(true);
        
    }
    
    public void iniciaVGestionBandas(){
        VGestionBandas vgb;
        
        vgb = new VGestionBandas(vp, true, fc);
        vgb.setVisible(true);
        
    }
    
    public void iniciaVGestionVisitas(){
        VGestionVisitas vgv;
        
        vgv = new VGestionVisitas(vp, true, fc);
        vgv.setVisible(true);
        
    }
    
    public void iniciaVPreso(){
        VPreso vps;
        vps = new VPreso(vp, true, fc);
        vps.setVisible(true);
    }
    
    public void iniciaVGestionBandasRelaciones(){
        VGestionBandasRelaciones vgbr;
        
        vgbr = new VGestionBandasRelaciones(vp, true, fc);
        vgbr.setVisible(true);
    }
    
    public void iniciaVModVisita(){
        VModVisita vmv;
        
        vmv = new VModVisita(vp, true, fc);
        vmv.setVisible(true);
    }
    
}