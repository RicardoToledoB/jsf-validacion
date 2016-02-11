package com.proyecto.bean;
import com.proyecto.model.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
/**
 *
 * @author ricardotoledo
 */
@Named(value = "usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable {
    /**
     * Creates a new instance of UsuarioBean
     */
    private Usuario usuario;
    public UsuarioBean() {
        usuario=new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void save(){
         
        String rut=this.getUsuario().getRut();
        String rut1 = rut.replace(".","");
        String rut2=  rut1.replace("-",""); 
        String run=rut2.substring(0, rut2.length()-1);
        String dv=rut2.substring(rut2.length()-1,rut2.length());
        String mensaje="normal:"+rut+" replace .:"+rut1+" final:"+rut2+" rut:"+run+ " dv:"+dv;
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,mensaje,mensaje);
        FacesContext.getCurrentInstance().addMessage("form:validate", message);

        
    }
    
}
