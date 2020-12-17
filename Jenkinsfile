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
               sh 'docker build -t parkinglotproblem:v1.0.1 --build-arg profile="${profile}" .'
          }

        }
        stage('Push the image to ECR'){
           steps{
               sh 'aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 071107458435.dkr.ecr.us-east-1.amazonaws.com'
               sh 'docker tag parkinglotproblem:v1.0.1 071107458435.dkr.ecr.us-east-1.amazonaws.com/parkinglot:latest'
               sh 'docker push 071107458435.dkr.ecr.us-east-1.amazonaws.com/parkinglot:latest'
           }
        }

        stage('GMail'){
           steps{
                emailext body: 'Hai kathir successfully deployed the application', subject: 'From Jenkins', to: 'kathirvelmuthusamy96@gmail.com'
           }

        }


    }

}
