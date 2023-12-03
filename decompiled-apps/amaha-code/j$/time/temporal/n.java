package j$.time.temporal;
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21006a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f21007b;

    public /* synthetic */ n(int i6, int i10) {
        this.f21006a = i10;
        this.f21007b = i6;
    }

    @Override // j$.time.temporal.m
    public final Temporal r(Temporal temporal) {
        int i6 = this.f21006a;
        int i10 = this.f21007b;
        switch (i6) {
            case 0:
                int l2 = temporal.l(a.DAY_OF_WEEK);
                if (l2 == i10) {
                    return temporal;
                }
                int i11 = l2 - i10;
                return temporal.d(i11 >= 0 ? 7 - i11 : -i11, ChronoUnit.DAYS);
            default:
                int l10 = temporal.l(a.DAY_OF_WEEK);
                if (l10 == i10) {
                    return temporal;
                }
                int i12 = i10 - l10;
                return temporal.g(i12 >= 0 ? 7 - i12 : -i12, ChronoUnit.DAYS);
        }
    }
}
