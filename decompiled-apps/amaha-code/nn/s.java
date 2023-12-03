package nn;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.monetization.activitiy.MiniMonetizationActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: BasicMonetizationOnboardingMiniFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/s;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s extends Fragment {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f26590x = 0;

    /* renamed from: u  reason: collision with root package name */
    public MiniMonetizationActivity f26591u;

    /* renamed from: v  reason: collision with root package name */
    public final int f26592v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f26593w = new LinkedHashMap();

    public s() {
        LogHelper.INSTANCE.makeLogTag("BasicMonetizationOnboardingMiniFragment");
        this.f26592v = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
    }

    public final MiniMonetizationActivity F() {
        MiniMonetizationActivity miniMonetizationActivity = this.f26591u;
        if (miniMonetizationActivity != null) {
            return miniMonetizationActivity;
        }
        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26593w;
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
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        if (i6 == this.f26592v) {
            Intent intent2 = new Intent();
            intent2.putExtra("monetization_open", true);
            F().setResult(-1, intent2);
            F().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_basic_monetization_onboarding_mini, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f26593w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.monetization.activitiy.MiniMonetizationActivity");
        this.f26591u = (MiniMonetizationActivity) requireActivity;
        if (F().I.size() > 0) {
            ((RobertoButton) _$_findCachedViewById(R.id.rewardMonetizationCta)).setText(getString(R.string.depressionMasteryDaydoneCTA1));
        } else {
            ((RobertoButton) _$_findCachedViewById(R.id.rewardMonetizationCta)).setText(getString(R.string.onboardingBasicCTATrial));
        }
        ((RobertoTextView) _$_findCachedViewById(R.id.rewardExploreCta)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.rewardExploreCta)).getPaintFlags() | 8);
        ((RobertoButton) _$_findCachedViewById(R.id.rewardMonetizationCta)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.r

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ s f26584v;

            {
                this.f26584v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                s this$0 = this.f26584v;
                switch (i6) {
                    case 0:
                        int i10 = s.f26590x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                        this$0.startActivityForResult(tr.r.s(requireActivity2, false).putExtra("source", "OnboardingMiniMonetization"), this$0.f26592v);
                        return;
                    case 1:
                        int i11 = s.f26590x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().setResult(-1, new Intent());
                        this$0.F().finish();
                        return;
                    default:
                        int i12 = s.f26590x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().setResult(-1, new Intent());
                        this$0.F().finish();
                        return;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.rewardExploreCta)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.r

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ s f26584v;

            {
                this.f26584v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                s this$0 = this.f26584v;
                switch (i6) {
                    case 0:
                        int i10 = s.f26590x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                        this$0.startActivityForResult(tr.r.s(requireActivity2, false).putExtra("source", "OnboardingMiniMonetization"), this$0.f26592v);
                        return;
                    case 1:
                        int i11 = s.f26590x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().setResult(-1, new Intent());
                        this$0.F().finish();
                        return;
                    default:
                        int i12 = s.f26590x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().setResult(-1, new Intent());
                        this$0.F().finish();
                        return;
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.rewardArrowBack)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.r

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ s f26584v;

            {
                this.f26584v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                s this$0 = this.f26584v;
                switch (i6) {
                    case 0:
                        int i10 = s.f26590x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                        this$0.startActivityForResult(tr.r.s(requireActivity2, false).putExtra("source", "OnboardingMiniMonetization"), this$0.f26592v);
                        return;
                    case 1:
                        int i11 = s.f26590x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().setResult(-1, new Intent());
                        this$0.F().finish();
                        return;
                    default:
                        int i12 = s.f26590x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().setResult(-1, new Intent());
                        this$0.F().finish();
                        return;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.rewardHeader)).setText(F().getString(R.string.onboardingBasicFinishHeader, FirebasePersistence.getInstance().getUser().getFirstName()));
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        AppCompatImageView rewardArrowBack = (AppCompatImageView) _$_findCachedViewById(R.id.rewardArrowBack);
        kotlin.jvm.internal.i.f(rewardArrowBack, "rewardArrowBack");
        insetsUtils.addStatusBarHeight(rewardArrowBack);
        ConstraintLayout parent = (ConstraintLayout) _$_findCachedViewById(R.id.parent);
        kotlin.jvm.internal.i.f(parent, "parent");
        insetsUtils.addBottomNavHeight(parent);
    }
}
