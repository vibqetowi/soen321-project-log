package com.theinnerhour.b2b.components.profile.experiment.viewModel;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import hs.k;
import kotlinx.coroutines.d0;
import ls.d;
import ns.e;
import ns.i;
import sp.b;
import ss.p;
import wo.n;
/* compiled from: ExperimentEditProfileRepository.kt */
@e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentEditProfileRepository$getAvatarAndThemes$2", f = "ExperimentEditProfileRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExperimentEditProfileRepository$getAvatarAndThemes$2 extends i implements p<d0, d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n f11601u;

    /* compiled from: ExperimentEditProfileRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a extends CustomVolleyErrorListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ n f11602u;

        public a(n nVar) {
            this.f11602u = nVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
        public final void onErrorResponse(VolleyError error) {
            kotlin.jvm.internal.i.g(error, "error");
            this.f11602u.f36961c.i(ApiNetworkStatus.ERROR);
            super.onErrorResponse(error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentEditProfileRepository$getAvatarAndThemes$2(n nVar, d<? super ExperimentEditProfileRepository$getAvatarAndThemes$2> dVar) {
        super(2, dVar);
        this.f11601u = nVar;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new ExperimentEditProfileRepository$getAvatarAndThemes$2(this.f11601u, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((ExperimentEditProfileRepository$getAvatarAndThemes$2) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        b.d0(obj);
        n nVar = this.f11601u;
        VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(0, "https://api.theinnerhour.com/v1/get_avatar_theme", null, new wo.k(nVar, 1), new a(nVar)));
        return k.f19476a;
    }
}
