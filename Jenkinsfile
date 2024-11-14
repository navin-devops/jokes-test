pipeline {
    agent any

    environment {
        PROJECT_ID = 'your-gcp-project-id'
        GOOGLE_APPLICATION_CREDENTIALS = credentials('gcp-service-account')
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Deploy to App Engine') {
            steps {
                sh "gcloud config set project $PROJECT_ID"
                sh 'gcloud app deploy --quiet'
            }
        }
    }
}
