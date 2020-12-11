pipeline {
    agent {label 'slave2'}
    stages {

        stage('Maven Build') {
            steps {
                sh 'mvn install'
            }
        }
        stage('Docker build'){
          steps{
               sh 'docker build -t kathir:22 --build-arg profile="${profile}" .'
          }

        }
        stage('Docker Run'){
           steps{
               sh 'sudo systemctl restart docker'
               sh 'docker run -d -p 8081:"${continer_port}" kathir:22'
           }
        }
        stage('GMail'){
           steps{
                emailext body: 'Hai kathir successfully deployed the application', subject: 'From Jenkins', to: 'kathirvelmuthusamy96@gmail.com'
           }

        }

    }
}
