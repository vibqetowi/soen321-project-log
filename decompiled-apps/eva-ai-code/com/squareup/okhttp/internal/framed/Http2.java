package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.framed.FrameReader;
import com.squareup.okhttp.internal.framed.Hpack;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
/* loaded from: classes4.dex */
public final class Http2 implements Variant {
    static final byte FLAG_ACK = 1;
    static final byte FLAG_COMPRESSED = 32;
    static final byte FLAG_END_HEADERS = 4;
    static final byte FLAG_END_PUSH_PROMISE = 4;
    static final byte FLAG_END_STREAM = 1;
    static final byte FLAG_NONE = 0;
    static final byte FLAG_PADDED = 8;
    static final byte FLAG_PRIORITY = 32;
    static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final byte TYPE_CONTINUATION = 9;
    static final byte TYPE_DATA = 0;
    static final byte TYPE_GOAWAY = 7;
    static final byte TYPE_HEADERS = 1;
    static final byte TYPE_PING = 6;
    static final byte TYPE_PRIORITY = 2;
    static final byte TYPE_PUSH_PROMISE = 5;
    static final byte TYPE_RST_STREAM = 3;
    static final byte TYPE_SETTINGS = 4;
    static final byte TYPE_WINDOW_UPDATE = 8;
    private static final Logger logger = Logger.getLogger(FrameLogger.class.getName());
    private static final ByteString CONNECTION_PREFACE = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    @Override // com.squareup.okhttp.internal.framed.Variant
    public Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    @Override // com.squareup.okhttp.internal.framed.Variant
    public FrameReader newReader(BufferedSource bufferedSource, boolean z) {
        return new Reader(bufferedSource, 4096, z);
    }

    @Override // com.squareup.okhttp.internal.framed.Variant
    public FrameWriter newWriter(BufferedSink bufferedSink, boolean z) {
        return new Writer(bufferedSink, z);
    }

    /* loaded from: classes4.dex */
    static final class Reader implements FrameReader {
        private final boolean client;
        private final ContinuationSource continuation;
        final Hpack.Reader hpackReader;
        private final BufferedSource source;

