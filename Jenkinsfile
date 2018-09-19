pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
				cd server
				gradle clean build
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
