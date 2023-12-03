package ek;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GratitudeLetterModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
/* compiled from: Log11AdapterNew.kt */
/* loaded from: classes2.dex */
public final class v extends RecyclerView.e<a> {
    public final HashSet<String> A;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<GratitudeLetterModel> f14317x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14318y;

    /* renamed from: z  reason: collision with root package name */
    public final Calendar f14319z;

    /* compiled from: Log11AdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14320u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f14321v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14322w;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.date);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.date)");
            this.f14320u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.logsContainer);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.logsContainer)");
            this.f14321v = (LinearLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.logsTime);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.logsTime)");
            this.f14322w = (RobertoTextView) findViewById3;
        }
    }

    public v(Context context, ArrayList arrayList) {
        this.f14317x = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        this.f14319z = calendar;
        this.A = new HashSet<>();
        this.f14317x = arrayList;
        this.f14318y = context;
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14317x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        a aVar2 = aVar;
        GratitudeLetterModel gratitudeLetterModel = this.f14317x.get(i6);
        kotlin.jvm.internal.i.f(gratitudeLetterModel, "goalList[position]");
        GratitudeLetterModel gratitudeLetterModel2 = gratitudeLetterModel;
        Calendar calendar = Calendar.getInstance();
        long j10 = 1000;
        calendar.setTimeInMillis(gratitudeLetterModel2.getDate() * j10);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        Calendar calendar2 = this.f14319z;
        long d10 = defpackage.b.d(calendar, calendar2.getTimeInMillis(), j10);
        HashSet<String> hashSet = this.A;
        RobertoTextView robertoTextView = aVar2.f14320u;
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
                    Date w10 = defpackage.c.w(gratitudeLetterModel2.getDate() * j10);
                    defpackage.c.A(defpackage.b.n("dd", w10), ' ', defpackage.b.n("MMM", w10), robertoTextView);
                    hashSet.add(obj);
                }
            }
        }
        aVar2.f14322w.setText(DateFormat.format("HH:mm", gratitudeLetterModel2.getDate() * j10).toString());
        boolean image = gratitudeLetterModel2.getImage();
        Context context = this.f14318y;
        LinearLayout linearLayout = aVar2.f14321v;
        if (image) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.row_log_new_image, (ViewGroup) linearLayout, false);
            z4.f k10 = new z4.f().k(R.drawable.ic_image);
            kotlin.jvm.internal.i.f(k10, "RequestOptions().placeholder(R.drawable.ic_image)");
            kotlin.jvm.internal.i.d(context);
            Glide.c(context).c(context).p("https://" + gratitudeLetterModel2.getDownloadUrl()).B((AppCompatImageView) inflate.findViewById(R.id.rowImage));
            inflate.setOnClickListener(new dk.t(2, this, gratitudeLetterModel2, k10));
            linearLayout.addView(inflate);
            return;
        }
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate2.findViewById(R.id.title)).setVisibility(8);
        ((RobertoTextView) inflate2.findViewById(R.id.content)).setText(gratitudeLetterModel2.getLetter());
        linearLayout.addView(inflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_card_new, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
