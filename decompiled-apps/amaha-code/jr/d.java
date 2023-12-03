package jr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TipsActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.IOException;
import pl.droidsonroids.gif.GifImageView;
/* compiled from: SleepTipsFragment.java */
/* loaded from: classes2.dex */
public class d extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f22583u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f22584v;

    /* compiled from: SleepTipsFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d.this.getActivity().finish();
        }
    }

    /* compiled from: SleepTipsFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((TipsActivity) d.this.getActivity()).t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_sleep_tips, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        String stringExtra = getActivity().getIntent().getStringExtra(Constants.API_COURSE_LINK);
        this.f22583u = (RobertoTextView) view.findViewById(R.id.txt_title);
        this.f22584v = (RobertoTextView) view.findViewById(R.id.txt_desc);
        if (stringExtra.equals(Constants.SCREEN_TIP_1)) {
            this.f22583u.setText("Start your day by going out into direct sunlight.");
            this.f22584v.setText("The light on your face in the morning will help your brain know that it has to wake up, which can help you feel more energetic.");
        } else if (stringExtra.equals(Constants.SCREEN_TIP_2)) {
            this.f22583u.setText("Before going to bed, turn the face of your clock away from you.");
            this.f22584v.setText("Don’t look at your alarm clock while you’re trying to fall asleep. Checking how much time you have left to wake up will make you anxious, because of which it will be harder for you to fall asleep.");
        } else if (stringExtra.equals(Constants.SCREEN_TIP_3)) {
            this.f22583u.setText("Exercise as soon as you wake up or in the late afternoon.");
            this.f22584v.setText("Regular exercise can improve your physical health, mood and sleeping patterns. Working out at 7:00 am can lead to deeper sleep, while afternoon workouts can help you fall asleep faster and stay asleep longer.");
        } else if (stringExtra.equals(Constants.SCREEN_TIP_4)) {
            this.f22583u.setText("Don't lie in bed if you are struggling to fall asleep.");
            this.f22584v.setText("Lying in bed creates an unhelpful link between being in bed and being awake. Your mind needs to link your bed to sleeping so that you feel sleepy as soon as you are in bed. Try meditating or listening to soothing music instead.");
        } else if (stringExtra.equals(Constants.SCREEN_TIP_5)) {
            this.f22583u.setText("Before a trip abroad, try to sleep as per your destination sleeping time.");
            this.f22584v.setText("This will help the circadian rhythm- your body's natural body clock- adjust faster, speeding your recovery from jetlag.");
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
