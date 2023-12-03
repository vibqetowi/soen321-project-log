package r1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: MediaRouteSelector.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final k f30286c = new k(new Bundle(), null);

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f30287a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f30288b;

    /* compiled from: MediaRouteSelector.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<String> f30289a;

        public a() {
        }

        public final void a(List list) {
            if (list != null) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str != null) {
                            if (this.f30289a == null) {
                                this.f30289a = new ArrayList<>();
                            }
                            if (!this.f30289a.contains(str)) {
                                this.f30289a.add(str);
                            }
                        } else {
                            throw new IllegalArgumentException("category must not be null");
                        }
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("categories must not be null");
        }

        public final k b() {
            if (this.f30289a == null) {
                return k.f30286c;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.f30289a);
            return new k(bundle, this.f30289a);
        }

        public a(k kVar) {
            if (kVar != null) {
                kVar.a();
                if (kVar.f30288b.isEmpty()) {
                    return;
                }
                this.f30289a = new ArrayList<>(kVar.f30288b);
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
    }

    public k(Bundle bundle, ArrayList arrayList) {
        this.f30287a = bundle;
        this.f30288b = arrayList;
    }

    public static k b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new k(bundle, null);
    }

    public final void a() {
        if (this.f30288b == null) {
            ArrayList<String> stringArrayList = this.f30287a.getStringArrayList("controlCategories");
            this.f30288b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f30288b = Collections.emptyList();
            }
        }
    }

    public final boolean c() {
        a();
        return this.f30288b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            a();
            kVar.a();
            return this.f30288b.equals(kVar.f30288b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f30288b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouteSelector{ controlCategories=");
        a();
        sb2.append(Arrays.toString(this.f30288b.toArray()));
        sb2.append(" }");
        return sb2.toString();
    }
}
