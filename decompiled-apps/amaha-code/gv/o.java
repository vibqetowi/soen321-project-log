package gv;
/* compiled from: Strings.kt */
/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.k implements ss.p<CharSequence, Integer, hs.f<? extends Integer, ? extends Integer>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ char[] f16954u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f16955v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(char[] cArr, boolean z10) {
        super(2);
        this.f16954u = cArr;
        this.f16955v = z10;
    }

    @Override // ss.p
    public final hs.f<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        CharSequence $receiver = charSequence;
        int intValue = num.intValue();
        kotlin.jvm.internal.i.g($receiver, "$this$$receiver");
        int P0 = r.P0(intValue, $receiver, this.f16955v, this.f16954u);
        if (P0 < 0) {
            return null;
        }
        return new hs.f<>(Integer.valueOf(P0), 1);
    }
}
