### Avaliação individual - Empresa de Transporte

Diagrama

+------------------------+       +------------------------+      +------------------------+
|      Veículo           |1----* |        Motorista       |1----* |       Cobrador         |
+------------------------+       +------------------------+      +------------------------+
| - Número de Chassi     |       | - ID                   |      | - ID                   |
| - Modelo               |       | - Nome                 |      | - Nome                 |
| - Capacidade           |       | - Número de CNH        |      | - Número de CNH        |
| ...                    |       | ...                    |      | ...                    |
+------------------------+       +------------------------+      +------------------------+
        |                               |                             |
        |                               |                             |
        V                               V                             V
+------------------------+       +------------------------+      +------------------------+
|      Passageiro        |       |       PontoParada      |      |        Trajeto         |
+------------------------+       +------------------------+      +------------------------+
| - ID                   |       | - ID                   |      | - ID                   |
| - Nome                 |       | - Nome                 |      | - Descrição            |
| - Tipo de Cartão       |       | - Localização          |      | - Lista de Trechos     |
| ...                    |       | ...                    |      | ...                    |
+------------------------+       +------------------------+      +------------------------+
        |                               |
        |                               |
        V                               V
+------------------------+       +------------------------+      +------------------------+
|        Jornada         |       |        Trecho          |      |        Embarque        |
+------------------------+       +------------------------+      +------------------------+
| - ID                   |       | - ID                   |      | - ID                   |
| - Data de Início       |       | - Origem               |      | - Passageiro           |
| - Data de Término      |       | - Destino              |      | - Ponto de Embarque    |
| - Motorista            |       | - Intervalo Estimado   |      | - Cartão               |
| - Veículo              |       | - ...                  |      | - Data e Hora          |
| ...                    |       +------------------------+      +------------------------+
        |                               |
        |                               |
        V                               V
+------------------------+       +------------------------+
|       Checkpoint       |       |         Sistema        |
+------------------------+       +------------------------+
| - ID                   |       | - ManterCadastro()     |
| - Data e Hora          |       | - RegistrarJornada()   |
| - Trajeto              |       | - RegistrarEmbarque()  |
+------------------------+       | - RegistrarCheckpoint()|
                                 | ...                    |
                                 +------------------------+


Entre Empresa e Veículo: A seta apontando de Empresa para Veículo indica que uma Empresa pode ter muitos Veículos (1,N), mas cada Veículo pertence a uma única Empresa (1).

Entre Veículo e Jornada: A seta apontando de Veículo para Jornada indica que um Veículo pode estar associado a muitas Jornadas (1,N), mas cada Jornada está associada a um único Veículo (1).

Entre Motorista e Jornada: A seta apontando de Motorista para Jornada indica que um Motorista pode realizar muitas Jornadas (1,N), mas cada Jornada é realizada por um único Motorista (1).

Entre Cobrador e Jornada: A seta apontando de Cobrador para Jornada indica que um Cobrador pode realizar muitas Jornadas (1,N), mas cada Jornada é realizada por um único Cobrador (1).

Entre Trajeto e Trecho: A seta apontando de Trajeto para Trecho indica que um Trajeto pode ser composto por muitos Trechos (1,N), mas cada Trecho pertence a um único Trajeto (1).