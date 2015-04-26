
package br.com.lendingofmaterials.dao.builder;

import br.com.lendingofmaterials.dao.entity.Material;
import java.sql.Date;

public class MaterialBuilder {

    private Material material;
    
    public MaterialBuilder(){
        this.material = new Material();
    }
    
    public MaterialBuilder estoque(Integer estoque){
        this.material.setEstoque(estoque);
        return this;
    }
    
    public MaterialBuilder nome(String nome){
        this.material.setNome(nome);
        return this;
    }
    
    public MaterialBuilder dataCompra(Date dataCompra){
        this.material.setDataCompra(dataCompra);
        return this;
    }
    
    public MaterialBuilder id(Long id){
        this.material.setId(id);
        return this;
    }
    
    public Material build(){
        return this.material;
    }
    
}
