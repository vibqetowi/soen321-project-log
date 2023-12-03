package vp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.ScreenResult9Model;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.i;
/* compiled from: TopicalLog9Adapter.kt */
/* loaded from: classes2.dex */
public final class e extends RecyclerView.e<RecyclerView.c0> {
    public final int A;
    public final int B;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<Object> f35336x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f35337y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f35338z;

    /* compiled from: TopicalLog9Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f35339u;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.trackerLogDate);
            i.f(findViewById, "itemView.findViewById(R.id.trackerLogDate)");
            this.f35339u = (RobertoTextView) findViewById;
        }
    }

    /* compiled from: TopicalLog9Adapter.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.c0 {
        public final View A;

        /* renamed from: u  reason: collision with root package name */
        public final LinearLayout f35340u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f35341v;

        /* renamed from: w  reason: collision with root package name */
        public final View f35342w;

        /* renamed from: x  reason: collision with root package name */
        public final View f35343x;

        /* renamed from: y  reason: collision with root package name */
        public final View f35344y;

        /* renamed from: z  reason: collision with root package name */
        public final View f35345z;

        public b(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.logsContainer);
            i.f(findViewById, "itemView.findViewById(R.id.logsContainer)");
            this.f35340u = (LinearLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.logTime);
            i.f(findViewById2, "itemView.findViewById(R.id.logTime)");
            this.f35341v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.trackerLogSeparator);
            i.f(findViewById3, "itemView.findViewById(R.id.trackerLogSeparator)");
            this.f35342w = findViewById3;
            View findViewById4 = view.findViewById(R.id.topLeftCorner);
            i.f(findViewById4, "itemView.findViewById(R.id.topLeftCorner)");
            this.f35343x = findViewById4;
            View findViewById5 = view.findViewById(R.id.topRightCorner);
            i.f(findViewById5, "itemView.findViewById(R.id.topRightCorner)");
            this.f35344y = findViewById5;
            View findViewById6 = view.findViewById(R.id.bottomLeftCorner);
            i.f(findViewById6, "itemView.findViewById(R.id.bottomLeftCorner)");
            this.f35345z = findViewById6;
            View findViewById7 = view.findViewById(R.id.bottomRightCorner);
            i.f(findViewById7, "itemView.findViewById(R.id.bottomRightCorner)");
            this.A = findViewById7;
        }
    }

    public e(Context context, ArrayList arrayList, ArrayList questionsList) {
        i.g(questionsList, "questionsList");
        this.f35336x = arrayList;
        this.f35337y = context;
        this.f35338z = questionsList;
        this.A = 1;
        this.B = 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f35336x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        if (this.f35336x.get(i6) instanceof String) {
            return this.A;
        }
        return this.B;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        String str;
        int h10 = h(i6);
        int i10 = this.A;
        ArrayList<Object> arrayList = this.f35336x;
        if (h10 == i10) {
            Object obj = arrayList.get(i6);
            i.e(obj, "null cannot be cast to non-null type kotlin.String");
            ((a) c0Var).f35339u.setText((String) obj);
            return;
        }
        int i11 = 8;
        if (i6 > 0 && i6 < arrayList.size() - 1) {
            b bVar = (b) c0Var;
            View view = bVar.A;
            view.setVisibility(8);
            View view2 = bVar.f35345z;
            view2.setVisibility(8);
            View view3 = bVar.f35344y;
            view3.setVisibility(8);
            View view4 = bVar.f35343x;
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
            bVar2.f35345z.setVisibility(0);
            if (arrayList.size() != 2) {
                bVar2.f35344y.setVisibility(8);
                bVar2.f35343x.setVisibility(8);
            }
        }
        b bVar3 = (b) c0Var;
        if (!(arrayList.get(i6 - 1) instanceof String)) {
            i11 = 0;
        }
        bVar3.f35342w.setVisibility(i11);
        LinearLayout linearLayout = bVar3.f35340u;
        linearLayout.removeAllViews();
        Object obj2 = arrayList.get(i6);
        i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult9Model");
        ScreenResult9Model screenResult9Model = (ScreenResult9Model) obj2;
        long j10 = 1000;
        long date = screenResult9Model.getDate() * j10;
        String format = LocalDateTime.ofEpochSecond(date / j10, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(date))).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH));
        i.f(format, "ofEpochSecond(timeInMill…thLocale(Locale.ENGLISH))");
        bVar3.f35341v.setText(format);
        int size = screenResult9Model.getList().size();
        for (int i12 = 0; i12 < size; i12++) {
            View inflate = LayoutInflater.from(this.f35337y).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
            RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.title);
            ArrayList<String> arrayList2 = this.f35338z;
            String str2 = "";
            if (i12 >= arrayList2.size()) {
                str = "";
            } else {
                str = arrayList2.get(i12);
            }
            robertoTextView.setText(str);
            RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.content);
            if (i12 < screenResult9Model.getList().size()) {
                str2 = screenResult9Model.getList().get(i12);
            }
            robertoTextView2.setText(str2);
            if (i12 == screenResult9Model.getList().size() - 1) {
                ViewGroup.LayoutParams layoutParams = ((RobertoTextView) inflate.findViewById(R.id.content)).getLayoutParams();
                i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            }
            linearLayout.addView(inflate);
        }
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
