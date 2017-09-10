# it_test

Example showing how to package integration tests into a native package so that you can share your tests with other people
who don't know Scala or want to install sbt. You can send them the tar file and they can use it like this:
* unzip path/it-test-1.0.zip
* it-test-1.0/bin/it-test -o -s org.bohdi2.itt.SimpleItSpec
