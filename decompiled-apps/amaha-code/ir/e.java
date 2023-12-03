package ir;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ThoughtsActivity;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: ThoughtsAreaSelectionFragment.java */
/* loaded from: classes2.dex */
public class e extends rr.b implements View.OnClickListener {

    /* compiled from: ThoughtsAreaSelectionFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ThoughtsActivity.B = Constants.THOUGHTS_WORK;
            ((ThoughtsActivity) e.this.getActivity()).o0();
        }
    }

    /* compiled from: ThoughtsAreaSelectionFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ThoughtsActivity.B = Constants.THOUGHTS_RELATIONSHIP;
            ((ThoughtsActivity) e.this.getActivity()).o0();
        }
    }

    /* compiled from: ThoughtsAreaSelectionFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e.this.getActivity().finish();
        }
    }

    /* compiled from: ThoughtsAreaSelectionFragment.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((ThoughtsActivity) e.this.getActivity()).o0();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new Handler().postDelayed(new d(), 200L);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_thoughts_area_selection, viewGroup, false);
        ((LinearLayout) inflate.findViewById(R.id.ll_work)).setOnClickListener(new a());
        ((LinearLayout) inflate.findViewById(R.id.ll_relationship)).setOnClickListener(new b());
        ((ImageView) inflate.findViewById(R.id.header_arrow_back)).setOnClickListener(new c());
        return inflate;
    }
}
