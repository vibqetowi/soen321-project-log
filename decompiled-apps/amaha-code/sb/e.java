package sb;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.j;
import cb.b;
import h2.o;
import qb.m;
/* compiled from: NavigationBarPresenter.java */
/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: u  reason: collision with root package name */
    public d f31404u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f31405v = false;

    /* renamed from: w  reason: collision with root package name */
    public int f31406w;

    /* compiled from: NavigationBarPresenter.java */
    /* loaded from: classes.dex */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0536a();

        /* renamed from: u  reason: collision with root package name */
        public int f31407u;

        /* renamed from: v  reason: collision with root package name */
        public m f31408v;

        /* compiled from: NavigationBarPresenter.java */
        /* renamed from: sb.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0536a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i6) {
                return new a[i6];
            }
        }

        public a() {
        }

        public a(Parcel parcel) {
            this.f31407u = parcel.readInt();
            this.f31408v = (m) parcel.readParcelable(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f31407u);
            parcel.writeParcelable(this.f31408v, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        boolean z11;
        h2.a aVar;
        if (this.f31405v) {
            return;
        }
        if (z10) {
            this.f31404u.a();
            return;
        }
        d dVar = this.f31404u;
        androidx.appcompat.view.menu.f fVar = dVar.W;
        if (fVar != null && dVar.f31402z != null) {
            int size = fVar.size();
            if (size != dVar.f31402z.length) {
                dVar.a();
                return;
            }
            int i6 = dVar.A;
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = dVar.W.getItem(i10);
                if (item.isChecked()) {
                    dVar.A = item.getItemId();
                    dVar.B = i10;
                }
            }
            if (i6 != dVar.A && (aVar = dVar.f31397u) != null) {
                o.a(dVar, aVar);
            }
            int i11 = dVar.f31401y;
            int size2 = dVar.W.l().size();
            if (i11 != -1 ? i11 == 0 : size2 > 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i12 = 0; i12 < size; i12++) {
                dVar.V.f31405v = true;
                dVar.f31402z[i12].setLabelVisibilityMode(dVar.f31401y);
                dVar.f31402z[i12].setShifting(z11);
                dVar.f31402z[i12].c((androidx.appcompat.view.menu.h) dVar.W.getItem(i12));
                dVar.V.f31405v = false;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.f31406w;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f31404u.W = fVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        SparseArray<cb.a> sparseArray;
        if (parcelable instanceof a) {
            d dVar = this.f31404u;
            a aVar = (a) parcelable;
            int i6 = aVar.f31407u;
            int size = dVar.W.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                MenuItem item = dVar.W.getItem(i10);
                if (i6 == item.getItemId()) {
                    dVar.A = i6;
                    dVar.B = i10;
                    item.setChecked(true);
                    break;
                }
                i10++;
            }
            Context context = this.f31404u.getContext();
            m mVar = aVar.f31408v;
            SparseArray sparseArray2 = new SparseArray(mVar.size());
            for (int i11 = 0; i11 < mVar.size(); i11++) {
                int keyAt = mVar.keyAt(i11);
                b.a aVar2 = (b.a) mVar.valueAt(i11);
                if (aVar2 != null) {
                    sparseArray2.put(keyAt, new cb.a(context, aVar2));
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            d dVar2 = this.f31404u;
            dVar2.getClass();
            int i12 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = dVar2.L;
                if (i12 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i12);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (cb.a) sparseArray2.get(keyAt2));
                }
                i12++;
            }
            sb.a[] aVarArr = dVar2.f31402z;
            if (aVarArr != null) {
                for (sb.a aVar3 : aVarArr) {
                    aVar3.setBadge(sparseArray.get(aVar3.getId()));
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(androidx.appcompat.view.menu.m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        a aVar = new a();
        aVar.f31407u = this.f31404u.getSelectedItemId();
        SparseArray<cb.a> badgeDrawables = this.f31404u.getBadgeDrawables();
        m mVar = new m();
        for (int i6 = 0; i6 < badgeDrawables.size(); i6++) {
            int keyAt = badgeDrawables.keyAt(i6);
            cb.a valueAt = badgeDrawables.valueAt(i6);
            if (valueAt != null) {
                mVar.put(keyAt, valueAt.f5229y.f5231a);
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        aVar.f31408v = mVar;
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
    }
}
