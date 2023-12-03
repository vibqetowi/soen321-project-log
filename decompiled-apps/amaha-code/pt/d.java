package pt;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: AnnotationQualifiersFqNames.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final fu.c f28863a = new fu.c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b  reason: collision with root package name */
    public static final fu.c f28864b = new fu.c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c  reason: collision with root package name */
    public static final fu.c f28865c = new fu.c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d  reason: collision with root package name */
    public static final fu.c f28866d = new fu.c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e  reason: collision with root package name */
    public static final List<c> f28867e;
    public static final Map<fu.c, s> f;

    /* renamed from: g  reason: collision with root package name */
    public static final LinkedHashMap f28868g;

    /* renamed from: h  reason: collision with root package name */
    public static final Set<fu.c> f28869h;

    static {
        c cVar = c.VALUE_PARAMETER;
        List<c> P0 = ca.a.P0(c.FIELD, c.METHOD_RETURN_TYPE, cVar, c.TYPE_PARAMETER_BOUNDS, c.TYPE_USE);
        f28867e = P0;
        fu.c cVar2 = e0.f28888c;
        xt.j jVar = xt.j.NOT_NULL;
        Map<fu.c, s> Q = sp.b.Q(new hs.f(cVar2, new s(new xt.k(jVar, false), P0, false)));
        f = Q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(is.e0.u0(new hs.f(new fu.c("javax.annotation.ParametersAreNullableByDefault"), new s(new xt.k(xt.j.NULLABLE, false), ca.a.O0(cVar))), new hs.f(new fu.c("javax.annotation.ParametersAreNonnullByDefault"), new s(new xt.k(jVar, false), ca.a.O0(cVar)))));
        linkedHashMap.putAll(Q);
        f28868g = linkedHashMap;
        f28869h = ca.a.m1(e0.f28890e, e0.f);
    }
}
