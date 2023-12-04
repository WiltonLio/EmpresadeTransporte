
import java.util.ArrayList;
import java.util.List;

class Veiculo {
    private String numeroChassi;
    private String modelo;
    private int capacidade;

    public Veiculo(String numeroChassi, String modelo, int capacidade) {
        this.numeroChassi = numeroChassi;
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

}

class Motorista {
    private int id;
    private String nome;
    private String numeroCNH;

    public Motorista(int id, String nome, String numeroCNH) {
        this.id = id;
        this.nome = nome;
        this.numeroCNH = numeroCNH;
    }

}

class Cobrador {
    private int id;
    private String nome;
    private String numeroCNH;

    public Cobrador(int id, String nome, String numeroCNH) {
        this.id = id;
        this.nome = nome;
        this.numeroCNH = numeroCNH;
    }

}

class Passageiro {
    private int id;
    private String nome;
    private String tipoCartao;

    public Passageiro(int id, String nome, String tipoCartao) {
        this.id = id;
        this.nome = nome;
        this.tipoCartao = tipoCartao;
    }

}

class PontoParada {
    private int id;
    private String nome;

    public PontoParada(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

}

class RegistrodeEmbarque {
    private int id;
    private PontoParada pontoParada;
    private String cartao;
}

class Trecho {
    private PontoParada origem;
    private PontoParada destino;
    private int intervaloEstimado;
    private RegistrodeEmbarque registrodeEmbarque;

    public Trecho(PontoParada origem, PontoParada destino, int intervaloEstimado, RegistrodeEmbarque registrodeEmbarque) {
        this.origem = origem;
        this.destino = destino;
        this.intervaloEstimado = intervaloEstimado;
        this.registrodeEmbarque = registrodeEmbarque;
    }

}

class Trajeto {
    private int id;
    private String descricao;
    private List<Trecho> trechos;

    public Trajeto(int id, String descricao, List<Trecho> trechos) {
        this.id = id;
        this.descricao = descricao;
        this.trechos = trechos;
    }

}

class Jornada {
    private int id;
    private String dataInicio;
    private String dataTermino;
    private Motorista motorista;
    private Veiculo veiculo;

    public Jornada(int id, String dataInicio, String dataTermino, Motorista motorista, Veiculo veiculo) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.motorista = motorista;
        this.veiculo = veiculo;
    }

    public String getId() {
        return null;
    }

}

class Embarque {
    private int id;
    private Passageiro passageiro;
    private PontoParada pontoEmbarque;
    private String cartao;
    private String dataHora;

    public Embarque(int id, Passageiro passageiro, PontoParada pontoEmbarque, String cartao, String dataHora) {
        this.id = id;
        this.passageiro = passageiro;
        this.pontoEmbarque = pontoEmbarque;
        this.cartao = cartao;
        this.dataHora = dataHora;
    }

    public String getId() {
        return null;
    }

}

class Checkpoint {
    private int id;
    private String dataHora;
    private Trajeto trajeto;

    
    public Checkpoint(int id, String dataHora, Trajeto trajeto) {
        this.id = id;
        this.dataHora = dataHora;
        this.trajeto = trajeto;
    }


    public String getId() {
        return null;
    }

}

class Sistema {
    public static void manterCadastro(Object entidade) {
        
        System.out.println("Cadastro mantido para: " + entidade.toString());
    }

    public static void registrarJornada(Jornada jornada) {
        
        System.out.println("Jornada registrada: " + jornada.getId());
    }

    public static void registrarEmbarque(Embarque embarque) {
        
        System.out.println("Embarque registrado: " + embarque.getId());
    }

    public static void registrarCheckpoint(Checkpoint checkpoint) {
        
        System.out.println("Checkpoint registrado: " + checkpoint.getId());
    }
}