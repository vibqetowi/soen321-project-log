package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.theinnerhour.b2b.R;
/* compiled from: MediaRouteChooserDialogFragment.java */
/* loaded from: classes.dex */
public class c extends androidx.fragment.app.n {

    /* renamed from: u  reason: collision with root package name */
    public boolean f2540u = false;

    /* renamed from: v  reason: collision with root package name */
    public g.r f2541v;

    /* renamed from: w  reason: collision with root package name */
    public r1.k f2542w;

    public c() {
        setCancelable(true);
    }

    public final void F() {
        if (this.f2542w == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f2542w = r1.k.b(arguments.getBundle("selector"));
            }
            if (this.f2542w == null) {
                this.f2542w = r1.k.f30286c;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int a10;
        super.onConfigurationChanged(configuration);
        g.r rVar = this.f2541v;
        if (rVar == null) {
            return;
        }
        int i6 = -2;
        if (this.f2540u) {
            n nVar = (n) rVar;
            Context context = nVar.A;
            if (!context.getResources().getBoolean(R.bool.is_tablet)) {
                a10 = -1;
            } else {
                a10 = m.a(context);
            }
            if (!context.getResources().getBoolean(R.bool.is_tablet)) {
                i6 = -1;
            }
            nVar.getWindow().setLayout(a10, i6);
            return;
        }
        b bVar = (b) rVar;
        bVar.getWindow().setLayout(m.a(bVar.getContext()), -2);
    }

    @Override // androidx.fragment.app.n
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f2540u) {
            n nVar = new n(getContext());
            this.f2541v = nVar;
            F();
            nVar.f(this.f2542w);
        } else {
            b bVar = new b(getContext());
            this.f2541v = bVar;
            F();
            bVar.f(this.f2542w);
        }
        return this.f2541v;
    }
}
