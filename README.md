# Maven Release Plugin Test

This project is used for testing the Maven Release Plugin, which provides a streamlined process for creating and releasing versions of your project.

## Prerequisites

- Java Development Kit (JDK) installed
- Apache Maven installed
- Git installed (if using Git as the SCM)

## Getting Started

1. Clone this repository to your local machine:
   git clone https://github.com/saharfk/mave-release-sample.git


2. Navigate to the project directory:
   cd maven-release-plugin-test


3. Test the Maven Release Plugin by executing the following command:
   mvn release:prepare
   This command will guide you through the process of preparing a new release. You will be prompted to specify the new version number and create a Git tag for the release.


4. Once the release preparation is complete, execute the following command to perform the release:
   This command will compile the project, generate the release artifacts, and deploy them to the specified repository.

## Additional Notes

- If you encounter any issues during the release process, you can use the following command to rollback the changes and revert to the previous state: 

mvn release:rollback

- Make sure you have configured the SCM connection settings in the `pom.xml` file before running the release commands. Modify the `<scm>` section in the `pom.xml` file with your SCM connection details.

- For more information on using the Maven Release Plugin, refer to the official documentation: [Maven Release Plugin Documentation](https://maven.apache.org/maven-release/maven-release-plugin/)

## License

This project is licensed under the [MIT License](LICENSE).
