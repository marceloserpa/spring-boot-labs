
package br.com.lendingofmaterials.dao.persistence;

import br.com.lendingofmaterials.dao.entity.Material;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MaterialJpaPersistence {
 
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<Material> list(){
        return entityManager.createQuery("select m from Material m").getResultList();
    }
    
    public Optional<Material> findById(Long id){
        Material material = entityManager.find(Material.class, id);
        return material == null ? Optional.empty() : Optional.of(material);
    }
    
    @Transactional
    public void save(Material material){
        entityManager.persist(material);        
    }
    
    @Transactional
    public void delete(Long id){
        Optional optionalMaterial = findById(id);
        if(optionalMaterial.isPresent()) entityManager.remove(optionalMaterial.get());
        
    }
    
}
