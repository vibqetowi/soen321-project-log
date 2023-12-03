package vp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResult4Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.i;
/* compiled from: TopicalLog4Adapter.kt */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.e<RecyclerView.c0> {
    public final int A;
    public final int B;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<Object> f35316x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f35317y;

    /* renamed from: z  reason: collision with root package name */
    public final String f35318z;

    /* compiled from: TopicalLog4Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f35319u;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.trackerLogDate);
            i.f(findViewById, "itemView.findViewById(R.id.trackerLogDate)");
            this.f35319u = (RobertoTextView) findViewById;
        }
    }

    /* compiled from: TopicalLog4Adapter.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.c0 {
        public final View A;

        /* renamed from: u  reason: collision with root package name */
        public final LinearLayout f35320u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f35321v;

        /* renamed from: w  reason: collision with root package name */
        public final View f35322w;

        /* renamed from: x  reason: collision with root package name */
        public final View f35323x;

        /* renamed from: y  reason: collision with root package name */
        public final View f35324y;

        /* renamed from: z  reason: collision with root package name */
        public final View f35325z;

        public b(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.logsContainer);
            i.f(findViewById, "itemView.findViewById(R.id.logsContainer)");
            this.f35320u = (LinearLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.logTime);
            i.f(findViewById2, "itemView.findViewById(R.id.logTime)");
            this.f35321v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.trackerLogSeparator);
            i.f(findViewById3, "itemView.findViewById(R.id.trackerLogSeparator)");
            this.f35322w = findViewById3;
            View findViewById4 = view.findViewById(R.id.topLeftCorner);
            i.f(findViewById4, "itemView.findViewById(R.id.topLeftCorner)");
            this.f35323x = findViewById4;
            View findViewById5 = view.findViewById(R.id.topRightCorner);
            i.f(findViewById5, "itemView.findViewById(R.id.topRightCorner)");
            this.f35324y = findViewById5;
            View findViewById6 = view.findViewById(R.id.bottomLeftCorner);
            i.f(findViewById6, "itemView.findViewById(R.id.bottomLeftCorner)");
            this.f35325z = findViewById6;
            View findViewById7 = view.findViewById(R.id.bottomRightCorner);
            i.f(findViewById7, "itemView.findViewById(R.id.bottomRightCorner)");
            this.A = findViewById7;
        }
    }

    public c(Context context, String title, ArrayList arrayList) {
        i.g(title, "title");
        this.f35316x = arrayList;
        this.f35317y = context;
        this.f35318z = title;
        this.A = 1;
        this.B = 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f35316x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        if (this.f35316x.get(i6) instanceof String) {
            return this.A;
        }
        return this.B;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        int h10 = h(i6);
        int i10 = this.A;
        ArrayList<Object> arrayList = this.f35316x;
        if (h10 == i10) {
            Object obj = arrayList.get(i6);
            i.e(obj, "null cannot be cast to non-null type kotlin.String");
            ((a) c0Var).f35319u.setText((String) obj);
            return;
        }
        int i11 = 8;
        if (i6 > 0 && i6 < arrayList.size() - 1) {
            b bVar = (b) c0Var;
            View view = bVar.A;
            view.setVisibility(8);
            View view2 = bVar.f35325z;
            view2.setVisibility(8);
            View view3 = bVar.f35324y;
            view3.setVisibility(8);
            View view4 = bVar.f35323x;
            view4.setVisibility(8);
            if (arrayList.get(i6 - 1) instanceof String) {
                view4.setVisibility(0);
                view3.setVisibility(0);
            }
            if (arrayList.get(i6 + 1) instanceof String) {
                view2.setVisibility(0);
                view.setVisibility(0);
            }
        } else {
            b bVar2 = (b) c0Var;
            bVar2.A.setVisibility(0);
            bVar2.f35325z.setVisibility(0);
            if (arrayList.size() != 2) {
                bVar2.f35324y.setVisibility(8);
                bVar2.f35323x.setVisibility(8);
            }
        }
        b bVar3 = (b) c0Var;
        if (!(arrayList.get(i6 - 1) instanceof String)) {
            i11 = 0;
        }
        bVar3.f35322w.setVisibility(i11);
        Object obj2 = arrayList.get(i6);
        i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult4Model");
        ScreenResult4Model screenResult4Model = (ScreenResult4Model) obj2;
        long j10 = 1000;
        long date = screenResult4Model.getDate() * j10;
        String format = LocalDateTime.ofEpochSecond(date / j10, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(date))).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH));
        i.f(format, "ofEpochSecond(timeInMill…thLocale(Locale.ENGLISH))");
        bVar3.f35321v.setText(format);
        LinearLayout linearLayout = bVar3.f35320u;
        linearLayout.removeAllViews();
        View inflate = LayoutInflater.from(this.f35317y).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.title)).setText(this.f35318z);
        ((RobertoTextView) inflate.findViewById(R.id.content)).setText(screenResult4Model.getText());
        ViewGroup.LayoutParams layoutParams = ((RobertoTextView) inflate.findViewById(R.id.content)).getLayoutParams();
        i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        linearLayout.addView(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        if (i6 == this.A) {
            return new a(defpackage.e.h(parent, R.layout.row_tracker_log_date, parent, false, "from(parent.context).inf…_log_date, parent, false)"));
        }
        return new b(defpackage.e.h(parent, R.layout.row_topical_log_item, parent, false, "from(parent.context).inf…_log_item, parent, false)"));
    }
}
