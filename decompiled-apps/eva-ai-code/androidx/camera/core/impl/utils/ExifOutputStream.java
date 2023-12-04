package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.utils.ExifData;
import androidx.core.util.Preconditions;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import kotlin.UShort;
/* loaded from: classes.dex */
public final class ExifOutputStream extends FilterOutputStream {
    private static final short BYTE_ALIGN_II = 18761;
    private static final short BYTE_ALIGN_MM = 19789;
    private static final boolean DEBUG = false;
    private static final byte[] IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(ExifAttribute.ASCII);
    private static final int IFD_OFFSET = 8;
    private static final byte START_CODE = 42;
    private static final int STATE_FRAME_HEADER = 1;
    private static final int STATE_JPEG_DATA = 2;
    private static final int STATE_SOI = 0;
    private static final int STREAMBUFFER_SIZE = 65536;
    private static final String TAG = "ExifOutputStream";
    private final ByteBuffer mBuffer;
    private int mByteToCopy;
    private int mByteToSkip;
    private final ExifData mExifData;
    private final byte[] mSingleByteArray;
    private int mState;

    public ExifOutputStream(OutputStream outputStream, ExifData exifData) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.mSingleByteArray = new byte[1];
        this.mBuffer = ByteBuffer.allocate(4);
        this.mState = 0;
        this.mExifData = exifData;
    }

    private int requestByteToBuffer(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, i - this.mBuffer.position());
        this.mBuffer.put(bArr, i2, min);
        return min;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
        if (r9 <= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
        r6.out.write(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            int i3 = this.mByteToSkip;
            if ((i3 > 0 || this.mByteToCopy > 0 || this.mState != 2) && i2 > 0) {
                if (i3 > 0) {
                    int min = Math.min(i2, i3);
                    i2 -= min;
                    this.mByteToSkip -= min;
                    i += min;
                }
                int i4 = this.mByteToCopy;
                if (i4 > 0) {
                    int min2 = Math.min(i2, i4);
                    this.out.write(bArr, i, min2);
                    i2 -= min2;
                    this.mByteToCopy -= min2;
                    i += min2;
                }
                if (i2 == 0) {
                    return;
                }
                int i5 = this.mState;
                if (i5 == 0) {
                    int requestByteToBuffer = requestByteToBuffer(2, bArr, i, i2);
                    i += requestByteToBuffer;
                    i2 -= requestByteToBuffer;
                    if (this.mBuffer.position() < 2) {
                        return;
                    }
                    this.mBuffer.rewind();
                    if (this.mBuffer.getShort() != -40) {
                        throw new IOException("Not a valid jpeg image, cannot write exif");
                    }
                    this.out.write(this.mBuffer.array(), 0, 2);
                    this.mState = 1;
                    this.mBuffer.rewind();
                    ByteOrderedDataOutputStream byteOrderedDataOutputStream = new ByteOrderedDataOutputStream(this.out, ByteOrder.BIG_ENDIAN);
                    byteOrderedDataOutputStream.writeShort((short) -31);
                    writeExifSegment(byteOrderedDataOutputStream);
                } else if (i5 != 1) {
                    continue;
                } else {
                    int requestByteToBuffer2 = requestByteToBuffer(4, bArr, i, i2);
                    i += requestByteToBuffer2;
                    i2 -= requestByteToBuffer2;
                    if (this.mBuffer.position() == 2 && this.mBuffer.getShort() == -39) {
                        this.out.write(this.mBuffer.array(), 0, 2);
                        this.mBuffer.rewind();
                    }
                    if (this.mBuffer.position() < 4) {
                        return;
                    }
                    this.mBuffer.rewind();
                    short s = this.mBuffer.getShort();
                    if (s == -31) {
                        this.mByteToSkip = (this.mBuffer.getShort() & UShort.MAX_VALUE) - 2;
                        this.mState = 2;
                    } else if (!JpegHeader.isSofMarker(s)) {
                        this.out.write(this.mBuffer.array(), 0, 4);
                        this.mByteToCopy = (this.mBuffer.getShort() & UShort.MAX_VALUE) - 2;
                    } else {
                        this.out.write(this.mBuffer.array(), 0, 4);
                        this.mState = 2;
                    }
                    this.mBuffer.rewind();
                }
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.mSingleByteArray;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    private void writeExifSegment(ByteOrderedDataOutputStream byteOrderedDataOutputStream) throws IOException {
        ExifTag[] exifTagArr;
        int[] iArr = new int[ExifData.EXIF_TAGS.length];
        int[] iArr2 = new int[ExifData.EXIF_TAGS.length];
        for (ExifTag exifTag : ExifData.EXIF_POINTER_TAGS) {
            for (int i = 0; i < ExifData.EXIF_TAGS.length; i++) {
                this.mExifData.getAttributes(i).remove(exifTag.name);
            }
        }
        if (!this.mExifData.getAttributes(1).isEmpty()) {
            this.mExifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(2).isEmpty()) {
            this.mExifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[2].name, ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(3).isEmpty()) {
            this.mExifData.getAttributes(1).put(ExifData.EXIF_POINTER_TAGS[3].name, ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        for (int i2 = 0; i2 < ExifData.EXIF_TAGS.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, ExifAttribute> entry : this.mExifData.getAttributes(i2).entrySet()) {
                int size = entry.getValue().size();
                if (size > 4) {
                    i3 += size;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < ExifData.EXIF_TAGS.length; i5++) {
            if (!this.mExifData.getAttributes(i5).isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.mExifData.getAttributes(i5).size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        int i6 = i4 + 8;
        if (!this.mExifData.getAttributes(1).isEmpty()) {
            this.mExifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong(iArr[1], this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(2).isEmpty()) {
            this.mExifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[2].name, ExifAttribute.createULong(iArr[2], this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(3).isEmpty()) {
            this.mExifData.getAttributes(1).put(ExifData.EXIF_POINTER_TAGS[3].name, ExifAttribute.createULong(iArr[3], this.mExifData.getByteOrder()));
        }
        byteOrderedDataOutputStream.writeUnsignedShort(i6);
        byteOrderedDataOutputStream.write(IDENTIFIER_EXIF_APP1);
        byteOrderedDataOutputStream.writeShort(this.mExifData.getByteOrder() == ByteOrder.BIG_ENDIAN ? BYTE_ALIGN_MM : BYTE_ALIGN_II);
        byteOrderedDataOutputStream.setByteOrder(this.mExifData.getByteOrder());
        byteOrderedDataOutputStream.writeUnsignedShort(42);
        byteOrderedDataOutputStream.writeUnsignedInt(8L);
        for (int i7 = 0; i7 < ExifData.EXIF_TAGS.length; i7++) {
            if (!this.mExifData.getAttributes(i7).isEmpty()) {
                byteOrderedDataOutputStream.writeUnsignedShort(this.mExifData.getAttributes(i7).size());
                int size2 = iArr[i7] + 2 + (this.mExifData.getAttributes(i7).size() * 12) + 4;
                for (Map.Entry<String, ExifAttribute> entry2 : this.mExifData.getAttributes(i7).entrySet()) {
                    int i8 = ((ExifTag) Preconditions.checkNotNull(ExifData.Builder.sExifTagMapsForWriting.get(i7).get(entry2.getKey()), "Tag not supported: " + entry2.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).number;
                    ExifAttribute value = entry2.getValue();
                    int size3 = value.size();
                    byteOrderedDataOutputStream.writeUnsignedShort(i8);
                    byteOrderedDataOutputStream.writeUnsignedShort(value.format);
                    byteOrderedDataOutputStream.writeInt(value.numberOfComponents);
                    if (size3 > 4) {
                        byteOrderedDataOutputStream.writeUnsignedInt(size2);
                        size2 += size3;
                    } else {
                        byteOrderedDataOutputStream.write(value.bytes);
                        if (size3 < 4) {
                            while (size3 < 4) {
                                byteOrderedDataOutputStream.writeByte(0);
                                size3++;
                            }
                        }
                    }
                }
                byteOrderedDataOutputStream.writeUnsignedInt(0L);
                for (Map.Entry<String, ExifAttribute> entry3 : this.mExifData.getAttributes(i7).entrySet()) {
                    ExifAttribute value2 = entry3.getValue();
                    if (value2.bytes.length > 4) {
                        byteOrderedDataOutputStream.write(value2.bytes, 0, value2.bytes.length);
                    }
                }
            }
        }
        byteOrderedDataOutputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class JpegHeader {
        public static final short APP1 = -31;
        public static final short DAC = -52;
        public static final short DHT = -60;
        public static final short EOI = -39;
        public static final short JPG = -56;
        public static final short SOF0 = -64;
        public static final short SOF15 = -49;
        public static final short SOI = -40;

        public static boolean isSofMarker(short s) {
            return (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) ? false : true;
        }

        private JpegHeader() {
        }
    }
}
