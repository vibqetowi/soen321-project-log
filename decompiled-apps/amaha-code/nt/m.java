package nt;

import java.lang.reflect.Member;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.f implements ss.l<Member, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public static final m f26821u = new m();

    public m() {
        super(1);
    }

    @Override // kotlin.jvm.internal.a, ys.c
    public final String getName() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.internal.a
    public final ys.f getOwner() {
        return kotlin.jvm.internal.y.a(Member.class);
    }

    @Override // kotlin.jvm.internal.a
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // ss.l
    public final Boolean invoke(Member member) {
        Member p02 = member;
        kotlin.jvm.internal.i.g(p02, "p0");
        return Boolean.valueOf(p02.isSynthetic());
    }
}
