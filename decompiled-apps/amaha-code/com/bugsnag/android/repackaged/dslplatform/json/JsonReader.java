package com.bugsnag.android.repackaged.dslplatform.json;

import j$.util.Iterator;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Formatter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.function.Consumer;
/* loaded from: classes.dex */
public final class JsonReader<TContext> {
    private static final boolean[] WHITESPACE;
    private static final EOFException eof;
    private static final Charset utf8 = Charset.forName("UTF-8");
    protected byte[] buffer;
    private int bufferLenWithExtraSpace;
    protected char[] chars;
    public final TContext context;
    private int currentIndex;
    private long currentPosition;
    protected final int doubleLengthLimit;
    protected final DoublePrecision doublePrecision;
    private final StringBuilder error;
    private final Formatter errorFormatter;
    protected final ErrorInfo errorInfo;
    private final StringCache keyCache;
    private byte last;
    private int lastNameLen;
    private int length;
    protected final int maxNumberDigits;
    private final int maxStringBuffer;
    private int nameEnd;
    private final byte[] originalBuffer;
    private final int originalBufferLenWithExtraSpace;
    private int readLimit;
    private InputStream stream;
    private final char[] tmp;
    private int tokenStart;
    private final TypeLookup typeLookup;
    protected final UnknownNumberParsing unknownNumbers;
    private final StringCache valuesCache;

    /* loaded from: classes.dex */
    public interface BindObject<T> {
        T bind(JsonReader jsonReader, T t3);
    }

    /* loaded from: classes.dex */
    public enum DoublePrecision {
        EXACT(0),
        HIGH(1),
        DEFAULT(3),
        LOW(4);
        
        final int level;

        DoublePrecision(int i6) {
            this.level = i6;
        }
    }

