pipeline {
    agent any
    stages{
        stage('Clone Repository') {
            steps{
                git branch: 'main', credentialsId: '8fef7f19-8d45-4b70-a70d-d77625aca804', url: 'https://github.com/caupolicanquerales/pipeline.git'
                echo 'Building..'
            }
        }
        stage('Build') {
            steps{
                sh 'mvn clean install -X'
            }
        }
        stage('Build docker image') {
            steps{
                sh 'docker build -t image_pipeline .'
            }
        }
        stage('Push image to Docker-hub') {
            steps{
                sh 'docker push caupolicanquerales/my-first-repository:image_pipeline'
            }
        }
        stage('Deploy') {
            steps{
                echo 'Deploying..'
            }
        }
    }
}