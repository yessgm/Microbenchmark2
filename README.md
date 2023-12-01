# Microbenchmark2 Results

```
/Users/yessicagaonamorales/Library/Java/JavaVirtualMachines/openjdk-21.0.1/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=55064:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/yessicagaonamorales/IdeaProjects/Microbenchmark2/target/classes:/Users/yessicagaonamorales/.m2/repository/org/openjdk/jmh/jmh-core/1.32/jmh-core-1.32.jar:/Users/yessicagaonamorales/.m2/repository/net/sf/jopt-simple/jopt-simple/4.6/jopt-simple-4.6.jar:/Users/yessicagaonamorales/.m2/repository/org/apache/commons/commons-math3/3.2/commons-math3-3.2.jar:/Users/yessicagaonamorales/.m2/repository/org/openjdk/jmh/jmh-generator-annprocess/1.32/jmh-generator-annprocess-1.32.jar org.openjdk.jmh.Main org.example.MicrobenchmarkTests.*
# JMH version: 1.32
# VM version: JDK 21.0.1, OpenJDK 64-Bit Server VM, 21.0.1+12-29
# VM invoker: /Users/yessicagaonamorales/Library/Java/JavaVirtualMachines/openjdk-21.0.1/Contents/Home/bin/java
# VM options: -javaagent:/Applications/IntelliJ/Users/yessicagaonamorales/Library/Java/JavaVirtualMachines/openjdk-21.0.1/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=55064:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/yessicagaonamorales/IdeaProjects/Microbenchmark2/target/classes:/Users/yessicagaonamorales/.m2/repository/org/openjdk/jmh/jmh-core/1.32/jmh-core-1.32.jar:/Users/yessicagaonamorales/.m2/repository/net/sf/jopt-simple/jopt-simple/4.6/jopt-simple-4.6.jar:/Users/yessicagaonamorales/.m2/repository/org/apache/commons/commons-math3/3.2/commons-math3-3.2.jar:/Users/yessicagaonamorales/.m2/repository/org/openjdk/jmh/jmh-generator-annprocess/1.32/jmh-generator-annprocess-1.32.jar org.openjdk.jmh.Main org.example.MicrobenchmarkTests.*
# JMH version: 1.32
# VM version: JDK 21.0.1, OpenJDK 64-Bit Server VM, 21.0.1+12-29
# VM invoker: /Users/yessicagaonamorales/Library/Java/JavaVirtualMachines/openjdk-21.0.1/Contents/Home/bin/java
# VM options: -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=55064:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: full + dont-inline hint
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.example.MicrobenchmarkTests.concatWithConcatenationMethod

# Run progress: 0.00% complete, ETA 00:00:30
# Fork: 1 of 1
# Warmup Iteration   1: 136181145.826 ops/s
# Warmup Iteration   2: 157467496.406 ops/s
# Warmup Iteration   3: 173934656.988 ops/s
# Warmup Iteration   4: 173702119.436 ops/s
# Warmup Iteration   5: 173693884.587 ops/s
Iteration   1: 172690648.311 ops/s
Iteration   2: 173573081.050 ops/s
Iteration   3: 174232805.816 ops/s
Iteration   4: 174590993.522 ops/s
Iteration   5: 174109038.457 ops/s


Result "org.example.MicrobenchmarkTests.concatWithConcatenationMethod":
  173839313.431 ±(99.9%) 2844608.337 ops/s [Average]
  (min, avg, max) = (172690648.311, 173839313.431, 174590993.522), stdev = 738735.752
  CI (99.9%): [170994705.094, 176683921.768] (assumes normal distribution)


# JMH version: 1.32
# VM version: JDK 21.0.1, OpenJDK 64-Bit Server VM, 21.0.1+12-29
# VM invoker: /Users/yessicagaonamorales/Library/Java/JavaVirtualMachines/openjdk-21.0.1/Contents/Home/bin/java
# VM options: -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=55064:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: full + dont-inline hint
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.example.MicrobenchmarkTests.concatWithPlusOperator

# Run progress: 33.33% complete, ETA 00:00:21
# Fork: 1 of 1
# Warmup Iteration   1: 340852579.407 ops/s
# Warmup Iteration   2: 394665679.213 ops/s
# Warmup Iteration   3: 394577737.852 ops/s
# Warmup Iteration   4: 394495557.524 ops/s
# Warmup Iteration   5: 394627508.489 ops/s
Iteration   1: 391357674.105 ops/s
Iteration   2: 394408764.496 ops/s
Iteration   3: 393922800.324 ops/s
Iteration   4: 394813931.534 ops/s
Iteration   5: 394750959.114 ops/s


Result "org.example.MicrobenchmarkTests.concatWithPlusOperator":
  393850825.915 ±(99.9%) 5536796.816 ops/s [Average]
  (min, avg, max) = (391357674.105, 393850825.915, 394813931.534), stdev = 1437888.550
  CI (99.9%): [388314029.099, 399387622.731] (assumes normal distribution)


# JMH version: 1.32
# VM version: JDK 21.0.1, OpenJDK 64-Bit Server VM, 21.0.1+12-29
# VM invoker: /Users/yessicagaonamorales/Library/Java/JavaVirtualMachines/openjdk-21.0.1/Contents/Home/bin/java
# VM options: -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=55064:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: full + dont-inline hint
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.example.MicrobenchmarkTests.concatWithStringBuilder

# Run progress: 66.67% complete, ETA 00:00:10
# Fork: 1 of 1
# Warmup Iteration   1: 131882288.526 ops/s
# Warmup Iteration   2: 152756747.370 ops/s
# Warmup Iteration   3: 167811695.466 ops/s
# Warmup Iteration   4: 168646421.040 ops/s
# Warmup Iteration   5: 169445383.285 ops/s
Iteration   1: 168475741.085 ops/s
Iteration   2: 166837061.002 ops/s
Iteration   3: 169329656.657 ops/s
Iteration   4: 169108528.294 ops/s
Iteration   5: 167798641.879 ops/s


Result "org.example.MicrobenchmarkTests.concatWithStringBuilder":
  168309925.783 ±(99.9%) 3915488.437 ops/s [Average]
  (min, avg, max) = (166837061.002, 168309925.783, 169329656.657), stdev = 1016839.913
  CI (99.9%): [164394437.346, 172225414.220] (assumes normal distribution)


# Run complete. Total time: 00:00:31

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                           Mode  Cnt          Score         Error  Units
MicrobenchmarkTests.concatWithConcatenationMethod  thrpt    5  173839313.431 ± 2844608.337  ops/s
MicrobenchmarkTests.concatWithPlusOperator         thrpt    5  393850825.915 ± 5536796.816  ops/s
MicrobenchmarkTests.concatWithStringBuilder        thrpt    5  168309925.783 ± 3915488.437  ops/s

Process finished with exit code 0 IDEA.app/Contents/lib/idea_rt.jar=55064:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: full + dont-inline hint
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.example.MicrobenchmarkTests.concatWithConcatenationMethod

# Run progress: 0.00% complete, ETA 00:00:30
# Fork: 1 of 1
# Warmup Iteration   1: 136181145.826 ops/s
# Warmup Iteration   2: 157467496.406 ops/s
# Warmup Iteration   3: 173934656.988 ops/s
# Warmup Iteration   4: 173702119.436 ops/s
# Warmup Iteration   5: 173693884.587 ops/s
Iteration   1: 172690648.311 ops/s
Iteration   2: 173573081.050 ops/s
Iteration   3: 174232805.816 ops/s
Iteration   4: 174590993.522 ops/s
Iteration   5: 174109038.457 ops/s


Result "org.example.MicrobenchmarkTests.concatWithConcatenationMethod":
  173839313.431 ±(99.9%) 2844608.337 ops/s [Average]
  (min, avg, max) = (172690648.311, 173839313.431, 174590993.522), stdev = 738735.752
  CI (99.9%): [170994705.094, 176683921.768] (assumes normal distribution)


# JMH version: 1.32
# VM version: JDK 21.0.1, OpenJDK 64-Bit Server VM, 21.0.1+12-29
# VM invoker: /Users/yessicagaonamorales/Library/Java/JavaVirtualMachines/openjdk-21.0.1/Contents/Home/bin/java
# VM options: -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=55064:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: full + dont-inline hint
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.example.MicrobenchmarkTests.concatWithPlusOperator

# Run progress: 33.33% complete, ETA 00:00:21
# Fork: 1 of 1
# Warmup Iteration   1: 340852579.407 ops/s
# Warmup Iteration   2: 394665679.213 ops/s
# Warmup Iteration   3: 394577737.852 ops/s
# Warmup Iteration   4: 394495557.524 ops/s
# Warmup Iteration   5: 394627508.489 ops/s
Iteration   1: 391357674.105 ops/s
Iteration   2: 394408764.496 ops/s
Iteration   3: 393922800.324 ops/s
Iteration   4: 394813931.534 ops/s
Iteration   5: 394750959.114 ops/s


Result "org.example.MicrobenchmarkTests.concatWithPlusOperator":
  393850825.915 ±(99.9%) 5536796.816 ops/s [Average]
  (min, avg, max) = (391357674.105, 393850825.915, 394813931.534), stdev = 1437888.550
  CI (99.9%): [388314029.099, 399387622.731] (assumes normal distribution)


# JMH version: 1.32
# VM version: JDK 21.0.1, OpenJDK 64-Bit Server VM, 21.0.1+12-29
# VM invoker: /Users/yessicagaonamorales/Library/Java/JavaVirtualMachines/openjdk-21.0.1/Contents/Home/bin/java
# VM options: -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=55064:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: full + dont-inline hint
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.example.MicrobenchmarkTests.concatWithStringBuilder

# Run progress: 66.67% complete, ETA 00:00:10
# Fork: 1 of 1
# Warmup Iteration   1: 131882288.526 ops/s
# Warmup Iteration   2: 152756747.370 ops/s
# Warmup Iteration   3: 167811695.466 ops/s
# Warmup Iteration   4: 168646421.040 ops/s
# Warmup Iteration   5: 169445383.285 ops/s
Iteration   1: 168475741.085 ops/s
Iteration   2: 166837061.002 ops/s
Iteration   3: 169329656.657 ops/s
Iteration   4: 169108528.294 ops/s
Iteration   5: 167798641.879 ops/s


Result "org.example.MicrobenchmarkTests.concatWithStringBuilder":
  168309925.783 ±(99.9%) 3915488.437 ops/s [Average]
  (min, avg, max) = (166837061.002, 168309925.783, 169329656.657), stdev = 1016839.913
  CI (99.9%): [164394437.346, 172225414.220] (assumes normal distribution)


# Run complete. Total time: 00:00:31

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                           Mode  Cnt          Score         Error  Units
MicrobenchmarkTests.concatWithConcatenationMethod  thrpt    5  173839313.431 ± 2844608.337  ops/s
MicrobenchmarkTests.concatWithPlusOperator         thrpt    5  393850825.915 ± 5536796.816  ops/s
MicrobenchmarkTests.concatWithStringBuilder        thrpt    5  168309925.783 ± 3915488.437  ops/s

Process finished with exit code 0
```
