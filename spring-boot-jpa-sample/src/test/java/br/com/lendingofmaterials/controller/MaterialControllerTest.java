
package br.com.lendingofmaterials.controller;

import br.com.lendingofmaterials.App;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = App.class)
@ActiveProfiles("test")
@WebAppConfiguration
public class MaterialControllerTest {

    @Autowired private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }   
    
    @Test
    public void addNewMaterialTest() throws Exception{            
       this.mockMvc.perform(post("/materiais/novo").param("nome", "material 1").param("estoque", "5").param("dataCompra", "2013-12-12"))
                .andDo(print())
                .andExpect(status().isOk()); 
    }
    
    @Test
    public void listAllMaterialsTest() throws Exception{                
        this.mockMvc.perform(get("/materiais"))
                .andDo(print())
                .andExpect(status().isOk());
    }
        
}
