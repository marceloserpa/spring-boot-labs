
package br.com.lendingofmaterials.http.service;

import br.com.lendingofmaterials.contract.MaterialContract;
import br.com.lendingofmaterials.dao.facade.MaterialFacade;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialService {
    
    @Autowired
    private MaterialFacade materialFacade;
    
    public List<MaterialContract> findAll(){
        return materialFacade.findAll();
    }
    
    public Optional<MaterialContract> findById(Long id){
        return materialFacade.findById(id);
    }
    
    public void save(MaterialContract material){          
        materialFacade.save(material);
    }
    
    public void delete(Long id){
        materialFacade.delete(id);
    }
    
}
