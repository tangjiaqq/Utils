node {
   // Mark the code checkout 'stage'....
   stage 'Checkout'

   // Get some code from a GitHub repository
    git([url: 'https://github.com/tangjiaqq/Utils.git', branch: 'master'])
   stage 'Build'
   sh "gradle clean assembleDebug"
  
}