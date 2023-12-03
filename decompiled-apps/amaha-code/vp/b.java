package vp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.i;
/* compiled from: TopicalLog30Adapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<RecyclerView.c0> {
    public final int A;
    public final int B;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<Object> f35306x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f35307y;

    /* renamed from: z  reason: collision with root package name */
    public final String f35308z;

    /* compiled from: TopicalLog30Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f35309u;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.trackerLogDate);
            i.f(findViewById, "itemView.findViewById(R.id.trackerLogDate)");
            this.f35309u = (RobertoTextView) findViewById;
        }
    }

    /* compiled from: TopicalLog30Adapter.kt */
    /* renamed from: vp.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0599b extends RecyclerView.c0 {
        public final View A;

        /* renamed from: u  reason: collision with root package name */
        public final LinearLayout f35310u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f35311v;

        /* renamed from: w  reason: collision with root package name */
        public final View f35312w;

        /* renamed from: x  reason: collision with root package name */
        public final View f35313x;

        /* renamed from: y  reason: collision with root package name */
        public final View f35314y;

        /* renamed from: z  reason: collision with root package name */
        public final View f35315z;

        public C0599b(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.logsContainer);
            i.f(findViewById, "itemView.findViewById(R.id.logsContainer)");
            this.f35310u = (LinearLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.logTime);
            i.f(findViewById2, "itemView.findViewById(R.id.logTime)");
            this.f35311v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.trackerLogSeparator);
            i.f(findViewById3, "itemView.findViewById(R.id.trackerLogSeparator)");
            this.f35312w = findViewById3;
            View findViewById4 = view.findViewById(R.id.topLeftCorner);
            i.f(findViewById4, "itemView.findViewById(R.id.topLeftCorner)");
            this.f35313x = findViewById4;
            View findViewById5 = view.findViewById(R.id.topRightCorner);
            i.f(findViewById5, "itemView.findViewById(R.id.topRightCorner)");
            this.f35314y = findViewById5;
            View findViewById6 = view.findViewById(R.id.bottomLeftCorner);
            i.f(findViewById6, "itemView.findViewById(R.id.bottomLeftCorner)");
            this.f35315z = findViewById6;
            View findViewById7 = view.findViewById(R.id.bottomRightCorner);
            i.f(findViewById7, "itemView.findViewById(R.id.bottomRightCorner)");
            this.A = findViewById7;
        }
    }

    public b(Context context, String title, ArrayList arrayList) {
        i.g(title, "title");
        this.f35306x = arrayList;
        this.f35307y = context;
        this.f35308z = title;
        this.A = 1;
        this.B = 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f35306x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        if (this.f35306x.get(i6) instanceof String) {
            return this.A;
        }
        return this.B;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        int h10 = h(i6);
        int i10 = this.A;
        ArrayList<Object> arrayList = this.f35306x;
        if (h10 == i10) {
            Object obj = arrayList.get(i6);
            i.e(obj, "null cannot be cast to non-null type kotlin.String");
            ((a) c0Var).f35309u.setText((String) obj);
            return;
        }
        int i11 = 8;
        if (i6 > 0 && i6 < arrayList.size() - 1) {
            UiUtils.Companion companion = UiUtils.Companion;
            C0599b c0599b = (C0599b) c0Var;
            View view = c0599b.A;
            View view2 = c0599b.f35315z;
            View view3 = c0599b.f35314y;
            View view4 = c0599b.f35313x;
            UiUtils.Companion.hideViews$default(companion, new View[]{view, view2, view3, view4}, false, 2, null);
            if (arrayList.get(i6 - 1) instanceof String) {
                view4.setVisibility(0);
                view3.setVisibility(0);
            }
            if (arrayList.get(i6 + 1) instanceof String) {
                view2.setVisibility(0);
                view.setVisibility(0);
            }
        } else {
            C0599b c0599b2 = (C0599b) c0Var;
            c0599b2.A.setVisibility(0);
            c0599b2.f35315z.setVisibility(0);
            if (arrayList.size() != 2) {
                c0599b2.f35314y.setVisibility(8);
                c0599b2.f35313x.setVisibility(8);
            }
        }
        C0599b c0599b3 = (C0599b) c0Var;
        if (!(arrayList.get(i6 - 1) instanceof String)) {
            i11 = 0;
        }
        c0599b3.f35312w.setVisibility(i11);
        Object obj2 = arrayList.get(i6);
        i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult30Model");
        ScreenResult30Model screenResult30Model = (ScreenResult30Model) obj2;
        long j10 = 1000;
        long date = screenResult30Model.getDate() * j10;
        String format = LocalDateTime.ofEpochSecond(date / j10, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(date))).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH));
        i.f(format, "ofEpochSecond(timeInMill…thLocale(Locale.ENGLISH))");
        c0599b3.f35311v.setText(format);
        LinearLayout linearLayout = c0599b3.f35310u;
        linearLayout.removeAllViews();
        Context context = this.f35307y;
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.title)).setText(this.f35308z);
        Extensions extensions = Extensions.INSTANCE;
        View findViewById = inflate.findViewById(R.id.content);
        i.f(findViewById, "v.findViewById<RobertoTextView>(R.id.content)");
        extensions.gone(findViewById);
        linearLayout.addView(inflate);
        int size = screenResult30Model.getList().size();
        for (int i12 = 0; i12 < size; i12++) {
            Extensions extensions2 = Extensions.INSTANCE;
            View inflateLayout = extensions2.inflateLayout(context, R.layout.row_log_item_new, linearLayout);
            RobertoTextView robertoTextView = (RobertoTextView) inflateLayout.findViewById(R.id.title);
            if (robertoTextView != null) {
                extensions2.gone(robertoTextView);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) inflateLayout.findViewById(R.id.content);
            if (robertoTextView2 != null) {
                robertoTextView2.setText(screenResult30Model.getList().get(i12));
            }
            if (i12 == screenResult30Model.getList().size() - 1) {
                ViewGroup.LayoutParams layoutParams = robertoTextView2.getLayoutParams();
                i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            }
            linearLayout.addView(inflateLayout);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        if (i6 == this.A) {
            return new a(defpackage.e.h(parent, R.layout.row_tracker_log_date, parent, false, "from(parent.context)\n   …_log_date, parent, false)"));
        }
        return new C0599b(defpackage.e.h(parent, R.layout.row_topical_log_item, parent, false, "from(parent.context)\n   …_log_item, parent, false)"));
    }
}
