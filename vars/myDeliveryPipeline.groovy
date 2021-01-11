def call() {
    
    def props = readProperties  file:'/var/lib/jenkins/jobs/abc/test.properties'
    def Var1= props['Monday']
    def Var2= props['Tuesday']
    echo "Var1=${Var1}"
    echo "Var2=${Var2}"
    
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
