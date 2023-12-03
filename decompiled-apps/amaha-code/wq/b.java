package wq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.HappinessAndEnviromentModel;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: HappinessAndEnviromentSelectionFragment.java */
/* loaded from: classes2.dex */
public class b extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f37052w = 0;

    /* renamed from: u  reason: collision with root package name */
    public ImageView f37053u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f37054v;

    /* compiled from: HappinessAndEnviromentSelectionFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.getActivity().finish();
        }
    }

    public static ArrayList<HappinessAndEnviromentModel> J() {
        ArrayList<HappinessAndEnviromentModel> arrayList = new ArrayList<>();
        arrayList.add(new HappinessAndEnviromentModel("temperature-and-happiness", "Temperature and Happiness", R.drawable.ic_temprature, "Are you more irritable when it’s hot and humid outside? Excessive heat can drain and dehydrate you, making you unhappy. High temperatures can increase your chances of getting stressed easily."));
        arrayList.add(new HappinessAndEnviromentModel("flowers-and-happiness", "Flowers and Happiness", R.drawable.ic_smell_the_flowers, "Flowers can make you happy. Studies show that the fragrance of a flower can induce happiness. Moreover, when you get flowers as a token of appreciation, you are more likely to be helpful towards others."));
        arrayList.add(new HappinessAndEnviromentModel("light-and-happiness", "Light and Happiness", R.drawable.ic_bright_room, "A dimly lit room can bring down the level of hormones that keep you alert, making you feel drowsy and lethargic. In contrast, ample light and good ventilation at work and home can help you be more productive and happy."));
        arrayList.add(new HappinessAndEnviromentModel("color-and-happiness", "Colour and Happiness", R.drawable.ic_color, "Did you know that different colours can trigger different emotions? Dressing in pastels or bright colours can actually make you more cheerful and optimistic."));
        arrayList.add(new HappinessAndEnviromentModel("greenery-and-happiness", "Greenery and Happiness", R.drawable.ic_spend_time_in_nature, "Spending time in nature can improve your ability to deal with stress and also help you feel happier. Studies have found that even keeping a photo of a plant around can induce positive emotions."));
        arrayList.add(new HappinessAndEnviromentModel("people-and-happiness", "People and Happiness", R.drawable.ic_people, "The people you are surrounded by can influence your happiness. Having good relationships with your friends, colleagues, and family members can make you happier. Being around happy people can make you happier as well."));
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_happiness_selection, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f37054v = (LinearLayout) view.findViewById(R.id.ll_activities);
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f37053u = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f37053u.setOnClickListener(new a());
        this.f37054v.removeAllViews();
        LayoutInflater layoutInflater = (LayoutInflater) getActivity().getSystemService("layout_inflater");
        Iterator<HappinessAndEnviromentModel> it = J().iterator();
        while (it.hasNext()) {
            HappinessAndEnviromentModel next = it.next();
            LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.row_coping_activity, (ViewGroup) null);
            ((AppCompatImageView) linearLayout.findViewById(R.id.icon)).setImageResource(next.getIcon());
            ((RobertoTextView) linearLayout.findViewById(R.id.text)).setText(next.getTitle());
            linearLayout.setOnClickListener(new c(this, next));
            this.f37054v.addView(linearLayout);
        }
    }
}
