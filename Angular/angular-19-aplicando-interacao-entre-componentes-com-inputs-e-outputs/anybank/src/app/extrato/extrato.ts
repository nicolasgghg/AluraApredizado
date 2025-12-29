import { Component, input } from '@angular/core';
import { Transacao as ITrasacao } from '../modelos/transacao';
import { Transacao } from "./transacao/transacao";


@Component({
  selector: 'app-extrato',
  imports: [Transacao],
  templateUrl: './extrato.html',
  styleUrl: './extrato.css',
})
export class Extrato {

  transacoes = input.required<ITrasacao[]>();
}
