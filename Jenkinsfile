pipeline {
    agent any
    stages{
        stage('Clone Repository') {
            steps{
                git branch: 'main', credentialsId: '8fef7f19-8d45-4b70-a70d-d77625aca804', url: 'https://github.com/caupolicanquerales/pipeline.git'
                echo 'Building..'
            }
        }
        stage('Test') {
            steps{
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps{
                echo 'Deploying..'
            }
        }
    }
}