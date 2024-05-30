## Chapter: Java I/O Streams

### Introduction to Java I/O Streams

Java I/O (Input/Output) is a powerful library that allows you to read and write data to and from various sources like files, network connections, and memory buffers. The core of Java I/O operations is based on streams. Streams in Java provide a universal way to handle input and output operations.

### What are Streams?

Streams in Java are sequences of data. There are two types of streams in Java:

1. **Byte Streams**: Handle I/O of raw binary data.
2. **Character Streams**: Handle I/O of character data, automatically handling character encoding and decoding.

### Byte Streams

Byte streams are used for reading and writing binary data. All byte stream classes are descended from `InputStream` and `OutputStream`. The most important byte stream classes are `FileInputStream` and `FileOutputStream`.

#### FileInputStream

The `FileInputStream` class is used to read raw bytes from a file. Here is a basic example of using `FileInputStream`:

```java
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

#### FileOutputStream

The `FileOutputStream` class is used to write raw bytes to a file. Here is a basic example of using `FileOutputStream`:

```java
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String data = "Hello, World!";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Character Streams

Character streams are designed for handling character data. All character stream classes are descended from `Reader` and `Writer`. The most important character stream classes are `FileReader` and `FileWriter`.

#### FileReader

The `FileReader` class is used to read character files. Here is a basic example of using `FileReader`:

```java
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("input.txt")) {
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

#### FileWriter

The `FileWriter` class is used to write characters to a file. Here is a basic example of using `FileWriter`:

```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String data = "Hello, World!";
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Buffered Streams

Buffered streams optimize input and output operations by reducing the number of read/write operations, which can be expensive in terms of performance. Buffered streams use internal buffers to hold data. The most important buffered stream classes are `BufferedInputStream`, `BufferedOutputStream`, `BufferedReader`, and `BufferedWriter`.

#### BufferedReader

The `BufferedReader` class is used to read text from an input stream, buffering characters for efficient reading.

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

#### BufferedWriter

The `BufferedWriter` class is used to write text to an output stream, buffering characters for efficient writing.

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String data = "Hello, World!";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Closing Streams

It's important to close streams after their operations are complete to release system resources. This is typically done using a `try-with-resources` statement, which ensures that each resource is closed at the end of the statement.

### Conclusion

Java I/O Streams provide a powerful and flexible way to handle input and output operations. By understanding the different types of streams and how to use them, you can efficiently manage data in your Java applications. Whether you are dealing with files, network connections, or memory buffers, mastering I/O streams is essential for effective Java programming.