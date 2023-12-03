package xq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: LocusOfControlQuestionFragment.java */
/* loaded from: classes2.dex */
public class e extends rr.b {
    public TextView A;
    public TextView B;
    public ImageView C;
    public ImageView D;
    public String E = null;
    public RobertoButton F;
    public int G;

    /* renamed from: u  reason: collision with root package name */
    public CardView f37922u;

    /* renamed from: v  reason: collision with root package name */
    public CardView f37923v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f37924w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f37925x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f37926y;

    /* renamed from: z  reason: collision with root package name */
    public RobertoTextView f37927z;

    /* compiled from: LocusOfControlQuestionFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e.this.getActivity().finish();
        }
    }

    /* compiled from: LocusOfControlQuestionFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ int f37929u;

        public b(int i6) {
            this.f37929u = i6;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e eVar = e.this;
            eVar.C.setImageResource(R.drawable.concentric_circle_green);
            eVar.D.setImageResource(R.drawable.circle_hollow_green);
            eVar.A.setVisibility(0);
            eVar.B.setVisibility(4);
            int i6 = this.f37929u;
            if (i6 == 1) {
                eVar.E = "Blaming yourself is a pessimistic way of thinking that might make you unhappy.\nTo be optimistic, think of possible external causes for the event.\nFor eg. \"My boss could be in a bad mood today.\"";
                eVar.G = R.drawable.ic_internal_factors;
            } else if (i6 == 2) {
                eVar.E = "Believing that you're always wrong because you've made one mistake will make you unhappy.\n\nTo be optimistic, think of areas in which you do well. \nFor example, \"I made one mistake at work, but there are other things that I am good at.\"";
                eVar.G = R.drawable.ic_global;
            } else if (i6 == 3) {
                eVar.E = "Thinking that things will always go wrong because they have gone wrong once can make you unhappy.\n\nTo be optimistic, you need to believe that what's happened once will not happen again.\nFor example, \"I made a mistake just this once and will try to not make one again.\"";
                eVar.G = R.drawable.ic_temporary;
            }
        }
    }

    /* compiled from: LocusOfControlQuestionFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ int f37931u;

        public c(int i6) {
            this.f37931u = i6;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e eVar = e.this;
            eVar.C.setImageResource(R.drawable.circle_hollow_green);
            eVar.D.setImageResource(R.drawable.concentric_circle_green);
            eVar.A.setVisibility(4);
            eVar.B.setVisibility(0);
            int i6 = this.f37931u;
            if (i6 == 1) {
                eVar.E = "This is an optimistic way of looking at the negative event. Instead of just blaming yourself, you are thinking of external factors that might be responsible for the event.";
                eVar.G = R.drawable.ic_external_factors;
            } else if (i6 == 2) {
                eVar.E = "This is an optimistic way of thinking, as you are limiting the negative event to only one area, instead of generalising it to all aspects of your life.";
                eVar.G = R.drawable.ic_specific;
            } else if (i6 == 3) {
                eVar.E = "This is an optimistic way of thinking, as you realise that this negative event is temporary and not likely to occur again, at least not frequently.";
                eVar.G = R.drawable.ic_stable;
            }
        }
    }

    /* compiled from: LocusOfControlQuestionFragment.java */
    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e eVar = e.this;
            if (eVar.E == null) {
                Toast.makeText(eVar.getContext(), "Select a option", 0).show();
                return;
            }
            xq.d dVar = new xq.d();
            Bundle arguments = eVar.getArguments();
            arguments.putString("title", eVar.f37924w.getText().toString());
            arguments.putString("desc", eVar.E);
            arguments.putInt("img", eVar.G);
            dVar.setArguments(arguments);
            ((rr.a) eVar.getActivity()).r0(dVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_locus_of_control_question, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f37922u = (CardView) view.findViewById(R.id.card1);
        this.f37923v = (CardView) view.findViewById(R.id.card2);
        this.f37924w = (RobertoTextView) view.findViewById(R.id.header);
        this.f37925x = (RobertoTextView) view.findViewById(R.id.txt);
        this.f37926y = (RobertoTextView) view.findViewById(R.id.text1);
        this.f37927z = (RobertoTextView) view.findViewById(R.id.text2);
        this.C = (ImageView) view.findViewById(R.id.roundcheck1);
        this.D = (ImageView) view.findViewById(R.id.roundcheck2);
        this.A = (TextView) view.findViewById(R.id.bottomcheck1);
        this.B = (TextView) view.findViewById(R.id.bottomcheck2);
        this.F = (RobertoButton) view.findViewById(R.id.ll_submit);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        int i6 = getArguments().getInt("screen_sequence", 1);
        this.f37924w.setText("Let's consider the same event.");
        this.f37925x.setText("Your boss yelled at you for a mistake you made at work.\n\nWhat are you more likely to think?");
        if (i6 == 1) {
            this.f37926y.setText("I am a bad employee.");
            this.f37927z.setText("My boss is in a bad mood today.");
        } else if (i6 == 2) {
            this.f37926y.setText("I make mistakes in everything I do.");
            this.f37927z.setText("I made a mistake but there are other things that I am good at.");
        } else if (i6 == 3) {
            this.f37926y.setText("I always make mistakes at work and will continue to do so.");
            this.f37927z.setText("I made a mistake just this once.");
        }
        this.f37922u.setOnClickListener(new b(i6));
        this.f37923v.setOnClickListener(new c(i6));
        this.F.setOnClickListener(new d());
    }
}
