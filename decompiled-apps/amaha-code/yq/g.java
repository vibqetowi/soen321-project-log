package yq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.MindfullnessModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: HappinessMindfulnessSelectionFragment.java */
/* loaded from: classes2.dex */
public class g extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f38912w = 0;

    /* renamed from: u  reason: collision with root package name */
    public ImageView f38913u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f38914v;

    /* compiled from: HappinessMindfulnessSelectionFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g.this.getActivity().finish();
        }
    }

    public static ArrayList<MindfullnessModel> J() {
        ArrayList<MindfullnessModel> arrayList = new ArrayList<>();
        arrayList.add(new MindfullnessModel("walking-meditation", "Mindful Walking", R.drawable.mindful_walking, "Mindful Walking is a good, practical way to include mindfulness in your everyday routine. This exercise allows you to focus on your thoughts and feelings, leaving you with a feeling of calm and well-being."));
        arrayList.add(new MindfullnessModel("thought-difusion", "Thought Defusion", R.drawable.ic_thought_diffusion, "Thought defusion is a technique that helps you focus on thoughts that might be causing distress. When you become aware of these thoughts, you can work towards letting them go or thinking of ways to change them."));
        arrayList.add(new MindfullnessModel("mindful-appreciation", "Self Compassion Pause", R.drawable.ic_mindful_appreciation, "While being kind to others might be easy, self-compassion is important, too. Showing kindness to yourself, especially in difficult situations, can help you feel happier."));
        arrayList.add(new MindfullnessModel(Constants.DEEP_BREATHING_ID, "Deep Breathing", R.drawable.deep_breathing, "Being in control of your breathing can help you feel better. Taking deep breaths can relax your body and mind, allowing you to feel calmer and happier."));
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_happiness_selection, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f38914v = (LinearLayout) view.findViewById(R.id.ll_activities);
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f38913u = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f38913u.setOnClickListener(new a());
        this.f38914v.removeAllViews();
        LayoutInflater layoutInflater = (LayoutInflater) getActivity().getSystemService("layout_inflater");
        Iterator<MindfullnessModel> it = J().iterator();
        while (it.hasNext()) {
            MindfullnessModel next = it.next();
            LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.row_coping_activity, (ViewGroup) null);
            ((AppCompatImageView) linearLayout.findViewById(R.id.icon)).setImageResource(next.getIcon());
            ((RobertoTextView) linearLayout.findViewById(R.id.text)).setText(next.getTitle());
            linearLayout.setOnClickListener(new h(this, next));
            this.f38914v.addView(linearLayout);
        }
    }
}
