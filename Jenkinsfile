pipeline {
    agent any

    environment {
        // Define any environment variables if needed
        // For example:
        // MY_ENV_VAR = 'value'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from your repository
                git 'https://github.com/navin-devops/jokes-test.git'
            }
        }

        stage('Build & Deploy') {
            steps {
                // Run Maven clean package and deploy to App Engine
                sh 'mvn clean package appengine:deploy'
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
