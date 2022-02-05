
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
    
    stage ('test') {
      steps {
        sh 'mvn test'
      }
    }
    
    stage ('Build') {
      steps {
        sh 'mvn site'
      }
    }
  }
