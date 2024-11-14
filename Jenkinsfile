pipeline {
    agent any

    environment {
        GOOGLE_CREDENTIALS = credentials('gcp-service-account') // Reference the ID of your credential
    }

    stages {
        stage('Clone Repository') {
            steps {
                // Example step to clone your repository
                git 'https://github.com/navin-devops/jokes-test.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Build the project using Maven
                    sh 'mvn clean package'
                }
            }
        }

        stage('Deploy to App Engine') {
            steps {
                script {
                    // Authenticate with Google Cloud
                    withCredentials([file(credentialsId: 'gcp-service-account', variable: 'GOOGLE_APPLICATION_CREDENTIALS')]) {
                        // Use the credentials to authenticate and deploy to Google App Engine
                        sh '''
                            gcloud auth activate-service-account --key-file=$GOOGLE_APPLICATION_CREDENTIALS
                            gcloud app deploy --quiet
                        '''
                    }
                }
            }
        }
    }
}
