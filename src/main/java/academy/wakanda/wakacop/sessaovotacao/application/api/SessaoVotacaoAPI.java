package academy.wakanda.wakacop.sessaovotacao.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/sessao")
public interface SessaoVotacaoAPI {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/abertura")
    SessaoAberturaResponse abreSessao(@RequestBody SessaoAberturaRequest sessaoAberturaRequest);

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/{idSessao}/voto")
    VotoResponse recebeVoto(@PathVariable UUID idSessao, @RequestBody VotoRequest novoVoto);
}
