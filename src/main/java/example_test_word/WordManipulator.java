package example_test_word;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class WordManipulator {
    public static void main(String[] args) {
        try {
            // Mapa com os placeholders e seus valore
            Map<String, String> replacements = new HashMap<>();
            replacements.put("${nome}", "Joao Silva");

            // Carregar o arquivo modelo
            FileInputStream fis = new FileInputStream("modelo.docx");
            XWPFDocument document = new XWPFDocument(fis);

            // Iterar por todos os paragrafos do documento
            for (XWPFParagraph paragraph : document.getParagraphs()) {
                // Iterar por cada run o paragrafo
                for (XWPFRun run : paragraph.getRuns()) {
                    String text = run.getText(0); // Obter o texto do run
                    if (text != null) {
                        // Substituir cada placeholder
                        for (Map.Entry<String, String> entry : replacements.entrySet()) {
                            text = text.replace(entry.getKey(), entry.getValue());
                        }
                        run.setText(text, 0); // Atualizar o texto no run
                    }
                }
            }

            // Salvar o documento modificado
            FileOutputStream fos = new FileOutputStream("resultado.docx");
            document.write(fos);

            // Fechar os recursos
            fos.close();
            fis.close();
            document.close();

            System.out.println("Documento Word gerado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}