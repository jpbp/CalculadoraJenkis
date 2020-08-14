Feature: SomaTeste

    Scenario: somar dois números e verificar se está certo
         Given Eu abri o site "https://convertcase.net/" 
         When eu digitar "oi eu sou goku" no painel "content"
         And clicar em "UPPER CASE"
         Then "oi eu sou goku" deve ser convertido em "OI EU SOU GOKU"       
