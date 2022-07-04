import com.azure.storage.blob.BlobServiceClientBuilder
import com.typesafe.scalalogging.LazyLogging

object Main extends LazyLogging {
  def main(args: Array[String]): Unit = {
    logger.info("Hello Azure Storage")
    val connectStr = System.getenv("AZURE_STORAGE_CONNECTION_STRING")
    // Create a BlobServiceClient object (using BlobServiceClientBuilder) which will be used to create a container client
    val blobServiceClient = new BlobServiceClientBuilder().connectionString(connectStr).buildClient
    //*** Create a unique name (String) for the container
    /*
    * YOUR CODE HERE
    */
    //*** Create the container (using blobServiceClient) and return a container client object
    /*
    * YOUR CODE HERE
    */

    //*** Create a local file in the ./data/ directory for uploading and downloading
    /*
    * YOUR CODE HERE
    */

    //*** Write text to the file
    /*
    * YOUR CODE HERE
    */

    //*** Get a reference to a blob (using containerClient)
    /*
    * YOUR CODE HERE
    */

    logger.info("Uploading to Blob storage as blob...")

    //*** Upload the blob (using blobClient)
    /*
    * YOUR CODE HERE
    */

    logger.info("Listing blobs...")

    //*** List the blob(s) in the container (using containerClient).
    /*
    * YOUR CODE HERE
    */

    //*** Download the blob to a local file (using blobClient)
    //*** Append the string "DOWNLOAD" before the .txt extension so that you can see both files.
    /*
    * YOUR CODE HERE
    */

    //*** Clean up (optional)
    logger.info("Deleting blob container...")
    /*
    * YOUR CODE HERE
    */
    logger.info("Deleting the local source and downloaded files...")
    /*
    * YOUR CODE HERE
    */

    println("Done")
  }
}