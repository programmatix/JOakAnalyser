# JOak Analyser
Analyses JVM .class files.  Especially useful for developers creating their own .class files.

If you want to work with .class files programmatically, check out [JOakClassFiles](https://github.com/progammatix/JOakClassFiles).  This project is essentially a thin executable wrapper around that.

## But... javap?
javap is a great Java command-line tool for analysing JVM .class files.  This is an alternative version/clone of it.

99% of the time you should just use javap - it has more features, is an offical Java tool, and is generally better.

This tool does have its uses though.  Specifically, when you're dealing with .class files that are broken, it gives much better output.  javap will simply tell you the file is invalid, but JOak Analyser will output every line it could successfully read up until the point of failure, and also try to provide some diagnostics on what's wrong.  This is much more useful for pinpointing the failure.

## Usage
It's recommended to use the [JOakUmbrella](https://github.com/progammatix/JOakUmrella) project, which includes this project and any dependencies.

* Clone [JOakUmbrella](https://github.com/progammatix/JOakUmrella) into <some_dir>
* ```cd <some_dir>```
* ```git submodule update --init --recursive``` to grab all required dependencies.
* ```sbt assembly``` to produce a fat JAR with all dependencies.
* ```java -jar target/scala-2.12/JOakAnalyser-assembly-0.1-SNAPSHOT.jar target/scala-2.12/classes/javap/JOakAnalyser.class``` to run JOakAnalyser on its own .class file.



