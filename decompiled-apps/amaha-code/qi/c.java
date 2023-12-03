package qi;

import java.util.ArrayList;
import java.util.List;
/* compiled from: ConditionAction.java */
/* loaded from: classes.dex */
public final class c extends bj.a {

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f29596b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29597c;

    public c(int i6, ArrayList arrayList, int i10) {
        super(i6);
        this.f29596b = arrayList;
        this.f29597c = i10;
    }

    public final String toString() {
        return "{\nconditionList:" + this.f29596b + "\n widgetId:" + this.f29597c + "\n actionType:" + defpackage.b.A(this.f4323a) + "\n}";
    }
}
