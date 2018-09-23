pipeline {
    agent any
    tools {nodejs "node"}
    stages {
        stage('Build FrontEnd') {
            steps {
                echo 'Building..'
				dir('client') {
                    sh 'npm install'
                    sh 'rm -rf dist'
                    sh 'npm run ng build'
                }				
            }
        }
        stage('Build BackEnd') {
            steps {
                echo 'Building..'
				dir('server') {                    
                    sh 'cp -r ../client/dist/client/* ./src/main/resources/static/'
                    sh './gradlew clean build -x test'
                }				
            }
        }
        stage('Docker Build') {
            agent any
            steps {
                sh 'docker build -t gbuchely/spring-angular:latest .'
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
