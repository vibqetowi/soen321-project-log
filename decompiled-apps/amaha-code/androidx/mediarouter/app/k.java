package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: MediaRouteControllerDialogFragment.java */
/* loaded from: classes.dex */
public class k extends androidx.fragment.app.n {

    /* renamed from: u  reason: collision with root package name */
    public boolean f2598u = false;

    /* renamed from: v  reason: collision with root package name */
    public g.r f2599v;

    /* renamed from: w  reason: collision with root package name */
    public r1.k f2600w;

    public k() {
        setCancelable(true);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g.r rVar = this.f2599v;
        if (rVar != null) {
            if (this.f2598u) {
                ((p) rVar).i();
            } else {
                ((g) rVar).o();
            }
        }
    }

    @Override // androidx.fragment.app.n
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f2598u) {
            p pVar = new p(getContext());
            this.f2599v = pVar;
            pVar.h(this.f2600w);
        } else {
            this.f2599v = new g(getContext());
        }
        return this.f2599v;
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        g.r rVar = this.f2599v;
        if (rVar != null && !this.f2598u) {
            ((g) rVar).h(false);
        }
    }
}
