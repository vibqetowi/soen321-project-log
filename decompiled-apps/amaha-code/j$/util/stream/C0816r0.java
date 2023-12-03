package j$.util.stream;

import java.util.function.Predicate;
/* renamed from: j$.util.stream.r0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0816r0 extends AbstractC0834v0 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EnumC0838w0 f21540c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Predicate f21541d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0816r0(EnumC0838w0 enumC0838w0, Predicate predicate) {
        super(enumC0838w0);
        this.f21540c = enumC0838w0;
        this.f21541d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        if (this.f21565a) {
            return;
        }
        boolean test = this.f21541d.test(obj);
        EnumC0838w0 enumC0838w0 = this.f21540c;
        z10 = enumC0838w0.f21578a;
        if (test == z10) {
            this.f21565a = true;
            z11 = enumC0838w0.f21579b;
            this.f21566b = z11;
        }
    }
}
