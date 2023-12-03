package bo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dl.m0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import nn.v0;
/* compiled from: NewOnboardingMatchingIntroFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbo/i;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f4591x = 0;

    /* renamed from: v  reason: collision with root package name */
    public eo.g f4593v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f4594w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f4592u = LogHelper.INSTANCE.makeLogTag("NewOnboardingMatchingIntro");

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f4594w;
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
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        try {
            if (context instanceof eo.g) {
                this.f4593v = (eo.g) context;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4592u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.layout_matching_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f4594w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        int i6;
        int i10;
        int i11;
        kotlin.jvm.internal.i.g(view, "view");
        try {
            super.onViewCreated(view, bundle);
            Bundle arguments = getArguments();
            if (arguments != null) {
                z10 = arguments.getBoolean("isTherapy", true);
            } else {
                z10 = true;
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivMatchingIntroProviders);
            if (appCompatImageView != null) {
                if (z10) {
                    i11 = R.drawable.ir_therapist_bubble_matching;
                } else {
                    i11 = R.drawable.ir_psychiatrist_bubble_matching;
                }
                appCompatImageView.setImageResource(i11);
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvMatchingIntroHeader);
            if (robertoTextView != null) {
                p requireActivity = requireActivity();
                if (z10) {
                    i6 = R.string.new_on_boarding_intro_therapy_title;
                } else {
                    i6 = R.string.new_on_boarding_intro_psychiatry_title;
                }
                robertoTextView.setText(requireActivity.getString(i6));
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvMatchingIntroSubHeader);
            if (robertoTextView2 != null) {
                p requireActivity2 = requireActivity();
                if (z10) {
                    i10 = R.string.new_on_boarding_intro_therapy_description;
                } else {
                    i10 = R.string.new_on_boarding_intro_psychiatry_description;
                }
                robertoTextView2.setText(requireActivity2.getString(i10));
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvMatchingIntroCta);
            if (robertoTextView3 != null) {
                robertoTextView3.setOnClickListener(new m0(this, z10, 1));
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivMatchingIntroBack)).setOnClickListener(new v0(7, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4592u, e10);
        }
    }
}
