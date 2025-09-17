package com.admincompany.utils

class DockerUtils {
    static def buildAndPush(script, imageName, tag, registry) {
        script.sh """
            docker build -t ${registry}/${imageName}:${tag} .
            docker push ${registry}/${imageName}:${tag}
        """
    }

    static def cleanup(script, imageName, tag) {
        script.sh "docker rmi ${imageName}:${tag} || true"
    }
}