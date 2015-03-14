The App Inventor distribution consists of the following subdirectories, the first seven of which contain source code for sub-projects:
  * aiphoneapp: the application that runs on the mobile device when it is connected to a computer running App Inventor.
  * appengine: the GWT application whose front-end provides the Designer running in the client browser and whose back-end provides supporting server-side functionality, such as storing and retrieving projects and issuing compile requests to the buildserver.
  * blockseditor: the Blocks Editor, which runs through JNLP on the client.
  * blockslib: library code (descended from the MIT Open Blocks library), used by both blockseditor and buildserver.
  * buildserver: an http server/servlet that takes a source zip file as input and produces an apk and/or error messages
  * common: constants and utility classes used by other sub-projects.
  * components: code supporting App Inventor components, including annotations, implementations, and scripts for extracting component information needed by other sub-projects.


The remaining two subdirectories contain static files:
  * docs: user-level documentation, such as tutorials.
  * lib: external libraries, such as junit, used by the various sub-projects.