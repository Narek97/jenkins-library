def call(String namespace, String deployment) {
    echo "Deploying to Kubernetes namespace: ${namespace}"
//     sh """
//         kubectl set image deployment/${deployment} app=\${IMAGE_NAME}:\${BUILD_NUMBER} -n ${namespace}
//         kubectl rollout status deployment/${deployment} -n ${namespace}
//     """
}