
package br.com.emprestimodb.dao;

import br.com.emprestimodb.entity.Material;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MaterialJpaDao {
 
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<Material> list(){
        return entityManager.createQuery("select m from Material m").getResultList();
    }
    
    public Optional<Material> get(Long id){
        Material material = entityManager.find(Material.class, id);
        return material == null ? Optional.empty() : Optional.of(material);
    }
    
    @Transactional
    public void save(Material material){
        entityManager.persist(material);        
    }
    
    @Transactional
    public void delete(Long id){
        Optional optionalMaterial = get(id);
        if(optionalMaterial.isPresent()) entityManager.remove(optionalMaterial.get());
        
    }
    
}
