### Avaliação individual - Empresa de Transporte

#### Explicação dos principais métodos das classes fornecidas:

>Veiculo(String numeroChassi, String modelo, int capacidade): Este é o construtor da classe Veiculo. Ele cria um novo objeto Veiculo com os parâmetros fornecidos e inicializa os campos numeroChassi, modelo e capacidade.

>Motorista(int id, String nome, String numeroCNH): Este é o construtor da classe Motorista. Ele cria um novo objeto Motorista com os parâmetros fornecidos e inicializa os campos id, nome e numeroCNH.

>Cobrador(int id, String nome, String numeroCNH): Este é o construtor da classe Cobrador. Ele cria um novo objeto Cobrador com os parâmetros fornecidos e inicializa os campos id, nome e numeroCNH.

>Passageiro(int id, String nome, String tipoCartao): Este é o construtor da classe Passageiro. Ele cria um novo objeto Passageiro com os parâmetros fornecidos e inicializa os campos id, nome e tipoCartao.

>PontoParada(int id, String nome): Este é o construtor da classe PontoParada. Ele cria um novo objeto PontoParada com os parâmetros fornecidos e inicializa os campos id e nome.

>Trecho(PontoParada origem, PontoParada destino, int intervaloEstimado, RegistrodeEmbarque registrodeEmbarque): Este é o construtor da classe Trecho. Ele cria um novo objeto Trecho com os parâmetros fornecidos e inicializa os campos origem, destino, intervaloEstimado e registrodeEmbarque.

>Trajeto(int id, String descricao, List<Trecho> trechos): Este é o construtor da classe Trajeto. Ele cria um novo objeto Trajeto com os parâmetros fornecidos e inicializa os campos id, descricao e trechos.

>Jornada(int id, String dataInicio, String dataTermino, Motorista motorista, Veiculo veiculo): Este é o construtor da classe Jornada. Ele cria um novo objeto Jornada com os parâmetros fornecidos e inicializa os campos id, dataInicio, dataTermino, motorista e veiculo.

>Embarque(int id, Passageiro passageiro, PontoParada pontoEmbarque, String cartao, String dataHora): Este é o construtor da classe Embarque. Ele cria um novo objeto Embarque com os parâmetros fornecidos e inicializa os campos id, passageiro, pontoEmbarque, cartao e dataHora.

>Checkpoint(int id, String dataHora, Trajeto trajeto): Este é o construtor da classe Checkpoint. Ele cria um novo objeto Checkpoint com os parâmetros fornecidos e inicializa os campos id, dataHora e trajeto.

>Sistema.manterCadastro(Object entidade): Este é um método estático da classe Sistema. Ele recebe um objeto entidade como parâmetro e imprime uma mensagem informando que o cadastro foi mantido para esse objeto.

>Sistema.registrarJornada(Jornada jornada): Este é um método estático da classe