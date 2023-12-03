package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.e;
import t0.s0;
import t0.t;
/* compiled from: BottomSheetDialog.java */
/* loaded from: classes.dex */
public final class a implements t {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f8857u;

    public a(e eVar) {
        this.f8857u = eVar;
    }

    @Override // t0.t
    public final s0 i(View view, s0 s0Var) {
        e eVar = this.f8857u;
        e.b bVar = eVar.F;
        if (bVar != null) {
            eVar.f8860y.removeBottomSheetCallback(bVar);
        }
        e.b bVar2 = new e.b(eVar.B, s0Var);
        eVar.F = bVar2;
        bVar2.e(eVar.getWindow());
        eVar.f8860y.addBottomSheetCallback(eVar.F);
        return s0Var;
    }
}
