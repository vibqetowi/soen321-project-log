package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.theinnerhour.b2b.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import t0.r0;
import t0.u0;
/* compiled from: MaterialDatePicker.java */
/* loaded from: classes.dex */
public final class r<S> extends androidx.fragment.app.n {
    public static final /* synthetic */ int U = 0;
    public b0<S> A;
    public com.google.android.material.datepicker.a B;
    public f C;
    public j<S> D;
    public int E;
    public CharSequence F;
    public boolean G;
    public int H;
    public int I;
    public CharSequence J;
    public int K;
    public CharSequence L;
    public TextView M;
    public TextView N;
    public CheckableImageButton O;
    public yb.f P;
    public Button Q;
    public boolean R;
    public CharSequence S;
    public CharSequence T;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashSet<u<? super S>> f8983u = new LinkedHashSet<>();

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f8984v = new LinkedHashSet<>();

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f8985w = new LinkedHashSet<>();

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f8986x = new LinkedHashSet<>();

    /* renamed from: y  reason: collision with root package name */
    public int f8987y;

    /* renamed from: z  reason: collision with root package name */
    public com.google.android.material.datepicker.d<S> f8988z;

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            r rVar = r.this;
            Iterator<u<? super S>> it = rVar.f8983u.iterator();
            while (it.hasNext()) {
                rVar.F().Y();
                it.next().a();
            }
            rVar.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes.dex */
    public class b extends t0.a {
        public b() {
        }

