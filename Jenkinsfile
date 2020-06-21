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
                deploy adapters: [tomcat8(credentialsId: 'TomcatLogin', path: '', url: 'http://192.168.3.5:8001/')], contextPath: 'index', war: 'target/index.war'   
            }
        }
        stage('Teste Funcional'){
            steps{
                sh 'mvn -Dtest=CalculadoraTestFuncional test'
            }
        }
        stage('deploy de produçaõ'){
            steps{
                sh 'docker-compose build'
                sh 'docker-compose up -d'
            }
        }
    }
    post{
        unsuccessful{
            emailext attachLog: true, body: 'olha o log do projeto', subject: 'falhou a construção ', to: 'jpbp@estudante.ufla.br'
        }
        fixed{
            emailext attachLog: true, body: 'olha o log do projeto', subject: 'construção voltou ao normal ', to: 'jpbp@estudante.ufla.br'
        }
    }
}
