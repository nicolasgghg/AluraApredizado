import { Component, output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { TipoTransacao, Transacao } from '../modelos/transacao';
import { KeyValuePipe } from '@angular/common';

@Component({
  selector: 'app-form-nova-transacao',
  imports: [FormsModule, KeyValuePipe],
  templateUrl: './form-nova-transacao.html',
  styleUrl: './form-nova-transacao.css',
})
export class FormNovaTransacao {

  valorTrasacao = "";
  tipoTransacao = "";
 
  transacaoCriada = output<Transacao>();

  tipoTransacaoEnum = TipoTransacao;
  
  aoSubmeter() {
    const transacao = new Transacao(
        this.tipoTransacao as TipoTransacao,
        Number(this.valorTrasacao)
    );

    this.transacaoCriada.emit(transacao);
    
    this.tipoTransacao = "";
    this.valorTrasacao = "";  
  }

   

}
