package ml;

import android.os.Bundle;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.network.model.CrossProviderRecommendationNotificationModel;
import com.theinnerhour.b2b.network.model.SuggestedBooking;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1", f = "DashboardTelecommunicationsViewModel.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25416u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f25417v;

    /* compiled from: DashboardTelecommunicationsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1", f = "DashboardTelecommunicationsViewModel.kt", l = {196}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25418u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f25419v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p f25420w;

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$10", f = "DashboardTelecommunicationsViewModel.kt", l = {191}, m = "invokeSuspend")
        /* renamed from: ml.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0412a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25421u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25422v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0412a(p pVar, ls.d<? super C0412a> dVar) {
                super(2, dVar);
                this.f25422v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0412a(this.f25422v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((C0412a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25421u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f25421u = 1;
                    obj = p.h(this.f25422v, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$11", f = "DashboardTelecommunicationsViewModel.kt", l = {192}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25423u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25424v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(p pVar, ls.d<? super b> dVar) {
                super(2, dVar);
                this.f25424v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new b(this.f25424v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25423u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f25423u = 1;
                    obj = p.h(this.f25424v, false, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$12", f = "DashboardTelecommunicationsViewModel.kt", l = {193}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25425u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25426v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(p pVar, ls.d<? super c> dVar) {
                super(2, dVar);
                this.f25426v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new c(this.f25426v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25425u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f25425u = 1;
                    if (p.g(this.f25426v, true, this) == aVar) {
                        return aVar;
                    }
                }
                return hs.k.f19476a;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$13", f = "DashboardTelecommunicationsViewModel.kt", l = {194}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class d extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25427u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25428v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(p pVar, ls.d<? super d> dVar) {
                super(2, dVar);
                this.f25428v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new d(this.f25428v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25427u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f25427u = 1;
                    if (p.g(this.f25428v, false, this) == aVar) {
                        return aVar;
                    }
                }
                return hs.k.f19476a;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$14", f = "DashboardTelecommunicationsViewModel.kt", l = {195}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class e extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25429u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25430v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(p pVar, ls.d<? super e> dVar) {
                super(2, dVar);
                this.f25430v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new e(this.f25430v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                Integer num;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25429u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f25429u = 1;
                    p pVar = this.f25430v;
                    pVar.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    try {
                        TherapistPackagesModel d10 = pVar.B.d();
                        if (d10 != null) {
                            num = new Integer(d10.getId());
                        } else {
                            num = null;
                        }
                        if (num == null) {
                            hVar.resumeWith(Boolean.FALSE);
                        } else {
                            ta.v.H(kc.f.H(pVar), null, 0, new ml.k(pVar, hVar, null), 3);
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(pVar.f25559z, e10);
                        hVar.resumeWith(Boolean.FALSE);
                    }
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$1", f = "DashboardTelecommunicationsViewModel.kt", l = {182}, m = "invokeSuspend")
        /* renamed from: ml.f$a$f  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0413f extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25431u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25432v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0413f(p pVar, ls.d<? super C0413f> dVar) {
                super(2, dVar);
                this.f25432v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0413f(this.f25432v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((C0413f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                Integer num;
                TherapistPackagesModel therapistPackagesModel;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25431u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    p pVar = this.f25432v;
                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d10 = pVar.A.d();
                    if (d10 != null && (therapistPackagesModel = d10.f19464u) != null) {
                        num = new Integer(therapistPackagesModel.getId());
                    } else {
                        num = null;
                    }
                    this.f25431u = 1;
                    obj = p.j(pVar, num, "therapist", this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$2", f = "DashboardTelecommunicationsViewModel.kt", l = {183}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class g extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25433u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25434v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(p pVar, ls.d<? super g> dVar) {
                super(2, dVar);
                this.f25434v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new g(this.f25434v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                Integer num;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25433u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    p pVar = this.f25434v;
                    TherapistPackagesModel d10 = pVar.B.d();
                    if (d10 != null) {
                        num = new Integer(d10.getId());
                    } else {
                        num = null;
                    }
                    this.f25433u = 1;
                    obj = p.j(pVar, num, "psychiatrist", this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$3", f = "DashboardTelecommunicationsViewModel.kt", l = {184}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class h extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25435u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25436v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(p pVar, ls.d<? super h> dVar) {
                super(2, dVar);
                this.f25436v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new h(this.f25436v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((h) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25435u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f25435u = 1;
                    obj = p.f(this.f25436v, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$4", f = "DashboardTelecommunicationsViewModel.kt", l = {185}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class i extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25437u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25438v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(p pVar, ls.d<? super i> dVar) {
                super(2, dVar);
                this.f25438v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new i(this.f25438v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25437u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f25437u = 1;
                    obj = p.f(this.f25438v, false, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$5", f = "DashboardTelecommunicationsViewModel.kt", l = {186}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class j extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25439u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25440v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(p pVar, ls.d<? super j> dVar) {
                super(2, dVar);
                this.f25440v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new j(this.f25440v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25439u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f25439u = 1;
                    p pVar = this.f25440v;
                    pVar.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    try {
                        ta.v.H(kc.f.H(pVar), null, 0, new ml.n(pVar, hVar, null), 3);
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(pVar.f25559z, e10);
                        hVar.resumeWith(Boolean.FALSE);
                    }
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$6", f = "DashboardTelecommunicationsViewModel.kt", l = {187}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class k extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25441u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25442v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(p pVar, ls.d<? super k> dVar) {
                super(2, dVar);
                this.f25442v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new k(this.f25442v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((k) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25441u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f25441u = 1;
                    obj = p.i(this.f25442v, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$7", f = "DashboardTelecommunicationsViewModel.kt", l = {188}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class l extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25443u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25444v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(p pVar, ls.d<? super l> dVar) {
                super(2, dVar);
                this.f25444v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new l(this.f25444v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((l) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25443u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f25443u = 1;
                    obj = p.i(this.f25444v, false, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$8", f = "DashboardTelecommunicationsViewModel.kt", l = {189}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class m extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25445u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25446v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(p pVar, ls.d<? super m> dVar) {
                super(2, dVar);
                this.f25446v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new m(this.f25446v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((m) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25445u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f25445u = 1;
                    p pVar = this.f25446v;
                    pVar.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    ta.v.H(kc.f.H(pVar), null, 0, new ml.d(pVar, hVar, null), 3);
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchDashboardNotifications$1$1$9", f = "DashboardTelecommunicationsViewModel.kt", l = {190}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class n extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25447u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25448v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(p pVar, ls.d<? super n> dVar) {
                super(2, dVar);
                this.f25448v = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new n(this.f25448v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((n) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25447u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f25447u = 1;
                    p pVar = this.f25448v;
                    pVar.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    try {
                        ta.v.H(kc.f.H(pVar), null, 0, new ml.c(pVar, hVar, null), 3);
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(pVar.f25559z, e10);
                        hVar.resumeWith(Boolean.FALSE);
                    }
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f25420w = pVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f25420w, dVar);
            aVar.f25419v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            Integer num;
            Integer num2;
            TherapistPackagesModel therapistPackagesModel;
            String str;
            boolean z14;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            TherapistPackagesModel therapistPackagesModel2;
            TherapistPackagesModel therapistPackagesModel3;
            TherapistPackagesModel therapistPackagesModel4;
            String str10;
            boolean z15;
            boolean z16;
            androidx.lifecycle.w<TherapistPackagesModel> wVar;
            TherapistPackagesModel d10;
            boolean z17;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            TherapistPackagesModel therapistPackagesModel5;
            TherapistPackagesModel therapistPackagesModel6;
            TherapistPackagesModel therapistPackagesModel7;
            TherapistPackagesModel therapistPackagesModel8;
            Integer num3;
            Integer num4;
            TherapistPackagesModel therapistPackagesModel9;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25418u;
            p pVar = this.f25420w;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f25419v;
                pVar.T = false;
                pVar.U = false;
                pVar.V = false;
                pVar.F = null;
                pVar.G = null;
                pVar.H.clear();
                pVar.I = null;
                pVar.J = null;
                pVar.K = null;
                pVar.L = null;
                pVar.M = null;
                pVar.N = null;
                pVar.O = null;
                pVar.P = null;
                pVar.Q = null;
                pVar.R = null;
                ArrayList k10 = ca.a.k(ta.v.g(d0Var, null, new C0413f(pVar, null), 3), ta.v.g(d0Var, null, new g(pVar, null), 3), ta.v.g(d0Var, null, new h(pVar, null), 3), ta.v.g(d0Var, null, new i(pVar, null), 3), ta.v.g(d0Var, null, new j(pVar, null), 3), ta.v.g(d0Var, null, new k(pVar, null), 3), ta.v.g(d0Var, null, new l(pVar, null), 3), ta.v.g(d0Var, null, new m(pVar, null), 3), ta.v.g(d0Var, null, new n(pVar, null), 3), ta.v.g(d0Var, null, new C0412a(pVar, null), 3), ta.v.g(d0Var, null, new b(pVar, null), 3), ta.v.g(d0Var, null, new c(pVar, null), 3), ta.v.g(d0Var, null, new d(pVar, null), 3), ta.v.g(d0Var, null, new e(pVar, null), 3));
                this.f25418u = 1;
                if (ca.a.n(k10, this) == aVar) {
                    return aVar;
                }
            }
            pVar.getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            List<UpcomingBooking> list = pVar.J;
            androidx.lifecycle.w<TherapistPackagesModel> wVar2 = pVar.B;
            androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar3 = pVar.A;
            if (list != null) {
                for (UpcomingBooking upcomingBooking : list) {
                    if (kotlin.jvm.internal.i.b(upcomingBooking.getBookingtype(), "single")) {
                        if (upcomingBooking.getTherapistId() != null) {
                            Integer therapistId = upcomingBooking.getTherapistId();
                            hs.f<TherapistPackagesModel, TherapistPackagesModel> d11 = wVar3.d();
                            if (d11 != null && (therapistPackagesModel9 = d11.f19464u) != null) {
                                num4 = Integer.valueOf(therapistPackagesModel9.getId());
                            } else {
                                num4 = null;
                            }
                            if (kotlin.jvm.internal.i.b(therapistId, num4)) {
                                if (kotlin.jvm.internal.i.b(upcomingBooking.getStatus(), "cancel")) {
                                    arrayList5.add(upcomingBooking);
                                } else {
                                    arrayList3.add(upcomingBooking);
                                }
                            }
                        }
                        if (upcomingBooking.getPsychiatristId() != null) {
                            Integer psychiatristId = upcomingBooking.getPsychiatristId();
                            TherapistPackagesModel d12 = wVar2.d();
                            if (d12 != null) {
                                num3 = Integer.valueOf(d12.getId());
                            } else {
                                num3 = null;
                            }
                            if (kotlin.jvm.internal.i.b(psychiatristId, num3)) {
                                if (kotlin.jvm.internal.i.b(upcomingBooking.getStatus(), "cancel")) {
                                    arrayList6.add(upcomingBooking);
                                } else {
                                    arrayList4.add(upcomingBooking);
                                }
                            }
                        }
                    }
                }
            }
            if (!(!arrayList3.isEmpty()) || !(!arrayList4.isEmpty())) {
                List<UpcomingBooking> list2 = pVar.I;
                if (list2 != null) {
                    for (UpcomingBooking upcomingBooking2 : list2) {
                        if (kotlin.jvm.internal.i.b(upcomingBooking2.getBookingtype(), "single")) {
                            if (upcomingBooking2.getTherapistId() != null) {
                                Integer therapistId2 = upcomingBooking2.getTherapistId();
                                hs.f<TherapistPackagesModel, TherapistPackagesModel> d13 = wVar3.d();
                                if (d13 != null && (therapistPackagesModel = d13.f19464u) != null) {
                                    num2 = Integer.valueOf(therapistPackagesModel.getId());
                                } else {
                                    num2 = null;
                                }
                                if (kotlin.jvm.internal.i.b(therapistId2, num2)) {
                                    arrayList.add(upcomingBooking2);
                                }
                            }
                            if (upcomingBooking2.getPsychiatristId() != null) {
                                Integer psychiatristId2 = upcomingBooking2.getPsychiatristId();
                                TherapistPackagesModel d14 = wVar2.d();
                                if (d14 != null) {
                                    num = Integer.valueOf(d14.getId());
                                } else {
                                    num = null;
                                }
                                if (kotlin.jvm.internal.i.b(psychiatristId2, num)) {
                                    arrayList2.add(upcomingBooking2);
                                }
                            }
                        }
                    }
                }
                if (arrayList3.isEmpty() && ((!arrayList.isEmpty()) || (!arrayList5.isEmpty()))) {
                    boolean z18 = !ApplicationPersistence.getInstance().containsKey("tc_notification_session_tips_therapy");
                    boolean z19 = !ApplicationPersistence.getInstance().containsKey("tc_notification_preparation_things_therapy");
                    pVar.Q = new hs.f<>(Boolean.valueOf(z18), Boolean.valueOf(z19));
                    if (!pVar.T && !z18 && !z19) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    pVar.T = z13;
                    if (z18) {
                        z10 = true;
                        ApplicationPersistence.getInstance().setBooleanValue("tc_preparation_curr_session_therapy", true);
                    } else {
                        z10 = true;
                    }
                    if (z19) {
                        ApplicationPersistence.getInstance().setBooleanValue("tc_session_tips_curr_session_therapy", z10);
                    }
                } else {
                    z10 = true;
                }
                if (arrayList4.isEmpty() && ((arrayList2.isEmpty() ^ z10) || (arrayList6.isEmpty() ^ z10))) {
                    boolean containsKey = ApplicationPersistence.getInstance().containsKey("tc_notification_session_tips_psychiatry") ^ z10;
                    boolean containsKey2 = ApplicationPersistence.getInstance().containsKey("tc_notification_preparation_things_psychiatry") ^ z10;
                    pVar.R = new hs.f<>(Boolean.valueOf(containsKey), Boolean.valueOf(containsKey2));
                    if (!pVar.U && !containsKey && !containsKey2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    pVar.U = z11;
                    if (containsKey) {
                        z12 = true;
                        ApplicationPersistence.getInstance().setBooleanValue("tc_preparation_curr_session_psychiatry", true);
                    } else {
                        z12 = true;
                    }
                    if (containsKey2) {
                        ApplicationPersistence.getInstance().setBooleanValue("tc_session_tips_curr_session_psychiatry", z12);
                    }
                }
            }
            pVar.S.i(Boolean.TRUE);
            ta.v.H(kc.f.H(pVar), null, 0, new ml.b(pVar, null), 3);
            String str17 = "suggested_therapy_event";
            Set<String> stringSetValue = ApplicationPersistence.getInstance().getStringSetValue("suggested_therapy_event");
            String str18 = "suggested_psychiatry_event";
            Set<String> stringSetValue2 = ApplicationPersistence.getInstance().getStringSetValue("suggested_psychiatry_event");
            Iterator it = pVar.H.iterator();
            boolean z20 = false;
            boolean z21 = false;
            while (true) {
                str = str18;
                z14 = z20;
                if (!it.hasNext()) {
                    break;
                }
                SuggestedBooking suggestedBooking = (SuggestedBooking) it.next();
                Iterator it2 = it;
                hs.f<TherapistPackagesModel, TherapistPackagesModel> d15 = wVar3.d();
                if (d15 != null && (therapistPackagesModel8 = d15.f19464u) != null) {
                    str10 = str17;
                    if (suggestedBooking.getProviderId() == therapistPackagesModel8.getId()) {
                        z15 = true;
                        z16 = z21;
                        wVar = wVar2;
                        if (!z15 && !stringSetValue2.contains(suggestedBooking.getSessionDateTime())) {
                            String str19 = gk.a.f16573a;
                            Bundle a10 = r1.b0.a("flow", "therapy");
                            StringBuilder sb2 = new StringBuilder();
                            hs.f<TherapistPackagesModel, TherapistPackagesModel> d16 = wVar3.d();
                            if (d16 != null && (therapistPackagesModel7 = d16.f19464u) != null) {
                                str14 = therapistPackagesModel7.getFirstname();
                            } else {
                                str14 = null;
                            }
                            sb2.append(str14);
                            sb2.append(' ');
                            hs.f<TherapistPackagesModel, TherapistPackagesModel> d17 = wVar3.d();
                            if (d17 != null && (therapistPackagesModel6 = d17.f19464u) != null) {
                                str15 = therapistPackagesModel6.getLastname();
                            } else {
                                str15 = null;
                            }
                            sb2.append(str15);
                            a10.putString("provider_name", sb2.toString());
                            hs.f<TherapistPackagesModel, TherapistPackagesModel> d18 = wVar3.d();
                            if (d18 != null && (therapistPackagesModel5 = d18.f19464u) != null) {
                                str16 = therapistPackagesModel5.getUuid();
                            } else {
                                str16 = null;
                            }
                            a10.putString("provider_uuid", str16);
                            a10.putString("suggested_date_local", pVar.o(suggestedBooking.getSessionDateTime()).f19465v);
                            a10.putString("suggested_slot_local", suggestedBooking.getSlot());
                            a10.putString("suggested_mode", suggestedBooking.getMode());
                            a10.putString("client_id", String.valueOf(SessionManager.getInstance().getLongValue(SessionManager.KEY_USERID)));
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(a10, "next_session_prompt_received");
                            stringSetValue.add(suggestedBooking.getSessionDateTime());
                            z20 = z14;
                            z21 = true;
                        } else {
                            d10 = wVar.d();
                            if (d10 == null && suggestedBooking.getProviderId() == d10.getId()) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (!z17 && !stringSetValue.contains(suggestedBooking.getSessionDateTime())) {
                                String str20 = gk.a.f16573a;
                                Bundle a11 = r1.b0.a("flow", "psychiatry");
                                StringBuilder sb3 = new StringBuilder();
                                TherapistPackagesModel d19 = wVar.d();
                                if (d19 != null) {
                                    str11 = d19.getFirstname();
                                } else {
                                    str11 = null;
                                }
                                sb3.append(str11);
                                sb3.append(' ');
                                TherapistPackagesModel d20 = wVar.d();
                                if (d20 != null) {
                                    str12 = d20.getLastname();
                                } else {
                                    str12 = null;
                                }
                                sb3.append(str12);
                                a11.putString("provider_name", sb3.toString());
                                TherapistPackagesModel d21 = wVar.d();
                                if (d21 != null) {
                                    str13 = d21.getUuid();
                                } else {
                                    str13 = null;
                                }
                                a11.putString("provider_uuid", str13);
                                a11.putString("suggested_date_local", pVar.o(suggestedBooking.getSessionDateTime()).f19465v);
                                a11.putString("suggested_slot_local", suggestedBooking.getSlot());
                                a11.putString("suggested_mode", suggestedBooking.getMode());
                                a11.putString("client_id", String.valueOf(SessionManager.getInstance().getLongValue(SessionManager.KEY_USERID)));
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(a11, "next_session_prompt_received");
                                stringSetValue2.add(suggestedBooking.getSessionDateTime());
                                z21 = z16;
                                z20 = true;
                            } else {
                                z20 = z14;
                                z21 = z16;
                            }
                        }
                        str18 = str;
                        str17 = str10;
                        it = it2;
                        wVar2 = wVar;
                    }
                } else {
                    str10 = str17;
                }
                z15 = false;
                z16 = z21;
                wVar = wVar2;
                if (!z15) {
                }
                d10 = wVar.d();
                if (d10 == null) {
                }
                z17 = false;
                if (!z17) {
                }
                z20 = z14;
                z21 = z16;
                str18 = str;
                str17 = str10;
                it = it2;
                wVar2 = wVar;
            }
            String str21 = str17;
            androidx.lifecycle.w<TherapistPackagesModel> wVar4 = wVar2;
            if (z21) {
                ApplicationPersistence.getInstance().setStringSetValue(str21, stringSetValue);
            }
            if (z14) {
                ApplicationPersistence.getInstance().setStringSetValue(str, stringSetValue2);
            }
            String stringValue = ApplicationPersistence.getInstance().getStringValue("cross_therapy_event");
            String stringValue2 = ApplicationPersistence.getInstance().getStringValue("cross_psychiatry_event");
            CrossProviderRecommendationNotificationModel crossProviderRecommendationNotificationModel = pVar.F;
            if (crossProviderRecommendationNotificationModel == null) {
                str2 = "psychiatry";
                str3 = "cross_psychiatry_event";
            } else {
                str3 = "cross_psychiatry_event";
                if (kotlin.jvm.internal.i.b(crossProviderRecommendationNotificationModel.getId(), stringValue)) {
                    crossProviderRecommendationNotificationModel = null;
                }
                if (crossProviderRecommendationNotificationModel == null) {
                    str2 = "psychiatry";
                } else {
                    String str22 = gk.a.f16573a;
                    Bundle f = defpackage.e.f("flow", "therapy", "prompt_type", "psychiatry");
                    StringBuilder sb4 = new StringBuilder();
                    str2 = "psychiatry";
                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d22 = wVar3.d();
                    if (d22 != null && (therapistPackagesModel4 = d22.f19464u) != null) {
                        str7 = therapistPackagesModel4.getFirstname();
                    } else {
                        str7 = null;
                    }
                    sb4.append(str7);
                    sb4.append(' ');
                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d23 = wVar3.d();
                    if (d23 != null && (therapistPackagesModel3 = d23.f19464u) != null) {
                        str8 = therapistPackagesModel3.getLastname();
                    } else {
                        str8 = null;
                    }
                    sb4.append(str8);
                    f.putString("provider_name", sb4.toString());
                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d24 = wVar3.d();
                    if (d24 != null && (therapistPackagesModel2 = d24.f19464u) != null) {
                        str9 = therapistPackagesModel2.getUuid();
                    } else {
                        str9 = null;
                    }
                    f.putString("provider_uuid", str9);
                    f.putString("client_id", String.valueOf(SessionManager.getInstance().getLongValue(SessionManager.KEY_USERID)));
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(f, "cross_referral_prompt_received");
                    ApplicationPersistence.getInstance().setStringValue("cross_therapy_event", crossProviderRecommendationNotificationModel.getId());
                }
            }
            CrossProviderRecommendationNotificationModel crossProviderRecommendationNotificationModel2 = pVar.G;
            if (crossProviderRecommendationNotificationModel2 != null) {
                if (kotlin.jvm.internal.i.b(crossProviderRecommendationNotificationModel2.getId(), stringValue2)) {
                    crossProviderRecommendationNotificationModel2 = null;
                }
                if (crossProviderRecommendationNotificationModel2 != null) {
                    String str23 = gk.a.f16573a;
                    Bundle f2 = defpackage.e.f("flow", str2, "prompt_type", "therapy");
                    StringBuilder sb5 = new StringBuilder();
                    TherapistPackagesModel d25 = wVar4.d();
                    if (d25 != null) {
                        str4 = d25.getFirstname();
                    } else {
                        str4 = null;
                    }
                    sb5.append(str4);
                    sb5.append(' ');
                    TherapistPackagesModel d26 = wVar4.d();
                    if (d26 != null) {
                        str5 = d26.getLastname();
                    } else {
                        str5 = null;
                    }
                    sb5.append(str5);
                    f2.putString("provider_name", sb5.toString());
                    TherapistPackagesModel d27 = wVar4.d();
                    if (d27 != null) {
                        str6 = d27.getUuid();
                    } else {
                        str6 = null;
                    }
                    f2.putString("provider_uuid", str6);
                    f2.putString("client_id", String.valueOf(SessionManager.getInstance().getLongValue(SessionManager.KEY_USERID)));
                    hs.k kVar4 = hs.k.f19476a;
                    gk.a.b(f2, "cross_referral_prompt_received");
                    ApplicationPersistence.getInstance().setStringValue(str3, crossProviderRecommendationNotificationModel2.getId());
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, ls.d<? super f> dVar) {
        super(2, dVar);
        this.f25417v = pVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new f(this.f25417v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25416u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f25417v, null);
            this.f25416u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
