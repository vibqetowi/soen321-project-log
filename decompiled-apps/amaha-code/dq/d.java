package dq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: ActivitySelectionIntroFragment.java */
/* loaded from: classes2.dex */
public class d extends rr.b {

    /* compiled from: ActivitySelectionIntroFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d.this.getActivity().finish();
        }
    }

    /* compiled from: ActivitySelectionIntroFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) d.this.getActivity()).t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_activity_selection_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
    }
}
