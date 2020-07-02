pipeline{
    agent any
    stages{
        stage('Construção da calculadora'){
            steps{
                sh 'mvn -DskipTests=true package'
            }
        }
        stage('Testes unitarios'){
            steps{
                sh 'mvn -Dtest=CalculadoraTest test'
            }
        }
        stage('Deploy da calculadora'){
            steps{
                sh 'docker-compose build'
                sh 'docker-compose down'
                sh 'docker-compose up -d'
                sh 'sleep 500'
            }
        }
        stage('teste'){
            steps{
                sh 'curl http://177.105.35.42:8000'
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
            junit allowEmptyResults: true, testResults: 'app/target/surefire-reports/*.xml'
        }
        unsuccessful{
            emailext attachLog: true, body: 'olha o log do projeto', subject: 'falhou a construção ', to: 'jpbp@estudante.ufla.br'
        }
        fixed{
            emailext attachLog: true, body: 'olha o log do projeto', subject: 'construção voltou ao normal ', to: 'jpbp@estudante.ufla.br'
        }
    }
}
