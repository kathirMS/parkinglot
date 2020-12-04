pipeline {
    agent {slave2}
    stages {
        stage('test'){
          steps{
              sh 'pwd'
              sh 'ls'
          }
        }
        stage('Maven Build') {
            steps {
                sh 'mvn install'
            }
        }
        stage('Docker build'){
          steps{
               sh 'docker build -t kathir:22 .'
          }

        }
        stage('Docker Run'){
           steps{
               sh 'sudo systemctl restart docker'
               sh 'docker run -d -p 8081:7000 kathir:22'
           }

        }

    }
}