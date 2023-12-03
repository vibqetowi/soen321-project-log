package j$.time.chrono;
/* loaded from: classes3.dex */
abstract /* synthetic */ class B {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ int[] f20799a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f20799a = iArr;
        try {
            iArr[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20799a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20799a[j$.time.temporal.a.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
