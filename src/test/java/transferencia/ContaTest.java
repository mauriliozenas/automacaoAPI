package transferencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    @Test
    public void realizarTransacao(){
        Cliente origem = new Cliente("Antonio", "123456789","11111111");
        Cliente destino = new Cliente("Maria","987654321","2222222");

        Conta contaOrigem = new Conta("0032","222121",2500.00,origem);
        Conta contaDestino = new Conta("999","666565",3500.00,destino);

        contaOrigem.realizarTransferencia(1000.00, contaDestino);
        assertEquals(1500.00,contaOrigem.getSaldo());
        assertEquals(4500.00,contaDestino.getSaldo());



    }


}