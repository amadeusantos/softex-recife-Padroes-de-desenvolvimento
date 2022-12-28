package ex006;

import ex006.compomentes.TextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.insertLine(10, "lorem22");
        editor.insertLine(0, "lovjkbjkkkb");
        editor.insertLine(10, "lorffffkmgçfkçdpçdçgfogfk");
        editor.insertLine(10, "lorem22fggfpgikfopg");
        editor.saveFile();
    }
}