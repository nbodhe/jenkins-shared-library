def call() {
    pipeline{
        agent any
        stages{
            stage('Checkout'){
                steps{
                    git 'https://github.com/nbodhe/SampleWebApplication.git'
                }
            }
            stage('Clean'){
                steps{
                    bat 'mvn clean'
                }
            }
            stage('Test'){
                steps{
                    bat 'mvn test'
                }
            }
            stage('Install'){
                steps{
                    bat 'mvn install'
                }
            }
            stage('ListDir'){
                steps{
                    bat 'dir'
                }
            }
        }
    }
  }
