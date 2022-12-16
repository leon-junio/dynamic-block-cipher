
# Random Block Cipher Java

Block encryption algorithm developed in java with dynamic block cipher system, random passwords and large file encryption. Based on the AES system of random ciphers and block scrambling.


# Usage/Examples

```java
import cifrador.BlockCipher;

public static void main(String[] args){
    // Send you password on constructor
    BlockCipher block = new BlockCipher("password");
    // Pass text to function called crypt to
    // get encrypted text
    String text = block.crypt("Hello world!");
    // Encrypted text after crypt function
    System.out.println(text);  
    // Pass encrypted text to function called decrypt
    // to get decrypted text
    text = block.decrypt(text);
    // original text after decrypt
    System.out.println(text);  
}
```


## Authors

- [@Leon Junio Martins Ferreira](https://www.github.com/leon-junio)