        @Override // t0.a
        public final void d(View view, u0.h hVar) {
            this.f32269a.onInitializeAccessibilityNodeInfo(view, hVar.f33731a);
            StringBuilder sb2 = new StringBuilder();
            int i6 = r.U;
            sb2.append(r.this.F().getError());
            sb2.append(", ");
            sb2.append((Object) hVar.e());
            hVar.i(sb2.toString());
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            r rVar = r.this;
            Iterator<View.OnClickListener> it = rVar.f8984v.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            rVar.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes.dex */
    public class d extends a0<S> {
        public d() {
        }

        @Override // com.google.android.material.datepicker.a0
        public final void a(S s10) {
            r rVar = r.this;
            com.google.android.material.datepicker.d<S> F = rVar.F();
            rVar.getContext();
            String v10 = F.v();
            TextView textView = rVar.N;
            com.google.android.material.datepicker.d<S> F2 = rVar.F();
            rVar.requireContext();
            textView.setContentDescription(F2.U());
            rVar.N.setText(v10);
            rVar.Q.setEnabled(rVar.F().T());
        }
    }

    public static int I(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar c10 = e0.c();
        c10.set(5, 1);
        Calendar b10 = e0.b(c10);
        b10.get(2);
        b10.get(1);
        int maximum = b10.getMaximum(7);
        b10.getActualMaximum(5);
        b10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean J(Context context) {
        return K(16843277, context);
    }

    public static boolean K(int i6, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ub.b.c(context, j.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i6});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    public final com.google.android.material.datepicker.d<S> F() {
        if (this.f8988z == null) {
            this.f8988z = (com.google.android.material.datepicker.d) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f8988z;
    }

    public final void M() {
        b0<S> b0Var;
        CharSequence charSequence;
        boolean z10;
        requireContext();
        int i6 = this.f8987y;
        if (i6 == 0) {
            i6 = F().N();
        }
        com.google.android.material.datepicker.d<S> F = F();
        com.google.android.material.datepicker.a aVar = this.B;
        f fVar = this.C;
        j<S> jVar = new j<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i6);
        bundle.putParcelable("GRID_SELECTOR_KEY", F);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", fVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f8926x);
        jVar.setArguments(bundle);
        this.D = jVar;
        boolean isChecked = this.O.isChecked();
        if (isChecked) {
            com.google.android.material.datepicker.d<S> F2 = F();
            com.google.android.material.datepicker.a aVar2 = this.B;
            b0Var = new v<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i6);
            bundle2.putParcelable("DATE_SELECTOR_KEY", F2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            b0Var.setArguments(bundle2);
        } else {
            b0Var = this.D;
        }
        this.A = b0Var;
        TextView textView = this.M;
        if (isChecked) {
            if (getResources().getConfiguration().orientation == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                charSequence = this.T;
                textView.setText(charSequence);
                com.google.android.material.datepicker.d<S> F3 = F();
                getContext();
                String v10 = F3.v();
                TextView textView2 = this.N;
                com.google.android.material.datepicker.d<S> F4 = F();
                requireContext();
                textView2.setContentDescription(F4.U());
                this.N.setText(v10);
                androidx.fragment.app.y childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(childFragmentManager);
                aVar3.f(R.id.mtrl_calendar_frame, this.A, null);
                aVar3.m();
                this.A.F(new d());
            }
        }
        charSequence = this.S;
        textView.setText(charSequence);
        com.google.android.material.datepicker.d<S> F32 = F();
        getContext();
        String v102 = F32.v();
        TextView textView22 = this.N;
        com.google.android.material.datepicker.d<S> F42 = F();
        requireContext();
        textView22.setContentDescription(F42.U());
        this.N.setText(v102);
        androidx.fragment.app.y childFragmentManager2 = getChildFragmentManager();
        childFragmentManager2.getClass();
        androidx.fragment.app.a aVar32 = new androidx.fragment.app.a(childFragmentManager2);
        aVar32.f(R.id.mtrl_calendar_frame, this.A, null);
        aVar32.m();
        this.A.F(new d());
    }

    public final void O(CheckableImageButton checkableImageButton) {
        String string;
        if (this.O.isChecked()) {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.O.setContentDescription(string);
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f8985w.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f8987y = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f8988z = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.B = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.C = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.E = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.F = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.H = bundle.getInt("INPUT_MODE_KEY");
        this.I = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.J = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.K = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.L = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.F;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.E);
        }
        this.S = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.T = charSequence;
    }

    @Override // androidx.fragment.app.n
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i6 = this.f8987y;
        if (i6 == 0) {
            i6 = F().N();
        }
        Dialog dialog = new Dialog(requireContext, i6);
        Context context = dialog.getContext();
        this.G = J(context);
        int i10 = ub.b.c(context, r.class.getCanonicalName(), R.attr.colorSurface).data;
        yb.f fVar = new yb.f(context, null, R.attr.materialCalendarStyle, 2132083840);
        this.P = fVar;
        fVar.i(context);
        this.P.k(ColorStateList.valueOf(i10));
        yb.f fVar2 = this.P;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
        fVar2.j(d0.i.i(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i6;
        boolean z10;
        if (this.G) {
            i6 = R.layout.mtrl_picker_fullscreen;
        } else {
            i6 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i6, viewGroup);
        Context context = inflate.getContext();
        f fVar = this.C;
        if (fVar != null) {
            fVar.getClass();
        }
        if (this.G) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.N = textView;
        WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
        d0.g.f(textView, 1);
        this.O = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.M = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.O.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.O;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, hc.d.H(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], hc.d.H(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.O;
        if (this.H != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        checkableImageButton2.setChecked(z10);
        t0.d0.q(this.O, null);
        O(this.O);
        this.O.setOnClickListener(new t(this));
        this.Q = (Button) inflate.findViewById(R.id.confirm_button);
        if (F().T()) {
            this.Q.setEnabled(true);
        } else {
            this.Q.setEnabled(false);
        }
        this.Q.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.J;
        if (charSequence != null) {
            this.Q.setText(charSequence);
        } else {
            int i10 = this.I;
            if (i10 != 0) {
                this.Q.setText(i10);
            }
        }
        this.Q.setOnClickListener(new a());
        t0.d0.q(this.Q, new b());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.L;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i11 = this.K;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        button.setOnClickListener(new c());
        return inflate;
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f8986x.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        w f;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f8987y);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f8988z);
        a.b bVar = new a.b(this.B);
        w wVar = this.D.f8969z;
        if (wVar != null) {
            bVar.f8932c = Long.valueOf(wVar.f9006z);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f8934e);
        w f2 = w.f(bVar.f8930a);
        w f10 = w.f(bVar.f8931b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = bVar.f8932c;
        if (l2 == null) {
            f = null;
        } else {
            f = w.f(l2.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new com.google.android.material.datepicker.a(f2, f10, cVar, f, bVar.f8933d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.C);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.E);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.F);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.I);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.J);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.K);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.L);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onStart() {
        Integer num;
        boolean z10;
        int i6;
        int i10;
        boolean z11;
        u0.e aVar;
        u0.e eVar;
        u0.e aVar2;
        u0.e eVar2;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.G) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.P);
            if (!this.R) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                if (findViewById.getBackground() instanceof ColorDrawable) {
                    num = Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor());
                } else {
                    num = null;
                }
                int i11 = Build.VERSION.SDK_INT;
                boolean z12 = false;
                if (num != null && num.intValue() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                int D0 = f6.b.D0(window.getContext(), 16842801, -16777216);
                if (z10) {
                    num = Integer.valueOf(D0);
                }
                Integer valueOf = Integer.valueOf(D0);
                r0.a(window, false);
                Context context = window.getContext();
                if (i11 < 23) {
                    i6 = j0.d.h(f6.b.D0(context, 16843857, -16777216), 128);
                } else {
                    i6 = 0;
                }
                Context context2 = window.getContext();
                if (i11 < 27) {
                    i10 = j0.d.h(f6.b.D0(context2, 16843858, -16777216), 128);
                } else {
                    i10 = 0;
                }
                window.setStatusBarColor(i6);
                window.setNavigationBarColor(i10);
                boolean I0 = f6.b.I0(num.intValue());
                if (!f6.b.I0(i6) && (i6 != 0 || !I0)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                View decorView = window.getDecorView();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    eVar = new u0.d(window);
                } else {
                    if (i12 >= 26) {
                        aVar = new u0.c(decorView, window);
                    } else if (i12 >= 23) {
                        aVar = new u0.b(decorView, window);
                    } else {
                        aVar = new u0.a(decorView, window);
                    }
                    eVar = aVar;
                }
                eVar.d(z11);
                boolean I02 = f6.b.I0(valueOf.intValue());
                if (f6.b.I0(i10) || (i10 == 0 && I02)) {
                    z12 = true;
                }
                View decorView2 = window.getDecorView();
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 30) {
                    eVar2 = new u0.d(window);
                } else {
                    if (i13 >= 26) {
                        aVar2 = new u0.c(decorView2, window);
                    } else if (i13 >= 23) {
                        aVar2 = new u0.b(decorView2, window);
                    } else {
                        aVar2 = new u0.a(decorView2, window);
                    }
                    eVar2 = aVar2;
                }
                eVar2.c(z12);
                s sVar = new s(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                d0.i.u(findViewById, sVar);
                this.R = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.P, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new lb.a(requireDialog(), rect));
        }
        M();
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onStop() {
        this.A.f8940u.clear();
        super.onStop();
    }
}
