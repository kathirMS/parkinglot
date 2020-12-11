pipeline {
    agent {label 'slave2'}
    stages {
        stage('test'){
          steps{
              sh 'pwd'
              sh 'echo "${name}" '
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
        stage('GMail'){
           steps{
                emailext body: 'Hai kathir successfully deployed the application', subject: 'From Jenkins', to: 'kathirvelmuthusamy96@gmail.com'
           }

        }

    }
}
