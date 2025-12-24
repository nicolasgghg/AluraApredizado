import { Component, input } from '@angular/core';
import { ILivro } from '../../Interfaces/livro';
import { NgClass } from "../../../../node_modules/@angular/common/types/_common_module-chunk";

@Component({
  selector: 'app-livro',
  imports: [NgClass],
  templateUrl: './livro.html',
  styleUrl: './livro.css',
})

export class Livro {

  livro = input.required<ILivro>();

  alternarFavorito() {
    this.livro().favorito = !this.livro().favorito;
  }



}