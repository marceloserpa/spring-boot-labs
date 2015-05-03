
package br.com.lendingofmaterials.contract;

import java.sql.Date;
import lombok.Data;

public @Data class MaterialContract {    
    
    private Long id;    
    private String nome;    
    private Integer estoque;    
    private Date dataCompra;            
    
}