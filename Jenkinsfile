 node {
      stage('Build') {
          checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'Baek-seung-beom', url: 'https://github.com/jinhee-han/employ24.git']]])
      }
      stage('Test') {
          //
      }
      stage('Deploy') {
          //
      }
  }