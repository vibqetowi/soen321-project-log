package tn;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.p000firebaseauthapi.qd;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import nn.v0;
import ta.v;
/* compiled from: TrackerLogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltn/k;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f33369z = 0;

    /* renamed from: v  reason: collision with root package name */
    public wn.i f33371v;

    /* renamed from: w  reason: collision with root package name */
    public qd f33372w;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f33374y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f33370u = LogHelper.INSTANCE.makeLogTag("TrackerLogFragment");

    /* renamed from: x  reason: collision with root package name */
    public final a f33373x = new a();

    /* compiled from: TrackerLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i6, int i10) {
            LinearLayoutManager linearLayoutManager;
            Integer num;
            RecyclerView.e eVar;
            sn.c cVar;
            Integer num2;
            wn.i iVar;
            RecyclerView recyclerView2;
            kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                num = Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition());
            } else {
                num = null;
            }
            if (num != null) {
                k kVar = k.this;
                qd qdVar = kVar.f33372w;
                if (qdVar != null && (recyclerView2 = (RecyclerView) qdVar.A) != null) {
                    eVar = recyclerView2.getAdapter();
                } else {
                    eVar = null;
                }
                if (eVar instanceof sn.c) {
                    cVar = (sn.c) eVar;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    num2 = Integer.valueOf(cVar.f31778x.size() - 1);
                } else {
                    num2 = null;
                }
                if (kotlin.jvm.internal.i.b(num2, num) && (iVar = kVar.f33371v) != null) {
                    v.H(kc.f.H(iVar), null, 0, new wn.g(iVar, num.intValue(), null), 3);
                }
            }
        }
    }

    /* compiled from: TrackerLogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<List<? extends MultiTrackerModel>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends MultiTrackerModel> list) {
            RecyclerView.e eVar;
            sn.c cVar;
            RecyclerView recyclerView;
            RecyclerView recyclerView2;
            RecyclerView recyclerView3;
            RecyclerView.e eVar2;
            RecyclerView recyclerView4;
            RecyclerView recyclerView5;
            List<? extends MultiTrackerModel> it = list;
            kotlin.jvm.internal.i.f(it, "it");
            int i6 = k.f33369z;
            k kVar = k.this;
            kVar.getClass();
            RecyclerView recyclerView6 = null;
            ConstraintLayout constraintLayout = null;
            if (it.isEmpty()) {
                qd qdVar = kVar.f33372w;
                if (qdVar != null && (recyclerView5 = (RecyclerView) qdVar.A) != null) {
                    eVar2 = recyclerView5.getAdapter();
                } else {
                    eVar2 = null;
                }
                if (eVar2 == null) {
                    qd qdVar2 = kVar.f33372w;
                    if (qdVar2 != null) {
                        recyclerView4 = (RecyclerView) qdVar2.A;
                    } else {
                        recyclerView4 = null;
                    }
                    if (recyclerView4 != null) {
                        recyclerView4.setVisibility(8);
                    }
                    qd qdVar3 = kVar.f33372w;
                    if (qdVar3 != null) {
                        constraintLayout = (ConstraintLayout) qdVar3.B;
                    }
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                    }
                }
            } else {
                ArrayList arrayList = new ArrayList();
                for (MultiTrackerModel multiTrackerModel : it) {
                    long j10 = 1000;
                    if (!arrayList.contains(sp.b.y(multiTrackerModel.getDate().getTime() * j10))) {
                        arrayList.add(sp.b.y(multiTrackerModel.getDate().getTime() * j10));
                    }
                    arrayList.add(multiTrackerModel);
                }
                qd qdVar4 = kVar.f33372w;
                if (qdVar4 != null && (recyclerView3 = (RecyclerView) qdVar4.A) != null) {
                    eVar = recyclerView3.getAdapter();
                } else {
                    eVar = null;
                }
                if (eVar instanceof sn.c) {
                    cVar = (sn.c) eVar;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    ArrayList<Object> arrayList2 = cVar.f31778x;
                    int size = arrayList2.size();
                    arrayList2.addAll(arrayList);
                    cVar.f2769u.e(size, 1);
                } else {
                    Context requireContext = kVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    sn.c cVar2 = new sn.c(requireContext, arrayList);
                    qd qdVar5 = kVar.f33372w;
                    if (qdVar5 != null) {
                        recyclerView = (RecyclerView) qdVar5.A;
                    } else {
                        recyclerView = null;
                    }
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(new LinearLayoutManager(kVar.getContext(), 1, false));
                    }
                    qd qdVar6 = kVar.f33372w;
                    if (qdVar6 != null) {
                        recyclerView6 = (RecyclerView) qdVar6.A;
                    }
                    if (recyclerView6 != null) {
                        recyclerView6.setAdapter(cVar2);
                    }
                    qd qdVar7 = kVar.f33372w;
                    if (qdVar7 != null && (recyclerView2 = (RecyclerView) qdVar7.A) != null) {
                        recyclerView2.i(kVar.f33373x);
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        View inflate = getLayoutInflater().inflate(R.layout.fragment_tracker_log, (ViewGroup) null, false);
        int i6 = R.id.btnBackLog;
        AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.btnBackLog, inflate);
        if (appCompatImageView != null) {
            i6 = R.id.goalTitle;
            RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.goalTitle, inflate);
            if (robertoTextView != null) {
                i6 = R.id.logListEmptyImg;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) hc.d.w(R.id.logListEmptyImg, inflate);
                if (appCompatImageView2 != null) {
                    i6 = R.id.logListEmptyText;
                    RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.logListEmptyText, inflate);
                    if (robertoTextView2 != null) {
                        i6 = R.id.logsRecyclerView;
                        RecyclerView recyclerView = (RecyclerView) hc.d.w(R.id.logsRecyclerView, inflate);
                        if (recyclerView != null) {
                            i6 = R.id.trackerLogsNullState;
                            ConstraintLayout constraintLayout = (ConstraintLayout) hc.d.w(R.id.trackerLogsNullState, inflate);
                            if (constraintLayout != null) {
                                qd qdVar = new qd((ConstraintLayout) inflate, appCompatImageView, robertoTextView, appCompatImageView2, robertoTextView2, recyclerView, constraintLayout, 5);
                                this.f33372w = qdVar;
                                return qdVar.a();
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        RecyclerView recyclerView;
        qd qdVar = this.f33372w;
        if (qdVar != null && (recyclerView = (RecyclerView) qdVar.A) != null) {
            recyclerView.c0(this.f33373x);
        }
        this.f33372w = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f33374y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RobertoTextView robertoTextView;
        AppCompatImageView appCompatImageView;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            qd qdVar = this.f33372w;
            if (qdVar != null && (appCompatImageView = (AppCompatImageView) qdVar.f8089w) != null) {
                appCompatImageView.setOnClickListener(new v0(5, this));
            }
            qd qdVar2 = this.f33372w;
            if (qdVar2 != null) {
                robertoTextView = (RobertoTextView) qdVar2.f8090x;
            } else {
                robertoTextView = null;
            }
            if (robertoTextView != null) {
                robertoTextView.setText(getString(R.string.trackerLogsTitle));
            }
            l0 a10 = new o0(this).a(wn.i.class);
            wn.i iVar = (wn.i) a10;
            iVar.f36795y.e(getViewLifecycleOwner(), new nn.k(13, new b()));
            v.H(kc.f.H(iVar), null, 0, new wn.h(iVar, null), 3);
            this.f33371v = (wn.i) a10;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33370u, e10);
        }
    }
}
