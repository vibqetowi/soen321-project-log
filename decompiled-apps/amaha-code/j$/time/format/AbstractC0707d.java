package j$.time.format;
/* renamed from: j$.time.format.d  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0707d {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ int[] f20891a;

    static {
        int[] iArr = new int[G.values().length];
        f20891a = iArr;
        try {
            iArr[G.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20891a[G.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20891a[G.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f20891a[G.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