        Reader(BufferedSource bufferedSource, int i, boolean z) {
            this.source = bufferedSource;
            this.client = z;
            ContinuationSource continuationSource = new ContinuationSource(bufferedSource);
            this.continuation = continuationSource;
            this.hpackReader = new Hpack.Reader(i, continuationSource);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader
        public void readConnectionPreface() throws IOException {
            if (this.client) {
                return;
            }
            ByteString readByteString = this.source.readByteString(Http2.CONNECTION_PREFACE.size());
            if (Http2.logger.isLoggable(Level.FINE)) {
                Http2.logger.fine(String.format("<< CONNECTION %s", readByteString.hex()));
            }
            if (!Http2.CONNECTION_PREFACE.equals(readByteString)) {
                throw Http2.ioException("Expected a connection header but was %s", readByteString.utf8());
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader
        public boolean nextFrame(FrameReader.Handler handler) throws IOException {
            try {
                this.source.require(9L);
                int readMedium = Http2.readMedium(this.source);
                if (readMedium < 0 || readMedium > 16384) {
                    throw Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(readMedium));
                }
                byte readByte = (byte) (this.source.readByte() & 255);
                byte readByte2 = (byte) (this.source.readByte() & 255);
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                if (Http2.logger.isLoggable(Level.FINE)) {
                    Http2.logger.fine(FrameLogger.formatHeader(true, readInt, readMedium, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        readData(handler, readMedium, readByte2, readInt);
                        break;
                    case 1:
                        readHeaders(handler, readMedium, readByte2, readInt);
                        break;
                    case 2:
                        readPriority(handler, readMedium, readByte2, readInt);
                        break;
                    case 3:
                        readRstStream(handler, readMedium, readByte2, readInt);
                        break;
                    case 4:
                        readSettings(handler, readMedium, readByte2, readInt);
                        break;
                    case 5:
                        readPushPromise(handler, readMedium, readByte2, readInt);
                        break;
                    case 6:
                        readPing(handler, readMedium, readByte2, readInt);
                        break;
                    case 7:
                        readGoAway(handler, readMedium, readByte2, readInt);
                        break;
                    case 8:
                        readWindowUpdate(handler, readMedium, readByte2, readInt);
                        break;
                    default:
                        this.source.skip(readMedium);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        private void readHeaders(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i2 == 0) {
                throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z = (b & 1) != 0;
            short readByte = (b & 8) != 0 ? (short) (this.source.readByte() & 255) : (short) 0;
            if ((b & 32) != 0) {
                readPriority(handler, i2);
                i -= 5;
            }
            handler.headers(false, z, i2, -1, readHeaderBlock(Http2.lengthWithoutPadding(i, b, readByte), readByte, b, i2), HeadersMode.HTTP_20_HEADERS);
        }

        private List<Header> readHeaderBlock(int i, short s, byte b, int i2) throws IOException {
            ContinuationSource continuationSource = this.continuation;
            continuationSource.left = i;
            continuationSource.length = i;
            this.continuation.padding = s;
            this.continuation.flags = b;
            this.continuation.streamId = i2;
            this.hpackReader.readHeaders();
            return this.hpackReader.getAndResetHeaderList();
        }

        private void readData(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            boolean z = (b & 1) != 0;
            if ((b & 32) != 0) {
                throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short readByte = (b & 8) != 0 ? (short) (this.source.readByte() & 255) : (short) 0;
            handler.data(z, i2, this.source, Http2.lengthWithoutPadding(i, b, readByte));
            this.source.skip(readByte);
        }

        private void readPriority(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i != 5) {
                throw Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            }
            if (i2 == 0) {
                throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            readPriority(handler, i2);
        }

        private void readPriority(FrameReader.Handler handler, int i) throws IOException {
            int readInt = this.source.readInt();
            handler.priority(i, readInt & Integer.MAX_VALUE, (this.source.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        private void readRstStream(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            }
            if (i2 == 0) {
                throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int readInt = this.source.readInt();
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt);
            if (fromHttp2 == null) {
                throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            handler.rstStream(i2, fromHttp2);
        }

        private void readSettings(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i2 != 0) {
                throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b & 1) != 0) {
                if (i != 0) {
                    throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                handler.ackSettings();
            } else if (i % 6 != 0) {
                throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            } else {
                Settings settings = new Settings();
                for (int i3 = 0; i3 < i; i3 += 6) {
                    short readShort = this.source.readShort();
                    int readInt = this.source.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (readInt != 0 && readInt != 1) {
                                throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            }
                            break;
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            if (readInt < 0) {
                                throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                            readShort = 7;
                            break;
                        case 5:
                            if (readInt < 16384 || readInt > 16777215) {
                                throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            }
                            break;
                            break;
                        default:
                            throw Http2.ioException("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(readShort));
                    }
                    settings.set(readShort, 0, readInt);
                }
                handler.settings(false, settings);
                if (settings.getHeaderTableSize() >= 0) {
                    this.hpackReader.headerTableSizeSetting(settings.getHeaderTableSize());
                }
            }
        }

        private void readPushPromise(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i2 == 0) {
                throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short readByte = (b & 8) != 0 ? (short) (this.source.readByte() & 255) : (short) 0;
            handler.pushPromise(i2, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Http2.lengthWithoutPadding(i - 4, b, readByte), readByte, b, i2));
        }

        private void readPing(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i != 8) {
                throw Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i));
            }
            if (i2 != 0) {
                throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
            }
            handler.ping((b & 1) != 0, this.source.readInt(), this.source.readInt());
        }

        private void readGoAway(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i < 8) {
                throw Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            }
            if (i2 != 0) {
                throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int readInt = this.source.readInt();
            int readInt2 = this.source.readInt();
            int i3 = i - 8;
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt2);
            if (fromHttp2 == null) {
                throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            ByteString byteString = ByteString.EMPTY;
            if (i3 > 0) {
                byteString = this.source.readByteString(i3);
            }
            handler.goAway(readInt, fromHttp2, byteString);
        }

        private void readWindowUpdate(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            }
            long readInt = this.source.readInt() & 2147483647L;
            if (readInt == 0) {
                throw Http2.ioException("windowSizeIncrement was 0", Long.valueOf(readInt));
            }
            handler.windowUpdate(i2, readInt);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.source.close();
        }
    }

    /* loaded from: classes4.dex */
    static final class Writer implements FrameWriter {
        private final boolean client;
        private boolean closed;
        private final Buffer hpackBuffer;
        private final Hpack.Writer hpackWriter;
        private int maxFrameSize;
        private final BufferedSink sink;

        Writer(BufferedSink bufferedSink, boolean z) {
            this.sink = bufferedSink;
            this.client = z;
            Buffer buffer = new Buffer();
            this.hpackBuffer = buffer;
            this.hpackWriter = new Hpack.Writer(buffer);
            this.maxFrameSize = 16384;
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void flush() throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.sink.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void ackSettings(Settings settings) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            frameHeader(0, 0, (byte) 4, (byte) 1);
            this.sink.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void connectionPreface() throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                if (Http2.logger.isLoggable(Level.FINE)) {
                    Http2.logger.fine(String.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.hex()));
                }
                this.sink.write(Http2.CONNECTION_PREFACE.toByteArray());
                this.sink.flush();
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void synStream(boolean z, boolean z2, int i, int i2, List<Header> list) throws IOException {
            try {
                if (z2) {
                    throw new UnsupportedOperationException();
                }
                if (this.closed) {
                    throw new IOException("closed");
                }
                headers(z, i, list);
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void synReply(boolean z, int i, List<Header> list) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            headers(z, i, list);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void headers(int i, List<Header> list) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            headers(false, i, list);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void pushPromise(int i, int i2, List<Header> list) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min(this.maxFrameSize - 4, size);
            long j = min;
            int i3 = (size > j ? 1 : (size == j ? 0 : -1));
            frameHeader(i, min + 4, (byte) 5, i3 == 0 ? (byte) 4 : (byte) 0);
            this.sink.writeInt(i2 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j);
            if (i3 > 0) {
                writeContinuationFrames(i, size - j);
            }
        }

        void headers(boolean z, int i, List<Header> list) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min(this.maxFrameSize, size);
            long j = min;
            int i2 = (size > j ? 1 : (size == j ? 0 : -1));
            byte b = i2 == 0 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            frameHeader(i, min, (byte) 1, b);
            this.sink.write(this.hpackBuffer, j);
            if (i2 > 0) {
                writeContinuationFrames(i, size - j);
            }
        }

        private void writeContinuationFrames(int i, long j) throws IOException {
            while (j > 0) {
                int min = (int) Math.min(this.maxFrameSize, j);
                long j2 = min;
                j -= j2;
                frameHeader(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
                this.sink.write(this.hpackBuffer, j2);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.httpCode == -1) {
                throw new IllegalArgumentException();
            }
            frameHeader(i, 4, (byte) 3, (byte) 0);
            this.sink.writeInt(errorCode.httpCode);
            this.sink.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public int maxDataLength() {
            return this.maxFrameSize;
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void data(boolean z, int i, Buffer buffer, int i2) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            dataFrame(i, z ? (byte) 1 : (byte) 0, buffer, i2);
        }

        void dataFrame(int i, byte b, Buffer buffer, int i2) throws IOException {
            frameHeader(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.sink.write(buffer, i2);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void settings(Settings settings) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            int i = 0;
            frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (settings.isSet(i)) {
                    this.sink.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.sink.writeInt(settings.get(i));
                }
                i++;
            }
            this.sink.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void ping(boolean z, int i, int i2) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            frameHeader(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.sink.writeInt(i);
            this.sink.writeInt(i2);
            this.sink.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.httpCode == -1) {
                throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
            }
            frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.sink.writeInt(i);
            this.sink.writeInt(errorCode.httpCode);
            if (bArr.length > 0) {
                this.sink.write(bArr);
            }
            this.sink.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void windowUpdate(int i, long j) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            }
            frameHeader(i, 4, (byte) 8, (byte) 0);
            this.sink.writeInt((int) j);
            this.sink.flush();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            this.closed = true;
            this.sink.close();
        }

        void frameHeader(int i, int i2, byte b, byte b2) throws IOException {
            if (Http2.logger.isLoggable(Level.FINE)) {
                Http2.logger.fine(FrameLogger.formatHeader(false, i, i2, b, b2));
            }
            int i3 = this.maxFrameSize;
            if (i2 > i3) {
                throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            if ((Integer.MIN_VALUE & i) == 0) {
                Http2.writeMedium(this.sink, i2);
                this.sink.writeByte(b & 255);
                this.sink.writeByte(b2 & 255);
                this.sink.writeInt(i & Integer.MAX_VALUE);
                return;
            }
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException ioException(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class ContinuationSource implements Source {
        byte flags;
        int left;
        int length;
        short padding;
        private final BufferedSource source;
        int streamId;

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public ContinuationSource(BufferedSource bufferedSource) {
            this.source = bufferedSource;
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.skip(this.padding);
                    this.padding = (short) 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(buffer, Math.min(j, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left = (int) (this.left - read);
                    return read;
                }
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.source.timeout();
        }

        private void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int readMedium = Http2.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            byte readByte = (byte) (this.source.readByte() & 255);
            this.flags = (byte) (this.source.readByte() & 255);
            if (Http2.logger.isLoggable(Level.FINE)) {
                Http2.logger.fine(FrameLogger.formatHeader(true, this.streamId, this.length, readByte, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (readByte != 9) {
                throw Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            }
            if (readInt != i) {
                throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lengthWithoutPadding(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class FrameLogger {
        private static final String[] TYPES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        private static final String[] FLAGS = new String[64];
        private static final String[] BINARY = new String[256];

        FrameLogger() {
        }

        static String formatHeader(boolean z, int i, int i2, byte b, byte b2) {
            String[] strArr = TYPES;
            String format = b < strArr.length ? strArr[b] : String.format("0x%02x", Byte.valueOf(b));
            String formatFlags = formatFlags(b, b2);
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = format;
            objArr[4] = formatFlags;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }

        static String formatFlags(byte b, byte b2) {
            if (b2 == 0) {
                return "";
            }
            if (b != 2 && b != 3) {
                if (b == 4 || b == 6) {
                    return b2 == 1 ? "ACK" : BINARY[b2];
                } else if (b != 7 && b != 8) {
                    String[] strArr = FLAGS;
                    String str = b2 < strArr.length ? strArr[b2] : BINARY[b2];
                    if (b != 5 || (b2 & 4) == 0) {
                        return (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return BINARY[b2];
        }

        static {
            int i;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr = BINARY;
                if (i3 >= strArr.length) {
                    break;
                }
                strArr[i3] = String.format("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
                i3++;
            }
            String[] strArr2 = FLAGS;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            strArr2[iArr[0] | 8] = strArr2[i] + "|PADDED";
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = iArr2[i4];
                int i6 = iArr[0];
                String[] strArr3 = FLAGS;
                int i7 = i6 | i5;
                strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
                strArr3[i7 | 8] = strArr3[i6] + '|' + strArr3[i5] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = FLAGS;
                if (i2 >= strArr4.length) {
                    return;
                }
                if (strArr4[i2] == null) {
                    strArr4[i2] = BINARY[i2];
                }
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readMedium(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeMedium(BufferedSink bufferedSink, int i) throws IOException {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }
}
