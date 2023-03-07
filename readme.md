# **Hexagonal**

## **APPLICATION**

Core da aplicacao regra de negocio, todo o código que nao deve ter acesso ao mundo externo, livre frameworks ficando totalmente isolado

Dentro da APPLICATION, criamos a pasta core e outra chama ports

Na pasta
core
domain - classes de dominio
usecase - ficam os casos de uso

	ports - Nada mais é do que interface (contendo as entradas e as saidas)
		in - Ele vai ter todas as portas de entrada para acessar o core da aplicacao
		out -  Vai a porta de saida para saida de dados do core


## **ADAPTERS**

Nada mais é do que as implementacoes da portas de entreda e saida

Dentro da ADAPTERS, criamos a pasta core e outra chama ports

Na pasta

	ports - Nada mais é do que interface (contendo as entradas e as saidas com as implementacoes)	
			in - consumer - topico, fila, grpc,controller - api, grapql
			out - client - api, grpc, rpc, repository - base de dados	

CONFIG

Nada mais e do que todas as configuracoes do projeto

Rodando WIREMOCK
cd /mock
java -jar wiremock-jre8-standalone-2.35.0.jar --port 8082

**Rodando curl teste**
curl http://localhost:8082/addresses/02442090
curl http://localhost:8082/addresses/08502000

****Plugin para Kafka -****
Kafkalytic
no host: localhost:9092
cluster: kafka-cluster-hexagonal

**Ver mensagen do kafka**
docker exec -it kafka-cluster-hexagonal_kafka_1 kafka-console-consumer --bootstrap-server localhost:9092 --topic cep --from-beginning
Abra o offsetExplorer e verifique a mensagem



	
