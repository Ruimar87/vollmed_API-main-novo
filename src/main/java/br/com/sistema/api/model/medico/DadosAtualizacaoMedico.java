package br.com.sistema.api.model.medico;

import br.com.sistema.api.model.endereco.DadosCadastroEndereco;

public record DadosAtualizacaoMedico(
    Integer id,
    String nome,
    String email,
    DadosCadastroEndereco endereco
) {

    public Object telefone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'telefone'");
    }
}
