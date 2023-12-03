package ek;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResult16Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
/* compiled from: Log16AdapterNew.kt */
/* loaded from: classes2.dex */
public final class a0 extends RecyclerView.e<a> {
    public final String A;
    public final String B;
    public final Calendar C;
    public final HashSet<String> D;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult16Model> f14054x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14055y;

    /* renamed from: z  reason: collision with root package name */
    public final String f14056z;

    /* compiled from: Log16AdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public final View A;

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14057u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14058v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14059w;

        /* renamed from: x  reason: collision with root package name */
        public final View f14060x;

        /* renamed from: y  reason: collision with root package name */
        public final View f14061y;

        /* renamed from: z  reason: collision with root package name */
        public final View f14062z;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14057u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14058v = (LinearLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.logsTime);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.logsTime)");
            this.f14059w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.topAdder);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.topAdder)");
            this.f14060x = findViewById4;
            View findViewById5 = view.findViewById(R.id.bottomAdder);
            kotlin.jvm.internal.i.f(findViewById5, "itemView.findViewById(R.id.bottomAdder)");
            this.f14061y = findViewById5;
            View findViewById6 = view.findViewById(R.id.cardBottomAdder);
            kotlin.jvm.internal.i.f(findViewById6, "itemView.findViewById(R.id.cardBottomAdder)");
            this.f14062z = findViewById6;
            View findViewById7 = view.findViewById(R.id.bottomLine);
            kotlin.jvm.internal.i.f(findViewById7, "itemView.findViewById(R.id.bottomLine)");
            this.A = findViewById7;
        }
    }

    public a0(ArrayList<ScreenResult16Model> goalList, Context context, String firstLabel, String secondLabel, String thirdLabel) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(firstLabel, "firstLabel");
        kotlin.jvm.internal.i.g(secondLabel, "secondLabel");
        kotlin.jvm.internal.i.g(thirdLabel, "thirdLabel");
        this.f14054x = new ArrayList<>();
        this.f14056z = "";
        this.A = "";
        this.B = "";
        Calendar calendar = Calendar.getInstance();
        this.C = calendar;
        this.D = new HashSet<>();
        this.f14054x = goalList;
        this.f14055y = context;
        this.f14056z = firstLabel;
        this.A = secondLabel;
        this.B = thirdLabel;
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14054x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        boolean z11;
        int i10;
        Calendar calendar;
        Calendar calendar2;
        int i11;
        a aVar2 = aVar;
        ArrayList<ScreenResult16Model> arrayList = this.f14054x;
        ScreenResult16Model screenResult16Model = arrayList.get(i6);
        kotlin.jvm.internal.i.f(screenResult16Model, "goalList[position]");
        ScreenResult16Model screenResult16Model2 = screenResult16Model;
        Calendar calendar3 = Calendar.getInstance();
        long j10 = 1000;
        calendar3.setTimeInMillis(screenResult16Model2.getDate() * j10);
        calendar3.clear(11);
        calendar3.clear(9);
        calendar3.clear(12);
        calendar3.clear(10);
        calendar3.clear(13);
        calendar3.clear(14);
        Calendar calendar4 = Calendar.getInstance();
        int i12 = i6 + 1;
        if (arrayList.size() == i12) {
            z10 = true;
        } else {
            calendar4.setTimeInMillis(arrayList.get(i12).getDate() * j10);
            calendar4.clear(11);
            calendar4.clear(9);
            calendar4.clear(12);
            calendar4.clear(10);
            calendar4.clear(13);
            calendar4.clear(14);
            z10 = false;
        }
        Calendar calendar5 = this.C;
        long d10 = defpackage.b.d(calendar3, calendar5.getTimeInMillis(), j10);
        HashSet<String> hashSet = this.D;
        View view = aVar2.f14062z;
        View view2 = aVar2.A;
        View view3 = aVar2.f14061y;
        View view4 = aVar2.f14060x;
        RobertoTextView robertoTextView = aVar2.f14057u;
        if (d10 < 86400) {
            if (hashSet.contains("Today")) {
                robertoTextView.setVisibility(8);
                i11 = 0;
                view4.setVisibility(0);
            } else {
                robertoTextView.setVisibility(0);
                view4.setVisibility(8);
                robertoTextView.setText("Today");
                hashSet.add("Today");
                i11 = 0;
            }
            if (!z10 && calendar3.getTimeInMillis() == calendar4.getTimeInMillis()) {
                view3.setVisibility(i11);
                view2.setVisibility(i11);
                view.setVisibility(i11);
            } else {
                view3.setVisibility(8);
                view2.setVisibility(8);
                view.setVisibility(8);
            }
        } else {
            long d11 = defpackage.b.d(calendar3, calendar5.getTimeInMillis(), j10);
            if (86400 <= d11 && d11 < 172800) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (hashSet.contains("Yesterday")) {
                    robertoTextView.setVisibility(8);
                    i10 = 0;
                    view4.setVisibility(0);
                } else {
                    robertoTextView.setVisibility(0);
                    view4.setVisibility(8);
                    robertoTextView.setText("Yesterday");
                    hashSet.add("Yesterday");
                    i10 = 0;
                }
                if (!z10 && calendar3.getTimeInMillis() == calendar4.getTimeInMillis()) {
                    view3.setVisibility(i10);
                    view2.setVisibility(i10);
                    view.setVisibility(i10);
                } else {
                    view3.setVisibility(8);
                    view2.setVisibility(8);
                    view.setVisibility(8);
                }
            } else {
                String obj = DateFormat.format("ddMMMMyy", calendar3).toString();
                if (hashSet.contains(obj)) {
                    robertoTextView.setVisibility(8);
                    view4.setVisibility(0);
                } else {
                    robertoTextView.setVisibility(0);
                    view4.setVisibility(8);
                    Date w10 = defpackage.c.w(screenResult16Model2.getDate() * j10);
                    defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
                    hashSet.add(obj);
                }
                if (!z10 && calendar3.getTimeInMillis() == calendar4.getTimeInMillis()) {
                    view3.setVisibility(0);
                    view2.setVisibility(0);
                    view.setVisibility(0);
                } else {
                    view3.setVisibility(8);
                    view2.setVisibility(8);
                    view.setVisibility(8);
                }
            }
        }
        aVar2.f14059w.setText(DateFormat.format("HH:mm", screenResult16Model2.getDate() * j10).toString());
        Context context = this.f14055y;
        LayoutInflater from = LayoutInflater.from(context);
        LinearLayout linearLayout = aVar2.f14058v;
        View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.title)).setText(this.f14056z);
        ((RobertoTextView) inflate.findViewById(R.id.content)).setText(screenResult16Model2.getText());
        linearLayout.addView(inflate);
        Calendar.getInstance().setTimeInMillis(screenResult16Model2.getFromTime() * j10);
        Calendar.getInstance().setTimeInMillis(screenResult16Model2.getTillTime() * j10);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate2.findViewById(R.id.title)).setText(this.A);
        ((RobertoTextView) inflate2.findViewById(R.id.content)).setText(((Object) DateFormat.format("HH:mm", calendar.getTime())) + " to " + ((Object) DateFormat.format("HH:mm", calendar2.getTime())));
        linearLayout.addView(inflate2);
        if (screenResult16Model2.getList().size() > 0) {
            View inflate3 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate3.findViewById(R.id.content)).setVisibility(8);
            ((RobertoTextView) inflate3.findViewById(R.id.title)).setText(this.B);
            linearLayout.addView(inflate3);
        }
        int size = screenResult16Model2.getList().size();
        for (int i13 = 0; i13 < size; i13++) {
            View inflate4 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
            ((RobertoTextView) inflate4.findViewById(R.id.content)).setText(screenResult16Model2.getList().get(i13));
            ((RobertoTextView) inflate4.findViewById(R.id.title)).setVisibility(8);
            if (i13 != screenResult16Model2.getList().size() - 1) {
                ViewGroup.LayoutParams layoutParams = ((RobertoTextView) inflate4.findViewById(R.id.content)).getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = 0;
                ((RobertoTextView) inflate4.findViewById(R.id.content)).setLayoutParams(marginLayoutParams);
            }
            linearLayout.addView(inflate4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
