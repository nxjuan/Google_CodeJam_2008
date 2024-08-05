import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Caminho do arquivo de entrada
        String inputFileName = "C:\\temp\\Code Jam\\2008\\1. qualification round\\1. Saving the Universe\\inputs\\input_2.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            // Ler o número de casos de teste
            int T = Integer.parseInt(reader.readLine().trim());

            for (int t = 1; t <= T; t++) {
                // Ler o número de mecanismos de busca
                int S = Integer.parseInt(reader.readLine().trim());
                
                // Ler os mecanismos de busca e ignorá-los (não são usados diretamente)
                for (int i = 0; i < S; i++) {
                    reader.readLine();
                }

                // Ler o número de consultas
                int Q = Integer.parseInt(reader.readLine().trim());
                
                // Resolver o caso de teste
                Set<String> st = new HashSet<>();
                int count = 0;

                for (int i = 0; i < Q; i++) {
                    String q = reader.readLine().trim();
                    
                    if (!st.contains(q)) {
                        if (st.size() == S - 1) {
                            st.clear();
                            count++;
                        }
                        st.add(q);
                    }
                }

                // Imprimir o resultado no formato correto
                System.out.println("Case #" + t + ": " + count);
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de entrada: " + e.getMessage());
        }
    }
}
