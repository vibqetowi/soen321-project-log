package xm;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.p;
import wm.c;
/* compiled from: LearningHubExperimentSearchFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxm/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f37859v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f37860u = new LinkedHashMap();

    /* compiled from: LearningHubExperimentSearchFragment.kt */
    /* renamed from: xm.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0636b extends k implements p<LearningHubModel, Boolean, hs.k> {
        public C0636b() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(LearningHubModel learningHubModel, Boolean bool) {
            LearningHubExperimentActivity learningHubExperimentActivity;
            LearningHubExperimentActivity learningHubExperimentActivity2;
            LearningHubModel model = learningHubModel;
            boolean booleanValue = bool.booleanValue();
            i.g(model, "model");
            boolean booleanValue2 = ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_LEARNING_HUB, false);
            b bVar = b.this;
            if (!booleanValue2 && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                androidx.fragment.app.p requireActivity = bVar.requireActivity();
                if (requireActivity instanceof LearningHubExperimentActivity) {
                    LearningHubExperimentActivity learningHubExperimentActivity3 = (LearningHubExperimentActivity) requireActivity;
                }
                ApplicationPersistence.getInstance().setBooleanValue(Constants.FFM_LEARNING_HUB, true);
            }
            androidx.fragment.app.p requireActivity2 = bVar.requireActivity();
            LearningHubExperimentActivity learningHubExperimentActivity4 = null;
            if (requireActivity2 instanceof LearningHubExperimentActivity) {
                learningHubExperimentActivity = (LearningHubExperimentActivity) requireActivity2;
            } else {
                learningHubExperimentActivity = null;
            }
            if (learningHubExperimentActivity != null) {
                androidx.fragment.app.p requireActivity3 = bVar.requireActivity();
                i.e(requireActivity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity");
                learningHubExperimentActivity.startActivity(new Intent((LearningHubExperimentActivity) requireActivity3, LearningHubArticleExperimentActivity.class).putExtra("model", model));
            }
            if (booleanValue) {
                androidx.fragment.app.p requireActivity4 = bVar.requireActivity();
                if (requireActivity4 instanceof LearningHubExperimentActivity) {
                    learningHubExperimentActivity2 = (LearningHubExperimentActivity) requireActivity4;
                } else {
                    learningHubExperimentActivity2 = null;
                }
                if (learningHubExperimentActivity2 != null) {
                    learningHubExperimentActivity2.B = true;
                }
                androidx.fragment.app.p requireActivity5 = bVar.requireActivity();
                if (requireActivity5 instanceof LearningHubExperimentActivity) {
                    learningHubExperimentActivity4 = (LearningHubExperimentActivity) requireActivity5;
                }
                if (learningHubExperimentActivity4 != null) {
                    learningHubExperimentActivity4.A = model;
                }
            }
            return hs.k.f19476a;
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f37860u;
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
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_learning_hub_experiment_search, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f37860u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LearningHubExperimentActivity learningHubExperimentActivity;
        ArrayList<LearningHubModel> arrayList;
        RecyclerView recyclerView;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p requireActivity = requireActivity();
        ArrayList<LearningHubModel> arrayList2 = null;
        if (requireActivity instanceof LearningHubExperimentActivity) {
            learningHubExperimentActivity = (LearningHubExperimentActivity) requireActivity;
        } else {
            learningHubExperimentActivity = null;
        }
        if (learningHubExperimentActivity != null && (arrayList = learningHubExperimentActivity.C) != null) {
            if (!arrayList.isEmpty()) {
                arrayList2 = arrayList;
            }
            if (arrayList2 != null && (recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvLearningHubExperimentSearchSearch)) != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
                recyclerView.setAdapter(new c(arrayList2, new C0636b()));
            }
        }
        RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.tvLearningHubExperimentSearchSearchEditText);
        if (robertoEditText != null) {
            robertoEditText.addTextChangedListener(new a());
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivLearningHubExperimentSearchSearchClear);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: xm.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f37858v;

                {
                    this.f37858v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Editable text;
                    int i6 = r2;
                    LearningHubExperimentActivity learningHubExperimentActivity2 = null;
                    c cVar = null;
                    b this$0 = this.f37858v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f37859v;
                            i.g(this$0, "this$0");
                            RobertoEditText robertoEditText2 = (RobertoEditText) this$0._$_findCachedViewById(R.id.tvLearningHubExperimentSearchSearchEditText);
                            if (robertoEditText2 != null && (text = robertoEditText2.getText()) != null) {
                                text.clear();
                            }
                            RecyclerView.e adapter = ((RecyclerView) this$0._$_findCachedViewById(R.id.rvLearningHubExperimentSearchSearch)).getAdapter();
                            if (adapter instanceof c) {
                                cVar = (c) adapter;
                            }
                            if (cVar != null) {
                                cVar.v("");
                            }
                            Bundle bundle2 = new Bundle();
                            defpackage.b.s(bundle2, "course", bundle2, "cm_post_search_cross_click");
                            return;
                        default:
                            int i11 = b.f37859v;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            if (requireActivity2 instanceof LearningHubExperimentActivity) {
                                learningHubExperimentActivity2 = (LearningHubExperimentActivity) requireActivity2;
                            }
                            if (learningHubExperimentActivity2 != null) {
                                learningHubExperimentActivity2.o0();
                            }
                            Bundle bundle3 = new Bundle();
                            defpackage.b.s(bundle3, "course", bundle3, "cm_post_search_back");
                            return;
                    }
                }
            });
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivLearningHubExperimentSearchArrowBack);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: xm.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f37858v;

                {
                    this.f37858v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Editable text;
                    int i6 = r2;
                    LearningHubExperimentActivity learningHubExperimentActivity2 = null;
                    c cVar = null;
                    b this$0 = this.f37858v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f37859v;
                            i.g(this$0, "this$0");
                            RobertoEditText robertoEditText2 = (RobertoEditText) this$0._$_findCachedViewById(R.id.tvLearningHubExperimentSearchSearchEditText);
                            if (robertoEditText2 != null && (text = robertoEditText2.getText()) != null) {
                                text.clear();
                            }
                            RecyclerView.e adapter = ((RecyclerView) this$0._$_findCachedViewById(R.id.rvLearningHubExperimentSearchSearch)).getAdapter();
                            if (adapter instanceof c) {
                                cVar = (c) adapter;
                            }
                            if (cVar != null) {
                                cVar.v("");
                            }
                            Bundle bundle2 = new Bundle();
                            defpackage.b.s(bundle2, "course", bundle2, "cm_post_search_cross_click");
                            return;
                        default:
                            int i11 = b.f37859v;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            if (requireActivity2 instanceof LearningHubExperimentActivity) {
                                learningHubExperimentActivity2 = (LearningHubExperimentActivity) requireActivity2;
                            }
                            if (learningHubExperimentActivity2 != null) {
                                learningHubExperimentActivity2.o0();
                            }
                            Bundle bundle3 = new Bundle();
                            defpackage.b.s(bundle3, "course", bundle3, "cm_post_search_back");
                            return;
                    }
                }
            });
        }
    }

    /* compiled from: TextView.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            c cVar;
            RecyclerView.e adapter = ((RecyclerView) b.this._$_findCachedViewById(R.id.rvLearningHubExperimentSearchSearch)).getAdapter();
            if (adapter instanceof c) {
                cVar = (c) adapter;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                cVar.v(String.valueOf(editable));
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
