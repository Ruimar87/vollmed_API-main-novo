package br.com.sistema.api.model.medico;

import br.com.sistema.api.model.endereco.DadosCadastroEndereco;

//DTO do cadastro das informações do médico
public record DadosCadastroMedico(
    String nome,
    String email,
    String telefone,
    String crm,
    Especialidade especialidade,
    DadosCadastroEndereco endereco
) {
    
}
