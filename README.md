# Open-Closed Principle (OCP)

### Projeto refatorado de https://github.com/emerson-prof-carvalho/solid-ocp-violation.

#### Solução
- Foi criada a interface `Shape`, que define os métodos `calculateArea` e `format`.
- Cada forma geométrica (como `Rectangle`, `Circle`, `Triangle` etc) implementa essa interface e define sua própria lógica para calcular a área e armazenar a formatação da operação.
- O método `calculateArea` da classe `AreaCalculator` agora opera sobre a interface `Shape`, permitindo a adicição de novas formas geométricas sem modificar a lógica existente.
