package op;

import am.w;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.onboarding.model.MatchingFlowModel;
import com.theinnerhour.b2b.components.onboarding.model.MatchingFlowUserResponseModel;
import com.theinnerhour.b2b.components.onboarding.model.ProviderListModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.EducationPackagesModel;
import com.theinnerhour.b2b.model.ExperiencePackagesModel;
import com.theinnerhour.b2b.model.LanguagePackagesModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.CenterZoomLayoutManager;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import is.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import nn.v0;
import rp.s;
import so.b0;
import ss.l;
import ta.v;
/* compiled from: TeleEntryPointFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lop/a;", "Lhl/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends hl.a {
    public static final /* synthetic */ int D = 0;
    public il.b A;
    public final androidx.activity.result.c<Intent> B;
    public final LinkedHashMap C = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f27695v = LogHelper.INSTANCE.makeLogTag("TeleEntryPointFragment");

    /* renamed from: w  reason: collision with root package name */
    public final yn.a f27696w = new yn.a();

    /* renamed from: x  reason: collision with root package name */
    public boolean f27697x = true;

    /* renamed from: y  reason: collision with root package name */
    public eo.f f27698y;

    /* renamed from: z  reason: collision with root package name */
    public Timer f27699z;

    /* compiled from: TeleEntryPointFragment.kt */
    /* renamed from: op.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0461a extends k implements l<SingleUseEvent<? extends ArrayList<ProviderListModel>>, hs.k> {
        public C0461a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends ArrayList<ProviderListModel>> singleUseEvent) {
            ArrayList<ProviderListModel> contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null) {
                a.I(a.this, contentIfNotHandled);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TeleEntryPointFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<SingleUseEvent<? extends MatchingFlowUserResponseModel>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ eo.f f27702v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(eo.f fVar) {
            super(1);
            this.f27702v = fVar;
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends MatchingFlowUserResponseModel> singleUseEvent) {
            int i6;
            int i10;
            MatchingFlowUserResponseModel contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            a aVar = a.this;
            if (contentIfNotHandled != null) {
                if (i.b(contentIfNotHandled.getOnBoardingType(), "therapy")) {
                    aVar.f27697x = true;
                    MatchingFlowModel matchingFlowModel = new MatchingFlowModel(contentIfNotHandled.getDifficulty(), contentIfNotHandled.getDuration(), contentIfNotHandled.getExpertise(), contentIfNotHandled.getLanguages(), contentIfNotHandled.getNeedImmediately(), contentIfNotHandled.getUserAge(), 5, "app");
                    eo.f fVar = aVar.f27698y;
                    if (fVar != null) {
                        v.H(kc.f.H(fVar), null, 0, new eo.d(fVar, matchingFlowModel, true, null), 3);
                    }
                } else {
                    aVar.f27697x = false;
                    eo.f fVar2 = this.f27702v;
                    fVar2.getClass();
                    v.H(kc.f.H(fVar2), null, 0, new eo.b(fVar2, false, null), 3);
                }
                RobertoTextView robertoTextView = (RobertoTextView) aVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardTitle);
                if (aVar.f27697x) {
                    i6 = R.string.teleEntryCardVarDDescription;
                } else {
                    i6 = R.string.teleEntryFragmentCardPsychiatristDescription;
                }
                robertoTextView.setText(aVar.getString(i6));
                RobertoTextView robertoTextView2 = (RobertoTextView) aVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardDescription);
                if (aVar.f27697x) {
                    i10 = R.string.teleEntryCardVarDTherapyHeader;
                } else {
                    i10 = R.string.teleEntryCardVarDPsychiatryHeader;
                }
                robertoTextView2.setText(aVar.getString(i10));
            } else {
                int i11 = a.D;
                aVar.K();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TeleEntryPointFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements l<SingleUseEvent<? extends ArrayList<ProviderListModel>>, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends ArrayList<ProviderListModel>> singleUseEvent) {
            int i6;
            int i10;
            ArrayList<ProviderListModel> contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            String str = null;
            a aVar = a.this;
            if (contentIfNotHandled != null && contentIfNotHandled.size() > 0) {
                ProviderListModel providerListModel = (ProviderListModel) u.i2(contentIfNotHandled);
                if (providerListModel != null) {
                    str = providerListModel.getType();
                }
                aVar.f27697x = i.b(str, "therapist");
                RobertoTextView robertoTextView = (RobertoTextView) aVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardTitle);
                if (aVar.f27697x) {
                    i6 = R.string.teleEntryCardVarDTherapyHeader;
                } else {
                    i6 = R.string.teleEntryCardVarDPsychiatryHeader;
                }
                robertoTextView.setText(aVar.getString(i6));
                RobertoTextView robertoTextView2 = (RobertoTextView) aVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardDescription);
                if (aVar.f27697x) {
                    i10 = R.string.teleEntryCardVarDDescription;
                } else {
                    i10 = R.string.teleEntryFragmentCardPsychiatristDescription;
                }
                robertoTextView2.setText(aVar.getString(i10));
                a.I(aVar, contentIfNotHandled);
            } else {
                eo.f fVar = aVar.f27698y;
                if (fVar != null) {
                    v.H(kc.f.H(fVar), null, 0, new eo.c(fVar, null), 3);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TeleEntryPointFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements l<ArrayList<TherapistPackagesModel>, hs.k> {
        public d() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ArrayList<TherapistPackagesModel> arrayList) {
            boolean z10;
            int i6;
            ArrayList<TherapistPackagesModel> arrayList2 = arrayList;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                ArrayList arrayList3 = new ArrayList(is.i.H1(arrayList2, 10));
                for (TherapistPackagesModel therapistPackagesModel : arrayList2) {
                    String firstname = therapistPackagesModel.getFirstname();
                    String lastname = therapistPackagesModel.getLastname();
                    String uuid = therapistPackagesModel.getUuid();
                    String image = therapistPackagesModel.getImage();
                    ArrayList<LanguagePackagesModel> languages = therapistPackagesModel.getLanguages();
                    ArrayList<EducationPackagesModel> educations = therapistPackagesModel.getEducations();
                    ExperiencePackagesModel experiencePackagesModel = new ExperiencePackagesModel();
                    ExperiencePackagesModel experience = therapistPackagesModel.getExperience();
                    if (experience != null) {
                        i6 = experience.getYear();
                    } else {
                        i6 = 0;
                    }
                    experiencePackagesModel.setYear(i6);
                    i.f(uuid, "uuid");
                    arrayList3.add(new ProviderListModel(firstname, lastname, image, educations, experiencePackagesModel, languages, uuid, "therapist"));
                }
                a.I(a.this, arrayList3);
            }
            return hs.k.f19476a;
        }
    }

    public a() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new w(27, this));
        i.f(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.B = registerForActivityResult;
    }

    public static final void I(a aVar, ArrayList arrayList) {
        RecyclerView.e eVar;
        np.a aVar2;
        RecyclerView recyclerView = (RecyclerView) aVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardRecycler);
        if (recyclerView != null) {
            eVar = recyclerView.getAdapter();
        } else {
            eVar = null;
        }
        if (eVar instanceof np.a) {
            aVar2 = (np.a) eVar;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            Timer timer = aVar.f27699z;
            if (timer != null) {
                timer.cancel();
            }
            aVar.f27699z = null;
            aVar2.f26707x = arrayList;
            aVar2.i();
            RecyclerView recyclerView2 = (RecyclerView) aVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardRecycler);
            if (recyclerView2 != null) {
                recyclerView2.h0(5000);
            }
            RecyclerView recyclerView3 = (RecyclerView) aVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardRecycler);
            if (recyclerView3 != null) {
                recyclerView3.k0(10, 0, false);
            }
            Timer timer2 = new Timer();
            aVar.f27699z = timer2;
            timer2.scheduleAtFixedRate(new op.b(aVar), 8000L, 5000L);
            return;
        }
        RecyclerView recyclerView4 = (RecyclerView) aVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardRecycler);
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(new np.a(arrayList, new op.c(aVar)));
            recyclerView4.post(new ni.c(13, recyclerView4, aVar, aVar));
        }
        ((RobertoButton) aVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardCTA)).setText(aVar.getString(R.string.teleEntryCardVarDCTA));
        ((RobertoButton) aVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardCTA)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(aVar.requireContext(), R.color.sea)));
        ((RobertoTextView) aVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardCtaDescription)).setVisibility(8);
    }

    @Override // hl.a
    public final void F() {
        J();
    }

    public final void J() {
        String str;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str = user.getCurrentCourseName();
        } else {
            str = null;
        }
        if (i.b(str, Constants.COURSE_GENERIC)) {
            eo.f fVar = this.f27698y;
            if (fVar != null) {
                try {
                    androidx.lifecycle.w<SingleUseEvent<ArrayList<ProviderListModel>>> wVar = fVar.I;
                    ArrayList<ProviderListModel> matchingTherapists = ApplicationPersistence.getInstance().getMatchingTherapists();
                    i.f(matchingTherapists, "getInstance().matchingTherapists");
                    wVar.i(new SingleUseEvent<>(new ArrayList(u.E2(matchingTherapists, 5))));
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(fVar.f14443x, e10);
                    return;
                }
            }
            return;
        }
        K();
    }

    public final void K() {
        String str;
        rp.v vVar = (rp.v) new o0(this, new rp.w(new s())).a(rp.v.class);
        vVar.f30910y.e(getViewLifecycleOwner(), new b0(29, new d()));
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str = user.getCurrentCourseName();
        } else {
            str = null;
        }
        vVar.e(str);
    }

    @Override // hl.a
    public final void _$_clearFindViewByIdCache() {
        this.C.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.C;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        i.g(context, "context");
        super.onAttach(context);
        if (context instanceof il.b) {
            this.A = (il.b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.dashboard_provider_entry_layout_variant_2, viewGroup, false);
    }

    @Override // hl.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        eo.f fVar = (eo.f) new o0(this).a(eo.f.class);
        this.f27698y = fVar;
        if (fVar != null) {
            fVar.H.e(getViewLifecycleOwner(), new b0(26, new C0461a()));
            fVar.J.e(getViewLifecycleOwner(), new b0(27, new b(fVar)));
            fVar.I.e(getViewLifecycleOwner(), new b0(28, new c()));
        }
        RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.tvProviderEntryVar2CardCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new v0(24, this));
        }
        J();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.tvProviderEntryVar2CardRecycler);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new CenterZoomLayoutManager(requireContext(), 0, false, 0.2f, 1.5f, null, 32, null));
            recyclerView.setAdapter(new qp.a(true));
            new r().a(recyclerView);
            recyclerView.post(new nn.f(recyclerView, 3, this));
        }
    }
}
