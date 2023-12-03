package uj;

import java.util.List;
/* compiled from: CollapsedTemplate.kt */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f34192a;

    /* renamed from: b  reason: collision with root package name */
    public final j f34193b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f34194c;

    public f(String type, j jVar, List<a> cards) {
        kotlin.jvm.internal.i.g(type, "type");
        kotlin.jvm.internal.i.g(cards, "cards");
        this.f34192a = type;
        this.f34193b = jVar;
        this.f34194c = cards;
    }

    public String toString() {
        return "CollapsedTemplate(type='" + this.f34192a + "', layoutStyle=" + this.f34193b + ", cards=" + this.f34194c + ')';
    }
}
