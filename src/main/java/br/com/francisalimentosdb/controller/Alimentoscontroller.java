package br.com.francisalimentosdb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.francisalimentosdb.model.AlimentosModel;
import br.com.francisalimentosdb.repository.AlimentosRepository;

@RestController
@RequestMapping("/matinais")
public class AlimentosController {
	@Autowired
	private AlimentosRepository alr;

	@RequestMapping("/listar")
	public List<AlimentosModel> listar() {
		return alr.findAll();
	}

	@PostMapping("/cadastrar")
	public String cadastro(@RequestBody AlimentosModel alimentos) {
		alr.save(alimentos);
		return "Alimento Cadastrado";
	}

	@PutMapping("/atualizar/{id}")
	public String atualizar(@PathVariable Long id, @RequestBody AlimentosModel alimentos) {
		Optional<AlimentosModel> al = alr.findById(id);
		if (!al.isPresent()) {
			return "Alimento atualizado com sucesso";
		}
		alimentos.setIdalimento(id);
		alr.save(alimentos);
		return "alimento matinal cadastrado com sucesso";
	}

	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		alr.deleteById(id);
		return "Alimento Removido ou não perecível ";
	}
}
