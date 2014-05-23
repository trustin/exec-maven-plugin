package kr.motd.maven.exec;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class LineBufferedOutputStream extends BufferedOutputStream {
    public LineBufferedOutputStream(OutputStream out) {
        super(out);
    }

    public LineBufferedOutputStream(OutputStream out, int size) {
        super(out, size);
    }

    @Override
    public void write(int b) throws IOException {
        super.write(b);
        switch (b) {
            case '\r':
            case '\n':
                flush();
        }
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        super.write(b, off, len);
        final int end = off + len;
        for (int i = off; i < end; i ++) {
            switch (b[i]) {
                case '\r':
                case '\n':
                    flush();
                    return;
            }
        }
    }
}
