package uj;

import java.util.Arrays;
/* compiled from: Widget.kt */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f34223a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34224b;

    /* renamed from: c  reason: collision with root package name */
    public final String f34225c;

    /* renamed from: d  reason: collision with root package name */
    public final n f34226d;

    /* renamed from: e  reason: collision with root package name */
    public final qj.a[] f34227e;

    public r(String type, int i6, String content, n nVar, qj.a[] actions) {
        kotlin.jvm.internal.i.g(type, "type");
        kotlin.jvm.internal.i.g(content, "content");
        kotlin.jvm.internal.i.g(actions, "actions");
        this.f34223a = type;
        this.f34224b = i6;
        this.f34225c = content;
        this.f34226d = nVar;
        this.f34227e = actions;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Widget(type='");
        sb2.append(this.f34223a);
        sb2.append("', id=");
        sb2.append(this.f34224b);
        sb2.append(", content='");
        sb2.append(this.f34225c);
        sb2.append("', style=");
        sb2.append(this.f34226d);
        sb2.append(", actions=");
        String arrays = Arrays.toString(this.f34227e);
        kotlin.jvm.internal.i.f(arrays, "toString(this)");
        sb2.append(arrays);
        sb2.append(')');
        return sb2.toString();
    }

    public r(r rVar) {
        this(rVar.f34223a, rVar.f34224b, rVar.f34225c, rVar.f34226d, rVar.f34227e);
    }
}
