package f1;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
/* compiled from: ExifInterface.java */
/* loaded from: classes.dex */
public final class a {
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final d H;
    public static final d[][] I;
    public static final d[] J;
    public static final HashMap<Integer, d>[] K;
    public static final HashMap<String, d>[] L;
    public static final HashSet<String> M;
    public static final HashMap<Integer, Integer> N;
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;

    /* renamed from: a  reason: collision with root package name */
    public String f14726a;

    /* renamed from: b  reason: collision with root package name */
    public FileDescriptor f14727b;

    /* renamed from: c  reason: collision with root package name */
    public AssetManager.AssetInputStream f14728c;

    /* renamed from: d  reason: collision with root package name */
    public int f14729d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, c>[] f14730e;
    public final HashSet f;

    /* renamed from: g  reason: collision with root package name */
    public ByteOrder f14731g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14732h;

    /* renamed from: i  reason: collision with root package name */
    public int f14733i;

    /* renamed from: j  reason: collision with root package name */
    public int f14734j;

    /* renamed from: k  reason: collision with root package name */
    public int f14735k;

    /* renamed from: l  reason: collision with root package name */
    public int f14736l;

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f14713m = Log.isLoggable("ExifInterface", 3);

    /* renamed from: n  reason: collision with root package name */
    public static final List<Integer> f14714n = Arrays.asList(1, 6, 3, 8);

    /* renamed from: o  reason: collision with root package name */
    public static final List<Integer> f14715o = Arrays.asList(2, 7, 4, 5);

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f14716p = {8, 8, 8};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f14717q = {8};
    public static final byte[] r = {-1, -40, -1};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f14718s = {102, 116, 121, 112};

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f14719t = {109, 105, 102, 49};

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f14720u = {104, 101, 105, 99};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f14721v = {79, 76, 89, 77, 80, 0};

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f14722w = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f14723x = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f14724y = {101, 88, 73, 102};

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f14725z = {73, 72, 68, 82};
    public static final byte[] A = {73, 69, 78, 68};
    public static final byte[] B = {82, 73, 70, 70};
    public static final byte[] C = {87, 69, 66, 80};
    public static final byte[] D = {69, 88, 73, 70};

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f14745a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14746b;

        /* renamed from: c  reason: collision with root package name */
        public final long f14747c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f14748d;

        public c(int i6, byte[] bArr, int i10) {
            this(-1L, bArr, i6, i10);
        }

