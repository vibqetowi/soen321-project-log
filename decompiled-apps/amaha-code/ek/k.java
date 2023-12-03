package ek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GratitudeJournalQuestionModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: GratitudeJournalAdapter.java */
/* loaded from: classes2.dex */
public final class k extends RecyclerView.e<a> {
    public final RobertoTextView A;
    public final RobertoTextView B;
    public final RobertoTextView C;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<GratitudeJournalQuestionModel> f14181x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final LayoutInflater f14182y;

    /* renamed from: z  reason: collision with root package name */
    public final Context f14183z;

    /* compiled from: GratitudeJournalAdapter.java */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14184u;

        /* renamed from: v  reason: collision with root package name */
        public final CardView f14185v;

        /* renamed from: w  reason: collision with root package name */
        public final AppCompatImageView f14186w;

        public a(View view) {
            super(view);
            this.f14184u = (RobertoTextView) view.findViewById(R.id.question);
            this.f14185v = (CardView) view.findViewById(R.id.cardview);
            this.f14186w = (AppCompatImageView) view.findViewById(R.id.gratitudeImage);
        }
    }

    public k(Context context, RobertoTextView robertoTextView, RobertoTextView robertoTextView2, RobertoTextView robertoTextView3) {
        this.f14183z = context;
        this.f14182y = (LayoutInflater) context.getSystemService("layout_inflater");
        this.A = robertoTextView;
        this.B = robertoTextView2;
        this.C = robertoTextView3;
        v();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14181x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        ArrayList<GratitudeJournalQuestionModel> arrayList = this.f14181x;
        aVar2.f14184u.setText(arrayList.get(i6).getQuestion());
        aVar2.f14185v.setOnClickListener(new j(this, i6));
        aVar2.f14186w.setImageResource(arrayList.get(i6).getImage());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        return new a(this.f14182y.inflate(R.layout.row_gratitude_journal_question, (ViewGroup) null));
    }

    public final void v() {
        ArrayList<GratitudeJournalQuestionModel> arrayList = this.f14181x;
        arrayList.clear();
        if (FirebasePersistence.getInstance().getUser().getHappiness() != null) {
            ArrayList<String> gratitudeQuestionId = FirebasePersistence.getInstance().getUser().getHappiness().getGratitudeQuestionId();
            Iterator<GratitudeJournalQuestionModel> it = Constants.getGratitudeJournalQuestions().iterator();
            while (it.hasNext()) {
                GratitudeJournalQuestionModel next = it.next();
                if (gratitudeQuestionId.contains(next.getQuestionId())) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            RobertoTextView robertoTextView = this.B;
            RobertoTextView robertoTextView2 = this.A;
            if (size == 0) {
                robertoTextView2.setVisibility(0);
                robertoTextView.setVisibility(0);
                return;
            }
            robertoTextView2.setVisibility(8);
            robertoTextView.setVisibility(8);
            this.C.setVisibility(8);
        }
    }
}
