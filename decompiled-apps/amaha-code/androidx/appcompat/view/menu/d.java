package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {

    /* renamed from: u  reason: collision with root package name */
    public Context f1078u;

    /* renamed from: v  reason: collision with root package name */
    public LayoutInflater f1079v;

    /* renamed from: w  reason: collision with root package name */
    public f f1080w;

    /* renamed from: x  reason: collision with root package name */
    public ExpandedMenuView f1081x;

    /* renamed from: y  reason: collision with root package name */
    public j.a f1082y;

    /* renamed from: z  reason: collision with root package name */
    public a f1083z;

    /* compiled from: ListMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: u  reason: collision with root package name */
        public int f1084u = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.f1080w;
            h hVar = fVar.f1112v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.f1101j;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    if (arrayList.get(i6) == hVar) {
                        this.f1084u = i6;
                        return;
                    }
                }
            }
            this.f1084u = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: c */
        public final h getItem(int i6) {
            d dVar = d.this;
            f fVar = dVar.f1080w;
            fVar.i();
            ArrayList<h> arrayList = fVar.f1101j;
            dVar.getClass();
            int i10 = i6 + 0;
            int i11 = this.f1084u;
            if (i11 >= 0 && i10 >= i11) {
                i10++;
            }
            return arrayList.get(i10);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            d dVar = d.this;
            f fVar = dVar.f1080w;
            fVar.i();
            int size = fVar.f1101j.size();
            dVar.getClass();
            int i6 = size + 0;
            if (this.f1084u < 0) {
                return i6;
            }
            return i6 - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i6) {
            return i6;
        }

        @Override // android.widget.Adapter
        public final View getView(int i6, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.f1079v.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).c(getItem(i6));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context) {
        this.f1078u = context;
        this.f1079v = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z10) {
        j.a aVar = this.f1082y;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        a aVar = this.f1083z;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.f1082y = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, f fVar) {
        if (this.f1078u != null) {
            this.f1078u = context;
            if (this.f1079v == null) {
                this.f1079v = LayoutInflater.from(context);
            }
        }
        this.f1080w = fVar;
        a aVar = this.f1083z;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1081x.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g(mVar);
        Context context = mVar.f1093a;
        b.a aVar = new b.a(context);
        d dVar = new d(aVar.getContext());
        gVar.f1117w = dVar;
        dVar.f1082y = gVar;
        mVar.b(dVar, context);
        d dVar2 = gVar.f1117w;
        if (dVar2.f1083z == null) {
            dVar2.f1083z = new a();
        }
        a aVar2 = dVar2.f1083z;
        AlertController.b bVar = aVar.f1046a;
        bVar.f1038n = aVar2;
        bVar.f1039o = gVar;
        View view = mVar.f1106o;
        if (view != null) {
            bVar.f = view;
        } else {
            bVar.f1029d = mVar.f1105n;
            aVar.setTitle(mVar.f1104m);
        }
        bVar.f1037m = gVar;
        androidx.appcompat.app.b create = aVar.create();
        gVar.f1116v = create;
        create.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f1116v.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.f1116v.show();
        j.a aVar3 = this.f1082y;
        if (aVar3 != null) {
            aVar3.d(mVar);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        if (this.f1081x == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1081x;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j10) {
        this.f1080w.q(this.f1083z.getItem(i6), this, 0);
    }
}
