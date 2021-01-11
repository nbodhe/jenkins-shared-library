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
                stpes{
                    bat 'echo "Build"'
                }
            }
        }
    }
  }
