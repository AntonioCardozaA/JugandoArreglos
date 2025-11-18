pipeline{
  agent any
  tools{
    maven 'maven_devops'
  }
  triggers{
    githubPush()
  }
  enviroment{
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
        sh 'mvn -f $POM -B'
      }
    }
    stage('Prueba'){
      steps{
        sh 'mvn -f $POM test'
      }
      post{
        always{
          junit 'jugandoArreglos/tarjet/surefire-reports/*.xml'
        }
      }
    }
    stage ('Empaquetado'){
      steps{
        sh 'mvn -f $POM package'
        archiveArtefacts artifacts: 'jugandoArreglos/tarjet/*.jar', fingerprint:true
      }
    }
  }
}
