import { Component, signal } from '@angular/core';
import { SaldoComponent } from "./saldo/saldo.component";
import { TransacoesComponent } from "./transacoes/transacoes.component";
import { ContasComponent } from "./contas/contas.component";
import { Conta } from './compartilhados/conta.model';
import { Transacao, TipoTransacao } from './compartilhados/transacao.model';

@Component({
  selector: 'app-area-financeira',
  imports: [SaldoComponent, TransacoesComponent, ContasComponent],
  templateUrl: './area-financeira.component.html',
  styleUrl: './area-financeira.component.css'
})
export class AreaFinanceiraComponent {
  saldo = 0;

  transacoes = signal<Transacao[]>([]);
  contas = signal<Conta[]>([]);

  processarTransacao(transacao: Transacao){
    this.transacoes.update(transacoes => {
      return [
        transacao,
        ...transacoes
      ]
    })
  }

  processarConta(conta: Conta){
    this.contas.update(contas => {
      return [
        conta,
        ...contas
      ]
    })
  }
}
