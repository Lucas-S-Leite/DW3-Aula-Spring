package com.fatec.sigvs.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" }) // manipula - lazy loaded properties 
@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String descricao;
	private String categoria;
	private double custo;
	private int qtdeEstoque;
		public Produto(String descricao, String categoria, double custo, int qtdeEstoque) {
		this.descricao = descricao;
		this.categoria = categoria;
		this.custo = custo;
		this.qtdeEstoque = qtdeEstoque;
		
	}
		public Produto() {
			
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			if (descricao == null || descricao.isBlank())
				throw new IllegalArgumentException ("A descrição não pode estar em branco");
			this.descricao = descricao;
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			if (categoria == null || descricao.isBlank())
				throw new IllegalArgumentException ("A categoria não pode estar em branco");
			this.categoria = categoria;
		}
		public double getCusto() {
			return custo;
		}
		public void setCusto(double custo) {
			try {
					if (custo <=0)
				throw new IllegalArgumentException ("O custo deve ser maior que zero");
					else {
					this.custo = custo;
					}
			} catch (Exception e){
				throw new IllegalArgumentException ("O custo deve ser maior que zero");
			}
		}
		public int getQtdeEstoque() {
			return qtdeEstoque;
		}
		public void setQtdeEstoque(int qtdeEstoque) {
			try {
					if (qtdeEstoque <=0)
				throw new IllegalArgumentException ("A quantidade deve ser maior que zero");
					else {
					this.qtdeEstoque = qtdeEstoque;
					}
			}catch (Exception e){
				throw new IllegalArgumentException ("A quantidade deve ser maior que zero");
			}
				
			}
		}

