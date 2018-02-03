package javap

import java.io.File

import jvmclass.JVMClassFileReader
import jvmclass.internal.JVMClassFileReader.ReadParams

object JOakAnalyser {
    def main(args: Array[String]): Unit = {
      if (args.length != 1) {
        println("usage: program <.class file>")
      }
      else {
        val filename = args(0)
        val (clsName: String, packageName: Option[String]) = jvmclass.ClassNameHandler.split(filename)
        val file = new File(args(0))
        JVMClassFileReader.read(packageName, clsName, file, ReadParams(verbose = true))
      }
    }

}
