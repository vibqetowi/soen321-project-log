package nn;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: CB2Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/i0;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i0 extends rn.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f26514x;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f26516z = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f26513w = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final String f26515y = LogHelper.INSTANCE.makeLogTag(i0.class);

    /* compiled from: CB2Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f26518b;

        public a(ObjectAnimator objectAnimator) {
            this.f26518b = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            boolean z10;
            kotlin.jvm.internal.i.g(animation, "animation");
            i0 i0Var = i0.this;
            String str = (String) is.u.j2(i0Var.f26514x, i0Var.f26513w);
            if (str != null) {
                if (i0Var.getActivity() == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    str = null;
                }
                if (str != null) {
                    androidx.fragment.app.p activity = i0Var.getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    com.bumptech.glide.f d10 = Glide.c(activity).d(activity);
                    androidx.fragment.app.p activity2 = i0Var.getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    d10.d(new File(activity2.getFilesDir(), str)).B((AppCompatImageView) i0Var._$_findCachedViewById(R.id.cb2ImageHolder));
                }
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((AppCompatImageView) i0Var._$_findCachedViewById(R.id.cb2ImageHolder), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(350L);
            ofFloat.start();
            this.f26518b.removeListener(this);
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

    public final void I(boolean z10) {
        try {
            if (z10) {
                this.f26514x++;
            } else {
                this.f26514x--;
            }
            if (this.f26514x >= this.f26513w.size()) {
                this.f26514x = 0;
            } else if (this.f26514x < 0) {
                this.f26514x = this.f26513w.size() - 1;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((AppCompatImageView) _$_findCachedViewById(R.id.cb2ImageHolder), "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(350L);
            ofFloat.addListener(new a(ofFloat));
            ofFloat.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26515y, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cc, code lost:
        r4 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        boolean z10;
        boolean z11;
        boolean z12;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string = arguments.getString("cb2_title", "");
                String str = null;
                if (string != null) {
                    if (gv.n.B0(string)) {
                        string = null;
                    }
                    if (string != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.cb2Title)).setText(string);
                    }
                }
                String string2 = arguments.getString("cb2_arrow_bg_color", "");
                boolean z13 = true;
                if (string2 != null) {
                    if (string2.length() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        string2 = null;
                    }
                    if (string2 != null) {
                        ((AppCompatImageView) _$_findCachedViewById(R.id.cb2ArrowLeft)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(string2)));
                        ((AppCompatImageView) _$_findCachedViewById(R.id.cb2ArrowRight)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(string2)));
                    }
                }
                String string3 = arguments.getString("cb2_arrow_color", "");
                if (string3 != null) {
                    if (string3.length() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        ((AppCompatImageView) _$_findCachedViewById(R.id.cb2ArrowLeft)).setImageTintList(ColorStateList.valueOf(Color.parseColor(string3)));
                        ((AppCompatImageView) _$_findCachedViewById(R.id.cb2ArrowRight)).setImageTintList(ColorStateList.valueOf(Color.parseColor(string3)));
                    }
                }
                ArrayList<String> stringArrayList = arguments.getStringArrayList("cb2_icon_list");
                if (stringArrayList != null) {
                    if (stringArrayList.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        stringArrayList = null;
                    }
                    if (stringArrayList != null) {
                        this.f26513w = stringArrayList;
                    }
                }
                String string4 = arguments.getString("template_colour", "");
                if (string4 != null && string4.length() != 0) {
                    z13 = false;
                }
                if (str != null) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.cb2Title)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26515y, e10);
        }
    }

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.f26516z.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26516z;
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
        return inflater.inflate(R.layout.fragment_cb2, viewGroup, false);
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            J();
            String str = (String) is.u.j2(0, this.f26513w);
            if (str != null) {
                if (getActivity() == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    str = null;
                }
                if (str != null) {
                    androidx.fragment.app.p activity = getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    com.bumptech.glide.f d10 = Glide.c(activity).d(activity);
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    d10.d(new File(activity2.getFilesDir(), str)).B((AppCompatImageView) _$_findCachedViewById(R.id.cb2ImageHolder));
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.d(activity3);
                    com.bumptech.glide.f d11 = Glide.c(activity3).d(activity3);
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.d(activity4);
                    d11.d(new File(activity4.getFilesDir(), str)).B((AppCompatImageView) _$_findCachedViewById(R.id.cb2BgHolder));
                }
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.cb2ArrowRight)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.h0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ i0 f26509v;

                {
                    this.f26509v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    i0 this$0 = this.f26509v;
                    switch (i6) {
                        case 0:
                            int i10 = i0.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(true);
                            return;
                        default:
                            int i11 = i0.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(false);
                            return;
                    }
                }
            });
            ((AppCompatImageView) _$_findCachedViewById(R.id.cb2ArrowLeft)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.h0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ i0 f26509v;

                {
                    this.f26509v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    i0 this$0 = this.f26509v;
                    switch (i6) {
                        case 0:
                            int i10 = i0.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(true);
                            return;
                        default:
                            int i11 = i0.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(false);
                            return;
                    }
                }
            });
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26515y, e10);
        }
    }
}
