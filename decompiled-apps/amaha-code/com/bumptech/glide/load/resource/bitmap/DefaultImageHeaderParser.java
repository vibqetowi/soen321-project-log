package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kc.f;
/* loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f5975a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f5976b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes.dex */
    public interface Reader {

        /* loaded from: classes.dex */
        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        short b();

        long skip(long j10);
    }

    /* loaded from: classes.dex */
    public static final class a implements Reader {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5977a;

        public a(ByteBuffer byteBuffer) {
            this.f5977a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() {
            return (b() << 8) | b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short b() {
            ByteBuffer byteBuffer = this.f5977a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j10) {
            ByteBuffer byteBuffer = this.f5977a;
            int min = (int) Math.min(byteBuffer.remaining(), j10);
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5978a;

        public b(byte[] bArr, int i6) {
            this.f5978a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i6);
        }

        public final short a(int i6) {
            boolean z10;
            ByteBuffer byteBuffer = this.f5978a;
            if (byteBuffer.remaining() - i6 >= 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return byteBuffer.getShort(i6);
            }
            return (short) -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Reader {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f5979a;

        public c(InputStream inputStream) {
            this.f5979a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() {
            return (b() << 8) | b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short b() {
            int read = this.f5979a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        public final int c(byte[] bArr, int i6) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i6 && (i11 = this.f5979a.read(bArr, i10, i6 - i10)) != -1) {
                i10 += i11;
            }
            if (i10 == 0 && i11 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i10;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j10) {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                InputStream inputStream = this.f5979a;
                long skip = inputStream.skip(j11);
                if (skip > 0) {
                    j11 -= skip;
                } else if (inputStream.read() == -1) {
                    break;
                } else {
                    j11--;
                }
            }
            return j10 - j11;
        }
    }

    public static ImageHeaderParser.ImageType d(Reader reader) {
        try {
            int a10 = reader.a();
            if (a10 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int b10 = (a10 << 8) | reader.b();
            if (b10 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int b11 = (b10 << 8) | reader.b();
            if (b11 == -1991225785) {
                reader.skip(21L);
                try {
                    if (reader.b() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (b11 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                reader.skip(4L);
                if (((reader.a() << 16) | reader.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a11 = (reader.a() << 16) | reader.a();
                if ((a11 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i6 = a11 & 255;
                if (i6 == 88) {
                    reader.skip(4L);
                    if ((reader.b() & 16) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else if (i6 == 76) {
                    reader.skip(4L);
                    if ((reader.b() & 8) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int e(c cVar) {
        short b10;
        short b11;
        int a10;
        long j10;
        long skip;
        do {
            if (cVar.b() != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) b10));
                }
                return -1;
            }
            b11 = cVar.b();
            if (b11 == 218) {
                return -1;
            }
            if (b11 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a10 = cVar.a() - 2;
            if (b11 != 225) {
                j10 = a10;
                skip = cVar.skip(j10);
            } else {
                return a10;
            }
        } while (skip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) b11) + ", wanted to skip: " + a10 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    public static int f(c cVar, byte[] bArr, int i6) {
        boolean z10;
        ByteOrder byteOrder;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        int c10 = cVar.c(bArr, i6);
        if (c10 != i6) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i6 + ", actually read: " + c10);
            }
            return -1;
        }
        short s10 = 1;
        byte[] bArr2 = f5975a;
        if (bArr != null && i6 > bArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i12 = 0;
            while (true) {
                if (i12 >= bArr2.length) {
                    break;
                } else if (bArr[i12] != bArr2[i12]) {
                    z10 = false;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (z10) {
            b bVar = new b(bArr, i6);
            short a10 = bVar.a(6);
            if (a10 != 18761) {
                if (a10 != 19789) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a10));
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ByteBuffer byteBuffer = bVar.f5978a;
            byteBuffer.order(byteOrder);
            if (byteBuffer.remaining() - 10 >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i10 = byteBuffer.getInt(10);
            } else {
                i10 = -1;
            }
            int i13 = i10 + 6;
            short a11 = bVar.a(i13);
            int i14 = 0;
            while (i14 < a11) {
                int i15 = (i14 * 12) + i13 + 2;
                short a12 = bVar.a(i15);
                if (a12 == 274) {
                    short a13 = bVar.a(i15 + 2);
                    if (a13 >= s10 && a13 <= 12) {
                        int i16 = i15 + 4;
                        if (byteBuffer.remaining() - i16 >= 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            i11 = byteBuffer.getInt(i16);
                        } else {
                            i11 = -1;
                        }
                        if (i11 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i14 + " tagType=" + ((int) a12) + " formatCode=" + ((int) a13) + " componentCount=" + i11);
                            }
                            int i17 = i11 + f5976b[a13];
                            if (i17 > 4) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a13));
                                }
                            } else {
                                int i18 = i15 + 8;
                                if (i18 >= 0 && i18 <= byteBuffer.remaining()) {
                                    if (i17 >= 0 && i17 + i18 <= byteBuffer.remaining()) {
                                        return bVar.a(i18);
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) a12));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i18 + " tagType=" + ((int) a12));
                                }
                            }
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) a13));
                    }
                }
                i14++;
                s10 = 1;
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        f.p(byteBuffer);
        return d(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(InputStream inputStream) {
        f.p(inputStream);
        return d(new c(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int c(InputStream inputStream, l4.b bVar) {
        boolean z10;
        f.p(inputStream);
        c cVar = new c(inputStream);
        f.p(bVar);
        int i6 = -1;
        try {
            int a10 = cVar.a();
            if ((a10 & 65496) != 65496 && a10 != 19789 && a10 != 18761) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a10);
                }
            } else {
                int e10 = e(cVar);
                if (e10 == -1) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    }
                } else {
                    byte[] bArr = (byte[]) bVar.c(e10, byte[].class);
                    int f = f(cVar, bArr, e10);
                    bVar.put(bArr);
                    i6 = f;
                }
            }
        } catch (Reader.EndOfFileException unused) {
        }
        return i6;
    }
}
