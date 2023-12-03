package ek;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResult3Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
/* compiled from: Log3AdapterNew.kt */
/* loaded from: classes2.dex */
public final class q0 extends RecyclerView.e<a> {
    public final Calendar A;
    public final HashSet<String> B;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult3Model> f14264x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14265y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f14266z;

    /* compiled from: Log3AdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public final View A;

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14267u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14268v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14269w;

        /* renamed from: x  reason: collision with root package name */
        public final View f14270x;

        /* renamed from: y  reason: collision with root package name */
        public final View f14271y;

        /* renamed from: z  reason: collision with root package name */
        public final View f14272z;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14267u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14268v = (LinearLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.logsTime);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.logsTime)");
            this.f14269w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.topAdder);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.topAdder)");
            this.f14270x = findViewById4;
            View findViewById5 = view.findViewById(R.id.bottomAdder);
            kotlin.jvm.internal.i.f(findViewById5, "itemView.findViewById(R.id.bottomAdder)");
            this.f14271y = findViewById5;
            View findViewById6 = view.findViewById(R.id.cardBottomAdder);
            kotlin.jvm.internal.i.f(findViewById6, "itemView.findViewById(R.id.cardBottomAdder)");
            this.f14272z = findViewById6;
            View findViewById7 = view.findViewById(R.id.bottomLine);
            kotlin.jvm.internal.i.f(findViewById7, "itemView.findViewById(R.id.bottomLine)");
            this.A = findViewById7;
        }
    }

    public q0(Context context, ArrayList goalList, ArrayList questionList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(questionList, "questionList");
        this.f14264x = new ArrayList<>();
        this.f14266z = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        this.A = calendar;
        this.B = new HashSet<>();
        this.f14264x = goalList;
        this.f14265y = context;
        this.f14266z = questionList;
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14264x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        boolean z11;
        int i10;
        String str;
        int i11;
        a aVar2 = aVar;
        RobertoTextView robertoTextView = aVar2.f14269w;
        robertoTextView.setVisibility(8);
        ArrayList<ScreenResult3Model> arrayList = this.f14264x;
        ScreenResult3Model screenResult3Model = arrayList.get(i6);
        kotlin.jvm.internal.i.f(screenResult3Model, "goalList[position]");
        ScreenResult3Model screenResult3Model2 = screenResult3Model;
        Calendar calendar = Calendar.getInstance();
        long j10 = 1000;
        calendar.setTimeInMillis(screenResult3Model2.getDate() * j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        Calendar calendar2 = Calendar.getInstance();
        int i12 = i6 + 1;
        if (arrayList.size() == i12) {
            z10 = true;
        } else {
            calendar2.setTimeInMillis(arrayList.get(i12).getDate() * j10);
            calendar2.clear(11);
            calendar2.clear(9);
            calendar2.clear(12);
            calendar2.clear(10);
            calendar2.clear(13);
            calendar2.clear(14);
            z10 = false;
        }
        Calendar calendar3 = this.A;
        long d10 = defpackage.b.d(calendar, calendar3.getTimeInMillis(), j10);
        HashSet<String> hashSet = this.B;
        View view = aVar2.f14272z;
        View view2 = aVar2.A;
        View view3 = aVar2.f14271y;
        View view4 = aVar2.f14270x;
        RobertoTextView robertoTextView2 = aVar2.f14267u;
        if (d10 < 86400) {
            if (hashSet.contains("Today")) {
                robertoTextView2.setVisibility(8);
                i11 = 0;
                view4.setVisibility(0);
            } else {
                robertoTextView2.setVisibility(0);
                view4.setVisibility(8);
                robertoTextView2.setText("Today");
                hashSet.add("Today");
                i11 = 0;
            }
            if (!z10 && calendar.getTimeInMillis() == calendar2.getTimeInMillis()) {
                view3.setVisibility(i11);
                view2.setVisibility(i11);
                view.setVisibility(i11);
            } else {
                view3.setVisibility(8);
                view2.setVisibility(8);
                view.setVisibility(8);
            }
        } else {
            long d11 = defpackage.b.d(calendar, calendar3.getTimeInMillis(), j10);
            if (86400 <= d11 && d11 < 172800) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (hashSet.contains("Yesterday")) {
                    robertoTextView2.setVisibility(8);
                    i10 = 0;
                    view4.setVisibility(0);
                } else {
                    robertoTextView2.setVisibility(0);
                    view4.setVisibility(8);
                    robertoTextView2.setText("Yesterday");
                    hashSet.add("Yesterday");
                    i10 = 0;
                }
                if (!z10 && calendar.getTimeInMillis() == calendar2.getTimeInMillis()) {
                    view3.setVisibility(i10);
                    view2.setVisibility(i10);
                    view.setVisibility(i10);
                } else {
                    view3.setVisibility(8);
                    view2.setVisibility(8);
                    view.setVisibility(8);
                }
            } else {
                String obj = DateFormat.format("ddMMMMyy", calendar).toString();
                if (hashSet.contains(obj)) {
                    robertoTextView2.setVisibility(8);
                    view4.setVisibility(0);
                } else {
                    robertoTextView2.setVisibility(0);
                    view4.setVisibility(8);
                    Date w10 = defpackage.c.w(screenResult3Model2.getDate() * j10);
                    defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView2);
                    hashSet.add(obj);
                }
                if (!z10 && calendar.getTimeInMillis() == calendar2.getTimeInMillis()) {
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
        robertoTextView.setText(DateFormat.format("HH:mm", screenResult3Model2.getDate() * j10).toString());
        int size = screenResult3Model2.getList().size();
        for (int i13 = 0; i13 < size; i13++) {
            LayoutInflater from = LayoutInflater.from(this.f14265y);
            LinearLayout linearLayout = aVar2.f14268v;
            View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
            RobertoTextView robertoTextView3 = (RobertoTextView) inflate.findViewById(R.id.title);
            ArrayList<String> arrayList2 = this.f14266z;
            String str2 = "";
            if (i13 >= arrayList2.size()) {
                str = "";
            } else {
                str = arrayList2.get(i13);
            }
            robertoTextView3.setText(str);
            RobertoTextView robertoTextView4 = (RobertoTextView) inflate.findViewById(R.id.content);
            if (i13 < screenResult3Model2.getList().size()) {
                str2 = screenResult3Model2.getList().get(i13);
            }
            robertoTextView4.setText(str2);
            linearLayout.addView(inflate);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