    /* loaded from: classes.dex */
    public static class EmptyEOFException extends EOFException {
        private EmptyEOFException() {
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum ErrorInfo {
        WITH_STACK_TRACE,
        DESCRIPTION_AND_POSITION,
        DESCRIPTION_ONLY,
        MINIMAL
    }

    /* loaded from: classes.dex */
    public interface ReadJsonObject<T extends JsonObject> {
        T deserialize(JsonReader jsonReader);
    }

    /* loaded from: classes.dex */
    public interface ReadObject<T> {
        T read(JsonReader jsonReader);
    }

    /* loaded from: classes.dex */
    public enum UnknownNumberParsing {
        LONG_AND_BIGDECIMAL,
        LONG_AND_DOUBLE,
        BIGDECIMAL,
        DOUBLE
    }

    /* loaded from: classes.dex */
    public static class WithObjectReader<T extends JsonObject> implements Iterator<T>, j$.util.Iterator {
        private boolean hasNext = true;
        private final JsonReader json;
        private final ReadJsonObject<T> reader;

        public WithObjectReader(ReadJsonObject<T> readJsonObject, JsonReader jsonReader) {
            this.reader = readJsonObject;
            this.json = jsonReader;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            T deserialize;
            try {
                byte last = this.json.last();
                if (last == 110) {
                    if (!this.json.wasNull()) {
                        throw this.json.newParseErrorAt("Expecting 'null' as null constant", 0);
                    }
                    deserialize = null;
                } else if (last == 123) {
                    this.json.getNextToken();
                    deserialize = this.reader.deserialize(this.json);
                } else {
                    throw this.json.newParseError("Expecting '{' for object start in iteration");
                }
                boolean z10 = this.json.getNextToken() == 44;
                this.hasNext = z10;
                if (z10) {
                    this.json.getNextToken();
                } else if (this.json.last() != 93) {
                    throw this.json.newParseError("Expecting ']' for iteration end");
                }
                return deserialize;
            } catch (IOException e10) {
                throw new SerializationException(e10);
            }
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
        }
    }

    static {
        boolean[] zArr = new boolean[256];
        WHITESPACE = zArr;
        zArr[137] = true;
        zArr[138] = true;
        zArr[139] = true;
        zArr[140] = true;
        zArr[141] = true;
        zArr[160] = true;
        zArr[32] = true;
        zArr[97] = true;
        zArr[98] = true;
        zArr[99] = true;
        eof = new EmptyEOFException();
    }

    private JsonReader(char[] cArr, byte[] bArr, int i6, TContext tcontext, StringCache stringCache, StringCache stringCache2, TypeLookup typeLookup, ErrorInfo errorInfo, DoublePrecision doublePrecision, UnknownNumberParsing unknownNumberParsing, int i10, int i11) {
        this.currentIndex = 0;
        this.currentPosition = 0L;
        this.last = (byte) 32;
        StringBuilder sb2 = new StringBuilder(0);
        this.error = sb2;
        this.errorFormatter = new Formatter(sb2);
        this.tmp = cArr;
        this.buffer = bArr;
        this.length = i6;
        int length = bArr.length - 38;
        this.bufferLenWithExtraSpace = length;
        this.context = tcontext;
        this.chars = cArr;
        this.keyCache = stringCache;
        this.valuesCache = stringCache2;
        this.typeLookup = typeLookup;
        this.errorInfo = errorInfo;
        this.doublePrecision = doublePrecision;
        this.unknownNumbers = unknownNumberParsing;
        this.maxNumberDigits = i10;
        this.maxStringBuffer = i11;
        this.doubleLengthLimit = doublePrecision.level + 15;
        this.originalBuffer = bArr;
        this.originalBufferLenWithExtraSpace = length;
    }

    private int calcHashAndCopyName(long j10, int i6) {
        int i10 = i6 - this.tokenStart;
        long j11 = this.currentPosition - i10;
        while (true) {
            char[] cArr = this.chars;
            if (cArr.length >= i10) {
                break;
            }
            this.chars = Arrays.copyOf(cArr, cArr.length * 2);
        }
        int i11 = 0;
        while (i11 < i10) {
            this.chars[i11] = (char) this.buffer[this.tokenStart + i11];
            i11++;
        }
        this.currentIndex = i6;
        while (true) {
            byte read = read();
            if (read == 92) {
                read = read();
            } else if (read == 34) {
                this.nameEnd = -1;
                this.lastNameLen = i11;
                return (int) j10;
            }
            char[] cArr2 = this.chars;
            if (i11 == cArr2.length) {
                this.chars = Arrays.copyOf(cArr2, cArr2.length * 2);
            }
            int i12 = i11 + 1;
            this.chars[i11] = (char) read;
            j10 = (j10 ^ read) * 16777619;
            if (!isEndOfStream()) {
                i11 = i12;
            } else {
                throw newParseErrorAt("JSON string was not closed with a double quote", (int) j11);
            }
        }
    }

    private int calcWeakHashAndCopyName(int i6, int i10) {
        int i11 = i10 - this.tokenStart;
        long j10 = this.currentPosition - i11;
        while (true) {
            char[] cArr = this.chars;
            if (cArr.length >= i11) {
                break;
            }
            this.chars = Arrays.copyOf(cArr, cArr.length * 2);
        }
        int i12 = 0;
        while (i12 < i11) {
            this.chars[i12] = (char) this.buffer[this.tokenStart + i12];
            i12++;
        }
        this.currentIndex = i10;
        while (true) {
            byte read = read();
            if (read == 92) {
                read = read();
            } else if (read == 34) {
                this.nameEnd = -1;
                this.lastNameLen = i12;
                return i6;
            }
            char[] cArr2 = this.chars;
            if (i12 == cArr2.length) {
                this.chars = Arrays.copyOf(cArr2, cArr2.length * 2);
            }
            int i13 = i12 + 1;
            this.chars[i12] = (char) read;
            i6 += read;
            if (!isEndOfStream()) {
                i12 = i13;
            } else {
                throw newParseErrorAt("JSON string was not closed with a double quote", (int) j10);
            }
        }
    }

    private int hexToInt(byte b10) {
        if (b10 >= 48 && b10 <= 57) {
            return b10 - 48;
        }
        if (b10 >= 65 && b10 <= 70) {
            return b10 - 55;
        }
        if (b10 >= 97 && b10 <= 102) {
            return b10 - 87;
        }
        throw newParseErrorWith("Could not parse unicode escape, expected a hexadecimal digit", Byte.valueOf(b10));
    }

    private int prepareNextBlock() {
        int i6 = this.length;
        int i10 = this.currentIndex;
        int i11 = i6 - i10;
        byte[] bArr = this.buffer;
        System.arraycopy(bArr, i10, bArr, 0, i11);
        int readFully = readFully(this.buffer, this.stream, i11);
        long j10 = this.currentPosition;
        int i12 = this.currentIndex;
        this.currentPosition = j10 + i12;
        if (readFully == i11) {
            int i13 = this.length - i12;
            this.readLimit = i13;
            this.length = i13;
            this.currentIndex = 0;
        } else {
            int i14 = this.bufferLenWithExtraSpace;
            if (readFully < i14) {
                i14 = readFully;
            }
            this.readLimit = i14;
            this.length = readFully;
            this.currentIndex = 0;
        }
        return readFully;
    }

    private static int readFully(byte[] bArr, InputStream inputStream, int i6) {
        int read;
        while (i6 < bArr.length && (read = inputStream.read(bArr, i6, bArr.length - i6)) != -1) {
            i6 += read;
        }
        return i6;
    }

    private Object readNull(Class<?> cls) {
        if (wasNull()) {
            if (cls.isPrimitive()) {
                if (cls == Integer.TYPE) {
                    return 0;
                }
                if (cls == Long.TYPE) {
                    return 0L;
                }
                if (cls == Short.TYPE) {
                    return (short) 0;
                }
                if (cls == Byte.TYPE) {
                    return (byte) 0;
                }
                if (cls == Float.TYPE) {
                    return Float.valueOf(0.0f);
                }
                if (cls == Double.TYPE) {
                    return Double.valueOf(0.0d);
                }
                if (cls == Boolean.TYPE) {
                    return Boolean.FALSE;
                }
                if (cls == Character.TYPE) {
                    return (char) 0;
                }
                return null;
            }
            return null;
        }
        throw newParseErrorAt("Expecting 'null' as null constant", 0);
    }

    private byte skipString() {
        byte read = read();
        boolean z10 = false;
        while (true) {
            if (read == 34 && !z10) {
                return getNextToken();
            }
            if (!z10 && read == 92) {
                z10 = true;
            } else {
                z10 = false;
            }
            read = read();
        }
    }

    private boolean wasWhiteSpace() {
        byte b10 = this.last;
        if (b10 != -96 && b10 != 32) {
            switch (b10) {
                case -31:
                    int i6 = this.currentIndex;
                    if (i6 + 1 < this.length) {
                        byte[] bArr = this.buffer;
                        if (bArr[i6] == -102 && bArr[i6 + 1] == Byte.MIN_VALUE) {
                            this.currentIndex = i6 + 2;
                            this.last = (byte) 32;
                            return true;
                        }
                    }
                    return false;
                case -30:
                    int i10 = this.currentIndex;
                    if (i10 + 1 >= this.length) {
                        return false;
                    }
                    byte[] bArr2 = this.buffer;
                    byte b11 = bArr2[i10];
                    byte b12 = bArr2[i10 + 1];
                    if (b11 == -127 && b12 == -97) {
                        this.currentIndex = i10 + 2;
                        this.last = (byte) 32;
                        return true;
                    } else if (b11 != Byte.MIN_VALUE) {
                        return false;
                    } else {
                        if (b12 != -88 && b12 != -87 && b12 != -81) {
                            switch (b12) {
                                case Byte.MIN_VALUE:
                                case -127:
                                case -126:
                                case -125:
                                case -124:
                                case -123:
                                case -122:
                                case -121:
                                case -120:
                                case -119:
                                case -118:
                                    break;
                                default:
                                    return false;
                            }
                        }
                        this.currentIndex = i10 + 2;
                        this.last = (byte) 32;
                        return true;
                    }
                case -29:
                    int i11 = this.currentIndex;
                    if (i11 + 1 < this.length) {
                        byte[] bArr3 = this.buffer;
                        if (bArr3[i11] == Byte.MIN_VALUE && bArr3[i11 + 1] == Byte.MIN_VALUE) {
                            this.currentIndex = i11 + 2;
                            this.last = (byte) 32;
                            return true;
                        }
                    }
                    return false;
                default:
                    switch (b10) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    public final boolean allWhitespace(int i6, int i10) {
        byte[] bArr = this.buffer;
        while (i6 < i10) {
            if (!WHITESPACE[bArr[i6] + 128]) {
                return false;
            }
            i6++;
        }
        return true;
    }

    public final StringBuilder appendString(StringBuilder sb2) {
        sb2.append(this.chars, 0, parseString());
        return sb2;
    }

    public final int calcHash() {
        int i6;
        if (this.last == 34) {
            int i10 = this.currentIndex;
            this.tokenStart = i10;
            long j10 = -2128831035;
            if (this.stream != null) {
                while (true) {
                    i6 = this.readLimit;
                    if (i10 >= i6) {
                        break;
                    }
                    byte[] bArr = this.buffer;
                    byte b10 = bArr[i10];
                    if (b10 == 92) {
                        if (i10 == i6 - 1) {
                            return calcHashAndCopyName(j10, i10);
                        }
                        i10++;
                        b10 = bArr[i10];
                    } else if (b10 == 34) {
                        break;
                    }
                    i10++;
                    j10 = (j10 ^ b10) * 16777619;
                }
                if (i10 >= i6) {
                    return calcHashAndCopyName(j10, i10);
                }
                int i11 = i10 + 1;
                this.currentIndex = i11;
                this.nameEnd = i11;
            } else {
                while (true) {
                    byte[] bArr2 = this.buffer;
                    if (i10 >= bArr2.length) {
                        break;
                    }
                    int i12 = i10 + 1;
                    byte b11 = bArr2[i10];
                    if (b11 == 92) {
                        if (i12 != bArr2.length) {
                            byte b12 = bArr2[i12];
                            i12++;
                            b11 = b12;
                        } else {
                            throw newParseError("Expecting '\"' for attribute name end");
                        }
                    } else if (b11 == 34) {
                        i10 = i12;
                        break;
                    }
                    j10 = (j10 ^ b11) * 16777619;
                    i10 = i12;
                }
                this.currentIndex = i10;
                this.nameEnd = i10;
            }
            return (int) j10;
        }
        throw newParseError("Expecting '\"' for attribute name start");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        if (r0 < r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        return calcWeakHashAndCopyName(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        r0 = r0 + 1;
        r7.currentIndex = r0;
        r7.nameEnd = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int calcWeakHash() {
        if (this.last == 34) {
            int i6 = this.currentIndex;
            this.tokenStart = i6;
            int i10 = 0;
            if (this.stream != null) {
                while (true) {
                    int i11 = this.readLimit;
                    if (i6 >= i11) {
                        break;
                    }
                    byte[] bArr = this.buffer;
                    byte b10 = bArr[i6];
                    if (b10 == 92) {
                        if (i6 == i11 - 1) {
                            return calcWeakHashAndCopyName(i10, i6);
                        }
                        i6++;
                        b10 = bArr[i6];
                    } else if (b10 == 34) {
                        break;
                    }
                    i6++;
                    i10 += b10;
                }
            } else {
                while (true) {
                    byte[] bArr2 = this.buffer;
                    if (i6 >= bArr2.length) {
                        break;
                    }
                    int i12 = i6 + 1;
                    byte b11 = bArr2[i6];
                    if (b11 == 92) {
                        if (i12 != bArr2.length) {
                            byte b12 = bArr2[i12];
                            i12++;
                            b11 = b12;
                        } else {
                            throw newParseError("Expecting '\"' for attribute name end");
                        }
                    } else if (b11 == 34) {
                        i6 = i12;
                        break;
                    }
                    i10 += b11;
                    i6 = i12;
                }
                this.currentIndex = i6;
                this.nameEnd = i6;
            }
            return i10;
        }
        throw newParseError("Expecting '\"' for attribute name start");
    }

    public final void checkArrayEnd() {
        if (this.last != 93) {
            if (this.currentIndex >= this.length) {
                throw newParseErrorAt("Unexpected end of JSON in collection", 0, eof);
            }
            throw newParseError("Expecting ']' as array end");
        }
    }

    public final void checkObjectEnd() {
        if (this.last != 125) {
            if (this.currentIndex >= this.length) {
                throw newParseErrorAt("Unexpected end of JSON in object", 0, eof);
            }
            throw newParseError("Expecting '}' as object end");
        }
    }

    public final void comma() {
        if (getNextToken() != 44) {
            if (this.currentIndex >= this.length) {
                throw newParseErrorAt("Unexpected end in JSON", 0, eof);
            }
            throw newParseError("Expecting ','");
        }
    }

    public final <T, S extends T> ArrayList<T> deserializeCollection(ReadObject<S> readObject) {
        ArrayList<T> arrayList = new ArrayList<>(4);
        deserializeCollection(readObject, arrayList);
        return arrayList;
    }

    public final <T, S extends T> ArrayList<T> deserializeNullableCollection(ReadObject<S> readObject) {
        ArrayList<T> arrayList = new ArrayList<>(4);
        deserializeNullableCollection(readObject, arrayList);
        return arrayList;
    }

    public final void endArray() {
        if (getNextToken() != 93) {
            if (this.currentIndex >= this.length) {
                throw newParseErrorAt("Unexpected end in JSON", 0, eof);
            }
            throw newParseError("Expecting ']' as array end");
        }
    }

    public final void endObject() {
        if (getNextToken() != 125) {
            if (this.currentIndex >= this.length) {
                throw newParseErrorAt("Unexpected end in JSON", 0, eof);
            }
            throw newParseError("Expecting '}' as object end");
        }
    }

    public final int fillName() {
        int calcHash = calcHash();
        if (read() != 58 && (!wasWhiteSpace() || getNextToken() != 58)) {
            throw newParseError("Expecting ':' after attribute name");
        }
        return calcHash;
    }

    public final int fillNameWeakHash() {
        int calcWeakHash = calcWeakHash();
        if (read() != 58 && (!wasWhiteSpace() || getNextToken() != 58)) {
            throw newParseError("Expecting ':' after attribute name");
        }
        return calcWeakHash;
    }

    public final int findNonWhitespace(int i6) {
        byte[] bArr = this.buffer;
        for (int i10 = i6 - 1; i10 > 0; i10--) {
            if (!WHITESPACE[bArr[i10] + 128]) {
                return i10 + 1;
            }
        }
        return 0;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final int getLastHash() {
        long j10 = -2128831035;
        if (this.stream != null && this.nameEnd == -1) {
            for (int i6 = 0; i6 < this.lastNameLen; i6++) {
                j10 = (j10 ^ ((byte) this.chars[i6])) * 16777619;
            }
        } else {
            for (int i10 = this.tokenStart; i10 < this.nameEnd - 1; i10++) {
                j10 = (j10 ^ this.buffer[i10]) * 16777619;
            }
        }
        return (int) j10;
    }

    public final String getLastName() {
        if (this.stream != null && this.nameEnd == -1) {
            return new String(this.chars, 0, this.lastNameLen);
        }
        byte[] bArr = this.buffer;
        int i6 = this.tokenStart;
        return new String(bArr, i6, (this.nameEnd - i6) - 1, "UTF-8");
    }

    public final byte getNextToken() {
        read();
        if (WHITESPACE[this.last + 128]) {
            while (wasWhiteSpace()) {
                read();
            }
        }
        return this.last;
    }

    public final int getTokenStart() {
        return this.tokenStart;
    }

    public final boolean isEndOfStream() {
        if (this.stream == null) {
            if (this.length == this.currentIndex) {
                return true;
            }
            return false;
        } else if (this.length == this.currentIndex && prepareNextBlock() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public final <T> java.util.Iterator<T> iterateOver(ReadObject<T> readObject) {
        return new WithReader(readObject, this);
    }

    public final byte last() {
        return this.last;
    }

    public final int length() {
        return this.length;
    }

    public final ParsingException newParseError(String str) {
        return newParseError(str, 0);
    }

    public final ParsingException newParseErrorAt(String str, int i6) {
        ErrorInfo errorInfo = this.errorInfo;
        if (errorInfo != ErrorInfo.MINIMAL && errorInfo != ErrorInfo.DESCRIPTION_ONLY) {
            this.error.setLength(0);
            this.error.append(str);
            this.error.append(" ");
            positionDescription(i6, this.error);
            return ParsingException.create(this.error.toString(), withStackTrace());
        }
        return ParsingException.create(str, false);
    }

    public final ParsingException newParseErrorFormat(String str, int i6, String str2, Object... objArr) {
        if (this.errorInfo == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, false);
        }
        this.error.setLength(0);
        this.errorFormatter.format(str2, objArr);
        if (this.errorInfo == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.create(this.error.toString(), false);
        }
        this.error.append(" ");
        positionDescription(i6, this.error);
        return ParsingException.create(this.error.toString(), withStackTrace());
    }

    public final ParsingException newParseErrorWith(String str, Object obj) {
        return newParseErrorWith(str, 0, "", str, obj, "");
    }

    public final <T> T next(Class<T> cls) {
        if (cls != null) {
            if (this.typeLookup != null) {
                if (getNextToken() == 110) {
                    return (T) readNull(cls);
                }
                ReadObject<T> tryFindReader = this.typeLookup.tryFindReader(cls);
                if (tryFindReader != null) {
                    return tryFindReader.read(this);
                }
                throw new ConfigurationException("Reader not found for " + cls + ". Check if reader was registered");
            }
            throw new ConfigurationException(b.l("typeLookup is not defined for this JsonReader. Unable to lookup specified type ", cls));
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01cc, code lost:
        throw newParseErrorWith("Maximum string buffer limit exceeded", java.lang.Integer.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cd, code lost:
        r4[r6] = (char) r0;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01db, code lost:
        throw newParseErrorAt("JSON string was not closed with a double quote", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r5 != r4.length) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
        r1 = r15.chars;
        r4 = r1.length * 2;
        r5 = r15.maxStringBuffer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
        if (r4 > r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
        r4 = java.util.Arrays.copyOf(r1, r4);
        r15.chars = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
        throw newParseErrorWith("Maximum string buffer limit exceeded", java.lang.Integer.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
        r1 = r4.length;
        r6 = r6 - 1;
        r15.currentIndex = r6;
        r6 = r6 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        if (isEndOfStream() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        r0 = read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
        if (r0 != 34) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        if (r0 != 92) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
        if (r6 < (r1 - 6)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
        r0 = r15.chars;
        r1 = r0.length * 2;
        r4 = r15.maxStringBuffer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
        if (r1 > r4) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
        r4 = java.util.Arrays.copyOf(r0, r1);
        r15.chars = r4;
        r1 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
        throw newParseErrorWith("Maximum string buffer limit exceeded", java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
        r0 = r15.buffer;
        r9 = r15.currentIndex;
        r10 = r9 + 1;
        r15.currentIndex = r10;
        r9 = r0[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
        if (r9 == 34) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
        if (r9 == 47) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
        if (r9 == 92) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
        if (r9 == 98) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
        if (r9 == 102) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
        if (r9 == 110) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a8, code lost:
        if (r9 == 114) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ac, code lost:
        if (r9 == 116) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b0, code lost:
        if (r9 != 117) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b2, code lost:
        r15.currentIndex = r10 + 1;
        r5 = r15.buffer;
        r7 = r15.currentIndex;
        r15.currentIndex = r7 + 1;
        r0 = (hexToInt(r0[r10]) << 12) + (hexToInt(r5[r7]) << 8);
        r5 = r15.buffer;
        r7 = r15.currentIndex;
        r15.currentIndex = r7 + 1;
        r0 = r0 + (hexToInt(r5[r7]) << 4);
        r5 = r15.buffer;
        r7 = r15.currentIndex;
        r15.currentIndex = r7 + 1;
        r5 = hexToInt(r5[r7]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ec, code lost:
        r0 = r0 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f9, code lost:
        throw newParseErrorWith("Invalid escape combination detected", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fa, code lost:
        r0 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fe, code lost:
        r0 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0102, code lost:
        r0 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
        r0 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010a, code lost:
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010e, code lost:
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0113, code lost:
        if ((r0 & 128) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0117, code lost:
        if (r6 < (r1 - 4)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0119, code lost:
        r1 = r15.chars;
        r4 = r1.length * 2;
        r5 = r15.maxStringBuffer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0120, code lost:
        if (r4 > r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0122, code lost:
        r1 = java.util.Arrays.copyOf(r1, r4);
        r15.chars = r1;
        r4 = r1;
        r1 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0135, code lost:
        throw newParseErrorWith("Maximum string buffer limit exceeded", java.lang.Integer.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0136, code lost:
        r5 = r15.buffer;
        r9 = r15.currentIndex;
        r10 = r9 + 1;
        r15.currentIndex = r10;
        r9 = r5[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0144, code lost:
        if ((r0 & 224) != 192) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0146, code lost:
        r0 = (r0 & 31) << 6;
        r5 = r9 & 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014d, code lost:
        r11 = r10 + 1;
        r15.currentIndex = r11;
        r10 = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0157, code lost:
        if ((r0 & 240) != 224) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0159, code lost:
        r0 = ((r0 & 15) << 12) + ((r9 & 63) << 6);
        r5 = r10 & 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0164, code lost:
        r15.currentIndex = r11 + 1;
        r5 = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0170, code lost:
        if ((r0 & 248) != 240) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0172, code lost:
        r0 = ((((r0 & 7) << 18) + ((r9 & 63) << 12)) + ((r10 & 63) << 6)) + (r5 & 63);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0185, code lost:
        if (r0 < 65536) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0189, code lost:
        if (r0 >= 1114112) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018b, code lost:
        r0 = r0 - 65536;
        r5 = r6 + 1;
        r4[r6] = (char) ((r0 >>> 10) + 55296);
        r6 = r5 + 1;
        r4[r5] = (char) ((r0 & 1023) + 56320);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a8, code lost:
        throw newParseErrorAt("Invalid unicode character detected", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ad, code lost:
        throw newParseErrorAt("Invalid unicode character detected", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ae, code lost:
        if (r6 < r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b0, code lost:
        r1 = r15.chars;
        r4 = r1.length * 2;
        r5 = r15.maxStringBuffer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b7, code lost:
        if (r4 > r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b9, code lost:
        r1 = java.util.Arrays.copyOf(r1, r4);
        r15.chars = r1;
        r4 = r1;
        r1 = r1.length;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int parseString() {
        int i6 = this.currentIndex;
        if (this.last == 34) {
            int i10 = this.length;
            if (i6 != i10) {
                char[] cArr = this.chars;
                int i11 = i10 - i6;
                if (cArr.length < i11) {
                    i11 = cArr.length;
                }
                int i12 = i6;
                int i13 = 0;
                while (true) {
                    if (i13 >= i11) {
                        break;
                    }
                    int i14 = i12 + 1;
                    byte b10 = this.buffer[i12];
                    if (b10 == 34) {
                        this.currentIndex = i14;
                        return i13;
                    } else if ((b10 ^ JsonWriter.ESCAPE) < 1) {
                        i12 = i14;
                        break;
                    } else {
                        cArr[i13] = (char) b10;
                        i13++;
                        i12 = i14;
                    }
                }
            } else {
                throw newParseErrorAt("Premature end of JSON string", 0);
            }
        } else {
            throw newParseError("Expecting '\"' for string start");
        }
    }

    public String positionDescription() {
        return positionDescription(0);
    }

    public final long positionInStream() {
        return this.currentPosition + this.currentIndex;
    }

    public final char[] prepareBuffer(int i6, int i10) {
        char[] cArr;
        if (i10 <= this.maxNumberDigits) {
            while (true) {
                cArr = this.chars;
                if (cArr.length >= i10) {
                    break;
                }
                this.chars = Arrays.copyOf(cArr, cArr.length * 2);
            }
            byte[] bArr = this.buffer;
            for (int i11 = 0; i11 < i10; i11++) {
                cArr[i11] = (char) bArr[i6 + i11];
            }
            return cArr;
        }
        throw newParseErrorWith("Too many digits detected in number", i10, "", "Too many digits detected in number", Integer.valueOf(i10), "");
    }

    public final JsonReader<TContext> process(InputStream inputStream) {
        this.currentPosition = 0L;
        this.currentIndex = 0;
        this.stream = inputStream;
        if (inputStream != null) {
            int i6 = this.length;
            int i10 = this.bufferLenWithExtraSpace;
            if (i6 >= i10) {
                i6 = i10;
            }
            this.readLimit = i6;
            int readFully = readFully(this.buffer, inputStream, 0);
            int i11 = this.bufferLenWithExtraSpace;
            if (readFully < i11) {
                i11 = readFully;
            }
            this.readLimit = i11;
            this.length = readFully;
        }
        return this;
    }

    public final byte read() {
        if (this.stream != null && this.currentIndex > this.readLimit) {
            prepareNextBlock();
        }
        int i6 = this.currentIndex;
        if (i6 < this.length) {
            byte[] bArr = this.buffer;
            this.currentIndex = i6 + 1;
            byte b10 = bArr[i6];
            this.last = b10;
            return b10;
        }
        throw ParsingException.create("Unexpected end of JSON input", eof, withStackTrace());
    }

    public final <T> T[] readArray(ReadObject<T> readObject, T[] tArr) {
        if (wasNull()) {
            return null;
        }
        if (this.last == 91) {
            if (getNextToken() == 93) {
                return tArr;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(readObject.read(this));
            while (getNextToken() == 44) {
                getNextToken();
                arrayList.add(readObject.read(this));
            }
            checkArrayEnd();
            return (T[]) arrayList.toArray(tArr);
        }
        throw newParseError("Expecting '[' as array start");
    }

    public final byte[] readBase64() {
        if (this.stream != null && Base64.findEnd(this.buffer, this.currentIndex) == this.buffer.length) {
            int parseString = parseString();
            byte[] bArr = new byte[parseString];
            for (int i6 = 0; i6 < parseString; i6++) {
                bArr[i6] = (byte) this.chars[i6];
            }
            return Base64.decodeFast(bArr, 0, parseString);
        } else if (this.last == 34) {
            int i10 = this.currentIndex;
            int findEnd = Base64.findEnd(this.buffer, i10);
            byte[] bArr2 = this.buffer;
            int i11 = findEnd + 1;
            this.currentIndex = i11;
            byte b10 = bArr2[findEnd];
            this.last = b10;
            if (b10 == 34) {
                return Base64.decodeFast(bArr2, i10, i11 - 1);
            }
            throw newParseError("Expecting '\"' for base64 end");
        } else {
            throw newParseError("Expecting '\"' for base64 start");
        }
    }

    public final <T> ArrayList<T> readCollection(ReadObject<T> readObject) {
        if (wasNull()) {
            return null;
        }
        if (this.last == 91) {
            if (getNextToken() == 93) {
                return new ArrayList<>(0);
            }
            ArrayList<T> arrayList = new ArrayList<>(4);
            arrayList.add(readObject.read(this));
            while (getNextToken() == 44) {
                getNextToken();
                arrayList.add(readObject.read(this));
            }
            checkArrayEnd();
            return arrayList;
        }
        throw newParseError("Expecting '[' as collection start");
    }

    public final String readKey() {
        String str;
        int parseString = parseString();
        StringCache stringCache = this.keyCache;
        if (stringCache != null) {
            str = stringCache.get(this.chars, parseString);
        } else {
            str = new String(this.chars, 0, parseString);
        }
        if (getNextToken() == 58) {
            getNextToken();
            return str;
        }
        throw newParseError("Expecting ':' after attribute name");
    }

    public final <K, V> LinkedHashMap<K, V> readMap(ReadObject<K> readObject, ReadObject<V> readObject2) {
        if (wasNull()) {
            return null;
        }
        if (this.last == 123) {
            if (getNextToken() == 125) {
                return new LinkedHashMap<>(0);
            }
            LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<>(4);
            K read = readObject.read(this);
            if (read != null) {
                if (getNextToken() == 58) {
                    getNextToken();
                    linkedHashMap.put(read, readObject2.read(this));
                    while (getNextToken() == 44) {
                        getNextToken();
                        K read2 = readObject.read(this);
                        if (read2 != null) {
                            if (getNextToken() == 58) {
                                getNextToken();
                                linkedHashMap.put(read2, readObject2.read(this));
                            } else {
                                throw newParseError("Expecting ':' after key attribute");
                            }
                        } else {
                            throw newParseErrorAt("Null detected as key", 0);
                        }
                    }
                    checkObjectEnd();
                    return linkedHashMap;
                }
                throw newParseError("Expecting ':' after key attribute");
            }
            throw newParseErrorAt("Null detected as key", 0);
        }
        throw newParseError("Expecting '{' as map start");
    }

    @Deprecated
    public String readNext() {
        int i6 = this.currentIndex - 1;
        skip();
        return new String(this.buffer, i6, (this.currentIndex - i6) - 1, "UTF-8");
    }

    @Deprecated
    public final char[] readNumber() {
        char[] cArr;
        int i6 = this.currentIndex;
        this.tokenStart = i6 - 1;
        char[] cArr2 = this.tmp;
        byte b10 = this.last;
        cArr2[0] = (char) b10;
        int i10 = 1;
        while (true) {
            cArr = this.tmp;
            if (i10 >= cArr.length || i6 >= this.length) {
                break;
            }
            int i11 = i6 + 1;
            b10 = this.buffer[i6];
            if (b10 == 44 || b10 == 125 || b10 == 93) {
                break;
            }
            cArr[i10] = (char) b10;
            i10++;
            i6 = i11;
        }
        this.currentIndex = (i10 - 1) + this.currentIndex;
        this.last = b10;
        return cArr;
    }

    public final <T> LinkedHashSet<T> readSet(ReadObject<T> readObject) {
        if (wasNull()) {
            return null;
        }
        if (this.last == 91) {
            if (getNextToken() == 93) {
                return new LinkedHashSet<>(0);
            }
            LinkedHashSet<T> linkedHashSet = new LinkedHashSet<>(4);
            linkedHashSet.add(readObject.read(this));
            while (getNextToken() == 44) {
                getNextToken();
                linkedHashSet.add(readObject.read(this));
            }
            checkArrayEnd();
            return linkedHashSet;
        }
        throw newParseError("Expecting '[' as set start");
    }

    public final char[] readSimpleQuote() {
        char[] cArr;
        if (this.last == 34) {
            int i6 = this.currentIndex;
            this.tokenStart = i6;
            int i10 = 0;
            while (true) {
                try {
                    cArr = this.tmp;
                    if (i10 >= cArr.length) {
                        break;
                    }
                    int i11 = i6 + 1;
                    byte b10 = this.buffer[i6];
                    if (b10 == 34) {
                        i6 = i11;
                        break;
                    }
                    cArr[i10] = (char) b10;
                    i10++;
                    i6 = i11;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw newParseErrorAt("JSON string was not closed with a double quote", 0);
                }
            }
            if (i6 <= this.length) {
                this.currentIndex = i6;
                return cArr;
            }
            throw newParseErrorAt("JSON string was not closed with a double quote", 0);
        }
        throw newParseError("Expecting '\"' for string start");
    }

    public final String readSimpleString() {
        char[] cArr;
        if (this.last == 34) {
            int i6 = this.currentIndex;
            int i10 = 0;
            while (true) {
                try {
                    cArr = this.tmp;
                    if (i10 >= cArr.length) {
                        break;
                    }
                    int i11 = i6 + 1;
                    byte b10 = this.buffer[i6];
                    if (b10 == 34) {
                        i6 = i11;
                        break;
                    }
                    int i12 = i10 + 1;
                    cArr[i10] = (char) b10;
                    i10 = i12;
                    i6 = i11;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw newParseErrorAt("JSON string was not closed with a double quote", 0);
                }
            }
            if (i6 <= this.length) {
                this.currentIndex = i6;
                return new String(cArr, 0, i10);
            }
            throw newParseErrorAt("JSON string was not closed with a double quote", 0);
        }
        throw newParseError("Expecting '\"' for string start");
    }

    public final String readString() {
        int parseString = parseString();
        StringCache stringCache = this.valuesCache;
        if (stringCache == null) {
            return new String(this.chars, 0, parseString);
        }
        return stringCache.get(this.chars, parseString);
    }

    @Deprecated
    public final void reset(InputStream inputStream) {
        process(inputStream);
    }

    public final int scanNumber() {
        int i6 = this.currentIndex;
        this.tokenStart = i6 - 1;
        byte b10 = this.last;
        int i10 = 1;
        while (i6 < this.length) {
            int i11 = i6 + 1;
            b10 = this.buffer[i6];
            if (b10 == 44 || b10 == 125 || b10 == 93) {
                break;
            }
            i10++;
            i6 = i11;
        }
        this.currentIndex = (i10 - 1) + this.currentIndex;
        this.last = b10;
        return this.tokenStart;
    }

    public final void semicolon() {
        if (getNextToken() != 58) {
            if (this.currentIndex >= this.length) {
                throw newParseErrorAt("Unexpected end in JSON", 0, eof);
            }
            throw newParseError("Expecting ':'");
        }
    }

    public final byte skip() {
        byte b10;
        byte b11 = this.last;
        if (b11 == 34) {
            return skipString();
        }
        if (b11 == 123) {
            byte nextToken = getNextToken();
            if (nextToken == 125) {
                return getNextToken();
            }
            if (nextToken == 34) {
                if (skipString() == 58) {
                    getNextToken();
                    byte skip = skip();
                    while (skip == 44) {
                        if (getNextToken() == 34) {
                            if (skipString() == 58) {
                                getNextToken();
                                skip = skip();
                            } else {
                                throw newParseError("Expecting ':' after attribute name");
                            }
                        } else {
                            throw newParseError("Expecting '\"' for attribute name");
                        }
                    }
                    if (skip == 125) {
                        return getNextToken();
                    }
                    throw newParseError("Expecting '}' for object end");
                }
                throw newParseError("Expecting ':' after attribute name");
            }
            throw newParseError("Expecting '\"' for attribute name");
        } else if (b11 == 91) {
            getNextToken();
            byte skip2 = skip();
            while (skip2 == 44) {
                getNextToken();
                skip2 = skip();
            }
            if (skip2 == 93) {
                return getNextToken();
            }
            throw newParseError("Expecting ']' for array end");
        } else if (b11 == 110) {
            if (wasNull()) {
                return getNextToken();
            }
            throw newParseErrorAt("Expecting 'null' for null constant", 0);
        } else if (b11 == 116) {
            if (wasTrue()) {
                return getNextToken();
            }
            throw newParseErrorAt("Expecting 'true' for true constant", 0);
        } else if (b11 == 102) {
            if (wasFalse()) {
                return getNextToken();
            }
            throw newParseErrorAt("Expecting 'false' for false constant", 0);
        } else {
            while (true) {
                b10 = this.last;
                if (b10 == 44 || b10 == 125 || b10 == 93) {
                    break;
                }
                read();
            }
            return b10;
        }
    }

    public final void startArray() {
        if (getNextToken() != 91) {
            if (this.currentIndex >= this.length) {
                throw newParseErrorAt("Unexpected end in JSON", 0, eof);
            }
            throw newParseError("Expecting '[' as array start");
        }
    }

    public final void startAttribute(String str) {
        while (getNextToken() == 34) {
            fillNameWeakHash();
            if (wasLastName(str)) {
                return;
            }
            getNextToken();
            if (skip() != 44) {
                throw newParseErrorWith("Unable to find attribute", str);
            }
        }
        throw newParseError("Expecting '\"' as attribute start");
    }

    public final void startObject() {
        if (getNextToken() != 123) {
            if (this.currentIndex >= this.length) {
                throw newParseErrorAt("Unexpected end in JSON", 0, eof);
            }
            throw newParseError("Expecting '{' as object start");
        }
    }

    public String toString() {
        return new String(this.buffer, 0, this.length, utf8);
    }

    public final boolean wasFalse() {
        if (this.last != 102) {
            return false;
        }
        int i6 = this.currentIndex;
        if (i6 + 3 < this.length) {
            byte[] bArr = this.buffer;
            if (bArr[i6] == 97 && bArr[i6 + 1] == 108 && bArr[i6 + 2] == 115 && bArr[i6 + 3] == 101) {
                this.currentIndex = i6 + 4;
                this.last = (byte) 101;
                return true;
            }
        }
        throw newParseErrorAt("Invalid false constant found", 0);
    }

    public final boolean wasLastName(String str) {
        if (this.stream != null && this.nameEnd == -1) {
            if (str.length() != this.lastNameLen) {
                return false;
            }
            for (int i6 = 0; i6 < str.length(); i6++) {
                if (str.charAt(i6) != this.chars[i6]) {
                    return false;
                }
            }
            return true;
        } else if (str.length() != (this.nameEnd - this.tokenStart) - 1) {
            return false;
        } else {
            for (int i10 = 0; i10 < str.length(); i10++) {
                if (str.charAt(i10) != this.buffer[this.tokenStart + i10]) {
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean wasNull() {
        if (this.last != 110) {
            return false;
        }
        int i6 = this.currentIndex;
        if (i6 + 2 < this.length) {
            byte[] bArr = this.buffer;
            if (bArr[i6] == 117 && bArr[i6 + 1] == 108 && bArr[i6 + 2] == 108) {
                this.currentIndex = i6 + 3;
                this.last = (byte) 108;
                return true;
            }
        }
        throw newParseErrorAt("Invalid null constant found", 0);
    }

    public final boolean wasTrue() {
        if (this.last != 116) {
            return false;
        }
        int i6 = this.currentIndex;
        if (i6 + 2 < this.length) {
            byte[] bArr = this.buffer;
            if (bArr[i6] == 114 && bArr[i6 + 1] == 117 && bArr[i6 + 2] == 101) {
                this.currentIndex = i6 + 3;
                this.last = (byte) 101;
                return true;
            }
        }
        throw newParseErrorAt("Invalid true constant found", 0);
    }

    public boolean withStackTrace() {
        if (this.errorInfo == ErrorInfo.WITH_STACK_TRACE) {
            return true;
        }
        return false;
    }

    public final <T extends JsonObject> java.util.Iterator<T> iterateOver(ReadJsonObject<T> readJsonObject) {
        return new WithObjectReader(readJsonObject, this);
    }

    public final ParsingException newParseError(String str, int i6) {
        if (this.errorInfo == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, false);
        }
        this.error.setLength(0);
        this.error.append(str);
        this.error.append(". Found ");
        this.error.append((char) this.last);
        if (this.errorInfo == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.create(this.error.toString(), false);
        }
        this.error.append(" ");
        positionDescription(i6, this.error);
        return ParsingException.create(this.error.toString(), withStackTrace());
    }

    public final ParsingException newParseErrorWith(String str, int i6, String str2, String str3, Object obj, String str4) {
        if (this.errorInfo == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, false);
        }
        this.error.setLength(0);
        this.error.append(str2);
        this.error.append(str3);
        if (obj != null) {
            this.error.append(": '");
            this.error.append(obj.toString());
            this.error.append("'");
        }
        this.error.append(str4);
        if (this.errorInfo == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.create(this.error.toString(), false);
        }
        this.error.append(" ");
        positionDescription(i6, this.error);
        return ParsingException.create(this.error.toString(), withStackTrace());
    }

    public String positionDescription(int i6) {
        StringBuilder sb2 = new StringBuilder(60);
        positionDescription(i6, sb2);
        return sb2.toString();
    }

    public final long positionInStream(int i6) {
        return (this.currentPosition + this.currentIndex) - i6;
    }

    @Deprecated
    public final void reset(int i6) {
        process(null, i6);
    }

    public final StringBuffer appendString(StringBuffer stringBuffer) {
        stringBuffer.append(this.chars, 0, parseString());
        return stringBuffer;
    }

    public final <T, S extends T> void deserializeCollection(ReadObject<S> readObject, Collection<T> collection) {
        collection.add(readObject.read(this));
        while (getNextToken() == 44) {
            getNextToken();
            collection.add(readObject.read(this));
        }
        checkArrayEnd();
    }

    public final <T, S extends T> void deserializeNullableCollection(ReadObject<S> readObject, Collection<T> collection) {
        if (wasNull()) {
            collection.add(null);
        } else {
            collection.add(readObject.read(this));
        }
        while (getNextToken() == 44) {
            getNextToken();
            if (wasNull()) {
                collection.add(null);
            } else {
                collection.add(readObject.read(this));
            }
        }
        checkArrayEnd();
    }

    public final void reset() {
        this.buffer = this.originalBuffer;
        this.bufferLenWithExtraSpace = this.originalBufferLenWithExtraSpace;
        this.currentIndex = 0;
        this.length = 0;
        this.readLimit = 0;
        this.stream = null;
    }

    private void positionDescription(int i6, StringBuilder sb2) {
        sb2.append("at position: ");
        sb2.append(positionInStream(i6));
        int i10 = this.currentIndex;
        if (i10 > i6) {
            try {
                int min = Math.min(i10 - i6, 20);
                String str = new String(this.buffer, (this.currentIndex - i6) - min, min, utf8);
                sb2.append(", following: `");
                sb2.append(str);
                sb2.append('`');
            } catch (Exception unused) {
            }
        }
        int i11 = this.currentIndex;
        int i12 = i11 - i6;
        int i13 = this.readLimit;
        if (i12 < i13) {
            try {
                String str2 = new String(this.buffer, this.currentIndex - i6, Math.min((i13 - i11) + i6, 20), utf8);
                sb2.append(", before: `");
                sb2.append(str2);
                sb2.append('`');
            } catch (Exception unused2) {
            }
        }
    }

    public final <T extends JsonObject> ArrayList<T> deserializeCollection(ReadJsonObject<T> readJsonObject) {
        ArrayList<T> arrayList = new ArrayList<>(4);
        deserializeCollection(readJsonObject, arrayList);
        return arrayList;
    }

    public final ParsingException newParseErrorAt(String str, int i6, Exception exc) {
        if (exc != null) {
            if (this.errorInfo == ErrorInfo.MINIMAL) {
                return ParsingException.create(str, exc, false);
            }
            this.error.setLength(0);
            String message = exc.getMessage();
            if (message != null && message.length() > 0) {
                this.error.append(message);
                if (!message.endsWith(".")) {
                    this.error.append(".");
                }
                this.error.append(" ");
            }
            this.error.append(str);
            if (this.errorInfo == ErrorInfo.DESCRIPTION_ONLY) {
                return ParsingException.create(this.error.toString(), exc, false);
            }
            this.error.append(" ");
            positionDescription(i6, this.error);
            return ParsingException.create(this.error.toString(), withStackTrace());
        }
        throw new IllegalArgumentException("cause can't be null");
    }

    public final JsonReader<TContext> process(byte[] bArr, int i6) {
        if (bArr != null) {
            this.buffer = bArr;
            this.bufferLenWithExtraSpace = bArr.length - 38;
        }
        if (i6 <= this.buffer.length) {
            this.currentIndex = 0;
            this.length = i6;
            this.stream = null;
            this.readLimit = i6;
            return this;
        }
        throw new IllegalArgumentException("length can't be longer than buffer.length");
    }

    public final boolean wasLastName(byte[] bArr) {
        if (this.stream != null && this.nameEnd == -1) {
            if (bArr.length != this.lastNameLen) {
                return false;
            }
            for (int i6 = 0; i6 < bArr.length; i6++) {
                if (bArr[i6] != this.chars[i6]) {
                    return false;
                }
            }
            return true;
        } else if (bArr.length != (this.nameEnd - this.tokenStart) - 1) {
            return false;
        } else {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr[i10] != this.buffer[this.tokenStart + i10]) {
                    return false;
                }
            }
            return true;
        }
    }

    public final <T extends JsonObject> void deserializeCollection(ReadJsonObject<T> readJsonObject, Collection<T> collection) {
        if (this.last == 123) {
            getNextToken();
            collection.add(readJsonObject.deserialize(this));
            while (getNextToken() == 44) {
                if (getNextToken() == 123) {
                    getNextToken();
                    collection.add(readJsonObject.deserialize(this));
                } else {
                    throw newParseError("Expecting '{' as object start within a collection");
                }
            }
            checkArrayEnd();
            return;
        }
        throw newParseError("Expecting '{' as collection start");
    }

    public final <T extends JsonObject> ArrayList<T> deserializeNullableCollection(ReadJsonObject<T> readJsonObject) {
        ArrayList<T> arrayList = new ArrayList<>(4);
        deserializeNullableCollection(readJsonObject, arrayList);
        return arrayList;
    }

    public final <T extends JsonObject> void deserializeNullableCollection(ReadJsonObject<T> readJsonObject, Collection<T> collection) {
        if (this.last == 123) {
            getNextToken();
            collection.add(readJsonObject.deserialize(this));
        } else if (wasNull()) {
            collection.add(null);
        } else {
            throw newParseError("Expecting '{' as collection start");
        }
        while (getNextToken() == 44) {
            if (getNextToken() == 123) {
                getNextToken();
                collection.add(readJsonObject.deserialize(this));
            } else if (wasNull()) {
                collection.add(null);
            } else {
                throw newParseError("Expecting '{' as object start within a collection");
            }
        }
        checkArrayEnd();
    }

    public final <T> T next(ReadObject<T> readObject) {
        if (readObject != null) {
            if (getNextToken() == 110) {
                if (wasNull()) {
                    return null;
                }
                throw newParseErrorAt("Expecting 'null' as null constant", 0);
            }
            return readObject.read(this);
        }
        throw new IllegalArgumentException("reader can't be null");
    }

    /* loaded from: classes.dex */
    public static class WithReader<T> implements java.util.Iterator<T>, j$.util.Iterator {
        private boolean hasNext = true;
        private final JsonReader json;
        private final ReadObject<T> reader;

        public WithReader(ReadObject<T> readObject, JsonReader jsonReader) {
            this.reader = readObject;
            this.json = jsonReader;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            T read;
            try {
                boolean z10 = false;
                if (this.json.last() == 110) {
                    if (this.json.wasNull()) {
                        read = null;
                    } else {
                        throw this.json.newParseErrorAt("Expecting 'null' as null constant", 0);
                    }
                } else {
                    read = this.reader.read(this.json);
                }
                if (this.json.getNextToken() == 44) {
                    z10 = true;
                }
                this.hasNext = z10;
                if (z10) {
                    this.json.getNextToken();
                } else if (this.json.last() != 93) {
                    throw this.json.newParseError("Expecting ']' for iteration end");
                }
                return read;
            } catch (IOException e10) {
                throw new SerializationException(e10);
            }
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
        }
    }

    public final <T> T next(Class<T> cls, T t3) {
        if (cls != null) {
            if (t3 != null) {
                if (this.typeLookup != null) {
                    if (getNextToken() == 110) {
                        return (T) readNull(cls);
                    }
                    BindObject<T> tryFindBinder = this.typeLookup.tryFindBinder(cls);
                    if (tryFindBinder != null) {
                        return tryFindBinder.bind(this, t3);
                    }
                    throw new ConfigurationException("Binder not found for " + cls + ". Check if binder was registered");
                }
                throw new ConfigurationException(b.l("typeLookup is not defined for this JsonReader. Unable to lookup specified type ", cls));
            }
            throw new IllegalArgumentException("instance can't be null");
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    @Deprecated
    public JsonReader(byte[] bArr, TContext tcontext) {
        this(bArr, tcontext, (StringCache) null, (StringCache) null);
    }

    @Deprecated
    public JsonReader(byte[] bArr, TContext tcontext, StringCache stringCache, StringCache stringCache2) {
        this(bArr, bArr.length, tcontext, new char[64], stringCache, stringCache2);
    }

    @Deprecated
    public JsonReader(byte[] bArr, TContext tcontext, char[] cArr) {
        this(bArr, bArr.length, tcontext, cArr);
        if (cArr == null) {
            throw new IllegalArgumentException("tmp buffer provided as null.");
        }
    }

    @Deprecated
    public JsonReader(byte[] bArr, int i6, TContext tcontext) {
        this(bArr, i6, tcontext, new char[64]);
    }

    @Deprecated
    public JsonReader(byte[] bArr, int i6, TContext tcontext, char[] cArr) {
        this(bArr, i6, tcontext, cArr, null, null);
    }

    @Deprecated
    public JsonReader(byte[] bArr, int i6, TContext tcontext, char[] cArr, StringCache stringCache, StringCache stringCache2) {
        this(cArr, bArr, i6, tcontext, stringCache, stringCache2, (TypeLookup) null, ErrorInfo.WITH_STACK_TRACE, DoublePrecision.DEFAULT, UnknownNumberParsing.LONG_AND_BIGDECIMAL, 512, 268435456);
        if (cArr != null) {
            if (i6 <= bArr.length) {
                if (i6 < bArr.length) {
                    bArr[i6] = 0;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("length can't be longer than buffer.length");
        }
        throw new IllegalArgumentException("tmp buffer provided as null.");
    }

    public final <T> T next(BindObject<T> bindObject, T t3) {
        if (bindObject != null) {
            if (t3 != null) {
                if (getNextToken() == 110) {
                    if (wasNull()) {
                        return null;
                    }
                    throw newParseErrorAt("Expecting 'null' as null constant", 0);
                }
                return bindObject.bind(this, t3);
            }
            throw new IllegalArgumentException("instance can't be null");
        }
        throw new IllegalArgumentException("binder can't be null");
    }

    public JsonReader(byte[] bArr, int i6, TContext tcontext, char[] cArr, StringCache stringCache, StringCache stringCache2, TypeLookup typeLookup, ErrorInfo errorInfo, DoublePrecision doublePrecision, UnknownNumberParsing unknownNumberParsing, int i10, int i11) {
        this(cArr, bArr, i6, tcontext, stringCache, stringCache2, typeLookup, errorInfo, doublePrecision, unknownNumberParsing, i10, i11);
        if (cArr != null) {
            if (i6 <= bArr.length) {
                if (i6 < bArr.length) {
                    bArr[i6] = 0;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("length can't be longer than buffer.length");
        }
        throw new IllegalArgumentException("tmp buffer provided as null.");
    }
}
