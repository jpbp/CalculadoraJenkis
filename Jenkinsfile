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
                deploy adapters: [tomcat8(credentialsId: 'TomcatLogin', path: '', url: 'http://177.105.55.13:8001/')], contextPath: 'index', war: 'target/index.war'   
            }
        }
        stage('Teste Funcional'){
            steps{
                sh 'mvn -Dtest=CalculadoraTestFuncional test'
            }
        }
    }
}