def call() {
    pipeline{
        agent any
        stages{
            stage('Checkout'){
                steps{
                    git 'https://github.com/nbodhe/SampleWebApplication.git'
                }
            }
            stage('Build'){
                steps{
                    bat 'dir'
                }
            }
        }
    }
  }
