import { Component, input } from '@angular/core';
import { Transacao as ITrasacao } from '../../modelos/transacao';
import { CurrencyPipe, DatePipe } from '@angular/common';

@Component({
  selector: 'app-transacao',
  imports: [CurrencyPipe, DatePipe],
  templateUrl: './transacao.html',
  styleUrl: './transacao.css',
})
export class Transacao {

  transacao = input.required<ITrasacao>();

}
