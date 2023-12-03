package qb;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import qb.h;
/* compiled from: CheckableGroup.java */
/* loaded from: classes.dex */
public final class b<T extends h<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f29407a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f29408b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public a f29409c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f29410d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f29411e;

    /* compiled from: CheckableGroup.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public final boolean a(h<T> hVar) {
        int id2 = hVar.getId();
        HashSet hashSet = this.f29408b;
        if (hashSet.contains(Integer.valueOf(id2))) {
            return false;
        }
        h<T> hVar2 = (h) this.f29407a.get(Integer.valueOf(d()));
        if (hVar2 != null) {
            f(hVar2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id2));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return add;
    }

    public final void b() {
        boolean z10 = !this.f29408b.isEmpty();
        for (h<T> hVar : this.f29407a.values()) {
            f(hVar, false);
        }
        if (z10) {
            e();
        }
    }

    public final ArrayList c(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f29408b);
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if ((childAt instanceof h) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int d() {
        if (this.f29410d) {
            HashSet hashSet = this.f29408b;
            if (!hashSet.isEmpty()) {
                return ((Integer) hashSet.iterator().next()).intValue();
            }
        }
        return -1;
    }

    public final void e() {
        a aVar = this.f29409c;
        if (aVar != null) {
            new HashSet(this.f29408b);
            ChipGroup chipGroup = ((com.google.android.material.chip.b) aVar).f8920a;
            ChipGroup.d dVar = chipGroup.A;
            if (dVar != null) {
                dVar.n(chipGroup, chipGroup.B.c(chipGroup));
            }
        }
    }

    public final boolean f(h<T> hVar, boolean z10) {
        int id2 = hVar.getId();
        HashSet hashSet = this.f29408b;
        if (!hashSet.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z10 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id2))) {
            hVar.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id2));
        if (hVar.isChecked()) {
            hVar.setChecked(false);
        }
        return remove;
    }
}
