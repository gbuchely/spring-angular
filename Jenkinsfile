pipeline {
    agent any
    tools {nodejs "node"}

    stages {
        stage('Build FrontEnd') {
            steps {
                echo 'Building..'
				dir('client') {
                    sh 'npm install'
                    rm -rf 'dist'
                    sh 'npm run ng build'
                }				
            }
        }
        stage('Build BackEnd') {
            steps {
                echo 'Building..'
				dir('server') {
                    sh './gradlew clean build -x test'
                    cp -r '../client/dist/client/* build/resources/main/static/'
                }				
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
