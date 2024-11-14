pipeline {
    agent any

    environment {
        GOOGLE_APPLICATION_CREDENTIALS = '/path/to/your/service-account-key.json'  // Set the path to your GCP service account key
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/shaiksaleemafroz/joke-generator-app.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Build the project using Maven
                    sh 'mvn clean install'
                }
            }
        }

        stage('Deploy to App Engine') {
            steps {
                script {
                    // Deploy to Google App Engine using the Google Cloud SDK
                    sh 'gcloud app deploy --quiet'
                }
            }
        }
    }
}
