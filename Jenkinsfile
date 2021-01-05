pipeline {
    agent {label 'slave1'}
    stages {

        stage('Maven Build') {
            steps {
                sh 'mvn install'
            }
        }
        stage('Test') {
            steps {
                 sh 'mvn test'push
            }
            post {
                 always {
                        junit '**/target/surefire-reports/TEST-*.xml'
                 }
            }
        }

        stage('Docker build'){
          steps{
               sh 'docker build -t parkinglotproblem:v1.0.1 --build-arg profile="${profile}" .'
          }

        }
        stage('Push the image to ECR'){
           steps{
               sh 'aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws/z8t7h8q9'
               sh 'docker tag parkinglotproblem:v1.0.1 public.ecr.aws/z8t7h8q9/parkinlotpublicrepo:latest'
               sh 'docker push public.ecr.aws/z8t7h8q9/parkinlotpublicrepo:latest'
           }
        }

        stage('Sent Success Massage To GMail '){
           steps{
                emailext body: 'Hai kathir successfully deployed the application', subject: 'From Jenkins', to: 'kathirvelmuthusamy96@gmail.com'
           }

        }


    }

}
