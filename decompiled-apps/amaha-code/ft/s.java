package ft;

import gt.b;
/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.k implements ss.l<gt.b, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f15907u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(k kVar) {
        super(1);
        this.f15907u = kVar;
    }

    @Override // ss.l
    public final Boolean invoke(gt.b bVar) {
        boolean z10;
        gt.b bVar2 = bVar;
        if (bVar2.m0() == b.a.DECLARATION) {
            ca.a aVar = this.f15907u.f15888b;
            gt.j c10 = bVar2.c();
            kotlin.jvm.internal.i.e(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            aVar.getClass();
            String str = c.f15851a;
            if (c.f15859j.containsKey(iu.g.g((gt.e) c10))) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
