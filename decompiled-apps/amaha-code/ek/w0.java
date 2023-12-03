package ek;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResult9Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
/* compiled from: Log9AdapterNew.kt */
/* loaded from: classes2.dex */
public final class w0 extends RecyclerView.e<a> {
    public final Calendar A;
    public final HashSet<String> B;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult9Model> f14330x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14331y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f14332z;

    /* compiled from: Log9AdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14333u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14334v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14335w;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14333u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14334v = (LinearLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.logsTime);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.logsTime)");
            this.f14335w = (RobertoTextView) findViewById3;
        }
    }

    public w0(Context context, ArrayList goalList, ArrayList questionList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(questionList, "questionList");
        this.f14330x = new ArrayList<>();
        this.f14332z = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        this.A = calendar;
        this.B = new HashSet<>();
        this.f14330x = goalList;
        this.f14331y = context;
        this.f14332z = questionList;
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14330x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        String str;
        a aVar2 = aVar;
        ScreenResult9Model screenResult9Model = this.f14330x.get(i6);
        kotlin.jvm.internal.i.f(screenResult9Model, "goalList[position]");
        ScreenResult9Model screenResult9Model2 = screenResult9Model;
        Calendar calendar = Calendar.getInstance();
        long j10 = 1000;
        calendar.setTimeInMillis(screenResult9Model2.getDate() * j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        Calendar calendar2 = this.A;
        long d10 = defpackage.b.d(calendar, calendar2.getTimeInMillis(), j10);
        HashSet<String> hashSet = this.B;
        RobertoTextView robertoTextView = aVar2.f14333u;
        if (d10 < 86400) {
            if (hashSet.contains("Today")) {
                robertoTextView.setVisibility(8);
            } else {
                robertoTextView.setText("Today");
                hashSet.add("Today");
            }
        } else {
            long d11 = defpackage.b.d(calendar, calendar2.getTimeInMillis(), j10);
            if (86400 <= d11 && d11 < 172800) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (hashSet.contains("Yesterday")) {
                    robertoTextView.setVisibility(8);
                } else {
                    robertoTextView.setText("Yesterday");
                    hashSet.add("Yesterday");
                }
            } else {
                String obj = DateFormat.format("ddMMMMyy", calendar).toString();
                if (hashSet.contains(obj)) {
                    robertoTextView.setVisibility(8);
                } else {
                    Date w10 = defpackage.c.w(screenResult9Model2.getDate() * j10);
                    defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
                    hashSet.add(obj);
                }
            }
        }
        aVar2.f14335w.setText(DateFormat.format("HH:mm", screenResult9Model2.getDate() * j10).toString());
        int size = screenResult9Model2.getList().size();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutInflater from = LayoutInflater.from(this.f14331y);
            LinearLayout linearLayout = aVar2.f14334v;
            View inflate = from.inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
            RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.title);
            ArrayList<String> arrayList = this.f14332z;
            String str2 = "";
            if (i10 >= arrayList.size()) {
                str = "";
            } else {
                str = arrayList.get(i10);
            }
            robertoTextView2.setText(str);
            RobertoTextView robertoTextView3 = (RobertoTextView) inflate.findViewById(R.id.content);
            if (i10 < screenResult9Model2.getList().size()) {
                str2 = screenResult9Model2.getList().get(i10);
            }
            robertoTextView3.setText(str2);
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
