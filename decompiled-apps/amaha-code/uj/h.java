package uj;

import java.util.List;
/* compiled from: ExpandedTemplate.kt */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f34195a;

    /* renamed from: b  reason: collision with root package name */
    public final j f34196b;

    /* renamed from: c  reason: collision with root package name */
    public final List<r> f34197c;

    /* renamed from: d  reason: collision with root package name */
    public List<a> f34198d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f34199e;

    /* JADX WARN: Multi-variable type inference failed */
    public h(String type, j jVar, List<? extends r> actionButtonList, List<a> cards, boolean z10) {
        kotlin.jvm.internal.i.g(type, "type");
        kotlin.jvm.internal.i.g(actionButtonList, "actionButtonList");
        kotlin.jvm.internal.i.g(cards, "cards");
        this.f34195a = type;
        this.f34196b = jVar;
        this.f34197c = actionButtonList;
        this.f34198d = cards;
        this.f34199e = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExpandedTemplate(type='");
        sb2.append(this.f34195a);
        sb2.append("', layoutStyle=");
        sb2.append(this.f34196b);
        sb2.append(", actionButtonList=");
        sb2.append(this.f34197c);
        sb2.append(", cards=");
        sb2.append(this.f34198d);
        sb2.append(", autoStart=");
        return defpackage.c.t(sb2, this.f34199e, ')');
    }
}
