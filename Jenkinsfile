pipeline {
    agent any

    environment {
        PROJECT_ID = 'gleaming-lead-438006-g4'
        GOOGLE_APPLICATION_CREDENTIALS = credentials('gcp-service-account')  // Ensure the correct secret is being used
    }

    stages {
        stage('Authenticate with Google Cloud') {
            steps {
                sh 'gcloud auth activate-service-account --key-file=${GOOGLE_APPLICATION_CREDENTIALS}'
                sh 'gcloud auth list'  // Verify the active account
            }
        }

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
