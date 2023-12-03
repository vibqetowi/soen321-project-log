package sm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: JournalThoughtLearningNutshellFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsm/w;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class w extends Fragment {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f31761y = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f31764w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f31765x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f31762u = LogHelper.INSTANCE.makeLogTag("JTLNutshellFragment");

    /* renamed from: v  reason: collision with root package name */
    public String f31763v = "journal_list";

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f31765x;
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
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_journal_thought_learning_nutshell, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f31765x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z10;
        String string;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("source");
            } else {
                str = null;
            }
            if (str == null) {
                str = "journal_list";
            }
            this.f31763v = str;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                z10 = arguments2.getBoolean("isOnboarding");
            } else {
                z10 = false;
            }
            this.f31764w = z10;
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivTLNutshellBack)).setOnClickListener(new View.OnClickListener(this) { // from class: sm.v

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ w f31760v;

                {
                    this.f31760v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    String str2 = "list_screen";
                    w this$0 = this.f31760v;
                    switch (i6) {
                        case 0:
                            int i10 = w.f31761y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.requireActivity().onBackPressed();
                            return;
                        case 1:
                            int i11 = w.f31761y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(this$0.f31763v, "journal_list")) {
                                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalActivity");
                                ((JournalActivity) requireActivity).p0(this$0.f31764w);
                            } else {
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                                ((JournalParentActivity) requireActivity2).q0();
                            }
                            String str3 = gk.a.f16573a;
                            Bundle a10 = r1.b0.a("template", "thought_journal");
                            if (!kotlin.jvm.internal.i.b(this$0.f31763v, "journal_list")) {
                                str2 = "inside_entry";
                            }
                            a10.putString("source", str2);
                            a10.putBoolean("is_onboarding", this$0.f31764w);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(a10, "journal_learn_more_skip");
                            return;
                        default:
                            int i12 = w.f31761y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(this$0.f31763v, "journal_list")) {
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalActivity");
                                ((JournalActivity) requireActivity3).p0(this$0.f31764w);
                            } else {
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                                ((JournalParentActivity) requireActivity4).q0();
                            }
                            String str4 = gk.a.f16573a;
                            Bundle a11 = r1.b0.a("template", "thought_journal");
                            if (!kotlin.jvm.internal.i.b(this$0.f31763v, "journal_list")) {
                                str2 = "inside_entry";
                            }
                            a11.putString("source", str2);
                            a11.putBoolean("is_onboarding", this$0.f31764w);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(a11, "journal_learn_more_understood");
                            return;
                    }
                }
            });
            if (this.f31764w) {
                ((RobertoButton) _$_findCachedViewById(R.id.btnTLNutshellSkip)).setVisibility(0);
                ((RobertoButton) _$_findCachedViewById(R.id.btnTLNutshellSkip)).setOnClickListener(new View.OnClickListener(this) { // from class: sm.v

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ w f31760v;

                    {
                        this.f31760v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        String str2 = "list_screen";
                        w this$0 = this.f31760v;
                        switch (i6) {
                            case 0:
                                int i10 = w.f31761y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.requireActivity().onBackPressed();
                                return;
                            case 1:
                                int i11 = w.f31761y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (kotlin.jvm.internal.i.b(this$0.f31763v, "journal_list")) {
                                    androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                    kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalActivity");
                                    ((JournalActivity) requireActivity).p0(this$0.f31764w);
                                } else {
                                    androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                    kotlin.jvm.internal.i.e(requireActivity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                                    ((JournalParentActivity) requireActivity2).q0();
                                }
                                String str3 = gk.a.f16573a;
                                Bundle a10 = r1.b0.a("template", "thought_journal");
                                if (!kotlin.jvm.internal.i.b(this$0.f31763v, "journal_list")) {
                                    str2 = "inside_entry";
                                }
                                a10.putString("source", str2);
                                a10.putBoolean("is_onboarding", this$0.f31764w);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(a10, "journal_learn_more_skip");
                                return;
                            default:
                                int i12 = w.f31761y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (kotlin.jvm.internal.i.b(this$0.f31763v, "journal_list")) {
                                    androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                    kotlin.jvm.internal.i.e(requireActivity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalActivity");
                                    ((JournalActivity) requireActivity3).p0(this$0.f31764w);
                                } else {
                                    androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                    kotlin.jvm.internal.i.e(requireActivity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                                    ((JournalParentActivity) requireActivity4).q0();
                                }
                                String str4 = gk.a.f16573a;
                                Bundle a11 = r1.b0.a("template", "thought_journal");
                                if (!kotlin.jvm.internal.i.b(this$0.f31763v, "journal_list")) {
                                    str2 = "inside_entry";
                                }
                                a11.putString("source", str2);
                                a11.putBoolean("is_onboarding", this$0.f31764w);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(a11, "journal_learn_more_understood");
                                return;
                        }
                    }
                });
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnTLNutshell)).setOnClickListener(new View.OnClickListener(this) { // from class: sm.v

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ w f31760v;

                {
                    this.f31760v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    String str2 = "list_screen";
                    w this$0 = this.f31760v;
                    switch (i6) {
                        case 0:
                            int i10 = w.f31761y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.requireActivity().onBackPressed();
                            return;
                        case 1:
                            int i11 = w.f31761y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(this$0.f31763v, "journal_list")) {
                                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalActivity");
                                ((JournalActivity) requireActivity).p0(this$0.f31764w);
                            } else {
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                                ((JournalParentActivity) requireActivity2).q0();
                            }
                            String str3 = gk.a.f16573a;
                            Bundle a10 = r1.b0.a("template", "thought_journal");
                            if (!kotlin.jvm.internal.i.b(this$0.f31763v, "journal_list")) {
                                str2 = "inside_entry";
                            }
                            a10.putString("source", str2);
                            a10.putBoolean("is_onboarding", this$0.f31764w);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(a10, "journal_learn_more_skip");
                            return;
                        default:
                            int i12 = w.f31761y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(this$0.f31763v, "journal_list")) {
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalActivity");
                                ((JournalActivity) requireActivity3).p0(this$0.f31764w);
                            } else {
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                kotlin.jvm.internal.i.e(requireActivity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                                ((JournalParentActivity) requireActivity4).q0();
                            }
                            String str4 = gk.a.f16573a;
                            Bundle a11 = r1.b0.a("template", "thought_journal");
                            if (!kotlin.jvm.internal.i.b(this$0.f31763v, "journal_list")) {
                                str2 = "inside_entry";
                            }
                            a11.putString("source", str2);
                            a11.putBoolean("is_onboarding", this$0.f31764w);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(a11, "journal_learn_more_understood");
                            return;
                    }
                }
            });
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnTLNutshell);
            if (this.f31764w) {
                string = getString(R.string.get_started);
            } else {
                string = getString(R.string.understood);
            }
            robertoButton.setText(string);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31762u, e10);
        }
    }
}
