package xt;
/* compiled from: AbstractSignatureParts.kt */
/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.k implements ss.l<Object, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a<Object> f38009u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a<Object> aVar) {
        super(1);
        this.f38009u = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r0.f38087d == pt.c.TYPE_PARAMETER_BOUNDS) goto L5;
     */
    @Override // ss.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(Object extractNullability) {
        boolean z10;
        kotlin.jvm.internal.i.g(extractNullability, "$this$extractNullability");
        u uVar = (u) this.f38009u;
        uVar.getClass();
        ht.c cVar = (ht.c) extractNullability;
        if (!(cVar instanceof rt.g) || !((rt.g) cVar).h()) {
            if (cVar instanceof tt.d) {
                ((st.c) uVar.f38086c.f29104v).f31951t.c();
                if (!((tt.d) cVar).f33613h) {
                }
            }
            z10 = false;
            return Boolean.valueOf(z10);
        }
        z10 = true;
        return Boolean.valueOf(z10);
    }
}
