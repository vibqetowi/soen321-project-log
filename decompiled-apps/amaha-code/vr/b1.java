package vr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: InsightBuilder.java */
/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35402a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f35403b;

    public b1(int i6) {
        this.f35402a = 1;
        this.f35403b = new ArrayList(i6);
    }

    public final void a(Object obj) {
        this.f35403b.add(obj);
    }

    public final void b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z10 = obj instanceof Object[];
        ArrayList arrayList = this.f35403b;
        if (z10) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
        } else if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                arrayList.add(obj2);
            }
        } else if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public final void c(Object obj, String str) {
        this.f35403b.add(str + "=" + obj);
    }

    public final int d() {
        return this.f35403b.size();
    }

    public final Object[] e(Object[] objArr) {
        return this.f35403b.toArray(objArr);
    }

    public final String toString() {
        switch (this.f35402a) {
            case 0:
                return this.f35403b.toString();
            default:
                return super.toString();
        }
    }

    public b1() {
        this.f35402a = 0;
        this.f35403b = new ArrayList();
    }
}
