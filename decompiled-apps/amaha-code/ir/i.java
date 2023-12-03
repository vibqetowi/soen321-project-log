package ir;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ThoughtsActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.MascotAnimationUtils;
/* compiled from: ThoughtsIntroFragment.java */
/* loaded from: classes2.dex */
public class i extends rr.b {

    /* compiled from: ThoughtsIntroFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            i.this.getActivity().finish();
        }
    }

    /* compiled from: ThoughtsIntroFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((ThoughtsActivity) i.this.getActivity()).o0();
        }
    }

    /* compiled from: ThoughtsIntroFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ThoughtsActivity thoughtsActivity = (ThoughtsActivity) i.this.getActivity();
            thoughtsActivity.f10552w = 1;
            thoughtsActivity.p0(true, true);
        }
    }

    /* compiled from: ThoughtsIntroFragment.java */
    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ThoughtsActivity thoughtsActivity = (ThoughtsActivity) i.this.getActivity();
            thoughtsActivity.f10552w = 1;
            thoughtsActivity.p0(true, true);
        }
    }

    /* compiled from: ThoughtsIntroFragment.java */
    /* loaded from: classes2.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ThoughtsActivity thoughtsActivity = (ThoughtsActivity) i.this.getActivity();
            thoughtsActivity.f10552w = 3;
            thoughtsActivity.p0(true, true);
        }
    }

    /* compiled from: ThoughtsIntroFragment.java */
    /* loaded from: classes2.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            i.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_thoughts_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        ((LinearLayout) view.findViewById(R.id.ll_submit)).setOnClickListener(new b());
        int i6 = getArguments().getInt("screen_pos");
        if (i6 == 2) {
            ((CardView) view.findViewById(R.id.white_card)).setOnClickListener(new c());
        } else if (i6 == 3) {
            ((CardView) view.findViewById(R.id.white_card)).setOnClickListener(new d());
            ((CardView) view.findViewById(R.id.white_card1)).setOnClickListener(new e());
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    ((CardView) view.findViewById(R.id.white_card2)).setAlpha(1.0f);
                    ((LinearLayout) view.findViewById(R.id.step_card3)).setAlpha(1.0f);
                }
            } else {
                ((CardView) view.findViewById(R.id.white_card1)).setAlpha(1.0f);
                ((LinearLayout) view.findViewById(R.id.step_card2)).setAlpha(1.0f);
            }
        } else {
            ((CardView) view.findViewById(R.id.white_card)).setAlpha(1.0f);
            ((LinearLayout) view.findViewById(R.id.step_card1)).setAlpha(1.0f);
        }
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new f());
        new MascotAnimationUtils().initMascot(view, getClass().getSimpleName(), Constants.SCREEN_COPING, "There you are!", "It seems like you haven’t read about thoughts before. Want to give it a try?", "OK, GOT IT", null);
    }
}
