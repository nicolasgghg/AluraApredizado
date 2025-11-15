package med.voll.api.domain.consulta.validacoes.cancelamento;

import med.voll.api.domain.consulta.DadosCancelamentoConsulta;
import org.springframework.stereotype.Component;

@Component("ValidadorHorarioAntecedenciaCancelamento")
public interface ValidadorCancelamentoDeConsulta {
    void validar(DadosCancelamentoConsulta dados);

}
