# Test

O objetivo do teste é disponibilizar uma api rest que consuma e trate o payload de uma api pública.

# Passos

1 - De um fork neste projeto, clone e importe no eclipse

2 - Crie 3 módulos "maven" com os seguintes nomes:

  - test-back-end-api
  - test-back-end-service
  - test-back-end-launcher (módulo executável)

3 - Configure o SpringBootApplication no módulo test-back-end-launcher.

4 - Crie um client no módulo test-back-end-service que consuma a seguinte api:

  - api: https://api.chucknorris.io/jokes/random

Obs: Crie o model para tratar o payload
  
5 - Exponha os dados retornados e documente o endpoint

Obs: Exponha com o formato json