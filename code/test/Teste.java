package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import cifrador.BlockCipher;

public class Teste {
    public static void main(String[] args) {
        try {
            long inic = 0, fim = 0;
            ArrayList<String> keys = new ArrayList<>(
                    Arrays.asList("gambound123", "leos123dino*", "vascodama*.9", "jantars12444", "testedesenha",
                            "password", "ratonildo", "gibaodamata", "123das3333", "cruzeirocabuloso"));
            BufferedReader buff = new BufferedReader(
                    new FileReader(new File("test\\alvo.txt")));
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(new File("test\\resp.txt")));
            BlockCipher cipher = new BlockCipher(keys.get(0));
            String line = "";
            int i = 0;
            inic = System.currentTimeMillis();
            while ((line = buff.readLine()) != null) {
                writer.append(cipher.crypt(line.replace("\n", "")) + "\n");
                i++;
                if (i == keys.size())
                    i = 0;
                cipher.setKey(keys.get(i));
            }
            fim = System.currentTimeMillis();
            System.out.println(fim - inic + " ms para criptografar");
            writer.close();
            buff.close();
            i = 0;
            cipher.setKey(keys.get(0));
            buff = new BufferedReader(
                    new FileReader(new File("test\\resp.txt")));
            writer = new BufferedWriter(
                    new FileWriter(new File("test\\decrypt.txt")));
            line = "";
            inic = System.currentTimeMillis();
            while ((line = buff.readLine()) != null) {
                writer.append(cipher.decrypt(line.replace("\n", "")) + "\n");
                i++;
                if (i == keys.size())
                    i = 0;
                cipher.setKey(keys.get(i));
            }
            fim = System.currentTimeMillis();
            System.out.println(fim - inic + " ms para descriptografar");
            writer.close();
            buff.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}