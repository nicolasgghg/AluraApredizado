import { Component, input } from '@angular/core';
import { ContaComponent } from "./conta/conta.component";
import { Conta } from '../compartilhados/conta.model';
import { CardComponent } from "../compartilhados/card/card.component";
import { BotaoAdicionarTransacaoComponent } from "../transacoes/botao-adicionar-transacao/botao-adicionar-transacao.component";
import { BotaoComponent } from "../../compartilhados/botao/botao.component";

@Component({
  selector: 'app-contas',
  imports: [ContaComponent, CardComponent, BotaoComponent],
  templateUrl: './contas.component.html',
  styleUrl: './contas.component.css'
})
export class ContasComponent {
  contas = input.required<Conta[]>();
}