        public static c a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(a.O);
            return new c(2, bytes, bytes.length);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            long[] jArr = {j10};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.F[4] * 1]);
            wrap.order(byteOrder);
            wrap.putInt((int) jArr[0]);
            return new c(4, wrap.array(), 1);
        }

        public static c c(e eVar, ByteOrder byteOrder) {
            e[] eVarArr = {eVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.F[5] * 1]);
            wrap.order(byteOrder);
            e eVar2 = eVarArr[0];
            wrap.putInt((int) eVar2.f14753a);
            wrap.putInt((int) eVar2.f14754b);
            return new c(5, wrap.array(), 1);
        }

        public static c d(int i6, ByteOrder byteOrder) {
            int[] iArr = {i6};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.F[3] * 1]);
            wrap.order(byteOrder);
            wrap.putShort((short) iArr[0]);
            return new c(3, wrap.array(), 1);
        }

        public final double e(ByteOrder byteOrder) {
            Serializable h10 = h(byteOrder);
            if (h10 != null) {
                if (h10 instanceof String) {
                    return Double.parseDouble((String) h10);
                }
                if (h10 instanceof long[]) {
                    long[] jArr = (long[]) h10;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof int[]) {
                    int[] iArr = (int[]) h10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof double[]) {
                    double[] dArr = (double[]) h10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof e[]) {
                    e[] eVarArr = (e[]) h10;
                    if (eVarArr.length == 1) {
                        e eVar = eVarArr[0];
                        return eVar.f14753a / eVar.f14754b;
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public final int f(ByteOrder byteOrder) {
            Serializable h10 = h(byteOrder);
            if (h10 != null) {
                if (h10 instanceof String) {
                    return Integer.parseInt((String) h10);
                }
                if (h10 instanceof long[]) {
                    long[] jArr = (long[]) h10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof int[]) {
                    int[] iArr = (int[]) h10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public final String g(ByteOrder byteOrder) {
            Serializable h10 = h(byteOrder);
            if (h10 == null) {
                return null;
            }
            if (h10 instanceof String) {
                return (String) h10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i6 = 0;
            if (h10 instanceof long[]) {
                long[] jArr = (long[]) h10;
                while (i6 < jArr.length) {
                    sb2.append(jArr[i6]);
                    i6++;
                    if (i6 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (h10 instanceof int[]) {
                int[] iArr = (int[]) h10;
                while (i6 < iArr.length) {
                    sb2.append(iArr[i6]);
                    i6++;
                    if (i6 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (h10 instanceof double[]) {
                double[] dArr = (double[]) h10;
                while (i6 < dArr.length) {
                    sb2.append(dArr[i6]);
                    i6++;
                    if (i6 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(h10 instanceof e[])) {
                return null;
            } else {
                e[] eVarArr = (e[]) h10;
                while (i6 < eVarArr.length) {
                    sb2.append(eVarArr[i6].f14753a);
                    sb2.append('/');
                    sb2.append(eVarArr[i6].f14754b);
                    i6++;
                    if (i6 != eVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:89|(3:91|(2:92|(1:101)(2:94|(2:97|98)(1:96)))|(1:100))|102|(2:104|(6:113|114|115|116|117|118)(3:106|(2:108|109)(2:111|112)|110))|122|115|116|117|118) */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x012a, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x012b, code lost:
            android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0167: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:132:0x0167 */
        /* JADX WARN: Removed duplicated region for block: B:174:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v25, types: [f1.a$e[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v28, types: [f1.a$e[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Serializable h(ByteOrder byteOrder) {
            b bVar;
            InputStream inputStream;
            byte b10;
            byte[] bArr;
            byte[] bArr2 = this.f14748d;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(bArr2);
                    try {
                        bVar.f14742v = byteOrder;
                        int i6 = this.f14745a;
                        int i10 = 0;
                        boolean z10 = true;
                        int i11 = this.f14746b;
                        switch (i6) {
                            case 1:
                            case 6:
                                if (bArr2.length == 1 && (b10 = bArr2[0]) >= 0 && b10 <= 1) {
                                    String str = new String(new char[]{(char) (b10 + 48)});
                                    try {
                                        bVar.close();
                                    } catch (IOException e10) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    }
                                    return str;
                                }
                                String str2 = new String(bArr2, a.O);
                                try {
                                    bVar.close();
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                }
                                return str2;
                            case 2:
                            case 7:
                                if (i11 >= a.G.length) {
                                    int i12 = 0;
                                    while (true) {
                                        bArr = a.G;
                                        if (i12 < bArr.length) {
                                            if (bArr2[i12] != bArr[i12]) {
                                                z10 = false;
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                    if (z10) {
                                        i10 = bArr.length;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                while (i10 < i11) {
                                    byte b11 = bArr2[i10];
                                    if (b11 != 0) {
                                        if (b11 >= 32) {
                                            sb2.append((char) b11);
                                        } else {
                                            sb2.append('?');
                                        }
                                        i10++;
                                    } else {
                                        String sb3 = sb2.toString();
                                        bVar.close();
                                        return sb3;
                                    }
                                }
                                String sb32 = sb2.toString();
                                bVar.close();
                                return sb32;
                            case 3:
                                ?? r15 = new int[i11];
                                while (i10 < i11) {
                                    r15[i10] = bVar.readUnsignedShort();
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                }
                                return r15;
                            case 4:
                                ?? r152 = new long[i11];
                                while (i10 < i11) {
                                    r152[i10] = bVar.readInt() & 4294967295L;
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                }
                                return r152;
                            case 5:
                                ?? r153 = new e[i11];
                                while (i10 < i11) {
                                    r153[i10] = new e(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                }
                                return r153;
                            case 8:
                                ?? r154 = new int[i11];
                                while (i10 < i11) {
                                    r154[i10] = bVar.readShort();
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e15) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                }
                                return r154;
                            case 9:
                                ?? r155 = new int[i11];
                                while (i10 < i11) {
                                    r155[i10] = bVar.readInt();
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e16) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                }
                                return r155;
                            case 10:
                                ?? r156 = new e[i11];
                                while (i10 < i11) {
                                    r156[i10] = new e(bVar.readInt(), bVar.readInt());
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e17) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                }
                                return r156;
                            case 11:
                                ?? r157 = new double[i11];
                                while (i10 < i11) {
                                    r157[i10] = bVar.readFloat();
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e18) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                                }
                                return r157;
                            case 12:
                                ?? r158 = new double[i11];
                                while (i10 < i11) {
                                    r158[i10] = bVar.readDouble();
                                    i10++;
                                }
                                try {
                                    bVar.close();
                                } catch (IOException e19) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                                }
                                return r158;
                            default:
                                try {
                                    bVar.close();
                                } catch (IOException e20) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e20);
                                }
                                return null;
                        }
                    } catch (IOException e21) {
                        e = e21;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e22) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e22);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e23) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e23);
                        }
                    }
                    throw th;
                }
            } catch (IOException e24) {
                e = e24;
                bVar = null;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                }
                throw th;
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(a.E[this.f14745a]);
            sb2.append(", data length:");
            return pl.a.g(sb2, this.f14748d.length, ")");
        }

        public c(long j10, byte[] bArr, int i6, int i10) {
            this.f14745a = i6;
            this.f14746b = i10;
            this.f14747c = j10;
            this.f14748d = bArr;
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f14753a;

        /* renamed from: b  reason: collision with root package name */
        public final long f14754b;

        public e(long j10, long j11) {
            if (j11 == 0) {
                this.f14753a = 0L;
                this.f14754b = 1L;
                return;
            }
            this.f14753a = j10;
            this.f14754b = j11;
        }

        public final String toString() {
            return this.f14753a + "/" + this.f14754b;
        }
    }

    static {
        d[] dVarArr;
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr2 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr3 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr4 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr5 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr6 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        H = new d("StripOffsets", 273, 3);
        I = new d[][]{dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr6, dVarArr2, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        J = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        N = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        O = forName;
        P = "Exif\u0000\u0000".getBytes(forName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i6 = 0;
        while (true) {
            d[][] dVarArr7 = I;
            if (i6 < dVarArr7.length) {
                K[i6] = new HashMap<>();
                L[i6] = new HashMap<>();
                for (d dVar : dVarArr7[i6]) {
                    K[i6].put(Integer.valueOf(dVar.f14749a), dVar);
                    L[i6].put(dVar.f14750b, dVar);
                }
                i6++;
            } else {
                HashMap<Integer, Integer> hashMap = N;
                d[] dVarArr8 = J;
                hashMap.put(Integer.valueOf(dVarArr8[0].f14749a), 5);
                hashMap.put(Integer.valueOf(dVarArr8[1].f14749a), 1);
                hashMap.put(Integer.valueOf(dVarArr8[2].f14749a), 2);
                hashMap.put(Integer.valueOf(dVarArr8[3].f14749a), 3);
                hashMap.put(Integer.valueOf(dVarArr8[4].f14749a), 7);
                hashMap.put(Integer.valueOf(dVarArr8[5].f14749a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public a(String str) {
        FileInputStream fileInputStream;
        boolean z10;
        d[][] dVarArr = I;
        this.f14730e = new HashMap[dVarArr.length];
        this.f = new HashSet(dVarArr.length);
        this.f14731g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.f14728c = null;
            this.f14726a = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                try {
                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    z10 = true;
                } catch (Exception unused) {
                    if (f14713m) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z10 = false;
                }
                if (z10) {
                    this.f14727b = fileInputStream.getFD();
                } else {
                    this.f14727b = null;
                }
                r(fileInputStream);
                try {
                    fileInputStream.close();
                    return;
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception unused2) {
                    return;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (RuntimeException e11) {
                        throw e11;
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        }
        throw new NullPointerException("filename cannot be null");
    }

    public static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i6 = 0; i6 < bArr.length; i6++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i6])));
        }
        return sb2.toString();
    }

    public static long[] c(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i6 = 0; i6 < iArr.length; i6++) {
                jArr[i6] = iArr[i6];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static ByteOrder u(b bVar) {
        short readShort = bVar.readShort();
        boolean z10 = f14713m;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z10) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z10) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void A() {
        y(0, 5);
        y(0, 4);
        y(5, 4);
        HashMap<String, c>[] hashMapArr = this.f14730e;
        c cVar = hashMapArr[1].get("PixelXDimension");
        c cVar2 = hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && q(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!q(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    public final void a() {
        String d10 = d("DateTimeOriginal");
        HashMap<String, c>[] hashMapArr = this.f14730e;
        if (d10 != null && d("DateTime") == null) {
            hashMapArr[0].put("DateTime", c.a(d10));
        }
        if (d("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.b(0L, this.f14731g));
        }
        if (d("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.b(0L, this.f14731g));
        }
        if (d("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.b(0L, this.f14731g));
        }
        if (d("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.b(0L, this.f14731g));
        }
    }

    public final String d(String str) {
        c f = f(str);
        if (f != null) {
            if (!M.contains(str)) {
                return f.g(this.f14731g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i6 = f.f14745a;
                if (i6 != 5 && i6 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i6);
                    return null;
                }
                e[] eVarArr = (e[]) f.h(this.f14731g);
                if (eVarArr != null && eVarArr.length == 3) {
                    e eVar = eVarArr[0];
                    e eVar2 = eVarArr[1];
                    e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVar.f14753a) / ((float) eVar.f14754b))), Integer.valueOf((int) (((float) eVar2.f14753a) / ((float) eVar2.f14754b))), Integer.valueOf((int) (((float) eVar3.f14753a) / ((float) eVar3.f14754b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                return null;
            }
            try {
                return Double.toString(f.e(this.f14731g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int e() {
        c f = f("Orientation");
        if (f == null) {
            return 1;
        }
        try {
            return f.f(this.f14731g);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final c f(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f14713m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i6 = 0; i6 < I.length; i6++) {
            c cVar = this.f14730e[i6].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void g(b bVar) {
        String str;
        String str2;
        String str3;
        int i6;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new C0228a(bVar));
            } else {
                FileDescriptor fileDescriptor = this.f14727b;
                if (fileDescriptor != null) {
                    mediaMetadataRetriever.setDataSource(fileDescriptor);
                } else {
                    String str4 = this.f14726a;
                    if (str4 != null) {
                        mediaMetadataRetriever.setDataSource(str4);
                    } else {
                        return;
                    }
                }
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            HashMap<String, c>[] hashMapArr = this.f14730e;
            if (str != null) {
                hashMapArr[0].put("ImageWidth", c.d(Integer.parseInt(str), this.f14731g));
            }
            if (str2 != null) {
                hashMapArr[0].put("ImageLength", c.d(Integer.parseInt(str2), this.f14731g));
            }
            if (str3 != null) {
                int parseInt = Integer.parseInt(str3);
                if (parseInt != 90) {
                    if (parseInt != 180) {
                        if (parseInt != 270) {
                            i6 = 1;
                        } else {
                            i6 = 8;
                        }
                    } else {
                        i6 = 3;
                    }
                } else {
                    i6 = 6;
                }
                hashMapArr[0].put("Orientation", c.d(i6, this.f14731g));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.a(parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i10 = parseInt2 + 6;
                        int i11 = parseInt3 - 6;
                        if (Arrays.equals(bArr, P)) {
                            byte[] bArr2 = new byte[i11];
                            if (bVar.read(bArr2) == i11) {
                                this.f14733i = i10;
                                v(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f14713m) {
                Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x01af, code lost:
        r24.f14742v = r23.f14731g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b3, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(b bVar, int i6, int i10) {
        byte readByte;
        byte readByte2;
        boolean z10;
        boolean z11;
        boolean z12 = f14713m;
        if (z12) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.f14742v = ByteOrder.BIG_ENDIAN;
        byte b10 = -1;
        if (bVar.readByte() == -1) {
            if (bVar.readByte() == -40) {
                int i11 = 2;
                int i12 = 2;
                while (true) {
                    if (bVar.readByte() == b10) {
                        int i13 = i12 + 1;
                        byte readByte3 = bVar.readByte();
                        if (z12) {
                            Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
                        }
                        int i14 = i13 + 1;
                        if (readByte3 != -39 && readByte3 != -38) {
                            int readUnsignedShort = bVar.readUnsignedShort() - i11;
                            int i15 = i14 + i11;
                            if (z12) {
                                Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + (readUnsignedShort + 2) + ")");
                            }
                            if (readUnsignedShort >= 0) {
                                HashMap<String, c>[] hashMapArr = this.f14730e;
                                if (readByte3 != -31) {
                                    if (readByte3 != -2) {
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                    default:
                                                        switch (readByte3) {
                                                            default:
                                                                switch (readByte3) {
                                                                }
                                                            case -55:
                                                            case -54:
                                                            case -53:
                                                                if (bVar.skipBytes(1) == 1) {
                                                                    hashMapArr[i10].put("ImageLength", c.b(bVar.readUnsignedShort(), this.f14731g));
                                                                    hashMapArr[i10].put("ImageWidth", c.b(bVar.readUnsignedShort(), this.f14731g));
                                                                    readUnsignedShort -= 5;
                                                                    break;
                                                                } else {
                                                                    throw new IOException("Invalid SOFx");
                                                                }
                                                        }
                                                    case -59:
                                                    case -58:
                                                    case -57:
                                                        break;
                                                }
                                            case -64:
                                            case -63:
                                            case -62:
                                            case -61:
                                                break;
                                        }
                                        if (readUnsignedShort < 0) {
                                            if (bVar.skipBytes(readUnsignedShort) == readUnsignedShort) {
                                                i12 = i15 + readUnsignedShort;
                                                i11 = 2;
                                                b10 = -1;
                                            } else {
                                                throw new IOException("Invalid JPEG segment");
                                            }
                                        } else {
                                            throw new IOException("Invalid length");
                                        }
                                    } else {
                                        byte[] bArr = new byte[readUnsignedShort];
                                        if (bVar.read(bArr) == readUnsignedShort) {
                                            if (d("UserComment") == null) {
                                                hashMapArr[1].put("UserComment", c.a(new String(bArr, O)));
                                            }
                                        } else {
                                            throw new IOException("Invalid exif");
                                        }
                                    }
                                } else {
                                    byte[] bArr2 = new byte[readUnsignedShort];
                                    bVar.readFully(bArr2);
                                    int i16 = i15 + readUnsignedShort;
                                    byte[] bArr3 = P;
                                    if (bArr3 != null && readUnsignedShort >= bArr3.length) {
                                        for (int i17 = 0; i17 < bArr3.length; i17++) {
                                            if (bArr2[i17] == bArr3[i17]) {
                                            }
                                        }
                                        z10 = true;
                                        if (!z10) {
                                            byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, readUnsignedShort);
                                            this.f14733i = i6 + i15 + bArr3.length;
                                            v(copyOfRange, i10);
                                            x(new b(copyOfRange));
                                        } else {
                                            byte[] bArr4 = Q;
                                            if (bArr4 != null && readUnsignedShort >= bArr4.length) {
                                                for (int i18 = 0; i18 < bArr4.length; i18++) {
                                                    if (bArr2[i18] == bArr4[i18]) {
                                                    }
                                                }
                                                z11 = true;
                                                if (z11) {
                                                    int length = i15 + bArr4.length;
                                                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, readUnsignedShort);
                                                    if (d("Xmp") == null) {
                                                        hashMapArr[0].put("Xmp", new c(length, copyOfRange2, 1, copyOfRange2.length));
                                                    }
                                                }
                                            }
                                            z11 = false;
                                            if (z11) {
                                            }
                                        }
                                        i15 = i16;
                                    }
                                    z10 = false;
                                    if (!z10) {
                                    }
                                    i15 = i16;
                                }
                                readUnsignedShort = 0;
                                if (readUnsignedShort < 0) {
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
                    }
                }
            } else {
                throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
            }
        } else {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ce, code lost:
        if (r8 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(BufferedInputStream bufferedInputStream) {
        boolean z10;
        boolean z11;
        b bVar;
        b bVar2;
        boolean z12;
        b bVar3;
        b bVar4;
        boolean z13;
        b bVar5;
        b bVar6;
        boolean z14;
        boolean z15;
        boolean z16;
        long j10;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i6 = 0;
        while (true) {
            byte[] bArr2 = r;
            if (i6 < bArr2.length) {
                if (bArr[i6] != bArr2[i6]) {
                    z10 = false;
                    break;
                }
                i6++;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return 4;
        }
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i10 = 0;
        while (true) {
            if (i10 < bytes.length) {
                if (bArr[i10] != bytes[i10]) {
                    z11 = false;
                    break;
                }
                i10++;
            } else {
                z11 = true;
                break;
            }
        }
        if (z11) {
            return 9;
        }
        try {
            bVar2 = new b(bArr);
            try {
                long readInt = bVar2.readInt();
                byte[] bArr3 = new byte[4];
                bVar2.read(bArr3);
                if (Arrays.equals(bArr3, f14718s)) {
                    if (readInt == 1) {
                        readInt = bVar2.readLong();
                        j10 = 16;
                        if (readInt < 16) {
                        }
                    } else {
                        j10 = 8;
                    }
                    long j11 = 5000;
                    if (readInt > j11) {
                        readInt = j11;
                    }
                    long j12 = readInt - j10;
                    if (j12 >= 8) {
                        byte[] bArr4 = new byte[4];
                        boolean z17 = false;
                        boolean z18 = false;
                        for (long j13 = 0; j13 < j12 / 4 && bVar2.read(bArr4) == 4; j13++) {
                            if (j13 != 1) {
                                if (Arrays.equals(bArr4, f14719t)) {
                                    z17 = true;
                                } else if (Arrays.equals(bArr4, f14720u)) {
                                    z18 = true;
                                }
                                if (z17 && z18) {
                                    bVar2.close();
                                    z12 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                e = e10;
                try {
                    if (f14713m) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (bVar2 != null) {
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            bVar2 = null;
        } catch (Throwable th4) {
            th = th4;
            bVar = null;
            bVar2 = bVar;
            if (bVar2 != null) {
            }
            throw th;
        }
        bVar2.close();
        z12 = false;
        if (z12) {
            return 12;
        }
        try {
            bVar4 = new b(bArr);
            try {
                ByteOrder u10 = u(bVar4);
                this.f14731g = u10;
                bVar4.f14742v = u10;
                short readShort = bVar4.readShort();
                if (readShort != 20306 && readShort != 21330) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                bVar4.close();
            } catch (Exception unused) {
                if (bVar4 != null) {
                    bVar4.close();
                }
                z13 = false;
                if (!z13) {
                }
            } catch (Throwable th5) {
                th = th5;
                bVar3 = bVar4;
                if (bVar3 != null) {
                    bVar3.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            bVar4 = null;
        } catch (Throwable th6) {
            th = th6;
            bVar3 = null;
        }
        if (!z13) {
            return 7;
        }
        try {
            b bVar7 = new b(bArr);
            try {
                ByteOrder u11 = u(bVar7);
                this.f14731g = u11;
                bVar7.f14742v = u11;
                if (bVar7.readShort() == 85) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                bVar7.close();
            } catch (Exception unused3) {
                bVar6 = bVar7;
                if (bVar6 != null) {
                    bVar6.close();
                }
                z14 = false;
                if (!z14) {
                }
            } catch (Throwable th7) {
                th = th7;
                bVar5 = bVar7;
                if (bVar5 != null) {
                    bVar5.close();
                }
                throw th;
            }
        } catch (Exception unused4) {
            bVar6 = null;
        } catch (Throwable th8) {
            th = th8;
            bVar5 = null;
        }
        if (!z14) {
            return 10;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr5 = f14723x;
            if (i11 < bArr5.length) {
                if (bArr[i11] != bArr5[i11]) {
                    z15 = false;
                    break;
                }
                i11++;
            } else {
                z15 = true;
                break;
            }
        }
        if (z15) {
            return 13;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr6 = B;
            if (i12 < bArr6.length) {
                if (bArr[i12] != bArr6[i12]) {
                    break;
                }
                i12++;
            } else {
                int i13 = 0;
                while (true) {
                    byte[] bArr7 = C;
                    if (i13 < bArr7.length) {
                        if (bArr[bArr6.length + i13 + 4] != bArr7[i13]) {
                            break;
                        }
                        i13++;
                    } else {
                        z16 = true;
                        break;
                    }
                }
            }
        }
        z16 = false;
        if (!z16) {
            return 0;
        }
        return 14;
    }

    public final void j(b bVar) {
        int i6;
        int i10;
        m(bVar);
        HashMap<String, c>[] hashMapArr = this.f14730e;
        c cVar = hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            b bVar2 = new b(cVar.f14748d);
            bVar2.f14742v = this.f14731g;
            byte[] bArr = f14721v;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.a(0L);
            byte[] bArr3 = f14722w;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.a(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.a(12L);
            }
            w(bVar2, 6);
            c cVar2 = hashMapArr[7].get("PreviewImageStart");
            c cVar3 = hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.h(this.f14731g);
                if (iArr != null && iArr.length == 4) {
                    int i11 = iArr[2];
                    int i12 = iArr[0];
                    if (i11 > i12 && (i6 = iArr[3]) > (i10 = iArr[1])) {
                        int i13 = (i11 - i12) + 1;
                        int i14 = (i6 - i10) + 1;
                        if (i13 < i14) {
                            int i15 = i13 + i14;
                            i14 = i15 - i14;
                            i13 = i15 - i14;
                        }
                        c d10 = c.d(i13, this.f14731g);
                        c d11 = c.d(i14, this.f14731g);
                        hashMapArr[0].put("ImageWidth", d10);
                        hashMapArr[0].put("ImageLength", d11);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void k(b bVar) {
        if (f14713m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.f14742v = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f14723x;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i6 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i10 = i6 + 4;
                    if (i10 == 16 && !Arrays.equals(bArr2, f14725z)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, A)) {
                        if (Arrays.equals(bArr2, f14724y)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f14733i = i10;
                                    v(bArr3, 0);
                                    A();
                                    x(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                        }
                        int i11 = readInt + 4;
                        bVar.skipBytes(i11);
                        length = i10 + i11;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void l(b bVar) {
        boolean z10 = f14713m;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i6 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        bVar.a(i6);
        bVar.read(bArr4);
        h(new b(bArr4), i6, 5);
        bVar.a(i11);
        bVar.f14742v = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == H.f14749a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d10 = c.d(readShort, this.f14731g);
                c d11 = c.d(readShort2, this.f14731g);
                HashMap<String, c>[] hashMapArr = this.f14730e;
                hashMapArr[0].put("ImageLength", d10);
                hashMapArr[0].put("ImageWidth", d11);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void m(b bVar) {
        s(bVar, bVar.available());
        w(bVar, 0);
        z(bVar, 0);
        z(bVar, 5);
        z(bVar, 4);
        A();
        if (this.f14729d == 8) {
            HashMap<String, c>[] hashMapArr = this.f14730e;
            c cVar = hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                b bVar2 = new b(cVar.f14748d);
                bVar2.f14742v = this.f14731g;
                bVar2.a(6L);
                w(bVar2, 9);
                c cVar2 = hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void n(b bVar) {
        if (f14713m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + bVar);
        }
        m(bVar);
        HashMap<String, c>[] hashMapArr = this.f14730e;
        c cVar = hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            h(new b(cVar.f14748d), (int) cVar.f14747c, 5);
        }
        c cVar2 = hashMapArr[0].get("ISO");
        c cVar3 = hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final void o(b bVar) {
        if (f14713m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.f14742v = ByteOrder.LITTLE_ENDIAN;
        bVar.skipBytes(B.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(C.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i6 = skipBytes + 4 + 4;
                    if (Arrays.equals(D, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f14733i = i6;
                            v(bArr2, 0);
                            x(new b(bArr2));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i10 = i6 + readInt2;
                    if (i10 == readInt) {
                        return;
                    }
                    if (i10 <= readInt) {
                        int skipBytes2 = bVar.skipBytes(readInt2);
                        if (skipBytes2 == readInt2) {
                            skipBytes = i6 + skipBytes2;
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void p(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f = cVar.f(this.f14731g);
            int f2 = cVar2.f(this.f14731g);
            if (this.f14729d == 7) {
                f += this.f14734j;
            }
            int min = Math.min(f2, bVar.f14743w - f);
            if (f > 0 && min > 0 && this.f14726a == null && this.f14728c == null && this.f14727b == null) {
                bVar.skip(f);
                bVar.read(new byte[min]);
            }
            if (f14713m) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f + ", length: " + min);
            }
        }
    }

    public final boolean q(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int f = cVar.f(this.f14731g);
            int f2 = cVar2.f(this.f14731g);
            if (f <= 512 && f2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r(InputStream inputStream) {
        boolean z10 = f14713m;
        if (inputStream != null) {
            for (int i6 = 0; i6 < I.length; i6++) {
                try {
                    try {
                        this.f14730e[i6] = new HashMap<>();
                    } catch (IOException e10) {
                        if (z10) {
                            Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                        }
                        a();
                        if (!z10) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    a();
                    if (z10) {
                        t();
                    }
                    throw th2;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f14729d = i(bufferedInputStream);
            b bVar = new b(bufferedInputStream);
            switch (this.f14729d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    m(bVar);
                    break;
                case 4:
                    h(bVar, 0, 0);
                    a();
                    if (z10) {
                        t();
                        return;
                    }
                    return;
                case 7:
                    j(bVar);
                    break;
                case 9:
                    l(bVar);
                    a();
                    if (z10) {
                        t();
                        return;
                    }
                    return;
                case 10:
                    n(bVar);
                    a();
                    if (z10) {
                        t();
                        return;
                    }
                    return;
                case 12:
                    g(bVar);
                    break;
                case 13:
                    k(bVar);
                    a();
                    if (z10) {
                        t();
                        return;
                    }
                    return;
                case 14:
                    o(bVar);
                    a();
                    if (z10) {
                        t();
                        return;
                    }
                    return;
            }
            bVar.a(this.f14733i);
            x(bVar);
            a();
            if (!z10) {
                return;
            }
            t();
            return;
        }
        throw new NullPointerException("inputstream shouldn't be null");
    }

    public final void s(b bVar, int i6) {
        ByteOrder u10 = u(bVar);
        this.f14731g = u10;
        bVar.f14742v = u10;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f14729d;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt >= 8 && readInt < i6) {
            int i11 = readInt - 8;
            if (i11 > 0 && bVar.skipBytes(i11) != i11) {
                throw new IOException(defpackage.c.p("Couldn't jump to first Ifd: ", i11));
            }
            return;
        }
        throw new IOException(defpackage.c.p("Invalid first Ifd offset: ", readInt));
    }

    public final void t() {
        int i6 = 0;
        while (true) {
            HashMap<String, c>[] hashMapArr = this.f14730e;
            if (i6 < hashMapArr.length) {
                StringBuilder u10 = defpackage.c.u("The size of tag group[", i6, "]: ");
                u10.append(hashMapArr[i6].size());
                Log.d("ExifInterface", u10.toString());
                for (Map.Entry<String, c> entry : hashMapArr[i6].entrySet()) {
                    c value = entry.getValue();
                    Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.g(this.f14731g) + "'");
                }
                i6++;
            } else {
                return;
            }
        }
    }

    public final void v(byte[] bArr, int i6) {
        b bVar = new b(bArr);
        s(bVar, bArr.length);
        w(bVar, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(b bVar, int i6) {
        HashMap<String, c>[] hashMapArr;
        String str;
        short s10;
        HashSet hashSet;
        int i10;
        int[] iArr;
        boolean z10;
        long j10;
        boolean z11;
        int i11;
        d dVar;
        HashMap<String, c>[] hashMapArr2;
        int i12;
        boolean z12;
        String str2;
        String str3;
        int readUnsignedShort;
        long j11;
        HashSet hashSet2;
        long j12;
        String str4;
        long j13;
        String str5;
        String str6;
        Integer valueOf = Integer.valueOf(bVar.f14744x);
        HashSet hashSet3 = this.f;
        hashSet3.add(valueOf);
        int i13 = bVar.f14744x + 2;
        int i14 = bVar.f14743w;
        if (i13 > i14) {
            return;
        }
        short readShort = bVar.readShort();
        boolean z13 = f14713m;
        String str7 = "ExifInterface";
        if (z13) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if ((readShort * 12) + bVar.f14744x <= i14 && readShort > 0) {
            short s11 = 0;
            while (true) {
                hashMapArr = this.f14730e;
                if (s11 >= readShort) {
                    break;
                }
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int readUnsignedShort3 = bVar.readUnsignedShort();
                int readInt = bVar.readInt();
                short s12 = s11;
                long j14 = bVar.f14744x + 4;
                d dVar2 = K[i6].get(Integer.valueOf(readUnsignedShort2));
                if (z13) {
                    Object[] objArr = new Object[5];
                    objArr[0] = Integer.valueOf(i6);
                    objArr[1] = Integer.valueOf(readUnsignedShort2);
                    if (dVar2 != null) {
                        s10 = readShort;
                        str6 = dVar2.f14750b;
                    } else {
                        s10 = readShort;
                        str6 = null;
                    }
                    objArr[2] = str6;
                    objArr[3] = Integer.valueOf(readUnsignedShort3);
                    objArr[4] = Integer.valueOf(readInt);
                    Log.d(str7, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr));
                } else {
                    s10 = readShort;
                }
                if (dVar2 == null) {
                    if (z13) {
                        Log.d(str7, "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                    }
                    hashSet = hashSet3;
                    i10 = readUnsignedShort2;
                } else {
                    if (readUnsignedShort3 > 0) {
                        if (readUnsignedShort3 < F.length) {
                            int i15 = dVar2.f14751c;
                            hashSet = hashSet3;
                            if (i15 != 7 && readUnsignedShort3 != 7 && i15 != readUnsignedShort3 && (i11 = dVar2.f14752d) != readUnsignedShort3) {
                                i10 = readUnsignedShort2;
                                if (((i15 != 4 && i11 != 4) || readUnsignedShort3 != 3) && (((i15 != 9 && i11 != 9) || readUnsignedShort3 != 8) && ((i15 != 12 && i11 != 12) || readUnsignedShort3 != 11))) {
                                    z10 = false;
                                    if (z10) {
                                        if (z13) {
                                            Log.d(str7, "Skip the tag entry since data format (" + E[readUnsignedShort3] + ") is unexpected for tag: " + dVar2.f14750b);
                                        }
                                    } else {
                                        if (readUnsignedShort3 == 7) {
                                            readUnsignedShort3 = i15;
                                        }
                                        j10 = iArr[readUnsignedShort3] * readInt;
                                        if (j10 >= 0 && j10 <= 2147483647L) {
                                            z11 = true;
                                            if (!z11) {
                                            }
                                            s11 = (short) (s12 + 1);
                                            z13 = z12;
                                            readShort = s10;
                                            hashSet3 = hashSet;
                                            str7 = str3;
                                        } else {
                                            if (z13) {
                                                Log.d(str7, "Skip the tag entry since the number of components is invalid: " + readInt);
                                            }
                                            z11 = false;
                                            if (!z11) {
                                                bVar.a(j14);
                                                z12 = z13;
                                                str3 = str7;
                                            } else {
                                                if (j10 > 4) {
                                                    int readInt2 = bVar.readInt();
                                                    if (z13) {
                                                        i12 = readUnsignedShort3;
                                                        j12 = j14;
                                                        Log.d(str7, "seek to data offset: " + readInt2);
                                                    } else {
                                                        j12 = j14;
                                                        i12 = readUnsignedShort3;
                                                    }
                                                    if (this.f14729d == 7) {
                                                        if ("MakerNote".equals(dVar2.f14750b)) {
                                                            this.f14734j = readInt2;
                                                        } else if (i6 == 6 && "ThumbnailImage".equals(dVar2.f14750b)) {
                                                            this.f14735k = readInt2;
                                                            this.f14736l = readInt;
                                                            c d10 = c.d(6, this.f14731g);
                                                            dVar = dVar2;
                                                            c b10 = c.b(this.f14735k, this.f14731g);
                                                            z12 = z13;
                                                            str4 = str7;
                                                            c b11 = c.b(this.f14736l, this.f14731g);
                                                            hashMapArr[4].put("Compression", d10);
                                                            hashMapArr[4].put("JPEGInterchangeFormat", b10);
                                                            hashMapArr[4].put("JPEGInterchangeFormatLength", b11);
                                                            j13 = readInt2;
                                                            hashMapArr2 = hashMapArr;
                                                            if (j13 + j10 > i14) {
                                                                bVar.a(j13);
                                                                j14 = j12;
                                                                str2 = str4;
                                                            } else {
                                                                if (z12) {
                                                                    str5 = str4;
                                                                    Log.d(str5, "Skip the tag entry since data offset is invalid: " + readInt2);
                                                                } else {
                                                                    str5 = str4;
                                                                }
                                                                bVar.a(j12);
                                                                str3 = str5;
                                                            }
                                                        }
                                                    }
                                                    z12 = z13;
                                                    str4 = str7;
                                                    dVar = dVar2;
                                                    j13 = readInt2;
                                                    hashMapArr2 = hashMapArr;
                                                    if (j13 + j10 > i14) {
                                                    }
                                                } else {
                                                    dVar = dVar2;
                                                    hashMapArr2 = hashMapArr;
                                                    i12 = readUnsignedShort3;
                                                    z12 = z13;
                                                    str2 = str7;
                                                }
                                                Integer num = N.get(Integer.valueOf(i10));
                                                if (z12) {
                                                    Log.d(str2, "nextIfdType: " + num + " byteCount: " + j10);
                                                }
                                                if (num != null) {
                                                    int i16 = i12;
                                                    if (i16 != 3) {
                                                        if (i16 != 4) {
                                                            if (i16 != 8) {
                                                                if (i16 != 9 && i16 != 13) {
                                                                    j11 = -1;
                                                                } else {
                                                                    readUnsignedShort = bVar.readInt();
                                                                }
                                                            } else {
                                                                readUnsignedShort = bVar.readShort();
                                                            }
                                                        } else {
                                                            j11 = bVar.readInt() & 4294967295L;
                                                        }
                                                        if (z12) {
                                                            Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f14750b));
                                                        }
                                                        if (j11 <= 0 && j11 < i14) {
                                                            hashSet2 = hashSet;
                                                            if (!hashSet2.contains(Integer.valueOf((int) j11))) {
                                                                bVar.a(j11);
                                                                w(bVar, num.intValue());
                                                            } else if (z12) {
                                                                Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j11 + ")");
                                                            }
                                                        } else {
                                                            hashSet2 = hashSet;
                                                            if (z12) {
                                                                Log.d(str2, "Skip jump into the IFD since its offset is invalid: " + j11);
                                                            }
                                                        }
                                                        bVar.a(j14);
                                                        str3 = str2;
                                                        hashSet = hashSet2;
                                                    } else {
                                                        readUnsignedShort = bVar.readUnsignedShort();
                                                    }
                                                    j11 = readUnsignedShort;
                                                    if (z12) {
                                                    }
                                                    if (j11 <= 0) {
                                                    }
                                                    hashSet2 = hashSet;
                                                    if (z12) {
                                                    }
                                                    bVar.a(j14);
                                                    str3 = str2;
                                                    hashSet = hashSet2;
                                                } else {
                                                    d dVar3 = dVar;
                                                    byte[] bArr = new byte[(int) j10];
                                                    bVar.readFully(bArr);
                                                    str3 = str2;
                                                    c cVar = new c(bVar.f14744x + this.f14733i, bArr, i12, readInt);
                                                    hashMapArr2[i6].put(dVar3.f14750b, cVar);
                                                    String str8 = dVar3.f14750b;
                                                    if ("DNGVersion".equals(str8)) {
                                                        this.f14729d = 3;
                                                    }
                                                    if ((("Make".equals(str8) || "Model".equals(str8)) && cVar.g(this.f14731g).contains("PENTAX")) || ("Compression".equals(str8) && cVar.f(this.f14731g) == 65535)) {
                                                        this.f14729d = 8;
                                                    }
                                                    if (bVar.f14744x != j14) {
                                                        bVar.a(j14);
                                                    }
                                                }
                                            }
                                            s11 = (short) (s12 + 1);
                                            z13 = z12;
                                            readShort = s10;
                                            hashSet3 = hashSet;
                                            str7 = str3;
                                        }
                                    }
                                }
                            } else {
                                i10 = readUnsignedShort2;
                            }
                            z10 = true;
                            if (z10) {
                            }
                        }
                    }
                    hashSet = hashSet3;
                    i10 = readUnsignedShort2;
                    if (z13) {
                        Log.d(str7, "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                    }
                }
                j10 = 0;
                z11 = false;
                if (!z11) {
                }
                s11 = (short) (s12 + 1);
                z13 = z12;
                readShort = s10;
                hashSet3 = hashSet;
                str7 = str3;
            }
            HashSet hashSet4 = hashSet3;
            boolean z14 = z13;
            String str9 = str7;
            if (bVar.f14744x + 4 <= i14) {
                int readInt3 = bVar.readInt();
                if (z14) {
                    str = str9;
                    Log.d(str, String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
                } else {
                    str = str9;
                }
                long j15 = readInt3;
                if (j15 > 0 && readInt3 < i14) {
                    if (!hashSet4.contains(Integer.valueOf(readInt3))) {
                        bVar.a(j15);
                        if (hashMapArr[4].isEmpty()) {
                            w(bVar, 4);
                        } else if (hashMapArr[5].isEmpty()) {
                            w(bVar, 5);
                        }
                    } else if (z14) {
                        Log.d(str, "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                    }
                } else if (z14) {
                    Log.d(str, "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(b bVar) {
        boolean z10;
        c cVar;
        int f;
        HashMap<String, c> hashMap = this.f14730e[4];
        c cVar2 = hashMap.get("Compression");
        if (cVar2 != null) {
            int f2 = cVar2.f(this.f14731g);
            int i6 = 1;
            if (f2 != 1) {
                if (f2 != 6) {
                    if (f2 != 7) {
                        return;
                    }
                } else {
                    p(bVar, hashMap);
                    return;
                }
            }
            c cVar3 = hashMap.get("BitsPerSample");
            if (cVar3 != null) {
                int[] iArr = (int[]) cVar3.h(this.f14731g);
                int[] iArr2 = f14716p;
                if (Arrays.equals(iArr2, iArr) || (this.f14729d == 3 && (cVar = hashMap.get("PhotometricInterpretation")) != null && (((f = cVar.f(this.f14731g)) == 1 && Arrays.equals(iArr, f14717q)) || (f == 6 && Arrays.equals(iArr, iArr2))))) {
                    z10 = true;
                    if (!z10) {
                        c cVar4 = hashMap.get("StripOffsets");
                        c cVar5 = hashMap.get("StripByteCounts");
                        if (cVar4 != null && cVar5 != null) {
                            long[] c10 = c(cVar4.h(this.f14731g));
                            long[] c11 = c(cVar5.h(this.f14731g));
                            if (c10 != null && c10.length != 0) {
                                if (c11 != null && c11.length != 0) {
                                    if (c10.length != c11.length) {
                                        Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                        return;
                                    }
                                    long j10 = 0;
                                    for (long j11 : c11) {
                                        j10 += j11;
                                    }
                                    byte[] bArr = new byte[(int) j10];
                                    this.f14732h = true;
                                    int i10 = 0;
                                    int i11 = 0;
                                    int i12 = 0;
                                    while (i10 < c10.length) {
                                        int i13 = (int) c10[i10];
                                        int i14 = (int) c11[i10];
                                        if (i10 < c10.length - i6 && i13 + i14 != c10[i10 + 1]) {
                                            this.f14732h = false;
                                        }
                                        int i15 = i13 - i11;
                                        if (i15 < 0) {
                                            Log.d("ExifInterface", "Invalid strip offset value");
                                            return;
                                        }
                                        long j12 = i15;
                                        if (bVar.skip(j12) != j12) {
                                            Log.d("ExifInterface", "Failed to skip " + i15 + " bytes.");
                                            return;
                                        }
                                        int i16 = i11 + i15;
                                        byte[] bArr2 = new byte[i14];
                                        if (bVar.read(bArr2) != i14) {
                                            Log.d("ExifInterface", "Failed to read " + i14 + " bytes.");
                                            return;
                                        }
                                        i11 = i16 + i14;
                                        System.arraycopy(bArr2, 0, bArr, i12, i14);
                                        i12 += i14;
                                        i10++;
                                        i6 = 1;
                                    }
                                    if (this.f14732h) {
                                        long j13 = c10[0];
                                        return;
                                    }
                                    return;
                                }
                                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                                return;
                            }
                            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            if (f14713m) {
                Log.d("ExifInterface", "Unsupported data type value");
            }
            z10 = false;
            if (!z10) {
            }
        } else {
            p(bVar, hashMap);
        }
    }

    public final void y(int i6, int i10) {
        HashMap<String, c>[] hashMapArr = this.f14730e;
        boolean isEmpty = hashMapArr[i6].isEmpty();
        boolean z10 = f14713m;
        if (!isEmpty && !hashMapArr[i10].isEmpty()) {
            c cVar = hashMapArr[i6].get("ImageLength");
            c cVar2 = hashMapArr[i6].get("ImageWidth");
            c cVar3 = hashMapArr[i10].get("ImageLength");
            c cVar4 = hashMapArr[i10].get("ImageWidth");
            if (cVar != null && cVar2 != null) {
                if (cVar3 != null && cVar4 != null) {
                    int f = cVar.f(this.f14731g);
                    int f2 = cVar2.f(this.f14731g);
                    int f10 = cVar3.f(this.f14731g);
                    int f11 = cVar4.f(this.f14731g);
                    if (f < f10 && f2 < f11) {
                        HashMap<String, c> hashMap = hashMapArr[i6];
                        hashMapArr[i6] = hashMapArr[i10];
                        hashMapArr[i10] = hashMap;
                    }
                } else if (z10) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (z10) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void z(b bVar, int i6) {
        c d10;
        c d11;
        HashMap<String, c>[] hashMapArr = this.f14730e;
        c cVar = hashMapArr[i6].get("DefaultCropSize");
        c cVar2 = hashMapArr[i6].get("SensorTopBorder");
        c cVar3 = hashMapArr[i6].get("SensorLeftBorder");
        c cVar4 = hashMapArr[i6].get("SensorBottomBorder");
        c cVar5 = hashMapArr[i6].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f14745a == 5) {
                e[] eVarArr = (e[]) cVar.h(this.f14731g);
                if (eVarArr != null && eVarArr.length == 2) {
                    d10 = c.c(eVarArr[0], this.f14731g);
                    d11 = c.c(eVarArr[1], this.f14731g);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) cVar.h(this.f14731g);
                if (iArr != null && iArr.length == 2) {
                    d10 = c.d(iArr[0], this.f14731g);
                    d11 = c.d(iArr[1], this.f14731g);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i6].put("ImageWidth", d10);
            hashMapArr[i6].put("ImageLength", d11);
        } else if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int f = cVar2.f(this.f14731g);
            int f2 = cVar4.f(this.f14731g);
            int f10 = cVar5.f(this.f14731g);
            int f11 = cVar3.f(this.f14731g);
            if (f2 > f && f10 > f11) {
                c d12 = c.d(f2 - f, this.f14731g);
                c d13 = c.d(f10 - f11, this.f14731g);
                hashMapArr[i6].put("ImageLength", d12);
                hashMapArr[i6].put("ImageWidth", d13);
            }
        } else {
            c cVar6 = hashMapArr[i6].get("ImageLength");
            c cVar7 = hashMapArr[i6].get("ImageWidth");
            if (cVar6 == null || cVar7 == null) {
                c cVar8 = hashMapArr[i6].get("JPEGInterchangeFormat");
                c cVar9 = hashMapArr[i6].get("JPEGInterchangeFormatLength");
                if (cVar8 != null && cVar9 != null) {
                    int f12 = cVar8.f(this.f14731g);
                    int f13 = cVar8.f(this.f14731g);
                    bVar.a(f12);
                    byte[] bArr = new byte[f13];
                    bVar.read(bArr);
                    h(new b(bArr), f12, i6);
                }
            }
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: y  reason: collision with root package name */
        public static final ByteOrder f14739y = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: z  reason: collision with root package name */
        public static final ByteOrder f14740z = ByteOrder.BIG_ENDIAN;

        /* renamed from: u  reason: collision with root package name */
        public final DataInputStream f14741u;

        /* renamed from: v  reason: collision with root package name */
        public ByteOrder f14742v;

        /* renamed from: w  reason: collision with root package name */
        public final int f14743w;

        /* renamed from: x  reason: collision with root package name */
        public int f14744x;

        public b(InputStream inputStream) {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.f14742v = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f14741u = dataInputStream;
            int available = dataInputStream.available();
            this.f14743w = available;
            this.f14744x = 0;
            dataInputStream.mark(available);
            this.f14742v = byteOrder;
        }

        public final void a(long j10) {
            int i6 = this.f14744x;
            if (i6 > j10) {
                this.f14744x = 0;
                DataInputStream dataInputStream = this.f14741u;
                dataInputStream.reset();
                dataInputStream.mark(this.f14743w);
            } else {
                j10 -= i6;
            }
            int i10 = (int) j10;
            if (skipBytes(i10) == i10) {
                return;
            }
            throw new IOException("Couldn't seek up to the byteCount");
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f14741u.available();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i6) {
            this.f14741u.mark(i6);
        }

        @Override // java.io.InputStream
        public final int read() {
            this.f14744x++;
            return this.f14741u.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.f14744x++;
            return this.f14741u.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            int i6 = this.f14744x + 1;
            this.f14744x = i6;
            if (i6 <= this.f14743w) {
                int read = this.f14741u.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.f14744x += 2;
            return this.f14741u.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i6, int i10) {
            int i11 = this.f14744x + i10;
            this.f14744x = i11;
            if (i11 <= this.f14743w) {
                if (this.f14741u.read(bArr, i6, i10) != i10) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final int readInt() {
            int i6 = this.f14744x + 4;
            this.f14744x = i6;
            if (i6 <= this.f14743w) {
                DataInputStream dataInputStream = this.f14741u;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                int read3 = dataInputStream.read();
                int read4 = dataInputStream.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f14742v;
                    if (byteOrder == f14739y) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f14740z) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f14742v);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() {
            int i6 = this.f14744x + 8;
            this.f14744x = i6;
            if (i6 <= this.f14743w) {
                DataInputStream dataInputStream = this.f14741u;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                int read3 = dataInputStream.read();
                int read4 = dataInputStream.read();
                int read5 = dataInputStream.read();
                int read6 = dataInputStream.read();
                int read7 = dataInputStream.read();
                int read8 = dataInputStream.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f14742v;
                    if (byteOrder == f14739y) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f14740z) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    throw new IOException("Invalid byte order: " + this.f14742v);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final short readShort() {
            int i6 = this.f14744x + 2;
            this.f14744x = i6;
            if (i6 <= this.f14743w) {
                DataInputStream dataInputStream = this.f14741u;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f14742v;
                    if (byteOrder == f14739y) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f14740z) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f14742v);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.f14744x += 2;
            return this.f14741u.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.f14744x++;
            return this.f14741u.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            int i6 = this.f14744x + 2;
            this.f14744x = i6;
            if (i6 <= this.f14743w) {
                DataInputStream dataInputStream = this.f14741u;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f14742v;
                    if (byteOrder == f14739y) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f14740z) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f14742v);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i6) {
            int min = Math.min(i6, this.f14743w - this.f14744x);
            int i10 = 0;
            while (i10 < min) {
                i10 += this.f14741u.skipBytes(min - i10);
            }
            this.f14744x += i10;
            return i10;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i6, int i10) {
            int read = this.f14741u.read(bArr, i6, i10);
            this.f14744x += read;
            return read;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            int length = this.f14744x + bArr.length;
            this.f14744x = length;
            if (length <= this.f14743w) {
                if (this.f14741u.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f14749a;

        /* renamed from: b  reason: collision with root package name */
        public final String f14750b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14751c;

        /* renamed from: d  reason: collision with root package name */
        public final int f14752d;

        public d(String str, int i6, int i10) {
            this.f14750b = str;
            this.f14749a = i6;
            this.f14751c = i10;
            this.f14752d = -1;
        }

        public d(String str, int i6, int i10, int i11) {
            this.f14750b = str;
            this.f14749a = i6;
            this.f14751c = i10;
            this.f14752d = i11;
        }
    }

    /* compiled from: ExifInterface.java */
    /* renamed from: f1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0228a extends MediaDataSource {

        /* renamed from: u  reason: collision with root package name */
        public long f14737u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ b f14738v;

        public C0228a(b bVar) {
            this.f14738v = bVar;
        }

        @Override // android.media.MediaDataSource
        public final long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j10, byte[] bArr, int i6, int i10) {
            if (i10 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f14737u;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f14738v.available()) {
                        return -1;
                    }
                    this.f14738v.a(j10);
                    this.f14737u = j10;
                }
                if (i10 > this.f14738v.available()) {
                    i10 = this.f14738v.available();
                }
                int read = this.f14738v.read(bArr, i6, i10);
                if (read >= 0) {
                    this.f14737u += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f14737u = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    public a(InputStream inputStream) {
        boolean z10;
        d[][] dVarArr = I;
        this.f14730e = new HashMap[dVarArr.length];
        this.f = new HashSet(dVarArr.length);
        this.f14731g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f14726a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f14728c = (AssetManager.AssetInputStream) inputStream;
                this.f14727b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        z10 = true;
                    } catch (Exception unused) {
                        if (f14713m) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z10 = false;
                    }
                    if (z10) {
                        this.f14728c = null;
                        this.f14727b = fileInputStream.getFD();
                    }
                }
                this.f14728c = null;
                this.f14727b = null;
            }
            r(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
