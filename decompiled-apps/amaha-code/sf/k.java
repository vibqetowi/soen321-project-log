package sf;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: JsonArray.java */
/* loaded from: classes.dex */
public final class k extends m implements Iterable<m> {

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f31509u = new ArrayList();

    @Override // sf.m
    public final int e() {
        ArrayList arrayList = this.f31509u;
        if (arrayList.size() == 1) {
            return ((m) arrayList.get(0)).e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof k) || !((k) obj).f31509u.equals(this.f31509u))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f31509u.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<m> iterator() {
        return this.f31509u.iterator();
    }

    @Override // sf.m
    public final String m() {
        ArrayList arrayList = this.f31509u;
        if (arrayList.size() == 1) {
            return ((m) arrayList.get(0)).m();
        }
        throw new IllegalStateException();
    }
}
