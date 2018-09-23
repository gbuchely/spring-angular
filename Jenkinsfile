pipeline {
    agent any
    tools {nodejs "node"}
    def app
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
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Build image') {
            steps {
                /* This builds the actual image; synonymous to
                * docker build on the command line */
                app = docker.build("getintodevops/hellonode")
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
