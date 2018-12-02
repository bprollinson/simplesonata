full:
	make clean
	make program
program:
	find src/main -name "*.java" > ./sources.txt
	javac -Xlint:unchecked @sources.txt
	rm sources.txt
clean:
	find . -name "*.class" -exec rm {} \;
	find . -name "*.java~" -exec rm {} \;
