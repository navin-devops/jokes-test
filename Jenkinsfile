pipeline {
    agent any

    environment {
        PROJECT_ID = 'gleaming-lead-438006-g4'
        GOOGLE_APPLICATION_CREDENTIALS = credentials('gcp-service-account')
    }

    stages {
        stage('Build') {
            steps {
                // Build the project using Maven
                sh 'mvn clean package'  // or './mvnw clean package' if using Maven Wrapper
            }
        }

        stage('Deploy to App Engine') {
            steps {
                // Set Google Cloud project
                sh "gcloud config set project $PROJECT_ID"
                // Deploy to App Engine
                sh 'gcloud app deploy --quiet'
            }
        }
    }
}
