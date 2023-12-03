package j$.time.chrono;
/* renamed from: j$.time.chrono.j  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0701j {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ int[] f20823a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f20823a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20823a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
