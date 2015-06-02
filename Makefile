all: ReadC.jar
ReadC.jar: ReadC.java
	javac ReadC.java
	javac Element.java
	jar cvfe ReadC.jar ReadC *.class

run: ReadC.jar
	java -jar ReadC.jar

clean:
	rm -f *.class
	rm -f ReadC.jar