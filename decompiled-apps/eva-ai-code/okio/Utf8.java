package okio;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Utf8.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0080\b\u001a4\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001a\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001c\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a%\u0010\u001d\u001a\u00020\u001e*\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"HIGH_SURROGATE_HEADER", "", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", "", "REPLACEMENT_CHARACTER", "", "REPLACEMENT_CODE_POINT", "isIsoControl", "", "codePoint", "isUtf8Continuation", "byte", "process2Utf8Bytes", "", "beginIndex", "endIndex", "yield", "Lkotlin/Function1;", "", "process3Utf8Bytes", "process4Utf8Bytes", "processUtf16Chars", "processUtf8Bytes", "", "processUtf8CodePoints", "utf8Size", "", "size", "okio"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i) {
        if (i >= 0 && i < 32) {
            return true;
        }
        return 127 <= i && i < 160;
    }

    public static final boolean isUtf8Continuation(byte b) {
        return (b & 192) == 128;
    }

    public static final long size(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static final long size(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return size$default(str, i, 0, 2, null);
    }

    public static /* synthetic */ long size$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return size(str, i, i2);
    }

    public static final long size(String str, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        long j = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j++;
            } else {
                if (charAt < 2048) {
                    i3 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i3 = 3;
                } else {
                    int i4 = i + 1;
                    char charAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j++;
                        i = i4;
                    } else {
                        j += 4;
                        i += 2;
                    }
                }
                j += i3;
            }
            i++;
        }
        return j;
    }

    public static final void processUtf8Bytes(String str, int i, int i2, Function1<? super Byte, Unit> yield) {
        int i3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (Intrinsics.compare((int) charAt, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) charAt));
                i++;
                while (i < i2 && Intrinsics.compare((int) str.charAt(i), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i)));
                    i++;
                }
            } else {
                if (Intrinsics.compare((int) charAt, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((charAt >> 6) | PsExtractor.AUDIO_STREAM)));
                    yield.invoke(Byte.valueOf((byte) ((charAt & '?') | 128)));
                } else {
                    boolean z = false;
                    if (!(55296 <= charAt && charAt < 57344)) {
                        yield.invoke(Byte.valueOf((byte) ((charAt >> '\f') | 224)));
                        yield.invoke(Byte.valueOf((byte) (((charAt >> 6) & 63) | 128)));
                        yield.invoke(Byte.valueOf((byte) ((charAt & '?') | 128)));
                    } else {
                        if (Intrinsics.compare((int) charAt, 56319) <= 0 && i2 > (i3 = i + 1)) {
                            char charAt2 = str.charAt(i3);
                            if (56320 <= charAt2 && charAt2 < 57344) {
                                z = true;
                            }
                            if (z) {
                                int charAt3 = ((charAt << '\n') + str.charAt(i3)) - 56613888;
                                yield.invoke(Byte.valueOf((byte) ((charAt3 >> 18) | PsExtractor.VIDEO_STREAM_MASK)));
                                yield.invoke(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                                yield.invoke(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                                yield.invoke(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                                i += 2;
                            }
                        }
                        yield.invoke(Byte.valueOf((byte) REPLACEMENT_BYTE));
                    }
                }
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0114, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void processUtf8CodePoints(byte[] bArr, int i, int i2, Function1<? super Integer, Unit> yield) {
        int i3;
        Integer valueOf;
        Integer valueOf2;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i4 = i;
        while (i4 < i2) {
            byte b = bArr[i4];
            if (b >= 0) {
                yield.invoke(Integer.valueOf(b));
                i4++;
                while (i4 < i2) {
                    byte b2 = bArr[i4];
                    if (b2 >= 0) {
                        i4++;
                        yield.invoke(Integer.valueOf(b2));
                    }
                }
            } else {
                if ((b >> 5) == -2) {
                    int i5 = i4 + 1;
                    if (i2 > i5) {
                        byte b3 = bArr[i5];
                        if ((b3 & 192) == 128) {
                            int i6 = (b << 6) ^ (b3 ^ 3968);
                            yield.invoke(i6 < 128 ? Integer.valueOf((int) REPLACEMENT_CODE_POINT) : Integer.valueOf(i6));
                            Unit unit = Unit.INSTANCE;
                            i3 = 2;
                        }
                    }
                    yield.invoke(Integer.valueOf((int) REPLACEMENT_CODE_POINT));
                    Unit unit2 = Unit.INSTANCE;
                    i3 = 1;
                } else if ((b >> 4) == -2) {
                    int i7 = i4 + 2;
                    if (i2 <= i7) {
                        yield.invoke(Integer.valueOf((int) REPLACEMENT_CODE_POINT));
                        Unit unit3 = Unit.INSTANCE;
                        int i8 = i4 + 1;
                        if (i2 > i8) {
                        }
                        i3 = 1;
                    } else {
                        byte b4 = bArr[i4 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i7];
                            if ((b5 & 192) == 128) {
                                int i9 = (b << Ascii.FF) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                if (i9 >= 2048) {
                                    if (55296 <= i9 && i9 < 57344) {
                                        r9 = true;
                                    }
                                    if (!r9) {
                                        valueOf = Integer.valueOf(i9);
                                        yield.invoke(valueOf);
                                        Unit unit4 = Unit.INSTANCE;
                                        i3 = 3;
                                    }
                                }
                                valueOf = Integer.valueOf((int) REPLACEMENT_CODE_POINT);
                                yield.invoke(valueOf);
                                Unit unit42 = Unit.INSTANCE;
                                i3 = 3;
                            } else {
                                yield.invoke(Integer.valueOf((int) REPLACEMENT_CODE_POINT));
                                Unit unit5 = Unit.INSTANCE;
                                i3 = 2;
                            }
                        } else {
                            yield.invoke(Integer.valueOf((int) REPLACEMENT_CODE_POINT));
                            Unit unit6 = Unit.INSTANCE;
                            i3 = 1;
                        }
                    }
                } else if ((b >> 3) == -2) {
                    int i10 = i4 + 3;
                    if (i2 <= i10) {
                        yield.invoke(Integer.valueOf((int) REPLACEMENT_CODE_POINT));
                        Unit unit7 = Unit.INSTANCE;
                        int i11 = i4 + 1;
                        if (i2 > i11) {
                            if ((bArr[i11] & 192) == 128) {
                                int i12 = i4 + 2;
                                if (i2 > i12) {
                                }
                                i3 = 2;
                            }
                        }
                        i3 = 1;
                    } else {
                        byte b6 = bArr[i4 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i4 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i10];
                                if ((b8 & 192) == 128) {
                                    int i13 = (b << Ascii.DC2) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << Ascii.FF));
                                    if (i13 <= 1114111) {
                                        if (55296 <= i13 && i13 < 57344) {
                                            r9 = true;
                                        }
                                        if (!r9 && i13 >= 65536) {
                                            valueOf2 = Integer.valueOf(i13);
                                            yield.invoke(valueOf2);
                                            Unit unit8 = Unit.INSTANCE;
                                            i3 = 4;
                                        }
                                    }
                                    valueOf2 = Integer.valueOf((int) REPLACEMENT_CODE_POINT);
                                    yield.invoke(valueOf2);
                                    Unit unit82 = Unit.INSTANCE;
                                    i3 = 4;
                                } else {
                                    yield.invoke(Integer.valueOf((int) REPLACEMENT_CODE_POINT));
                                    Unit unit9 = Unit.INSTANCE;
                                    i3 = 3;
                                }
                            } else {
                                yield.invoke(Integer.valueOf((int) REPLACEMENT_CODE_POINT));
                                Unit unit10 = Unit.INSTANCE;
                                i3 = 2;
                            }
                        } else {
                            yield.invoke(Integer.valueOf((int) REPLACEMENT_CODE_POINT));
                            Unit unit11 = Unit.INSTANCE;
                            i3 = 1;
                        }
                    }
                } else {
                    yield.invoke(Integer.valueOf((int) REPLACEMENT_CODE_POINT));
                    i4++;
                }
                i4 += i3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0116, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void processUtf16Chars(byte[] bArr, int i, int i2, Function1<? super Character, Unit> yield) {
        int i3;
        char c;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i4 = i;
        while (i4 < i2) {
            byte b = bArr[i4];
            if (b >= 0) {
                yield.invoke(Character.valueOf((char) b));
                i4++;
                while (i4 < i2) {
                    byte b2 = bArr[i4];
                    if (b2 >= 0) {
                        i4++;
                        yield.invoke(Character.valueOf((char) b2));
                    }
                }
            } else {
                if ((b >> 5) == -2) {
                    int i5 = i4 + 1;
                    if (i2 > i5) {
                        byte b3 = bArr[i5];
                        if ((b3 & 192) == 128) {
                            int i6 = (b << 6) ^ (b3 ^ 3968);
                            yield.invoke(Character.valueOf(i6 < 128 ? (char) REPLACEMENT_CODE_POINT : (char) i6));
                            Unit unit = Unit.INSTANCE;
                            i3 = 2;
                        }
                    }
                    yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                    Unit unit2 = Unit.INSTANCE;
                    i3 = 1;
                } else if ((b >> 4) == -2) {
                    int i7 = i4 + 2;
                    if (i2 <= i7) {
                        yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                        Unit unit3 = Unit.INSTANCE;
                        int i8 = i4 + 1;
                        if (i2 > i8) {
                        }
                        i3 = 1;
                    } else {
                        byte b4 = bArr[i4 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i7];
                            if ((b5 & 192) == 128) {
                                int i9 = (b << Ascii.FF) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                if (i9 >= 2048) {
                                    if (55296 <= i9 && i9 < 57344) {
                                        r9 = true;
                                    }
                                    if (!r9) {
                                        c = (char) i9;
                                        yield.invoke(Character.valueOf(c));
                                        Unit unit4 = Unit.INSTANCE;
                                        i3 = 3;
                                    }
                                }
                                c = (char) REPLACEMENT_CODE_POINT;
                                yield.invoke(Character.valueOf(c));
                                Unit unit42 = Unit.INSTANCE;
                                i3 = 3;
                            } else {
                                yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                                Unit unit5 = Unit.INSTANCE;
                                i3 = 2;
                            }
                        } else {
                            yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                            Unit unit6 = Unit.INSTANCE;
                            i3 = 1;
                        }
                    }
                } else if ((b >> 3) == -2) {
                    int i10 = i4 + 3;
                    if (i2 <= i10) {
                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                        Unit unit7 = Unit.INSTANCE;
                        int i11 = i4 + 1;
                        if (i2 > i11) {
                            if ((bArr[i11] & 192) == 128) {
                                int i12 = i4 + 2;
                                if (i2 > i12) {
                                }
                                i3 = 2;
                            }
                        }
                        i3 = 1;
                    } else {
                        byte b6 = bArr[i4 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i4 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i10];
                                if ((b8 & 192) == 128) {
                                    int i13 = (b << Ascii.DC2) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << Ascii.FF));
                                    if (i13 <= 1114111) {
                                        if (55296 <= i13 && i13 < 57344) {
                                            r9 = true;
                                        }
                                        if (!r9 && i13 >= 65536 && i13 != 65533) {
                                            yield.invoke(Character.valueOf((char) ((i13 >>> 10) + HIGH_SURROGATE_HEADER)));
                                            yield.invoke(Character.valueOf((char) ((i13 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + LOG_SURROGATE_HEADER)));
                                            Unit unit8 = Unit.INSTANCE;
                                            i3 = 4;
                                        }
                                    }
                                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    Unit unit82 = Unit.INSTANCE;
                                    i3 = 4;
                                } else {
                                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    Unit unit9 = Unit.INSTANCE;
                                    i3 = 3;
                                }
                            } else {
                                yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                Unit unit10 = Unit.INSTANCE;
                                i3 = 2;
                            }
                        } else {
                            yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                            Unit unit11 = Unit.INSTANCE;
                            i3 = 1;
                        }
                    }
                } else {
                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                    i4++;
                }
                i4 += i3;
            }
        }
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i, int i2, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i3 = i + 1;
        Integer valueOf = Integer.valueOf((int) REPLACEMENT_CODE_POINT);
        if (i2 <= i3) {
            yield.invoke(valueOf);
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i3];
        if (!((b2 & 192) == 128)) {
            yield.invoke(valueOf);
            return 1;
        }
        int i4 = (b2 ^ 3968) ^ (b << 6);
        if (i4 < 128) {
            yield.invoke(valueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i4));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i, int i2, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i3 = i + 2;
        Integer valueOf = Integer.valueOf((int) REPLACEMENT_CODE_POINT);
        if (i2 <= i3) {
            yield.invoke(valueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if (!((b2 & 192) == 128)) {
            yield.invoke(valueOf);
            return 1;
        }
        byte b3 = bArr[i3];
        if (!((b3 & 192) == 128)) {
            yield.invoke(valueOf);
            return 2;
        }
        int i5 = ((b3 ^ (-123008)) ^ (b2 << 6)) ^ (b << Ascii.FF);
        if (i5 < 2048) {
            yield.invoke(valueOf);
            return 3;
        }
        if (55296 <= i5 && i5 < 57344) {
            r2 = true;
        }
        if (r2) {
            yield.invoke(valueOf);
            return 3;
        }
        yield.invoke(Integer.valueOf(i5));
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i, int i2, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i3 = i + 3;
        Integer valueOf = Integer.valueOf((int) REPLACEMENT_CODE_POINT);
        if (i2 <= i3) {
            yield.invoke(valueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & 192) == 128) {
                    int i5 = i + 2;
                    if (i2 > i5) {
                        if ((bArr[i5] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if (!((b2 & 192) == 128)) {
            yield.invoke(valueOf);
            return 1;
        }
        byte b3 = bArr[i + 2];
        if (!((b3 & 192) == 128)) {
            yield.invoke(valueOf);
            return 2;
        }
        byte b4 = bArr[i3];
        if (!((b4 & 192) == 128)) {
            yield.invoke(valueOf);
            return 3;
        }
        int i6 = (((b4 ^ 3678080) ^ (b3 << 6)) ^ (b2 << Ascii.FF)) ^ (b << Ascii.DC2);
        if (i6 > 1114111) {
            yield.invoke(valueOf);
            return 4;
        }
        if (55296 <= i6 && i6 < 57344) {
            r3 = true;
        }
        if (r3) {
            yield.invoke(valueOf);
            return 4;
        } else if (i6 < 65536) {
            yield.invoke(valueOf);
            return 4;
        } else {
            yield.invoke(Integer.valueOf(i6));
            return 4;
        }
    }
}
