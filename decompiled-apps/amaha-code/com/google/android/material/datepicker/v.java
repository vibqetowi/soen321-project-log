package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* compiled from: MaterialTextInputPicker.java */
/* loaded from: classes.dex */
public final class v<S> extends b0<S> {

    /* renamed from: v  reason: collision with root package name */
    public int f8997v;

    /* renamed from: w  reason: collision with root package name */
    public d<S> f8998w;

    /* renamed from: x  reason: collision with root package name */
    public com.google.android.material.datepicker.a f8999x;

    /* compiled from: MaterialTextInputPicker.java */
    /* loaded from: classes.dex */
    public class a extends a0<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.a0
        public final void a(S s10) {
            Iterator<a0<S>> it = v.this.f8940u.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f8997v = bundle.getInt("THEME_RES_ID_KEY");
        this.f8998w = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f8999x = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f8997v));
        d<S> dVar = this.f8998w;
        new a();
        return dVar.a0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f8997v);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f8998w);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f8999x);
    }
}
