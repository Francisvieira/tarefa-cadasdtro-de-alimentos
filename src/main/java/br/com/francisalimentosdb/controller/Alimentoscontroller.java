package br.com.francisalimentosdb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.francisalimentosdb.repository.AlimentosRepository;List;

@RestController
@RequestMapping ("/matinais")
public class Alimentoscontroller<Matinais> {
	 @Autowired
	 @RequestMapping ("/listar")
	 public List<Matinais>listar(){
		 return al.findAll();
		 
		 
	 }
	 @Autowired
	 private AlimentosRepository al;
	 @PostMapping("/cadastrar");
	 public String cadastro (@RequestBody Matinais matinais) {
		 al.save(matinais);
		 return "Alimento Cadastrado";
	 }
	 
	 
	 @PutMapping("/atualizar/{id}")
		public String atualizar(@PathVariable Long id,@RequestBody Matinais matinais) {
			Optional<Matinais> al =al.findById(id);
			if(!al.isPresent()) {
				return "Alimento atualizado com sucesso";
			}
			matinais.setIdmatinais(id);
			al.save(matinais);
			return "alimento matinal cadastrado com sucesso";
	 }
			@DeleteMapping("/apagar/{id}")
			public String apagar(@PathVariable Long id) {	
				al.deleteById(id);
				return "Alimento Removido ou não perecível ";
			}
}
