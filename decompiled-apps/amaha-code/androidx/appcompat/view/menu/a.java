package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.j;
import com.theinnerhour.b2b.R;
/* compiled from: BaseMenuPresenter.java */
/* loaded from: classes.dex */
public abstract class a implements j {
    public k B;
    public int C;

    /* renamed from: u  reason: collision with root package name */
    public final Context f1057u;

    /* renamed from: v  reason: collision with root package name */
    public Context f1058v;

    /* renamed from: w  reason: collision with root package name */
    public f f1059w;

    /* renamed from: x  reason: collision with root package name */
    public final LayoutInflater f1060x;

    /* renamed from: y  reason: collision with root package name */
    public j.a f1061y;

    /* renamed from: z  reason: collision with root package name */
    public final int f1062z = R.layout.abc_action_menu_layout;
    public final int A = R.layout.abc_action_menu_item_layout;

    public a(Context context) {
        this.f1057u = context;
        this.f1060x = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.f1061y = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.C;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }
}
