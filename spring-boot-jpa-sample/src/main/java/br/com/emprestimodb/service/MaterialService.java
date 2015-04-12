
package br.com.emprestimodb.service;

import br.com.emprestimodb.dao.converter.MaterialConverter;
import br.com.emprestimodb.dao.persistence.MaterialJpaPersistence;
import br.com.emprestimodb.dao.entity.Material;
import br.com.emprestimodb.model.MaterialModel;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialService {
    
    @Autowired
    private MaterialJpaPersistence materialJpaDao;
    
    public List<Material> findAll(){
        return materialJpaDao.list();
    }
    
    public Optional<Material> findById(Long id){
        return materialJpaDao.get(id);
    }
    
    public void save(MaterialModel material){          
        materialJpaDao.save(MaterialConverter.modelToEntity(material));
    }
    
    public void delete(Long id){
        materialJpaDao.delete(id);
    }
    
}
