package bo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: NewOnBoardingInfoScreensFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbo/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends Fragment {

    /* renamed from: v  reason: collision with root package name */
    public boolean f4558v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f4559w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f4557u = LogHelper.INSTANCE.makeLogTag("NewOnBoardingInfoScreens");

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f4559w;
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
        return inflater.inflate(R.layout.fragment_new_on_boarding_intro_screens, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f4559w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LottieAnimationView lottieAnimationView;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            int i6 = 0;
            if (arguments != null) {
                i6 = arguments.getInt(Constants.DAYMODEL_POSITION, 0);
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvInfoScreenHeader);
            p requireActivity = requireActivity();
            int i10 = R.string.on_boarding_intro_screen_1_header;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            i10 = R.string.on_boarding_intro_screen_4_header;
                        }
                    } else {
                        i10 = R.string.on_boarding_intro_screen_3_header;
                    }
                } else {
                    i10 = R.string.on_boarding_intro_screen_2_header;
                }
            }
            robertoTextView.setText(requireActivity.getString(i10));
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clInfoScreenParentContainer);
            Context requireContext = requireContext();
            int i11 = R.color.onBoardingBackgroundIntroScreen1;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            i11 = R.color.onBoardingBackgroundIntroScreen4;
                        }
                    } else {
                        i11 = R.color.onBoardingBackgroundIntroScreen3;
                    }
                } else {
                    i11 = R.color.onBoardingBackgroundIntroScreen2;
                }
            }
            constraintLayout.setBackgroundColor(g0.a.b(requireContext, i11));
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.lavInfoScreenLottieView);
            int i12 = R.raw.new_onboarding_info_screen_1;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            i12 = R.raw.new_onboarding_info_screen_4;
                        }
                    } else {
                        i12 = R.raw.new_onboarding_info_screen_3;
                    }
                } else {
                    i12 = R.raw.new_onboarding_info_screen_2;
                }
            }
            lottieAnimationView2.setAnimation(i12);
            if ((i6 != 0 || this.f4558v) && (lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.lavInfoScreenLottieView)) != null) {
                lottieAnimationView.h();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4557u, e10);
        }
    }
}
