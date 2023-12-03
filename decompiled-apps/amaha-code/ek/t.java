package ek;

import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.GratitudeLetterModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: Log11Adapter.kt */
/* loaded from: classes2.dex */
public final class t extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<GratitudeLetterModel> f14297x;

    /* renamed from: y  reason: collision with root package name */
    public final TemplateActivity f14298y;

    /* compiled from: Log11Adapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14299u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f14300v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f14301w;

        /* renamed from: x  reason: collision with root package name */
        public final ImageView f14302x;

        /* renamed from: y  reason: collision with root package name */
        public final CardView f14303y;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dateText);
            kotlin.jvm.internal.i.f(findViewById, "itemView.findViewById(R.id.dateText)");
            this.f14299u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.monthText);
            kotlin.jvm.internal.i.f(findViewById2, "itemView.findViewById(R.id.monthText)");
            this.f14300v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.textView1);
            kotlin.jvm.internal.i.f(findViewById3, "itemView.findViewById(R.id.textView1)");
            this.f14301w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.imageView1);
            kotlin.jvm.internal.i.f(findViewById4, "itemView.findViewById(R.id.imageView1)");
            this.f14302x = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.logCard);
            kotlin.jvm.internal.i.f(findViewById5, "itemView.findViewById(R.id.logCard)");
            this.f14303y = (CardView) findViewById5;
        }
    }

    public t(ArrayList<GratitudeLetterModel> goalList, TemplateActivity act) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        kotlin.jvm.internal.i.g(act, "act");
        this.f14297x = new ArrayList<>();
        this.f14297x = goalList;
        this.f14298y = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14297x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        GratitudeLetterModel gratitudeLetterModel = this.f14297x.get(i6);
        kotlin.jvm.internal.i.f(gratitudeLetterModel, "goalList[position]");
        GratitudeLetterModel gratitudeLetterModel2 = gratitudeLetterModel;
        Date w10 = defpackage.c.w(gratitudeLetterModel2.getDate() * 1000);
        String n10 = defpackage.b.n("MMM", w10);
        String n11 = defpackage.b.n("dd", w10);
        aVar2.f14300v.setText(n10);
        aVar2.f14299u.setText(n11);
        boolean image = gratitudeLetterModel2.getImage();
        CardView cardView = aVar2.f14303y;
        ImageView imageView = aVar2.f14302x;
        RobertoTextView robertoTextView = aVar2.f14301w;
        if (image) {
            z4.f fVar = new z4.f();
            fVar.k(R.drawable.ic_image);
            com.bumptech.glide.f i10 = Glide.i(this.f14298y);
            i10.p("https://" + gratitudeLetterModel2.getDownloadUrl()).B(imageView);
            robertoTextView.setVisibility(8);
            imageView.setVisibility(0);
            cardView.setOnClickListener(new dk.t(1, this, gratitudeLetterModel2, fVar));
            return;
        }
        robertoTextView.setText(gratitudeLetterModel2.getLetter());
        imageView.setVisibility(8);
        robertoTextView.setVisibility(0);
        cardView.setOnClickListener(new defpackage.a(this, 13, gratitudeLetterModel2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_log_11, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
