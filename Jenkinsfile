pipeline{
    agent any
    stages{
        stage('Construção da calculadora'){
            step{
                sh 'mvn clean -DskipTests=true package'
            }
        }
        stage('Testes unitarios'){
            step{
                sh 'mvn -Dtest=CalculadoraTest test'
            }
        }
        stage('Deploy da calculadora'){
            step{
                deploy adapters: [tomcat8(credentialsId: 'TomcatLogin', path: '', url: 'http://177.105.55.13:8001/')], contextPath: 'index', war: 'target/index.war'   
            }
        }
        stage('Teste Funcional'){
            step{
                sh 'mvn -Dtest=CalculadoraTestFuncional test'
            }
        }
    }
}
