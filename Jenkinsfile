pipeline{
    agent any
    stages{
        stage('Construção da calculadora'){
            step{
                sh 'mvn clean -DskipTests=true package'
            }
        }
    }
}
