pipeline{
  agent any
  tools{
    maven 'devops_maven'
  }
  triggers{
    githubPush()
  }
  environment{
    POM="jugandoArreglos/pom.xml"
  }
  stages{
    stage('Descarga'){
      steps{
        git url:'https://github.com/AntonioCardozaA/JugandoArreglos.git',branch:'main'
      }
    }
    stage('Compilacion'){
      steps{
        sh 'mvn -f $POM -B package'
      }
    }
    stage('Prueba'){
      steps{
        sh 'mvn -f $POM test'
      }
      post{
        always{
          junit 'jugandoArreglos/target/surefire-reports/*.xml'
        }
      }
    }
    stage ('Empaquetado'){
      steps{
        archiveArtifacts artifacts: 'jugandoArreglos/tarjet/*.jar', fingerprint:true
      }
    }
  }
}
