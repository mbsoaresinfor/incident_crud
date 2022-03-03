# incident_crud
Projeto CRUD que gerencia incidentes genericos

Necessário Java 8

Compilação por maven: mvn clean install

Aplicação está rodando na porta 9090 (http://localhost:9090/swagger-ui.html)

Executar o arquivo br.com.mbs.Main para iniciar a aplicação.

Também é possível por meio do Dockerfile  (liberar porta 9090)

Dados sendo salvos em memória (H2)

Estruturado em 3 camadas: controller -> service -> repository

O acesso a api é por autenticação básica:

usuario: admin

senha: admin 

