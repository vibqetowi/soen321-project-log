package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.r;
import com.theinnerhour.b2b.R;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class j<S> extends b0<S> {
    public static final /* synthetic */ int I = 0;
    public int A;
    public com.google.android.material.datepicker.c B;
    public RecyclerView C;
    public RecyclerView D;
    public View E;
    public View F;
    public View G;
    public View H;

    /* renamed from: v  reason: collision with root package name */
    public int f8965v;

    /* renamed from: w  reason: collision with root package name */
    public com.google.android.material.datepicker.d<S> f8966w;

    /* renamed from: x  reason: collision with root package name */
    public com.google.android.material.datepicker.a f8967x;

    /* renamed from: y  reason: collision with root package name */
    public f f8968y;

    /* renamed from: z  reason: collision with root package name */
    public w f8969z;

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes.dex */
    public class a extends t0.a {
        @Override // t0.a
        public final void d(View view, u0.h hVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f32269a;
            AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionInfo(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes.dex */
    public class b extends c0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8970a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, int i6, int i10) {
            super(context, i6);
            this.f8970a = i10;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(RecyclerView.y yVar, int[] iArr) {
            int i6 = this.f8970a;
            j jVar = j.this;
            if (i6 == 0) {
                iArr[0] = jVar.D.getWidth();
                iArr[1] = jVar.D.getWidth();
                return;
            }
            iArr[0] = jVar.D.getHeight();
            iArr[1] = jVar.D.getHeight();
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes.dex */
    public class c implements d {
        public c() {
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    @Override // com.google.android.material.datepicker.b0
    public final boolean F(r.d dVar) {
        return super.F(dVar);
    }

    public final void I(w wVar) {
        boolean z10;
        w wVar2 = ((z) this.D.getAdapter()).f9015x.f8923u;
        Calendar calendar = wVar2.f9001u;
        if (calendar instanceof GregorianCalendar) {
            int i6 = wVar.f9003w;
            int i10 = wVar2.f9003w;
            int i11 = wVar.f9002v;
            int i12 = wVar2.f9002v;
            int i13 = (i11 - i12) + ((i6 - i10) * 12);
            w wVar3 = this.f8969z;
            if (calendar instanceof GregorianCalendar) {
                int i14 = i13 - ((wVar3.f9002v - i12) + ((wVar3.f9003w - i10) * 12));
                boolean z11 = false;
                if (Math.abs(i14) > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i14 > 0) {
                    z11 = true;
                }
                this.f8969z = wVar;
                if (z10 && z11) {
                    this.D.h0(i13 - 3);
                    this.D.post(new i(this, i13));
                    return;
                } else if (z10) {
                    this.D.h0(i13 + 3);
                    this.D.post(new i(this, i13));
                    return;
                } else {
                    this.D.post(new i(this, i13));
                    return;
                }
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void J(int i6) {
        this.A = i6;
        if (i6 == 2) {
            this.C.getLayoutManager().scrollToPosition(this.f8969z.f9003w - ((g0) this.C.getAdapter()).f8959x.f8967x.f8923u.f9003w);
            this.G.setVisibility(0);
            this.H.setVisibility(8);
            this.E.setVisibility(8);
            this.F.setVisibility(8);
        } else if (i6 == 1) {
            this.G.setVisibility(8);
            this.H.setVisibility(0);
            this.E.setVisibility(0);
            this.F.setVisibility(0);
            I(this.f8969z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f8965v = bundle.getInt("THEME_RES_ID_KEY");
        this.f8966w = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f8967x = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f8968y = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f8969z = (w) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i6;
        int i10;
        g gVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f8965v);
        this.B = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        w wVar = this.f8967x.f8923u;
        if (r.J(contextThemeWrapper)) {
            i6 = R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i6 = R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i6, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i11 = x.A;
        int i12 = dimensionPixelOffset + dimensionPixelSize;
        inflate.setMinimumHeight(i12 + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        t0.d0.q(gridView, new a());
        int i13 = this.f8967x.f8927y;
        if (i13 > 0) {
            gVar = new g(i13);
        } else {
            gVar = new g();
        }
        gridView.setAdapter((ListAdapter) gVar);
        gridView.setNumColumns(wVar.f9004x);
        gridView.setEnabled(false);
        this.D = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.D.setLayoutManager(new b(getContext(), i10, i10));
        this.D.setTag("MONTHS_VIEW_GROUP_TAG");
        z zVar = new z(contextThemeWrapper, this.f8966w, this.f8967x, this.f8968y, new c());
        this.D.setAdapter(zVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.C = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.C.setLayoutManager(new GridLayoutManager(contextThemeWrapper, integer, 0));
            this.C.setAdapter(new g0(this));
            this.C.g(new l(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            t0.d0.q(materialButton, new m(this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.E = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.F = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.G = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.H = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            J(1);
            materialButton.setText(this.f8969z.h());
            this.D.i(new n(this, zVar, materialButton));
            materialButton.setOnClickListener(new o(this));
            this.F.setOnClickListener(new p(this, zVar));
            this.E.setOnClickListener(new h(this, zVar));
        }
        if (!r.J(contextThemeWrapper)) {
            new androidx.recyclerview.widget.w().a(this.D);
        }
        RecyclerView recyclerView2 = this.D;
        w wVar2 = this.f8969z;
        w wVar3 = zVar.f9015x.f8923u;
        if (wVar3.f9001u instanceof GregorianCalendar) {
            recyclerView2.h0((wVar2.f9002v - wVar3.f9002v) + ((wVar2.f9003w - wVar3.f9003w) * 12));
            t0.d0.q(this.D, new k());
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f8965v);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f8966w);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f8967x);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f8968y);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f8969z);
    }
}
