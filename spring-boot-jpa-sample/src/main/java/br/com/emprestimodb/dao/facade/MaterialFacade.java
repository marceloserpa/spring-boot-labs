
package br.com.emprestimodb.dao.facade;

import br.com.emprestimodb.dao.converter.MaterialConverter;
import br.com.emprestimodb.dao.persistence.MaterialJpaPersistence;
import br.com.emprestimodb.contract.MaterialContract;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MaterialFacade {
    
    @Autowired
    private MaterialJpaPersistence materialJpaDao;    
    
    public List<MaterialContract> findAll(){
        return materialJpaDao.list().stream()
                .map(m -> MaterialConverter.entityToModel(m))
                .collect(Collectors.toList());
    }
    
    public Optional<MaterialContract> findById(Long id){
        return Optional.of(MaterialConverter.entityToModel(materialJpaDao.findById(id).get()));
    }
    
    public void save(MaterialContract material){          
        materialJpaDao.save(MaterialConverter.modelToEntity(material));
    }
    
    public void delete(Long id){
        materialJpaDao.delete(id);
    }    
    
}
