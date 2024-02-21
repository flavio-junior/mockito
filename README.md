# mockito

**O que é o Mockito?**
> **O Mockito é uma biblioteca para ativar a criação de mocks, verificação e Stubbing(Substituição de um trecho de código).**

**Dependências:**
- **Acessar o site e adicionar as dependências.**
- **[mvn repository](https://mvnrepository.com/).**

> **Todas as dependências citadas aqui são compatíveis com o Kotlin** 

**Usando o Mockito para chegar os dados:**
```java
@Test
void testSum() {
    Calculate calculate = mock(Calculate.class);
    calculate.sum(7, 14);
    verify(calculate).sum(7, 14);
}
```

**Referências:**
- [Site](https://site.mockito.org/)
- [Referência principal da documentação](https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html)
