package yt;

import java.util.HashMap;
import yt.a;
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.k implements ss.l<o, a.C0659a<Object, Object>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a<Object, Object> f39006u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a<Object, Object> aVar) {
        super(1);
        this.f39006u = aVar;
    }

    @Override // ss.l
    public final a.C0659a<Object, Object> invoke(o oVar) {
        o kotlinClass = oVar;
        kotlin.jvm.internal.i.g(kotlinClass, "kotlinClass");
        a<Object, Object> aVar = this.f39006u;
        aVar.getClass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        kotlinClass.b(new b(aVar, hashMap, kotlinClass, hashMap2));
        return new a.C0659a<>(hashMap, hashMap2, hashMap3);
    }
}
