package ek;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ProsAndConsModel;
import com.theinnerhour.b2b.model.ScreenResult14Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: Log14AdapterNew.kt */
/* loaded from: classes2.dex */
public final class y extends RecyclerView.e<a> {
    public final Calendar A;
    public final HashSet<String> B;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<ScreenResult14Model> f14348x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14349y;

    /* renamed from: z  reason: collision with root package name */
    public final HashMap<String, String> f14350z;

    /* compiled from: Log14AdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14351u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14352v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14353w;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14351u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14352v = (LinearLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.logsTime);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.logsTime)");
            this.f14353w = (RobertoTextView) findViewById3;
        }
    }

    public y(ArrayList<ScreenResult14Model> goalList, Context context, HashMap<String, String> hashMap) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f14348x = new ArrayList<>();
        this.f14350z = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        this.A = calendar;
        this.B = new HashSet<>();
        this.f14348x = goalList;
        this.f14349y = context;
        this.f14350z = hashMap;
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14348x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        int i10;
        int i11;
        a aVar2 = aVar;
        ScreenResult14Model screenResult14Model = this.f14348x.get(i6);
        kotlin.jvm.internal.i.f(screenResult14Model, "goalList[position]");
        ScreenResult14Model screenResult14Model2 = screenResult14Model;
        Calendar calendar = Calendar.getInstance();
        long j10 = 1000;
        calendar.setTimeInMillis(screenResult14Model2.getDate() * j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        Calendar calendar2 = this.A;
        long d10 = defpackage.b.d(calendar, calendar2.getTimeInMillis(), j10);
        HashSet<String> hashSet = this.B;
        boolean z11 = false;
        RobertoTextView robertoTextView = aVar2.f14351u;
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
                    Date w10 = defpackage.c.w(screenResult14Model2.getDate() * j10);
                    defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
                    hashSet.add(obj);
                }
            }
        }
        aVar2.f14353w.setText(DateFormat.format("HH:mm", screenResult14Model2.getDate() * j10).toString());
        Context context = this.f14349y;
        LayoutInflater from = LayoutInflater.from(context);
        LinearLayout linearLayout = aVar2.f14352v;
        View inflate = from.inflate(R.layout.layout_pros_cons_new_logs, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate.findViewById(R.id.proConTitle)).setText(screenResult14Model2.getStatement());
        HashMap<String, String> hashMap = this.f14350z;
        String str = hashMap.get("r14_pros_text");
        kotlin.jvm.internal.i.e(str, "null cannot be cast to non-null type kotlin.String");
        ((RobertoTextView) inflate.findViewById(R.id.proTitle)).setText(str);
        String str2 = hashMap.get("r14_cons_text");
        kotlin.jvm.internal.i.e(str2, "null cannot be cast to non-null type kotlin.String");
        ((RobertoTextView) inflate.findViewById(R.id.conTitle)).setText(str2);
        if (screenResult14Model2.getCons().size() > screenResult14Model2.getPros().size()) {
            ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.prosCard);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = 0;
            viewGroup.setLayoutParams(layoutParams);
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.consCard);
            ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
            layoutParams2.height = -2;
            viewGroup2.setLayoutParams(layoutParams2);
        }
        View findViewById = inflate.findViewById(R.id.prosContainer);
        kotlin.jvm.internal.i.f(findViewById, "parentView.findViewById(R.id.prosContainer)");
        LinearLayout linearLayout2 = (LinearLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.consContainer);
        kotlin.jvm.internal.i.f(findViewById2, "parentView.findViewById(R.id.consContainer)");
        LinearLayout linearLayout3 = (LinearLayout) findViewById2;
        Iterator<ProsAndConsModel> it = screenResult14Model2.getPros().iterator();
        while (it.hasNext()) {
            ProsAndConsModel next = it.next();
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.row_pro_con_log, (ViewGroup) linearLayout2, false);
            ((RobertoTextView) inflate2.findViewById(R.id.proConRating)).setText(String.valueOf(next.getValue()));
            ((RobertoTextView) inflate2.findViewById(R.id.proConInput)).setText(next.getText());
            linearLayout2.addView(inflate2);
        }
        Iterator<ProsAndConsModel> it2 = screenResult14Model2.getCons().iterator();
        while (it2.hasNext()) {
            ProsAndConsModel next2 = it2.next();
            View inflate3 = LayoutInflater.from(context).inflate(R.layout.row_pro_con_log, linearLayout3, z11);
            ((RobertoTextView) inflate3.findViewById(R.id.proConRating)).setText(String.valueOf(next2.getValue()));
            ((RobertoTextView) inflate3.findViewById(R.id.proConInput)).setText(next2.getText());
            linearLayout3.addView(inflate3);
            z11 = false;
        }
        if (!screenResult14Model2.getPros().isEmpty()) {
            Iterator<ProsAndConsModel> it3 = screenResult14Model2.getPros().iterator();
            i10 = 0;
            while (it3.hasNext()) {
                i10 += it3.next().getValue();
            }
            ((RobertoTextView) inflate.findViewById(R.id.proTotal)).setText(String.valueOf(i10));
        } else {
            ((RobertoTextView) inflate.findViewById(R.id.proTotal)).setText("0");
            i10 = 0;
        }
        if (!screenResult14Model2.getCons().isEmpty()) {
            Iterator<ProsAndConsModel> it4 = screenResult14Model2.getCons().iterator();
            i11 = 0;
            while (it4.hasNext()) {
                i11 += it4.next().getValue();
            }
            ((RobertoTextView) inflate.findViewById(R.id.conTotal)).setText(String.valueOf(i11));
        } else {
            ((RobertoTextView) inflate.findViewById(R.id.conTotal)).setText("0");
            i11 = 0;
        }
        if (i10 > i11) {
            String str3 = hashMap.get("r14_pros_more_text");
            kotlin.jvm.internal.i.e(str3, "null cannot be cast to non-null type kotlin.String");
            ((RobertoTextView) inflate.findViewById(R.id.evaluationText)).setText(str3);
        } else if (i11 > i10) {
            String str4 = hashMap.get("r14_cons_more_text");
            kotlin.jvm.internal.i.e(str4, "null cannot be cast to non-null type kotlin.String");
            ((RobertoTextView) inflate.findViewById(R.id.evaluationText)).setText(str4);
        } else {
            String str5 = hashMap.get("r14_similar_text");
            kotlin.jvm.internal.i.e(str5, "null cannot be cast to non-null type kotlin.String");
            ((RobertoTextView) inflate.findViewById(R.id.evaluationText)).setText(str5);
        }
        linearLayout.addView(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
