
package br.com.emprestimodb.dao.converter;

import br.com.emprestimodb.dao.builder.MaterialBuilder;
import br.com.emprestimodb.dao.entity.Material;
import br.com.emprestimodb.model.MaterialModel;

public class MaterialConverter {

    public static Material modelToEntity(MaterialModel model){
        return new MaterialBuilder()
                .dataCompra(model.getDataCompra())
                .estoque(model.getEstoque())
                .nome(model.getNome())
                .id(model.getId())
                .build();
    }
    
}
