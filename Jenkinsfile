pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
				dir('client') {sh 'npm install'}				
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
