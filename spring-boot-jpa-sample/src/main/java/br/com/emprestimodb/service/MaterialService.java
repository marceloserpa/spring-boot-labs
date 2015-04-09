
package br.com.emprestimodb.service;

import br.com.emprestimodb.dao.MaterialJpaDao;
import br.com.emprestimodb.entity.Material;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialService {
    
    @Autowired
    private MaterialJpaDao materialJpaDao;
    
    public List<Material> findAll(){
        return materialJpaDao.list();
    }
    
    public Optional<Material> findById(Long id){
        return materialJpaDao.get(id);
    }
    
    public void save(Material material){
        materialJpaDao.save(material);
    }
    
    public void delete(Long id){
        materialJpaDao.delete(id);
    }
    
}
