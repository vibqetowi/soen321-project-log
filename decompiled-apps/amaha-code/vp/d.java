package vp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResult6Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.i;
/* compiled from: TopicalLog6Adapter.kt */
/* loaded from: classes2.dex */
public final class d extends RecyclerView.e<RecyclerView.c0> {
    public final int A;
    public final int B;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<Object> f35326x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f35327y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f35328z;

    /* compiled from: TopicalLog6Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f35329u;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.trackerLogDate);
            i.f(findViewById, "itemView.findViewById(R.id.trackerLogDate)");
            this.f35329u = (RobertoTextView) findViewById;
        }
    }

    /* compiled from: TopicalLog6Adapter.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.c0 {
        public final View A;

        /* renamed from: u  reason: collision with root package name */
        public final LinearLayout f35330u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f35331v;

        /* renamed from: w  reason: collision with root package name */
        public final View f35332w;

        /* renamed from: x  reason: collision with root package name */
        public final View f35333x;

        /* renamed from: y  reason: collision with root package name */
        public final View f35334y;

        /* renamed from: z  reason: collision with root package name */
        public final View f35335z;

        public b(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.logsContainer);
            i.f(findViewById, "itemView.findViewById(R.id.logsContainer)");
            this.f35330u = (LinearLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.logTime);
            i.f(findViewById2, "itemView.findViewById(R.id.logTime)");
            this.f35331v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.trackerLogSeparator);
            i.f(findViewById3, "itemView.findViewById(R.id.trackerLogSeparator)");
            this.f35332w = findViewById3;
            View findViewById4 = view.findViewById(R.id.topLeftCorner);
            i.f(findViewById4, "itemView.findViewById(R.id.topLeftCorner)");
            this.f35333x = findViewById4;
            View findViewById5 = view.findViewById(R.id.topRightCorner);
            i.f(findViewById5, "itemView.findViewById(R.id.topRightCorner)");
            this.f35334y = findViewById5;
            View findViewById6 = view.findViewById(R.id.bottomLeftCorner);
            i.f(findViewById6, "itemView.findViewById(R.id.bottomLeftCorner)");
            this.f35335z = findViewById6;
            View findViewById7 = view.findViewById(R.id.bottomRightCorner);
            i.f(findViewById7, "itemView.findViewById(R.id.bottomRightCorner)");
            this.A = findViewById7;
        }
    }

    public d(Context context, ArrayList arrayList, ArrayList questionsList) {
        i.g(questionsList, "questionsList");
        this.f35326x = arrayList;
        this.f35327y = context;
        this.f35328z = questionsList;
        this.A = 1;
        this.B = 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f35326x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        if (this.f35326x.get(i6) instanceof String) {
            return this.A;
        }
        return this.B;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        int i10;
        int h10 = h(i6);
        int i11 = this.A;
        ArrayList<Object> arrayList = this.f35326x;
        if (h10 == i11) {
            Object obj = arrayList.get(i6);
            i.e(obj, "null cannot be cast to non-null type kotlin.String");
            ((a) c0Var).f35329u.setText((String) obj);
            return;
        }
        if (i6 > 0 && i6 < arrayList.size() - 1) {
            b bVar = (b) c0Var;
            View view = bVar.A;
            view.setVisibility(8);
            View view2 = bVar.f35335z;
            view2.setVisibility(8);
            View view3 = bVar.f35334y;
            view3.setVisibility(8);
            View view4 = bVar.f35333x;
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
            bVar2.f35335z.setVisibility(0);
            if (arrayList.size() != 2) {
                bVar2.f35334y.setVisibility(8);
                bVar2.f35333x.setVisibility(8);
            }
        }
        b bVar3 = (b) c0Var;
        if (arrayList.get(i6 - 1) instanceof String) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        bVar3.f35332w.setVisibility(i10);
        Object obj2 = arrayList.get(i6);
        i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult6Model");
        ScreenResult6Model screenResult6Model = (ScreenResult6Model) obj2;
        long j10 = 1000;
        long date = screenResult6Model.getDate() * j10;
        String format = LocalDateTime.ofEpochSecond(date / j10, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(date))).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH));
        i.f(format, "ofEpochSecond(timeInMill…thLocale(Locale.ENGLISH))");
        bVar3.f35331v.setText(format);
        LinearLayout linearLayout = bVar3.f35330u;
        linearLayout.removeAllViews();
        ArrayList<String> arrayList2 = this.f35328z;
        int size = arrayList2.size();
        int i12 = R.layout.row_log_item_new;
        Context context = this.f35327y;
        if (size == 1) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate.findViewById(R.id.title)).setText(arrayList2.get(0));
            ((RobertoTextView) inflate.findViewById(R.id.content)).setText(screenResult6Model.getList().get(screenResult6Model.getList().size() - 1));
            ViewGroup.LayoutParams layoutParams = ((RobertoTextView) inflate.findViewById(R.id.content)).getLayoutParams();
            i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            linearLayout.addView(inflate);
            return;
        }
        int size2 = screenResult6Model.getList().size();
        int i13 = 0;
        while (i13 < size2) {
            View inflate2 = LayoutInflater.from(context).inflate(i12, (ViewGroup) linearLayout, false);
            if (arrayList2.size() > 1) {
                ((RobertoTextView) inflate2.findViewById(R.id.title)).setText(arrayList2.get(i13));
            } else if (i13 == 0) {
                ((RobertoTextView) inflate2.findViewById(R.id.title)).setText(arrayList2.get(i13));
            } else {
                ((RobertoTextView) inflate2.findViewById(R.id.title)).setVisibility(8);
            }
            ((RobertoTextView) inflate2.findViewById(R.id.content)).setText(screenResult6Model.getList().get(i13));
            if (i13 == screenResult6Model.getList().size() - 1) {
                ViewGroup.LayoutParams layoutParams2 = ((RobertoTextView) inflate2.findViewById(R.id.content)).getLayoutParams();
                i.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
            }
            linearLayout.addView(inflate2);
            i13++;
            i12 = R.layout.row_log_item_new;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        if (i6 == this.A) {
            return new a(defpackage.e.h(parent, R.layout.row_tracker_log_date, parent, false, "from(parent.context)\n   …_log_date, parent, false)"));
        }
        return new b(defpackage.e.h(parent, R.layout.row_topical_log_item, parent, false, "from(parent.context)\n   …_log_item, parent, false)"));
    }
}
