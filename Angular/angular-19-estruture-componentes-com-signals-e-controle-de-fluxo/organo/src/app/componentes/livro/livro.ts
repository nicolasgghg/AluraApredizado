import { Component } from '@angular/core';

@Component({
  selector: 'app-livro',
  imports: [],
  templateUrl: './livro.html',
  styleUrl: './livro.css',
})

export class Livro {

  alternarFavorito() {
    this.livro.favorito = !this.livro.favorito;
  }

  livro = {
    titulo: "Clean Code",
    autor: "Robert Cecil Martin",
    favorito: false,
    imagem: "https://m.media-amazon.com/images/I/71nj3JM-igL._AC_UF1000,1000_QL80_.jpg"
  }


}