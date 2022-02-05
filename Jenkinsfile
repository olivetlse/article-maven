
pipeline {
  agent any
  tools {
    maven 'maven' 
  }
  stages {
    stage ('clean') {
      steps {
        sh 'mvn clean'
      }
    }
  }
  stages {
    stage ('test') {
      steps {
        sh 'mvn test'
      }
    }
  }
  stages {
    stage ('Build') {
      steps {
        sh 'mvn site'
      }
    }
  }
}
