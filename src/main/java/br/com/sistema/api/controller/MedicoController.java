package br.com.sistema.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.sistema.api.model.medico.DadosCadastroMedico;
import br.com.sistema.api.model.medico.Medico;
import br.com.sistema.api.model.medico.MedicoRepository;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("medico")
public class MedicoController {
    
    @Autowired 
    private MedicoRepository medicoRepository;

    @PostMapping("/cadastro") // Aponta para localhost:8080/medico/cadastro
    @Transactional 
    public void cadastrarMedico(@RequestBody DadosCadastroMedico dados) {
        medicoRepository.save(new Medico(dados));
    }

    // GET Request -> Response -> Ex: Tela home
    @GetMapping("/") // Aponta para localhost:8080/medico
    public List<Medico> listarMedicos() {
        return medicoRepository.findAll();
    }

    // GET/POST Request -> Response -> Ex: Cadastrar Medico. GET Exibe tela de
    // cadastro e o POST é chamado quando o botão enviar é clicado.
    // GET/PUT Request -> Response -> Ex: Alterar telefone. Get exibe a tela de
    // alteração e o PUT é chamado quando o botão alterar é clicado.
    // DELETE

    // CRUD

}
