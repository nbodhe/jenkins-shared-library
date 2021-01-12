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
            stage('PrintProperty'){
                steps{
                    
                    script{
                          def props = readProperties  file:'jenkins.properties'
                          def sonar= props['sonar']
                          def nexus= props['nexus']
                          def veracode= props['veracode']
                          def ada= props['ada']
                          echo "sonar=${sonar}"
                          echo "nexus=${nexus}"
                          echo "veracode=${veracode}"
                          echo "ada=${ada}"
                    }
                }
            }
        }
    }
  }
