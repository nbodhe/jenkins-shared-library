def call() {
    pipeline{
        agent any
        stages{
            stage('Checkout'){
                steps{
                    bat 'echo "checkout"'
                }
            }
            stage('Build'){
                steps{
                    bat 'echo "Build"'
                }
            }
        }
    }
  }
