package org.example;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput) // Measure throughput (operations per second)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(1) // Number of separate JVM processes
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)

public class MicrobenchmarkTests {

    private static final String prefix = "Hello, ";
    private static final String suffix = " world!";

    @Benchmark
    public String concatWithPlusOperator() {
        return prefix + suffix;
    }

    @Benchmark
    public String concatWithStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        sb.append(suffix);
        return sb.toString();
    }

    @Benchmark
    public String concatWithConcatenationMethod() {
        return prefix.concat(suffix);
    }
}
