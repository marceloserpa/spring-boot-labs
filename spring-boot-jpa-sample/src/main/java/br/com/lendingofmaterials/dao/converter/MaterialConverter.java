
package br.com.lendingofmaterials.dao.converter;

import br.com.lendingofmaterials.dao.builder.MaterialBuilder;
import br.com.lendingofmaterials.dao.entity.Material;
import br.com.lendingofmaterials.contract.MaterialContract;

public class MaterialConverter {

    public static Material modelToEntity(MaterialContract model){
        return new MaterialBuilder()
                .dataCompra(model.getDataCompra())
                .estoque(model.getEstoque())
                .nome(model.getNome())
                .id(model.getId())
                .build();
    }
    
    public static MaterialContract entityToModel(Material entity){
        MaterialContract model= new MaterialContract();
        model.setDataCompra(entity.getDataCompra());
        model.setEstoque(entity.getEstoque());
        model.setNome(entity.getNome());
        model.setId(entity.getId());
        return model;
    }
    
}
