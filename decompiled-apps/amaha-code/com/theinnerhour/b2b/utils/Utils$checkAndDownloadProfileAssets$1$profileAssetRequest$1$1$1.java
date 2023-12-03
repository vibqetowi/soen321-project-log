package com.theinnerhour.b2b.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import ss.p;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@ns.e(c = "com.theinnerhour.b2b.utils.Utils$checkAndDownloadProfileAssets$1$profileAssetRequest$1$1$1", f = "Utils.kt", l = {1397}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Utils$checkAndDownloadProfileAssets$1$profileAssetRequest$1$1$1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Utils$checkAndDownloadProfileAssets$1$profileAssetRequest$1$1$1(Context context, ls.d<? super Utils$checkAndDownloadProfileAssets$1$profileAssetRequest$1$1$1> dVar) {
        super(2, dVar);
        this.$context = context;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new Utils$checkAndDownloadProfileAssets$1$profileAssetRequest$1$1$1(this.$context, dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            Utils utils = Utils.INSTANCE;
            Context context = this.$context;
            this.label = 1;
            if (Utils.checkForUpdatedProfileAssets$default(utils, context, false, this, 2, null) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((Utils$checkAndDownloadProfileAssets$1$profileAssetRequest$1$1$1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }
}
