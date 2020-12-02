pipeline {
    agent any
    stages {
        stage('Maven Build') {
            steps {

                  withMaven(maven : 'maven_3.6.3') {
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