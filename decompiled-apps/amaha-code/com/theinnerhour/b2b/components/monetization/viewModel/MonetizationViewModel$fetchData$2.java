package com.theinnerhour.b2b.components.monetization.viewModel;

import com.google.gson.reflect.TypeToken;
import gv.n;
import hs.k;
import java.util.ArrayList;
import kc.f;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ls.d;
import ns.e;
import ns.i;
import pn.a;
import sp.b;
import ss.p;
import ta.v;
/* compiled from: MonetizationViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$fetchData$2", f = "MonetizationViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MonetizationViewModel$fetchData$2 extends i implements p<d0, d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ MonetizationViewModel f11465u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonetizationViewModel$fetchData$2(MonetizationViewModel monetizationViewModel, d<? super MonetizationViewModel$fetchData$2> dVar) {
        super(2, dVar);
        this.f11465u = monetizationViewModel;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new MonetizationViewModel$fetchData$2(this.f11465u, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((MonetizationViewModel$fetchData$2) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        b.d0(obj);
        String a10 = a.a("purchase_history");
        boolean z10 = !n.B0(a10);
        MonetizationViewModel monetizationViewModel = this.f11465u;
        if (z10) {
            ArrayList<String> arrayList = (ArrayList) new sf.i().c(a10, new TypeToken<ArrayList<String>>() { // from class: com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$fetchData$2$typeToken$1
            }.getType());
            if (arrayList.size() > 0) {
                monetizationViewModel.j().i(arrayList);
            }
            monetizationViewModel.getClass();
            v.H(f.H(monetizationViewModel), o0.f23642c, 0, new qn.i(monetizationViewModel, false, null), 2);
        } else {
            monetizationViewModel.getClass();
            v.H(f.H(monetizationViewModel), o0.f23642c, 0, new qn.i(monetizationViewModel, true, null), 2);
        }
        return k.f19476a;
    }
}
