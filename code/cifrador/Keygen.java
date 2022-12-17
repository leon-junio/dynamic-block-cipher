package cifrador;

/**
 * @author Leon Jr Martins Ferreira
 */
public class Keygen {

    /**
     * Function to return a bitstream using seed or block as key
     * Função para gerar bitstream de dados a partir de uma seed
     * 
     * @param size tamanho do bloco alocado no momento - size of block
     * @param seed String alvo para virar um bitstream - String of text or block
     * @param pass Uma senha para ajudar na formação aleatoria do bitStream - The password to encrypt seed
     * @return uma chave em formato de byte - return a key for use in blockCipher methods
     */
    protected static char[] generateKey(int size, String seed, String pass) throws Exception {
        char[] key = new char[size];
        if (seed.length() < size) {
            int alvo = size - seed.length();
            seed += String.valueOf(seed).repeat(alvo);
        } else if (seed.length() > size) {
            seed = seed.substring(0, size);
        }
        key = seed.toCharArray();
        pass = pass.repeat(size);
        int[] stream = pass.chars().map(t -> t = t + size + 7).toArray();
        for (int i = 0; i < size; i++) {
            key[i] = ((char) (key[i] ^ stream[i]));
        }
        return key;
    }

}
