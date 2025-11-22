package med.voll.api.domain.consulta.validacoes.agendamento;

import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

@Component
public interface ValidadorAgendamentoDeConsultas {

    void validar(DadosAgendamentoConsulta dados);

}
