package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import com.google.android.material.datepicker.r;
import java.util.LinkedHashSet;
/* compiled from: PickerFragment.java */
/* loaded from: classes.dex */
public abstract class b0<S> extends Fragment {

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashSet<a0<S>> f8940u = new LinkedHashSet<>();

    public boolean F(r.d dVar) {
        return this.f8940u.add(dVar);
    }
}
