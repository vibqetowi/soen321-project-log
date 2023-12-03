package ir;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ThoughtsActivity;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ThoughtsConfirmationFragment.java */
/* loaded from: classes2.dex */
public class h extends rr.b {

    /* compiled from: ThoughtsConfirmationFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* compiled from: ThoughtsConfirmationFragment.java */
        /* renamed from: ir.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0315a implements Runnable {
            public RunnableC0315a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ((ThoughtsActivity) h.this.getActivity()).o0();
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            new Handler().postDelayed(new RunnableC0315a(), 200L);
        }
    }

    /* compiled from: ThoughtsConfirmationFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {

        /* compiled from: ThoughtsConfirmationFragment.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ThoughtsActivity thoughtsActivity = (ThoughtsActivity) h.this.getActivity();
                int i6 = thoughtsActivity.f10552w - 2;
                thoughtsActivity.f10552w = i6;
                if (i6 < 0) {
                    thoughtsActivity.f10552w = 0;
                }
                thoughtsActivity.p0(true, true);
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            new Handler().postDelayed(new a(), 200L);
        }
    }

    /* compiled from: ThoughtsConfirmationFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_yes_no_assessment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoTextView) view.findViewById(R.id.ques)).setText("Do you often find yourself thinking this way?");
        ((RobertoButton) view.findViewById(R.id.ll_right)).setOnClickListener(new a());
        ((RobertoButton) view.findViewById(R.id.ll_wrong)).setOnClickListener(new b());
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new c());
    }
}
