pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
				dir('server') {sh './gradlew clean build'}
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
				dir('server') {sh './gradlew test'}
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
