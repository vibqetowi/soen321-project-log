package jr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TipsActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.IOException;
import pl.droidsonroids.gif.GifImageView;
/* compiled from: HappinessTips1Fragment.java */
/* loaded from: classes2.dex */
public class c extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f22579u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f22580v;

    /* compiled from: HappinessTips1Fragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) c.this.getActivity()).onBackPressed();
        }
    }

    /* compiled from: HappinessTips1Fragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) c.this.getActivity()).t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_depression_tips, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getActivity().getIntent().getStringExtra(Constants.API_COURSE_LINK);
        this.f22579u = (RobertoTextView) view.findViewById(R.id.txt_title);
        this.f22580v = (RobertoTextView) view.findViewById(R.id.txt_desc);
        FirebasePersistence.getInstance().getCourseById(defpackage.c.n());
        int i6 = ((TipsActivity) getActivity()).f10557x;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        this.f22579u.setText("You are happier when you pay for experiences instead of things.");
                        this.f22580v.setText("When you spend on exciting and challenging experiences, you are likely to create unforgettable and happy memories. Experiences also help you explore your passions and purpose in life.");
                    }
                } else {
                    this.f22579u.setText("Music with faster rhythms can make you feel happier.");
                    this.f22580v.setText("Research has shown that listening to music with a cheerful rhythm can be quite effective in giving your mood a quick boost.");
                }
            } else {
                this.f22579u.setText("Getting enough sleep can help you feel happier.");
                this.f22580v.setText("Sleeping regularly and sticking to a sleeping and waking time can make you feel happier. An irregular schedule can make you feel tired and even interfere with your brain's ability to experience positive emotions.");
            }
        } else {
            this.f22579u.setText("Smiling can actually make you happier.");
            this.f22580v.setText("When you smile (even if you don't feel like doing it), the muscles in your face move in a particular way, signalling your brain that you are happy. This can actually make you feel happy.");
        }
        ((ImageView) view.findViewById(R.id.cancel)).setOnClickListener(new a());
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
        try {
            ((GifImageView) view.findViewById(R.id.mascot)).setImageDrawable(new pl.droidsonroids.gif.b(getResources(), (int) R.raw.mascot_tips));
        } catch (IOException e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }
}
