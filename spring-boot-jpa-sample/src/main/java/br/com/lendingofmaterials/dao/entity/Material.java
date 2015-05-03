
package br.com.lendingofmaterials.dao.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
public @Data class Material {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;
    
    private Integer estoque;
    
    @Column(name = "data_compra")
    private Date dataCompra;
              
}
