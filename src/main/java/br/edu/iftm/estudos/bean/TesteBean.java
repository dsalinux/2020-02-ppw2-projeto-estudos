package br.edu.iftm.estudos.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named(value="testeBean")
@SessionScoped
@Getter @Setter
public class TesteBean implements Serializable {

    private List<Cliente> clientes = new ArrayList();

    private Cliente cliente = new Cliente(); // Lombok -> getCliente()
    
    public void cadastrar(){
        this.clientes.add(this.cliente);
        this.cliente = new Cliente();
    }
    
    public void editar(Cliente cliente){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, 
                this.clientes.contains(cliente)+"",
                "");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
