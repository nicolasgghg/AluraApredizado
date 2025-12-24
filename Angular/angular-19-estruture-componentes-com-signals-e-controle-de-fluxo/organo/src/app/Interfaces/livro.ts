import { IGeneroLiterario } from "./generoLiterario";

export interface ILivro {
    titulo: string;
    autoria: string;
    genero: IGeneroLiterario;
    favorito: boolean;
    imagem: string;
}

