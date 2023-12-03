package uj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: Card.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f34183a;

    /* renamed from: b  reason: collision with root package name */
    public final List<r> f34184b;

    /* renamed from: c  reason: collision with root package name */
    public final String f34185c;

    /* renamed from: d  reason: collision with root package name */
    public final qj.a[] f34186d;

    public a(int i6, ArrayList arrayList, String str, qj.a[] aVarArr) {
        this.f34183a = i6;
        this.f34184b = arrayList;
        this.f34185c = str;
        this.f34186d = aVarArr;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Card(id=");
        sb2.append(this.f34183a);
        sb2.append(", widgets=");
        sb2.append(this.f34184b);
        sb2.append(", type='");
        sb2.append(this.f34185c);
        sb2.append("', actions=");
        String arrays = Arrays.toString(this.f34186d);
        kotlin.jvm.internal.i.f(arrays, "toString(this)");
        sb2.append(arrays);
        sb2.append(')');
        return sb2.toString();
    }
}
