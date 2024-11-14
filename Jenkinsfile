pipeline {
    agent any

    environment {
        // Set environment variables if needed
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from your repository
                git 'https://github.com/shaiksaleemafroz/cloudruntest.git'
            }
        }

        stage('Build') {
            steps {
                // Run Maven clean package and deploy to App Engine
                sh 'mvn clean package appengine:deploy'
            }
        }

        stage('Deploy') {
            steps {
                // Optional: deploy steps if needed
            }
        }
    }

    post {
        success {
            // Actions to perform after a successful build
            echo 'Build and deployment successful!'
        }
        failure {
            // Actions to perform after a failed build
            echo 'Build or deployment failed.'
        }
    }
}
