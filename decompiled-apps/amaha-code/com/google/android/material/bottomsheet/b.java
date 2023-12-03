package com.google.android.material.bottomsheet;

import android.content.res.TypedArray;
import android.view.View;
/* compiled from: BottomSheetDialog.java */
/* loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f8858u;

    public b(e eVar) {
        this.f8858u = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e eVar = this.f8858u;
        if (eVar.C && eVar.isShowing()) {
            if (!eVar.E) {
                TypedArray obtainStyledAttributes = eVar.getContext().obtainStyledAttributes(new int[]{16843611});
                eVar.D = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                eVar.E = true;
            }
            if (eVar.D) {
                eVar.cancel();
            }
        }
    }
}
