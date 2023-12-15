pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                sh 'echo "Hello World"'
            }
        }
        stage ('compiling') {
            steps {
                sh 'echo "compiling"'
            }
        }
        stage ('packaging')
            steps {
                sh 'echo"packaging"'
                }
        stage ('Running test cases')
            steps {
                sh 'echo "Test case excution is in progress"'
            }
        stage ('Deployment')
            steps {
                sh 'echo "deployment is completed"'
            }
    }
}