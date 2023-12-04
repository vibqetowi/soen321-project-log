package androidx.camera.core.impl.utils;

import androidx.camera.core.Logger;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExifAttribute {
    public static final long BYTES_OFFSET_UNKNOWN = -1;
    static final int IFD_FORMAT_BYTE = 1;
    static final int IFD_FORMAT_DOUBLE = 12;
    static final int IFD_FORMAT_SBYTE = 6;
    static final int IFD_FORMAT_SINGLE = 11;
    static final int IFD_FORMAT_SLONG = 9;
    static final int IFD_FORMAT_SRATIONAL = 10;
    static final int IFD_FORMAT_SSHORT = 8;
    static final int IFD_FORMAT_STRING = 2;
    static final int IFD_FORMAT_ULONG = 4;
    static final int IFD_FORMAT_UNDEFINED = 7;
    static final int IFD_FORMAT_URATIONAL = 5;
    static final int IFD_FORMAT_USHORT = 3;
    private static final String TAG = "ExifAttribute";
    public final byte[] bytes;
    public final long bytesOffset;
    public final int format;
    public final int numberOfComponents;
    static final Charset ASCII = StandardCharsets.US_ASCII;
    static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] EXIF_ASCII_PREFIX = {65, 83, 67, 73, 73, 0, 0, 0};

    ExifAttribute(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    ExifAttribute(int i, int i2, long j, byte[] bArr) {
        this.format = i;
        this.numberOfComponents = i2;
        this.bytesOffset = j;
        this.bytes = bArr;
    }

    public static ExifAttribute createUShort(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new ExifAttribute(3, iArr.length, wrap.array());
    }

    public static ExifAttribute createUShort(int i, ByteOrder byteOrder) {
        return createUShort(new int[]{i}, byteOrder);
    }

    public static ExifAttribute createULong(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new ExifAttribute(4, jArr.length, wrap.array());
    }

    public static ExifAttribute createULong(long j, ByteOrder byteOrder) {
        return createULong(new long[]{j}, byteOrder);
    }

    public static ExifAttribute createSLong(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putInt(i);
        }
        return new ExifAttribute(9, iArr.length, wrap.array());
    }

    public static ExifAttribute createSLong(int i, ByteOrder byteOrder) {
        return createSLong(new int[]{i}, byteOrder);
    }

    public static ExifAttribute createByte(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(ASCII);
        return new ExifAttribute(1, bytes.length, bytes);
    }

    public static ExifAttribute createString(String str) {
        byte[] bytes = (str + (char) 0).getBytes(ASCII);
        return new ExifAttribute(2, bytes.length, bytes);
    }

    public static ExifAttribute createURational(LongRational[] longRationalArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[5] * longRationalArr.length]);
        wrap.order(byteOrder);
        for (LongRational longRational : longRationalArr) {
            wrap.putInt((int) longRational.getNumerator());
            wrap.putInt((int) longRational.getDenominator());
        }
        return new ExifAttribute(5, longRationalArr.length, wrap.array());
    }

    public static ExifAttribute createURational(LongRational longRational, ByteOrder byteOrder) {
        return createURational(new LongRational[]{longRational}, byteOrder);
    }

    public static ExifAttribute createSRational(LongRational[] longRationalArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[10] * longRationalArr.length]);
        wrap.order(byteOrder);
        for (LongRational longRational : longRationalArr) {
            wrap.putInt((int) longRational.getNumerator());
            wrap.putInt((int) longRational.getDenominator());
        }
        return new ExifAttribute(10, longRationalArr.length, wrap.array());
    }

    public static ExifAttribute createSRational(LongRational longRational, ByteOrder byteOrder) {
        return createSRational(new LongRational[]{longRational}, byteOrder);
    }

    public static ExifAttribute createDouble(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d : dArr) {
            wrap.putDouble(d);
        }
        return new ExifAttribute(12, dArr.length, wrap.array());
    }

    public static ExifAttribute createDouble(double d, ByteOrder byteOrder) {
        return createDouble(new double[]{d}, byteOrder);
    }

    public String toString() {
        return "(" + IFD_FORMAT_NAMES[this.format] + ", data length:" + this.bytes.length + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:151:0x0198 */
    /* JADX WARN: Removed duplicated region for block: B:182:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getValue(ByteOrder byteOrder) {
        ByteOrderedDataInputStream byteOrderedDataInputStream;
        ByteOrderedDataInputStream byteOrderedDataInputStream2;
        byte b;
        byte b2;
        byte[] bArr;
        ByteOrderedDataInputStream byteOrderedDataInputStream3 = null;
        try {
            try {
                byteOrderedDataInputStream = new ByteOrderedDataInputStream(this.bytes);
                try {
                    byteOrderedDataInputStream.setByteOrder(byteOrder);
                    int i = 0;
                    boolean z = true;
                    switch (this.format) {
                        case 1:
                        case 6:
                            byte[] bArr2 = this.bytes;
                            if (bArr2.length != 1 || (b = bArr2[0]) < 0 || b > 1) {
                                String str = new String(bArr2, ASCII);
                                try {
                                    byteOrderedDataInputStream.close();
                                } catch (IOException e) {
                                    Logger.e(TAG, "IOException occurred while closing InputStream", e);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e2) {
                                Logger.e(TAG, "IOException occurred while closing InputStream", e2);
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (this.numberOfComponents >= EXIF_ASCII_PREFIX.length) {
                                int i2 = 0;
                                while (true) {
                                    bArr = EXIF_ASCII_PREFIX;
                                    if (i2 < bArr.length) {
                                        if (this.bytes[i2] != bArr[i2]) {
                                            z = false;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                if (z) {
                                    i = bArr.length;
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i < this.numberOfComponents && (b2 = this.bytes[i]) != 0) {
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                i++;
                            }
                            String sb2 = sb.toString();
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e3) {
                                Logger.e(TAG, "IOException occurred while closing InputStream", e3);
                            }
                            return sb2;
                        case 3:
                            int[] iArr = new int[this.numberOfComponents];
                            while (i < this.numberOfComponents) {
                                iArr[i] = byteOrderedDataInputStream.readUnsignedShort();
                                i++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e4) {
                                Logger.e(TAG, "IOException occurred while closing InputStream", e4);
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.numberOfComponents];
                            while (i < this.numberOfComponents) {
                                jArr[i] = byteOrderedDataInputStream.readUnsignedInt();
                                i++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e5) {
                                Logger.e(TAG, "IOException occurred while closing InputStream", e5);
                            }
                            return jArr;
                        case 5:
                            LongRational[] longRationalArr = new LongRational[this.numberOfComponents];
                            while (i < this.numberOfComponents) {
                                longRationalArr[i] = new LongRational(byteOrderedDataInputStream.readUnsignedInt(), byteOrderedDataInputStream.readUnsignedInt());
                                i++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e6) {
                                Logger.e(TAG, "IOException occurred while closing InputStream", e6);
                            }
                            return longRationalArr;
                        case 8:
                            int[] iArr2 = new int[this.numberOfComponents];
                            while (i < this.numberOfComponents) {
                                iArr2[i] = byteOrderedDataInputStream.readShort();
                                i++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e7) {
                                Logger.e(TAG, "IOException occurred while closing InputStream", e7);
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.numberOfComponents];
                            while (i < this.numberOfComponents) {
                                iArr3[i] = byteOrderedDataInputStream.readInt();
                                i++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e8) {
                                Logger.e(TAG, "IOException occurred while closing InputStream", e8);
                            }
                            return iArr3;
                        case 10:
                            LongRational[] longRationalArr2 = new LongRational[this.numberOfComponents];
                            while (i < this.numberOfComponents) {
                                longRationalArr2[i] = new LongRational(byteOrderedDataInputStream.readInt(), byteOrderedDataInputStream.readInt());
                                i++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e9) {
                                Logger.e(TAG, "IOException occurred while closing InputStream", e9);
                            }
                            return longRationalArr2;
                        case 11:
                            double[] dArr = new double[this.numberOfComponents];
                            while (i < this.numberOfComponents) {
                                dArr[i] = byteOrderedDataInputStream.readFloat();
                                i++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e10) {
                                Logger.e(TAG, "IOException occurred while closing InputStream", e10);
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.numberOfComponents];
                            while (i < this.numberOfComponents) {
                                dArr2[i] = byteOrderedDataInputStream.readDouble();
                                i++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e11) {
                                Logger.e(TAG, "IOException occurred while closing InputStream", e11);
                            }
                            return dArr2;
                        default:
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e12) {
                                Logger.e(TAG, "IOException occurred while closing InputStream", e12);
                            }
                            return null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    Logger.w(TAG, "IOException occurred during reading a value", e);
                    if (byteOrderedDataInputStream != null) {
                        try {
                            byteOrderedDataInputStream.close();
                        } catch (IOException e14) {
                            Logger.e(TAG, "IOException occurred while closing InputStream", e14);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                byteOrderedDataInputStream3 = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream3 != null) {
                    try {
                        byteOrderedDataInputStream3.close();
                    } catch (IOException e15) {
                        Logger.e(TAG, "IOException occurred while closing InputStream", e15);
                    }
                }
                throw th;
            }
        } catch (IOException e16) {
            e = e16;
            byteOrderedDataInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (byteOrderedDataInputStream3 != null) {
            }
            throw th;
        }
    }

    public double getDoubleValue(ByteOrder byteOrder) {
        Object value = getValue(byteOrder);
        if (value == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (value instanceof String) {
            return Double.parseDouble((String) value);
        }
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        } else if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        } else if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        } else if (value instanceof LongRational[]) {
            LongRational[] longRationalArr = (LongRational[]) value;
            if (longRationalArr.length == 1) {
                return longRationalArr[0].toDouble();
            }
            throw new NumberFormatException("There are more than one component");
        } else {
            throw new NumberFormatException("Couldn't find a double value");
        }
    }

    public int getIntValue(ByteOrder byteOrder) {
        Object value = getValue(byteOrder);
        if (value == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (value instanceof String) {
            return Integer.parseInt((String) value);
        }
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        } else if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        } else {
            throw new NumberFormatException("Couldn't find a integer value");
        }
    }

    public String getStringValue(ByteOrder byteOrder) {
        Object value = getValue(byteOrder);
        if (value == null) {
            return null;
        }
        if (value instanceof String) {
            return (String) value;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (value instanceof LongRational[]) {
            LongRational[] longRationalArr = (LongRational[]) value;
            while (i < longRationalArr.length) {
                sb.append(longRationalArr[i].getNumerator());
                sb.append('/');
                sb.append(longRationalArr[i].getDenominator());
                i++;
                if (i != longRationalArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else {
            return null;
        }
    }

    public int size() {
        return IFD_FORMAT_BYTES_PER_FORMAT[this.format] * this.numberOfComponents;
    }
}
