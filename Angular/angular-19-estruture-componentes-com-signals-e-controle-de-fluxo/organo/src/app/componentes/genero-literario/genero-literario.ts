import { Component, input } from '@angular/core';
import { Livro } from "../livro/livro";
import { livros } from '../../mock-livros';
import { IGeneroLiterario } from '../../Interfaces/generoLiterario';
import { NgClass } from '@angular/common';

@Component({
  selector: 'app-genero-literario',
  imports: [Livro, NgClass],
  templateUrl: './genero-literario.html',
  styleUrl: './genero-literario.css',
})
export class GeneroLiterario {

  genero = input.required<IGeneroLiterario>()
  livro = livros

}
