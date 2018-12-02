SHELL:=/bin/bash

full:
	make clean
	make program
program:
	find src/main -name "*.java" > ./sources.txt
	javac -Xlint:unchecked @sources.txt
	rm sources.txt
test:
	make clean
	find src/test -name "*.java" > ./sources.txt
	javac -cp src/main:src/test:junit-4.12.jar:hamcrest-core-1.3.jar -Xlint:unchecked @sources.txt
	rm sources.txt
	$(eval TEST_PATHS=$(shell bash -c "find src/test/simplesonata/ -name \"*.java\" | sed -e 's/^src\/test\///' -e 's/.java$$//' -e 's/\//./g'"))
	java -cp src/main:src/test:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore ${TEST_PATHS}
	make clean
clean:
	find . -name "*.class" -exec rm {} \;
	find . -name "*.java~" -exec rm {} \;
