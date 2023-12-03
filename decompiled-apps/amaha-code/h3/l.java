package h3;

import java.util.Arrays;
import java.util.List;
/* compiled from: ShapeGroup.java */
/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f17132a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f17133b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17134c;

    public l(String str, List<b> list, boolean z10) {
        this.f17132a = str;
        this.f17133b = list;
        this.f17134c = z10;
    }

    @Override // h3.b
    public final c3.b a(a3.j jVar, i3.b bVar) {
        return new c3.c(jVar, bVar, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f17132a + "' Shapes: " + Arrays.toString(this.f17133b.toArray()) + '}';
    }
}
