pipeline {
    agent any
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

              stage('Push image') {
                       def app = docker.build("6383943367/build1")
                       docker.withRegistry('https://registry.hub.docker.com', '89933921-ac8e-41a0-89be-0e6d70af41bd') {
                       app.push("${env.BUILD_NUMBER}")
                       app.push("latest")
                       }
                          echo "Trying to Push Docker Build to DockerHub"
              }


}
