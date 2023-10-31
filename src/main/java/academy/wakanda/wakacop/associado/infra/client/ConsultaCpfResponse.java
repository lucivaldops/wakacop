package academy.wakanda.wakacop.associado.infra.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ConsultaCpfResponse {
    @JsonProperty("ni")
    private String ni;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("situacao")
    private Situacao situacao;
    @JsonProperty("nascimento")
    private String nascimento;

    public boolean isInvalid() {
        return ! isValid();
    }

    public boolean isValid() {
        return this.situacao.getCodigo().equals("0");
    }

    @Getter
    @ToString
    public static class Situacao {
        @JsonProperty("codigo")
        private String codigo;
        @JsonProperty("descricao")
        private String descricao;
    }
}
