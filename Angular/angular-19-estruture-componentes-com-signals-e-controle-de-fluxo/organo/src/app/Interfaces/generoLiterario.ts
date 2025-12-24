import { ILivro } from "./livro";

export interface IGeneroLiterario {
    id: string;
    value: string;
    livros: ILivro[];
}