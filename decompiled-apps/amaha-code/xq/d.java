package xq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: LocusOfControlQuestionDescFragment.java */
/* loaded from: classes2.dex */
public class d extends rr.b {

    /* compiled from: LocusOfControlQuestionDescFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d.this.getActivity().onBackPressed();
        }
    }

    /* compiled from: LocusOfControlQuestionDescFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) d.this.getActivity()).t0();
        }
    }

    @Override // rr.b
    public final rr.b F() {
        e eVar = new e();
        eVar.setArguments(getArguments());
        return eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_locus_of_control_question_desc, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.cancel)).setOnClickListener(new a());
        Bundle arguments = getArguments();
        ((RobertoTextView) view.findViewById(R.id.txt_title)).setVisibility(8);
        ((RobertoTextView) view.findViewById(R.id.txt_desc)).setText(arguments.getString("desc"));
        ((ImageView) view.findViewById(R.id.impact_img)).setImageDrawable(Utils.INSTANCE.checkBuildBeforesetDrawable(arguments.getInt("img"), getContext()));
        ((RobertoButton) view.findViewById(R.id.ll_submit)).setOnClickListener(new b());
    }
}
