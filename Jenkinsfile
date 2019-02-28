pipeline {
	agent any 
	
	stages{
		stage('Compile stage') {
			steps {
				withMaven(maven: 'maven_3_6_0') {
					sh 'mvn package'
				}
			}
		}
		
		stage('Test stage') {
			steps {
				echo "Running test scripts"
			}
		}
		
		stage('Deploy stage') {
			steps {
				echo "Deploying..."
			}
		}
	}
}
