
package br.com.lendingofmaterials.http.controller;

import br.com.lendingofmaterials.contract.MaterialContract;
import br.com.lendingofmaterials.http.service.MaterialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materiais")
public class MaterialController {
    
    @Autowired 
    private MaterialService materialService;
    
    @RequestMapping(method=RequestMethod.GET)
    public List<MaterialContract> getAll(){
        return materialService.findAll();
    }
    
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public MaterialContract getOne(@PathVariable Long id){
        return materialService.findById(id).get();
    } 
    
    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    public void remove(@PathVariable Long id){
        materialService.delete(id);
    }      
    
    @RequestMapping(value = "/novo", method = RequestMethod.POST)
    public void add(MaterialContract material){
        materialService.save(material);
    }
    
}
