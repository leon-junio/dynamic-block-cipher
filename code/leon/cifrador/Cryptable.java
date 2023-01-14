package cifrador;

/**
 * @author Leon Jr Martins Ferreira
 */
public interface Cryptable {

    /**
     * Função para criptografar textos e retornar o mesmo - Function to crypt a text
     * and return it
     * 
     * @param base Texto alvo para ser encriptado - Target text to be encrypted
     * @return Texto criptografado - Crypted text
     */
    public String crypt(String base);

    /**
     * Função para descriptografar textos e retornar o mesmo - Function to decrypt a
     * text
     * and return it
     * 
     * @param base Texto alvo para ser encriptado - Target text to be decrypted
     * @return Texto descriptografado - Decrypted text
     */
    public String decrypt(String base);

}
