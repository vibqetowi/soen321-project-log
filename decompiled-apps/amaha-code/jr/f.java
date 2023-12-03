package jr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TipsActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import java.io.IOException;
import pl.droidsonroids.gif.GifImageView;
/* compiled from: StressResponseTipFragment.java */
/* loaded from: classes2.dex */
public class f extends rr.b {

    /* compiled from: StressResponseTipFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f.this.getActivity().finish();
        }
    }

    /* compiled from: StressResponseTipFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((TipsActivity) f.this.getActivity()).t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_stress_response_tip, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.cancel)).setOnClickListener(new a());
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
        try {
            ((GifImageView) view.findViewById(R.id.mascot)).setImageDrawable(new pl.droidsonroids.gif.b(getResources(), (int) R.raw.mascot_tips));
        } catch (IOException e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }
}
