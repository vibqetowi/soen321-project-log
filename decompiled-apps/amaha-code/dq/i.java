package dq;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: PleasureActivityDetailFragment.java */
/* loaded from: classes2.dex */
public class i extends rr.b {

    /* compiled from: PleasureActivityDetailFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            i.this.getActivity().finish();
        }
    }

    /* compiled from: PleasureActivityDetailFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) i.this.getActivity()).t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_enduring_no_goals, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
        RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.score);
        robertoTextView.setVisibility(0);
        robertoTextView.setText("Pleasurable");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image);
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageResource(R.drawable.ic_pleasure);
        ((RobertoTextView) view.findViewById(R.id.txt_desc)).setText(Html.fromHtml("They generally make you feel happier. When you stop engaging in these tasks, you no longer experience positive emotions.<br><br>For example:<i> Listening to music, reading a book.</i>"));
    }
}
