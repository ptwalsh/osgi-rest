# osgi-rest
Example for REST on OSGI using Apache CXF on Apache Karaf. This is simplest example ready to run on Apache Karaf.

# Installation
1. mvn clean install
2. Copy ‘features/target/testcxf.kar’ to deploy directory on Apache Karaf home directory.
3. Type on Karaf console: feature:install testcxf
4. Goto http://localhost:8181/cxf/testservice/rest/sayHello/John