Feature: SomaTeste

    Scenario: somar dois números e verificar se está certo
         Given Eu abri o site "http://localhost:8002/index" 
         When eu clico em "cinco"
         When eu clico em "soma"
         When eu clico em "cinco"
         And eu clico em "igual"
         Then "10" deve ser igual a "10"       
