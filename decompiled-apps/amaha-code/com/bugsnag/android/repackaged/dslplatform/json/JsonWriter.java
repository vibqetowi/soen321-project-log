package com.bugsnag.android.repackaged.dslplatform.json;

import com.appsflyer.R;
import com.bugsnag.android.repackaged.dslplatform.json.Grisu3;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class JsonWriter {
    public static final byte ARRAY_END = 93;
    public static final byte ARRAY_START = 91;
    public static final byte COMMA = 44;
    public static final byte ESCAPE = 92;
    public static final byte OBJECT_END = 125;
    public static final byte OBJECT_START = 123;
    public static final byte QUOTE = 34;
    public static final byte SEMI = 58;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private byte[] buffer;
    private final Grisu3.FastDtoaBuilder doubleBuilder;
    private long flushed;
    private int position;
    private OutputStream target;
    private final UnknownSerializer unknownSerializer;

    /* loaded from: classes.dex */
    public interface WriteObject<T> {
        void write(JsonWriter jsonWriter, T t3);
    }

    @Deprecated
    public JsonWriter() {
        this(512, (UnknownSerializer) null);
    }

    private void enlargeOrFlush(int i6, int i10) {
        OutputStream outputStream = this.target;
        if (outputStream != null) {
            try {
                outputStream.write(this.buffer, 0, i6);
                this.position = 0;
                this.flushed += i6;
                byte[] bArr = this.buffer;
                if (i10 > bArr.length) {
                    this.buffer = Arrays.copyOf(bArr, (bArr.length / 2) + bArr.length + i10);
                    return;
                }
                return;
            } catch (IOException e10) {
                throw new SerializationException("Unable to write to target stream.", e10);
            }
        }
        byte[] bArr2 = this.buffer;
        this.buffer = Arrays.copyOf(bArr2, (bArr2.length / 2) + bArr2.length + i10);
    }

    private void writeQuotedString(CharSequence charSequence, int i6, int i10, int i11) {
        int i12;
        byte[] bArr = this.buffer;
        int i13 = i6;
        int i14 = i10;
        while (i13 < i11) {
            char charAt = charSequence.charAt(i13);
            if (charAt == '\"') {
                int i15 = i14 + 1;
                bArr[i14] = ESCAPE;
                i14 = i15 + 1;
                bArr[i15] = QUOTE;
            } else if (charAt == '\\') {
                int i16 = i14 + 1;
                bArr[i14] = ESCAPE;
                i14 = i16 + 1;
                bArr[i16] = ESCAPE;
            } else if (charAt < ' ') {
                if (charAt == '\b') {
                    int i17 = i14 + 1;
                    bArr[i14] = ESCAPE;
                    i14 = i17 + 1;
                    bArr[i17] = 98;
                } else if (charAt == '\t') {
                    int i18 = i14 + 1;
                    bArr[i14] = ESCAPE;
                    i14 = i18 + 1;
                    bArr[i18] = 116;
                } else if (charAt == '\n') {
                    int i19 = i14 + 1;
                    bArr[i14] = ESCAPE;
                    i14 = i19 + 1;
                    bArr[i19] = 110;
                } else if (charAt == '\f') {
                    int i20 = i14 + 1;
                    bArr[i14] = ESCAPE;
                    i14 = i20 + 1;
                    bArr[i20] = 102;
                } else if (charAt == '\r') {
                    int i21 = i14 + 1;
                    bArr[i14] = ESCAPE;
                    i14 = i21 + 1;
                    bArr[i21] = 114;
                } else {
                    bArr[i14] = ESCAPE;
                    bArr[i14 + 1] = 117;
                    bArr[i14 + 2] = 48;
                    bArr[i14 + 3] = 48;
                    switch (charAt) {
                        case 0:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 48;
                            break;
                        case 1:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 49;
                            break;
                        case 2:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 50;
                            break;
                        case 3:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 51;
                            break;
                        case 4:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 52;
                            break;
                        case 5:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 53;
                            break;
                        case 6:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 54;
                            break;
                        case 7:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 55;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                        default:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 70;
                            break;
                        case 11:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 66;
                            break;
                        case 14:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 69;
                            break;
                        case 15:
                            bArr[i14 + 4] = 48;
                            bArr[i14 + 5] = 70;
                            break;
                        case 16:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 48;
                            break;
                        case 17:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 49;
                            break;
                        case 18:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 50;
                            break;
                        case 19:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 51;
                            break;
                        case 20:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 52;
                            break;
                        case 21:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 53;
                            break;
                        case 22:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 54;
                            break;
                        case 23:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 55;
                            break;
                        case 24:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 56;
                            break;
                        case 25:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 57;
                            break;
                        case 26:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 65;
                            break;
                        case 27:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 66;
                            break;
                        case 28:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 67;
                            break;
                        case 29:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 68;
                            break;
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            bArr[i14 + 4] = 49;
                            bArr[i14 + 5] = 69;
                            break;
                    }
                    i14 += 6;
                }
            } else {
                if (charAt < 127) {
                    i12 = i14 + 1;
                    bArr[i14] = (byte) charAt;
                } else {
                    int codePointAt = Character.codePointAt(charSequence, i13);
                    if (Character.isSupplementaryCodePoint(codePointAt)) {
                        i13++;
                    }
                    if (codePointAt == 127) {
                        i12 = i14 + 1;
                        bArr[i14] = (byte) codePointAt;
                    } else if (codePointAt <= 2047) {
                        int i22 = i14 + 1;
                        bArr[i14] = (byte) (((codePointAt >> 6) & 31) | 192);
                        i14 = i22 + 1;
                        bArr[i22] = (byte) ((codePointAt & 63) | 128);
                    } else if (codePointAt >= 55296 && (codePointAt <= 57343 || codePointAt > 65535)) {
                        if (codePointAt >= 65536 && codePointAt <= 1114111) {
                            int i23 = i14 + 1;
                            bArr[i14] = (byte) (((codePointAt >> 18) & 7) | 240);
                            int i24 = i23 + 1;
                            bArr[i23] = (byte) (((codePointAt >> 12) & 63) | 128);
                            int i25 = i24 + 1;
                            bArr[i24] = (byte) (((codePointAt >> 6) & 63) | 128);
                            i14 = i25 + 1;
                            bArr[i25] = (byte) ((codePointAt & 63) | 128);
                        } else {
                            throw new SerializationException("Unknown unicode codepoint in string! " + Integer.toHexString(codePointAt));
                        }
                    } else {
                        int i26 = i14 + 1;
                        bArr[i14] = (byte) (((codePointAt >> 12) & 15) | 224);
                        int i27 = i26 + 1;
                        bArr[i26] = (byte) (((codePointAt >> 6) & 63) | 128);
                        i12 = i27 + 1;
                        bArr[i27] = (byte) ((codePointAt & 63) | 128);
                    }
                }
                i14 = i12;
            }
            i13++;
        }
        bArr[i14] = QUOTE;
        this.position = i14 + 1;
    }

    public void advance(int i6) {
        this.position += i6;
    }

    @Deprecated
    public void close() {
        int i6;
        OutputStream outputStream = this.target;
        if (outputStream != null && (i6 = this.position) != 0) {
            outputStream.write(this.buffer, 0, i6);
            this.position = 0;
            this.flushed = 0L;
        }
    }

    public final byte[] ensureCapacity(int i6) {
        int i10 = this.position;
        if (i10 + i6 >= this.buffer.length) {
            enlargeOrFlush(i10, i6);
        }
        return this.buffer;
    }

    public final void flush() {
        int i6;
        OutputStream outputStream = this.target;
        if (outputStream != null && (i6 = this.position) != 0) {
            try {
                outputStream.write(this.buffer, 0, i6);
                this.flushed += this.position;
                this.position = 0;
            } catch (IOException e10) {
                throw new SerializationException("Unable to write to target stream.", e10);
            }
        }
    }

    public final long flushed() {
        return this.flushed;
    }

    public final byte[] getByteBuffer() {
        return this.buffer;
    }

    public final void reset() {
        reset(null);
    }

    public <T extends JsonObject> void serialize(T[] tArr) {
        writeByte(ARRAY_START);
        if (tArr.length != 0) {
            tArr[0].serialize(this, false);
            for (int i6 = 1; i6 < tArr.length; i6++) {
                writeByte(COMMA);
                tArr[i6].serialize(this, false);
            }
        }
        writeByte(ARRAY_END);
    }

    public void serializeObject(Object obj) {
        if (obj == null) {
            writeNull();
            return;
        }
        UnknownSerializer unknownSerializer = this.unknownSerializer;
        if (unknownSerializer != null) {
            try {
                unknownSerializer.serialize(this, obj);
                return;
            } catch (IOException e10) {
                throw new SerializationException(e10);
            }
        }
        throw new ConfigurationException("Unable to serialize: " + obj.getClass() + ".\nCheck that JsonWriter was created through DslJson#newWriter.");
    }

    public void serializeRaw(List list, WriteObject writeObject) {
        serialize(list, writeObject);
    }

    public final int size() {
        return this.position;
    }

    public final byte[] toByteArray() {
        if (this.target == null) {
            return Arrays.copyOf(this.buffer, this.position);
        }
        throw new ConfigurationException("Method is not available when targeting stream");
    }

    public final void toStream(OutputStream outputStream) {
        if (this.target == null) {
            outputStream.write(this.buffer, 0, this.position);
            this.flushed += this.position;
            this.position = 0;
            return;
        }
        throw new ConfigurationException("Method should not be used when targeting streams. Instead use flush() to copy what's remaining in the buffer");
    }

    public String toString() {
        return new String(this.buffer, 0, this.position, UTF_8);
    }

    public final void writeAscii(String str) {
        int length = str.length();
        int i6 = this.position;
        if (i6 + length >= this.buffer.length) {
            enlargeOrFlush(i6, length);
        }
        str.getBytes(0, length, this.buffer, this.position);
        this.position += length;
    }

    public final void writeBinary(byte[] bArr) {
        int i6 = this.position;
        if ((bArr.length << 1) + i6 + 2 >= this.buffer.length) {
            enlargeOrFlush(i6, (bArr.length << 1) + 2);
        }
        byte[] bArr2 = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        bArr2[i10] = QUOTE;
        int encodeToBytes = i11 + Base64.encodeToBytes(bArr, bArr2, i11);
        byte[] bArr3 = this.buffer;
        this.position = encodeToBytes + 1;
        bArr3[encodeToBytes] = QUOTE;
    }

    public final void writeByte(byte b10) {
        int i6 = this.position;
        if (i6 == this.buffer.length) {
            enlargeOrFlush(i6, 0);
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        bArr[i10] = b10;
    }

    public final void writeDouble(double d10) {
        if (d10 == Double.POSITIVE_INFINITY) {
            writeAscii("\"Infinity\"");
        } else if (d10 == Double.NEGATIVE_INFINITY) {
            writeAscii("\"-Infinity\"");
        } else if (d10 != d10) {
            writeAscii("\"NaN\"");
        } else if (d10 == 0.0d) {
            writeAscii("0.0");
        } else if (Grisu3.tryConvert(d10, this.doubleBuilder)) {
            int i6 = this.position;
            if (i6 + 24 >= this.buffer.length) {
                enlargeOrFlush(i6, 24);
            }
            this.position += this.doubleBuilder.copyTo(this.buffer, this.position);
        } else {
            writeAscii(Double.toString(d10));
        }
    }

    public final void writeNull() {
        int i6 = this.position;
        if (i6 + 4 >= this.buffer.length) {
            enlargeOrFlush(i6, 0);
        }
        int i10 = this.position;
        byte[] bArr = this.buffer;
        bArr[i10] = 110;
        bArr[i10 + 1] = 117;
        bArr[i10 + 2] = 108;
        bArr[i10 + 3] = 108;
        this.position = i10 + 4;
    }

    public <T> void writeQuoted(WriteObject<T> writeObject, T t3) {
        if (t3 instanceof Double) {
            double doubleValue = ((Double) t3).doubleValue();
            if (Double.isNaN(doubleValue)) {
                writeAscii("\"NaN\"");
            } else if (doubleValue == Double.POSITIVE_INFINITY) {
                writeAscii("\"Infinity\"");
            } else if (doubleValue == Double.NEGATIVE_INFINITY) {
                writeAscii("\"-Infinity\"");
            } else {
                writeByte(QUOTE);
                NumberConverter.serialize(doubleValue, this);
                writeByte(QUOTE);
            }
        } else if (t3 instanceof Float) {
            float floatValue = ((Float) t3).floatValue();
            if (Float.isNaN(floatValue)) {
                writeAscii("\"NaN\"");
            } else if (floatValue == Float.POSITIVE_INFINITY) {
                writeAscii("\"Infinity\"");
            } else if (floatValue == Float.NEGATIVE_INFINITY) {
                writeAscii("\"-Infinity\"");
            } else {
                writeByte(QUOTE);
                NumberConverter.serialize(floatValue, this);
                writeByte(QUOTE);
            }
        } else if (t3 instanceof Number) {
            writeByte(QUOTE);
            writeObject.write(this, t3);
            writeByte(QUOTE);
        } else {
            writeObject.write(this, t3);
        }
    }

    public final void writeRaw(byte[] bArr, int i6, int i10) {
        int i11 = this.position;
        if (i11 + i10 >= this.buffer.length) {
            enlargeOrFlush(i11, i10);
        }
        System.arraycopy(bArr, i6, this.buffer, this.position, i10);
        this.position += i10;
    }

    public final void writeString(String str) {
        int length = str.length();
        int i6 = this.position;
        int i10 = length << 2;
        int i11 = length << 1;
        if (i6 + i10 + i11 + 2 >= this.buffer.length) {
            enlargeOrFlush(i6, i10 + i11 + 2);
        }
        byte[] bArr = this.buffer;
        int i12 = this.position;
        bArr[i12] = QUOTE;
        int i13 = i12 + 1;
        int i14 = 0;
        while (i14 < length) {
            char charAt = str.charAt(i14);
            if (charAt > 31 && charAt != '\"' && charAt != '\\' && charAt < '~') {
                bArr[i13] = (byte) charAt;
                i14++;
                i13++;
            } else {
                writeQuotedString(str, i14, i13, length);
                return;
            }
        }
        bArr[i13] = QUOTE;
        this.position = i13 + 1;
    }

    public JsonWriter(UnknownSerializer unknownSerializer) {
        this(512, unknownSerializer);
    }

    public final void reset(OutputStream outputStream) {
        this.position = 0;
        this.target = outputStream;
        this.flushed = 0L;
    }

    public void serializeRaw(Collection collection, WriteObject writeObject) {
        serialize(collection, writeObject);
    }

    public JsonWriter(int i6, UnknownSerializer unknownSerializer) {
        this(new byte[i6], unknownSerializer);
    }

    public void serializeRaw(Map map, WriteObject writeObject, WriteObject writeObject2) {
        serialize(map, writeObject, writeObject2);
    }

    public JsonWriter(byte[] bArr, UnknownSerializer unknownSerializer) {
        this.doubleBuilder = new Grisu3.FastDtoaBuilder();
        this.buffer = bArr;
        this.unknownSerializer = unknownSerializer;
    }

    public final void writeAscii(String str, int i6) {
        int i10 = this.position;
        if (i10 + i6 >= this.buffer.length) {
            enlargeOrFlush(i10, i6);
        }
        str.getBytes(0, i6, this.buffer, this.position);
        this.position += i6;
    }

    public <T extends JsonObject> void serialize(T[] tArr, int i6) {
        writeByte(ARRAY_START);
        if (tArr.length != 0 && i6 != 0) {
            tArr[0].serialize(this, false);
            for (int i10 = 1; i10 < i6; i10++) {
                writeByte(COMMA);
                tArr[i10].serialize(this, false);
            }
        }
        writeByte(ARRAY_END);
    }

    public final void writeAscii(byte[] bArr) {
        int length = bArr.length;
        int i6 = this.position;
        if (i6 + length >= this.buffer.length) {
            enlargeOrFlush(i6, length);
        }
        int i10 = this.position;
        byte[] bArr2 = this.buffer;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr2[i10 + i11] = bArr[i11];
        }
        this.position += length;
    }

    public final void writeString(CharSequence charSequence) {
        int length = charSequence.length();
        int i6 = this.position;
        int i10 = length << 2;
        int i11 = length << 1;
        if (i6 + i10 + i11 + 2 >= this.buffer.length) {
            enlargeOrFlush(i6, i10 + i11 + 2);
        }
        byte[] bArr = this.buffer;
        int i12 = this.position;
        bArr[i12] = QUOTE;
        int i13 = i12 + 1;
        int i14 = 0;
        while (i14 < length) {
            char charAt = charSequence.charAt(i14);
            if (charAt > 31 && charAt != '\"' && charAt != '\\' && charAt < '~') {
                bArr[i13] = (byte) charAt;
                i14++;
                i13++;
            } else {
                writeQuotedString(charSequence, i14, i13, length);
                return;
            }
        }
        bArr[i13] = QUOTE;
        this.position = i13 + 1;
    }

    public <T extends JsonObject> void serialize(List<T> list) {
        writeByte(ARRAY_START);
        if (list.size() != 0) {
            list.get(0).serialize(this, false);
            for (int i6 = 1; i6 < list.size(); i6++) {
                writeByte(COMMA);
                list.get(i6).serialize(this, false);
            }
        }
        writeByte(ARRAY_END);
    }

    public final void writeAscii(byte[] bArr, int i6) {
        int i10 = this.position;
        if (i10 + i6 >= this.buffer.length) {
            enlargeOrFlush(i10, i6);
        }
        int i11 = this.position;
        byte[] bArr2 = this.buffer;
        for (int i12 = 0; i12 < i6; i12++) {
            bArr2[i11 + i12] = bArr[i12];
        }
        this.position += i6;
    }

    public <T> void serialize(T[] tArr, WriteObject<T> writeObject) {
        if (tArr == null) {
            writeNull();
            return;
        }
        writeByte(ARRAY_START);
        if (tArr.length != 0) {
            T t3 = tArr[0];
            if (t3 != null) {
                writeObject.write(this, t3);
            } else {
                writeNull();
            }
            for (int i6 = 1; i6 < tArr.length; i6++) {
                writeByte(COMMA);
                T t10 = tArr[i6];
                if (t10 != null) {
                    writeObject.write(this, t10);
                } else {
                    writeNull();
                }
            }
        }
        writeByte(ARRAY_END);
    }

    public <T> void serialize(List<T> list, WriteObject<T> writeObject) {
        if (list == null) {
            writeNull();
            return;
        }
        writeByte(ARRAY_START);
        if (!list.isEmpty()) {
            if (list instanceof RandomAccess) {
                T t3 = list.get(0);
                if (t3 != null) {
                    writeObject.write(this, t3);
                } else {
                    writeNull();
                }
                for (int i6 = 1; i6 < list.size(); i6++) {
                    writeByte(COMMA);
                    T t10 = list.get(i6);
                    if (t10 != null) {
                        writeObject.write(this, t10);
                    } else {
                        writeNull();
                    }
                }
            } else {
                Iterator<T> it = list.iterator();
                T next = it.next();
                if (next != null) {
                    writeObject.write(this, next);
                } else {
                    writeNull();
                }
                while (it.hasNext()) {
                    writeByte(COMMA);
                    T next2 = it.next();
                    if (next2 != null) {
                        writeObject.write(this, next2);
                    } else {
                        writeNull();
                    }
                }
            }
        }
        writeByte(ARRAY_END);
    }

    public <T> void serialize(Collection<T> collection, WriteObject<T> writeObject) {
        if (collection == null) {
            writeNull();
            return;
        }
        writeByte(ARRAY_START);
        if (!collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            T next = it.next();
            if (next != null) {
                writeObject.write(this, next);
            } else {
                writeNull();
            }
            while (it.hasNext()) {
                writeByte(COMMA);
                T next2 = it.next();
                if (next2 != null) {
                    writeObject.write(this, next2);
                } else {
                    writeNull();
                }
            }
        }
        writeByte(ARRAY_END);
    }

    public <K, V> void serialize(Map<K, V> map, WriteObject<K> writeObject, WriteObject<V> writeObject2) {
        if (map == null) {
            writeNull();
            return;
        }
        writeByte(OBJECT_START);
        int size = map.size();
        if (size > 0) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            Map.Entry<K, V> next = it.next();
            writeQuoted(writeObject, next.getKey());
            writeByte(SEMI);
            writeObject2.write(this, next.getValue());
            for (int i6 = 1; i6 < size; i6++) {
                writeByte(COMMA);
                Map.Entry<K, V> next2 = it.next();
                writeQuoted(writeObject, next2.getKey());
                writeByte(SEMI);
                writeObject2.write(this, next2.getValue());
            }
        }
        writeByte(OBJECT_END);
    }
}
