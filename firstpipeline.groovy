pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                script{
                sh 'echo "Hello World"'
                }
            }
        }
        stage ('compiling') {
            steps {
                script{
                sh 'echo "compiling"'
                }
            }
        }
        stage ('packaging'){
            steps {
                script{
                sh 'echo"packaging"'
                }
            }
        }
        stage ('Running test cases'){
            steps {
                script{
                sh 'echo "Test case excution is in progress"'
                }
            }
        }
        stage ('Deployment'){
            steps {
                script{
                sh 'echo "deployment is completed"'
                }
            }
        }
    }
}