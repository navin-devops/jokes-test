pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from your repository
                git branch: 'main', url: 'https://github.com/navin-devops/jokes-test.git'
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
                // Optional: Add deployment steps if needed
                echo 'Deployment step (if necessary) will go here'
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
