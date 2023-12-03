package vp;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GratitudeLetterModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ho.o;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.i;
import z4.f;
/* compiled from: TopicalLog11Adapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<RecyclerView.c0> {
    public final f B;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<Object> f35295x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f35296y;

    /* renamed from: z  reason: collision with root package name */
    public final int f35297z = 1;
    public final int A = 2;

    /* compiled from: TopicalLog11Adapter.kt */
    /* renamed from: vp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0598a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f35298u;

        public C0598a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.trackerLogDate);
            i.f(findViewById, "itemView.findViewById(R.id.trackerLogDate)");
            this.f35298u = (RobertoTextView) findViewById;
        }
    }

    /* compiled from: TopicalLog11Adapter.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.c0 {
        public final View A;

        /* renamed from: u  reason: collision with root package name */
        public final LinearLayout f35299u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f35300v;

        /* renamed from: w  reason: collision with root package name */
        public final View f35301w;

        /* renamed from: x  reason: collision with root package name */
        public final View f35302x;

        /* renamed from: y  reason: collision with root package name */
        public final View f35303y;

        /* renamed from: z  reason: collision with root package name */
        public final View f35304z;

        public b(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.logsContainer);
            i.f(findViewById, "itemView.findViewById(R.id.logsContainer)");
            this.f35299u = (LinearLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.logTime);
            i.f(findViewById2, "itemView.findViewById(R.id.logTime)");
            this.f35300v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.trackerLogSeparator);
            i.f(findViewById3, "itemView.findViewById(R.id.trackerLogSeparator)");
            this.f35301w = findViewById3;
            View findViewById4 = view.findViewById(R.id.topLeftCorner);
            i.f(findViewById4, "itemView.findViewById(R.id.topLeftCorner)");
            this.f35302x = findViewById4;
            View findViewById5 = view.findViewById(R.id.topRightCorner);
            i.f(findViewById5, "itemView.findViewById(R.id.topRightCorner)");
            this.f35303y = findViewById5;
            View findViewById6 = view.findViewById(R.id.bottomLeftCorner);
            i.f(findViewById6, "itemView.findViewById(R.id.bottomLeftCorner)");
            this.f35304z = findViewById6;
            View findViewById7 = view.findViewById(R.id.bottomRightCorner);
            i.f(findViewById7, "itemView.findViewById(R.id.bottomRightCorner)");
            this.A = findViewById7;
        }
    }

    /* compiled from: TopicalLog11Adapter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends a5.f<Bitmap> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Dialog f35305x;

        public c(Dialog dialog) {
            this.f35305x = dialog;
        }

        @Override // a5.h
        public final void f(Object obj) {
            View findViewById = this.f35305x.findViewById(R.id.ivFullscreenImage);
            i.e(findViewById, "null cannot be cast to non-null type com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView");
            ((SubsamplingScaleImageView) findViewById).setImage(ImageSource.bitmap((Bitmap) obj));
        }
    }

    public a(Context context, ArrayList arrayList) {
        this.f35295x = arrayList;
        this.f35296y = context;
        f k10 = new f().k(R.drawable.ic_image);
        i.f(k10, "RequestOptions().placeholder(R.drawable.ic_image)");
        this.B = k10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f35295x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        if (this.f35295x.get(i6) instanceof String) {
            return this.f35297z;
        }
        return this.A;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        int i10;
        int h10 = h(i6);
        int i11 = this.f35297z;
        ArrayList<Object> arrayList = this.f35295x;
        if (h10 == i11) {
            Object obj = arrayList.get(i6);
            i.e(obj, "null cannot be cast to non-null type kotlin.String");
            ((C0598a) c0Var).f35298u.setText((String) obj);
            return;
        }
        if (i6 > 0 && i6 < arrayList.size() - 1) {
            b bVar = (b) c0Var;
            View view = bVar.A;
            view.setVisibility(8);
            View view2 = bVar.f35304z;
            view2.setVisibility(8);
            View view3 = bVar.f35303y;
            view3.setVisibility(8);
            View view4 = bVar.f35302x;
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
            bVar2.f35304z.setVisibility(0);
            if (arrayList.size() != 2) {
                bVar2.f35303y.setVisibility(8);
                bVar2.f35302x.setVisibility(8);
            }
        }
        b bVar3 = (b) c0Var;
        if (arrayList.get(i6 - 1) instanceof String) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        bVar3.f35301w.setVisibility(i10);
        LinearLayout linearLayout = bVar3.f35299u;
        linearLayout.removeAllViews();
        Object obj2 = arrayList.get(i6);
        i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.GratitudeLetterModel");
        GratitudeLetterModel gratitudeLetterModel = (GratitudeLetterModel) obj2;
        long j10 = 1000;
        long date = gratitudeLetterModel.getDate() * j10;
        String format = LocalDateTime.ofEpochSecond(date / j10, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(date))).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH));
        i.f(format, "ofEpochSecond(timeInMill…thLocale(Locale.ENGLISH))");
        bVar3.f35300v.setText(format);
        boolean image = gratitudeLetterModel.getImage();
        Context context = this.f35296y;
        if (image) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.row_log_new_image, (ViewGroup) linearLayout, false);
            Glide.g(context).p("https://" + gratitudeLetterModel.getDownloadUrl()).B((AppCompatImageView) inflate.findViewById(R.id.rowImage));
            inflate.setOnClickListener(new o(this, 10, gratitudeLetterModel));
            ViewGroup.LayoutParams layoutParams = ((AppCompatImageView) inflate.findViewById(R.id.rowImage)).getLayoutParams();
            i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
            linearLayout.addView(inflate);
            return;
        }
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.row_log_item_new, (ViewGroup) linearLayout, false);
        ((RobertoTextView) inflate2.findViewById(R.id.title)).setVisibility(8);
        ((RobertoTextView) inflate2.findViewById(R.id.content)).setText(gratitudeLetterModel.getLetter());
        ViewGroup.LayoutParams layoutParams2 = ((RobertoTextView) inflate2.findViewById(R.id.content)).getLayoutParams();
        i.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(0, 0, 0, 0);
        linearLayout.addView(inflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        if (i6 == this.f35297z) {
            return new C0598a(defpackage.e.h(parent, R.layout.row_tracker_log_date, parent, false, "from(parent.context)\n   …_log_date, parent, false)"));
        }
        return new b(defpackage.e.h(parent, R.layout.row_topical_log_item, parent, false, "from(parent.context)\n   …_log_item, parent, false)"));
    }
}
