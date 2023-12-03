package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: u  reason: collision with root package name */
    public final f f1086u;

    /* renamed from: v  reason: collision with root package name */
    public int f1087v = -1;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1088w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f1089x;

    /* renamed from: y  reason: collision with root package name */
    public final LayoutInflater f1090y;

    /* renamed from: z  reason: collision with root package name */
    public final int f1091z;

    public e(f fVar, LayoutInflater layoutInflater, boolean z10, int i6) {
        this.f1089x = z10;
        this.f1090y = layoutInflater;
        this.f1086u = fVar;
        this.f1091z = i6;
        b();
    }

    public final void b() {
        f fVar = this.f1086u;
        h hVar = fVar.f1112v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.f1101j;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (arrayList.get(i6) == hVar) {
                    this.f1087v = i6;
                    return;
                }
            }
        }
        this.f1087v = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public final h getItem(int i6) {
        ArrayList<h> l2;
        boolean z10 = this.f1089x;
        f fVar = this.f1086u;
        if (z10) {
            fVar.i();
            l2 = fVar.f1101j;
        } else {
            l2 = fVar.l();
        }
        int i10 = this.f1087v;
        if (i10 >= 0 && i6 >= i10) {
            i6++;
        }
        return l2.get(i6);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<h> l2;
        boolean z10 = this.f1089x;
        f fVar = this.f1086u;
        if (z10) {
            fVar.i();
            l2 = fVar.f1101j;
        } else {
            l2 = fVar.l();
        }
        if (this.f1087v < 0) {
            return l2.size();
        }
        return l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        int i10;
        boolean z10 = false;
        if (view == null) {
            view = this.f1090y.inflate(this.f1091z, viewGroup, false);
        }
        int i11 = getItem(i6).f1119b;
        int i12 = i6 - 1;
        if (i12 >= 0) {
            i10 = getItem(i12).f1119b;
        } else {
            i10 = i11;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f1086u.m() && i11 != i10) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        k.a aVar = (k.a) view;
        if (this.f1088w) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i6));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
