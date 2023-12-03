package gr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SymptomsActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: StressSymptomsIntroFragment.java */
/* loaded from: classes2.dex */
public class h extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f16752u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f16753v;

    /* renamed from: w  reason: collision with root package name */
    public ImageView f16754w;

    /* compiled from: StressSymptomsIntroFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SymptomsActivity) h.this.getActivity()).o0();
        }
    }

    /* compiled from: StressSymptomsIntroFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_stress_symptoms_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new a());
        this.f16752u = (RobertoTextView) view.findViewById(R.id.sym_title);
        this.f16753v = (RobertoTextView) view.findViewById(R.id.sym_text);
        if (SymptomsActivity.B.equals(Constants.COURSE_STRESS)) {
            this.f16752u.setText("The Stress \nEffect");
            this.f16753v.setText("Stress can affect your mind, body and feelings. Let's learn about the symptoms of stress that you are currently experiencing.");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_ANGER)) {
            this.f16752u.setText("The Anger \nEffect");
            this.f16753v.setText("Anger can have an impact on the way you think, feel and behave. Knowing about the signs that indicate that your anger is affecting you can help you manage your anger effectively.");
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f16754w = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f16754w.setOnClickListener(new b());
    }
}
