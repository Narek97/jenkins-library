def call(String imageName, String tag = 'latest') {
    echo "Building Docker image: ${imageName}:${tag}"
//     sh """
//         docker build -t ${imageName}:${tag} .
//         docker tag ${imageName}:${tag} ${imageName}:latest
//     """
}

def call(Map config) {
    def imageName = config.imageName
    def tag = config.tag ?: 'latest'
    def dockerfile = config.dockerfile ?: 'Dockerfile'

    echo "Building Docker image: ${imageName}:${tag}"
//     sh """
//         docker build -f ${dockerfile} -t ${imageName}:${tag} .
//         docker push ${imageName}:${tag}
//     """
}