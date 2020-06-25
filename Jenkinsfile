pipeline{
    agent any
    stages{
        stage('Construção da calculadora'){
            steps{
                sh 'mvn clean -DskipTests=true package'
            }
        }
        stage('Testes unitarios'){
            steps{
                sh 'mvn -Dtest=CalculadoraTest test'
            }
        }
        stage('Deploy da calculadora'){
            steps{
                sh 'ls'
                sh 'docker-compose up -d'  
            }
        }
        stage('Teste Funcional'){
            steps{
                sh 'mvn -Dtest=CalculadoraTestFuncional test'
            }
        }
    }
    post{
        always{
            junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
        }
        unsuccessful{
            emailext attachLog: true, body: 'olha o log do projeto', subject: 'falhou a construção ', to: 'jpbp@estudante.ufla.br'
        }
        fixed{
            emailext attachLog: true, body: 'olha o log do projeto', subject: 'construção voltou ao normal ', to: 'jpbp@estudante.ufla.br'
        }
    }
}
