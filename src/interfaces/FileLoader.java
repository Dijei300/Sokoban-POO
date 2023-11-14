package interfaces;

import test.SokobanGUI;

import java.io.File;

public interface FileLoader {
    // devolve a extensão de ficheiro associada
    String getExtension();
    // constrói o objeto de jogo com a informação do ficheiro
    SokobanGUI load(File f);
}
