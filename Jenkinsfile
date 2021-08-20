pipeline {
    agent any
    environment{
        DOCKERHUB_CREDENTIALS = credentials('caupolicanquerales-dockerhub')
    }
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
        stage('Build docker') {
            steps{
                sh 'docker build -t image_pipeline:latest .'
            }
        }
        stage('Login docker'){
            steps{
                sh 'docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
        }
        stage('Push Docker-hub') {
            steps{
                sh 'docker push image_pipeline:latest'
            }
        }
        
    }
    post{
        always{
            sh 'docker logout'
        }
    }
}