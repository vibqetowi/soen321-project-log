package ho;

import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import nn.v0;
/* compiled from: ProAssessmentPresentConcernsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/n;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18024z = 0;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f18029y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18025u = LogHelper.INSTANCE.makeLogTag(n.class);

    /* renamed from: v  reason: collision with root package name */
    public final int f18026v = 5;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<String> f18027w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public boolean f18028x = true;

    /* compiled from: ProAssessmentPresentConcernsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent e10) {
            kotlin.jvm.internal.i.g(e10, "e");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent e12, MotionEvent e22, float f, float f2) {
            n nVar = n.this;
            kotlin.jvm.internal.i.g(e12, "e1");
            kotlin.jvm.internal.i.g(e22, "e2");
            try {
                if (!nVar.f18028x && e22.getY() - e12.getY() > 400.0f && Math.abs(f2) > 100.0f) {
                    nVar.K(true);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(nVar.f18025u, e10);
            }
            return super.onFling(e12, e22, f, f2);
        }
    }

    /* compiled from: ProAssessmentPresentConcernsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            n nVar = n.this;
            if (!nVar.f18028x) {
                RobertoEditText robertoEditText = (RobertoEditText) nVar._$_findCachedViewById(R.id.presentConcernTellUsMoreEditText);
                if (robertoEditText != null) {
                    robertoEditText.requestFocus();
                }
                if (((RobertoEditText) nVar._$_findCachedViewById(R.id.presentConcernTellUsMoreEditText)) != null) {
                    UiUtils.Companion companion = UiUtils.Companion;
                    Context requireContext = nVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    RobertoEditText presentConcernTellUsMoreEditText = (RobertoEditText) nVar._$_findCachedViewById(R.id.presentConcernTellUsMoreEditText);
                    kotlin.jvm.internal.i.f(presentConcernTellUsMoreEditText, "presentConcernTellUsMoreEditText");
                    companion.showKeyboardFrom(requireContext, presentConcernTellUsMoreEditText);
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    public final void J() {
        try {
            String[] stringArray = getResources().getStringArray(R.array.paPresentConcernsWordCloud);
            kotlin.jvm.internal.i.f(stringArray, "resources.getStringArray…PresentConcernsWordCloud)");
            for (String str : ca.a.k(Arrays.copyOf(stringArray, stringArray.length))) {
                Chip chip = new Chip(requireContext(), null);
                chip.setLayoutParams(new ChipGroup.b());
                chip.setGravity(17);
                chip.setChipMinHeightResource(R.dimen.margin_32);
                chip.setChipStartPaddingResource(R.dimen.margin_10);
                chip.setChipEndPaddingResource(R.dimen.margin_10);
                chip.setTextColor(g0.a.b(requireContext(), R.color.proAssessmentBlueLight));
                chip.setChipBackgroundColorResource(R.color.proBgPink);
                chip.setChipStrokeColorResource(R.color.proAssessmentBlueLightest);
                chip.setChipStrokeWidth(2.0f);
                chip.setCloseIconTint(null);
                chip.setCheckedIconVisible(false);
                chip.setChipIconVisible(false);
                chip.setCloseIconVisible(false);
                chip.setChecked(false);
                chip.setCheckable(true);
                chip.setText(str);
                chip.setOnCheckedChangeListener(new fl.m(this, 1, chip));
                ChipGroup chipGroup = (ChipGroup) _$_findCachedViewById(R.id.presentConcernChipGroup);
                if (chipGroup != null) {
                    chipGroup.addView(chip);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18025u, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(boolean z10) {
        boolean z11;
        boolean z12 = true;
        float f = 1.0f;
        try {
            if (z10) {
                ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.presentConcernWordCloud);
                if (constraintLayout != null) {
                    constraintLayout.setAlpha(0.0f);
                }
                if (((ConstraintLayout) _$_findCachedViewById(R.id.presentConcernWordCloud)) != null) {
                    ((ConstraintLayout) _$_findCachedViewById(R.id.presentConcernWordCloud)).animate().translationY(0.0f).alpha(1.0f).setDuration(500L).start();
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.presentConcernTellUsMore);
                if (constraintLayout2 != null) {
                    constraintLayout2.setAlpha(1.0f);
                    constraintLayout2.setScaleX(1.0f);
                    constraintLayout2.setScaleY(1.0f);
                    constraintLayout2.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setDuration(300L).start();
                }
                RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.presentConcernTellUsMoreEditText);
                if (robertoEditText != null) {
                    robertoEditText.clearFocus();
                }
                if (((RobertoEditText) _$_findCachedViewById(R.id.presentConcernTellUsMoreEditText)) != null) {
                    UiUtils.Companion companion = UiUtils.Companion;
                    Context requireContext = requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    RobertoEditText presentConcernTellUsMoreEditText = (RobertoEditText) _$_findCachedViewById(R.id.presentConcernTellUsMoreEditText);
                    kotlin.jvm.internal.i.f(presentConcernTellUsMoreEditText, "presentConcernTellUsMoreEditText");
                    companion.hideKeyboardFrom(requireContext, presentConcernTellUsMoreEditText);
                }
                ((AppCompatImageView) _$_findCachedViewById(R.id.presentConcernNext)).setAlpha(1.0f);
            } else {
                if (((ConstraintLayout) _$_findCachedViewById(R.id.presentConcernWordCloud)) != null) {
                    ((ConstraintLayout) _$_findCachedViewById(R.id.presentConcernWordCloud)).animate().translationY(-((ConstraintLayout) _$_findCachedViewById(R.id.presentConcernWordCloud)).getHeight()).alpha(0.0f).setDuration(300L).start();
                }
                ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(R.id.presentConcernTellUsMore);
                if (constraintLayout3 != null) {
                    constraintLayout3.setVisibility(0);
                    constraintLayout3.setAlpha(0.0f);
                    constraintLayout3.setScaleX(0.6f);
                    constraintLayout3.setScaleY(0.6f);
                    constraintLayout3.animate().setListener(new c()).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(500L).start();
                    AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.presentConcernNext);
                    Editable text = ((RobertoEditText) _$_findCachedViewById(R.id.presentConcernTellUsMoreEditText)).getText();
                    if (text != null && !gv.n.B0(text)) {
                        z11 = false;
                        if (z11) {
                            f = 0.34f;
                        }
                        appCompatImageView.setAlpha(f);
                    }
                    z11 = true;
                    if (z11) {
                    }
                    appCompatImageView.setAlpha(f);
                }
            }
            if (this.f18028x) {
                z12 = false;
            }
            this.f18028x = z12;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18025u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18029y;
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
        return inflater.inflate(R.layout.fragment_pa_present_concerns, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18029y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str = this.f18025u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            J();
            try {
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.presentConcernNext);
                if (appCompatImageView != null) {
                    appCompatImageView.setOnClickListener(new v0(14, this));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, e10);
            }
            GestureDetector gestureDetector = new GestureDetector(requireContext(), new b());
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.presentConcernTellUsMore);
            if (constraintLayout != null) {
                constraintLayout.setOnTouchListener(new dc.h(4, gestureDetector));
            }
            ((RobertoEditText) _$_findCachedViewById(R.id.presentConcernTellUsMoreEditText)).addTextChangedListener(new a());
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    /* compiled from: ProAssessmentPresentConcernsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            float f;
            AppCompatImageView appCompatImageView = (AppCompatImageView) n.this._$_findCachedViewById(R.id.presentConcernNext);
            if (charSequence != null && !gv.n.B0(charSequence)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                f = 0.34f;
            } else {
                f = 1.0f;
            }
            appCompatImageView.setAlpha(f);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
