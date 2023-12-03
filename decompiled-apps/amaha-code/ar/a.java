package ar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.QuizActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: StressQuizFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {
    public static boolean G = false;
    public LinearLayout A;
    public LinearLayout B;
    public ImageView D;
    public LinearLayout E;
    public RobertoButton F;

    /* renamed from: v  reason: collision with root package name */
    public ImageView f3445v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f3446w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f3447x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f3448y;

    /* renamed from: z  reason: collision with root package name */
    public RobertoTextView f3449z;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f3444u = new ArrayList();
    public int C = 0;

    /* compiled from: StressQuizFragment.java */
    /* renamed from: ar.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0052a implements View.OnClickListener {
        public View$OnClickListenerC0052a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.G = true;
            a.this.J();
        }
    }

    /* compiled from: StressQuizFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.G = false;
            a.this.J();
        }
    }

    /* compiled from: StressQuizFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10 = a.G;
            a.this.J();
        }
    }

    /* compiled from: StressQuizFragment.java */
    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    /* compiled from: StressQuizFragment.java */
    /* loaded from: classes2.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f3454a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3455b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3456c;

        public e(boolean z10, boolean z11, String str) {
            this.f3456c = z10;
            this.f3454a = z11;
            this.f3455b = str;
        }
    }

    public final void J() {
        int i6 = this.C;
        ArrayList arrayList = this.f3444u;
        if (i6 == arrayList.size()) {
            ((QuizActivity) getActivity()).t0();
            return;
        }
        e eVar = (e) arrayList.get(this.C);
        boolean z10 = true;
        this.C++;
        boolean z11 = eVar.f3454a;
        String str = eVar.f3455b;
        if (z11) {
            this.A.setVisibility(0);
            this.f3446w.setVisibility(0);
            this.f3447x.setText("FALSE");
            this.f3448y.setText(str);
            this.E.setBackgroundResource(R.color.v1_orange_dark);
            this.B.setVisibility(8);
            this.f3447x.setVisibility(0);
            this.F.setVisibility(8);
            return;
        }
        this.A.setVisibility(8);
        this.f3446w.setVisibility(4);
        this.f3449z.setText(str);
        this.f3447x.setVisibility(4);
        this.F.setVisibility(0);
        this.E.setBackgroundResource(R.color.v1_orange_light);
        this.B.setVisibility(0);
        if (G != eVar.f3456c) {
            z10 = false;
        }
        if (z10) {
            this.f3445v.setImageResource(R.drawable.ic_right);
        } else {
            this.f3445v.setImageResource(R.drawable.ic_wrong);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sleep_quiz, viewGroup, false);
        Course courseById = FirebasePersistence.getInstance().getCourseById(defpackage.c.n());
        boolean equals = courseById.getCourseName().equals(Constants.COURSE_STRESS);
        ArrayList arrayList = this.f3444u;
        if (equals) {
            arrayList.add(new e(false, true, "Stress is the same for everybody."));
            arrayList.add(new e(false, false, "Stress is different for everyone. What is stressful for one person may or may not be stressful for another, and everybody responds to stress in different ways."));
            arrayList.add(new e(true, true, "Stress is not always bad for you."));
            arrayList.add(new e(true, false, "Stress that is within your control can make you feel productive and happy. For example, if you are confident that you can handle a situation, you will overcome any stress and feel a sense of achievement."));
            arrayList.add(new e(false, true, "Stress is a part of life, you can’t do anything about it."));
            arrayList.add(new e(false, false, "While you can’t remove stress from your life completely, you can plan your life so that you’re prepared for stress and it doesn’t become too much for you to handle."));
            arrayList.add(new e(false, true, "It is normal for stress to interfere with your daily routine."));
            arrayList.add(new e(false, false, "If your stress or anxiety is longstanding and interferes with your daily life, it is a sign that you need to seek help. A trained professional can help you find a happier, healthier lifestyle."));
            arrayList.add(new e(true, true, "Even the smallest symptoms of stress require attention."));
            arrayList.add(new e(true, false, "If you start by addressing the first small signs of stress, you can save yourself from having to deal with more difficult issues later."));
            arrayList.add(new e(false, true, "Stress is not big deal."));
            arrayList.add(new e(false, false, "For many, stress is a big deal. You may not admit how big it is because you worry it could make you look weak, but stress can take over your life if you don’t deal with it on time and in a proper way."));
        } else if (courseById.getCourseName().equals(Constants.COURSE_SLEEP)) {
            arrayList.add(new e(false, true, "A long nap after lunch will make me feel energised."));
            arrayList.add(new e(false, false, "Research shows that a ten to fifteen minute nap keeps you alert and helps you get through the rest of the day. Napping too close to your bedtime or napping for too long will make you wake up more often during the night."));
            arrayList.add(new e(false, true, "I can make up for lack of sleep by sleeping extra on weekends."));
            arrayList.add(new e(false, false, "You cannot make up for lack of sleep during the week by sleeping more on the weekend. Sleep deprivation is linked to weight gain, high blood pressure, feeling irritable and an inability to function."));
            arrayList.add(new e(true, true, "Snoring could be a serious problem."));
            arrayList.add(new e(true, false, "Many people think of snoring as just an inconvenience. However, snoring often makes you sleepy. This might be indicative of a medical problem, such as high blood pressure or problems with breathing."));
            arrayList.add(new e(false, true, "Having a drink or two at night will help me sleep better."));
            arrayList.add(new e(false, false, "You may think that drinking helps you to sleep better. However, while alcohol may help you fall asleep faster, you will not sleep well through the night and will also wake up in the morning feeling tired."));
            arrayList.add(new e(false, true, "I can open a window while driving to feel less sleepy."));
            arrayList.add(new e(false, false, "Tricks like opening the window or turning on the AC are ineffective and dangerous. Caffeinated drinks only offer temporary relief. Instead, park your car, take a nap and drive only when you no longer feel sleepy."));
            arrayList.add(new e(false, true, "My whole body rests when I am asleep, including my brain."));
            arrayList.add(new e(false, false, "Your body is at rest when you sleep, but your brain remains active to carry out important activities like breathing. Moreover, when you sleep, new memories are created and skills learned during the day are strengthened."));
        } else if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
            arrayList.add(new e(false, true, "Depression is a sign of weakness."));
            arrayList.add(new e(false, false, "Depression has both psychological and biological causes. It can negatively impact one's ability to function effectively on a daily basis. It requires structured treatment from a medical or psychological professional."));
            arrayList.add(new e(false, true, "Only women suffer from depression."));
            arrayList.add(new e(false, false, "Research shows that while depression is more common among women, men are more vulnerable to the impact of stressful events that can contribute to depression. There are no gender differences in the development of depression in older people."));
            arrayList.add(new e(true, true, "There is a relationship between food and mood."));
            arrayList.add(new e(true, false, "Eating at irregular times, skipping meals and eating foods rich in refined carbohydrates can make your mood fluctuate. On the other hand, dark chocolate and food rich in proteins, vitamins, fibre and omega-3 fatty acids improve mood."));
            arrayList.add(new e(false, true, "Interactions with strangers aren't important."));
            arrayList.add(new e(false, false, "If brief interactions with strangers are filled with kindness, you are likely to experience greater happiness, a greater sense of belonging, and lesser negative interactions with loved ones."));
            arrayList.add(new e(false, true, "There is no treatment for depression."));
            arrayList.add(new e(false, false, "Like most other illnesses, depression can be treated. For example, counselling, medication and social support contribute towards better coping and faster recovery."));
            arrayList.add(new e(false, true, "If a parent has depression, a child will too."));
            arrayList.add(new e(false, false, "Depression by itself cannot be inherited since environmental and situational factors also play an important role. However, close relatives of someone with depression, such as children and siblings, are susceptible to it."));
        } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
            arrayList.add(new e(false, true, "Attractive people are happier."));
            arrayList.add(new e(false, false, "Studies show that how you feel about the way you look is more strongly related to happiness than simply being conventionally attractive. Those who are satisfied with their looks are happier than those who aren't."));
            arrayList.add(new e(true, true, "It is okay to put your needs over the needs of other people."));
            arrayList.add(new e(true, false, "While you might think that it's selfish to look out for yourself, taking care of yourself and your needs ensures you have the energy to better take care of others."));
            arrayList.add(new e(false, true, "Only younger people can be happy."));
            arrayList.add(new e(false, false, "People of all ages experience happiness - though the definition of happiness may change over time. Older people might feel happy with good health, while having more money might be more important for younger people."));
            arrayList.add(new e(true, true, "Small, everyday problems can make you unhappy."));
            arrayList.add(new e(true, false, "While you may often reach out for help in times of crisis, you might be dealing with everyday problems on your own. Trying to manage daily difficulties all by yourself can make you unhappy in the long run."));
            arrayList.add(new e(false, true, "You can only be happy when you accomplish your goals."));
            arrayList.add(new e(false, false, "Sometimes, trying to achieve your goal in itself can make you happy, as you often learn new things about yourself and new strategies to deal with difficulties."));
        } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
            arrayList.add(new e(false, true, "It's completely normal to worry."));
            arrayList.add(new e(false, false, "Everyone worries from time to time. However, when that worry is persistent and interferes with your day to day activities, it might be a cause of concern."));
            arrayList.add(new e(true, true, "Worry can only be caused by a stressful situation."));
            arrayList.add(new e(false, false, "While a troubling situation could cause you to worry, excessive worry could result from a number of other factors. It could be the result of biological causes or stress. Sometimes it could occur without any reason."));
            arrayList.add(new e(false, true, "Worry is something you should not ignore."));
            arrayList.add(new e(true, false, "Excessive worry is not something that you can just shake off. It can make you feel helpless and overwhelmed. It can also come in the way of your daily routine."));
            arrayList.add(new e(true, true, "You need to be concerned about excessive worry."));
            arrayList.add(new e(true, false, "Worrying too much can put your body under extreme stress and negatively impact your health. This might lead to digestive system difficulties, poor immunity or skin problems."));
            arrayList.add(new e(false, true, "Worrying about a problem makes you resolve it better."));
            arrayList.add(new e(false, false, "Worrying about something does not mean you are actually taking steps towards solving the problem. In fact, worrying may be unhelpful because it can overwhelm you, making it hard for you to concentrate on the problem at hand."));
            arrayList.add(new e(false, true, "You cannot do anything to worry less."));
            arrayList.add(new e(false, false, "While worrying is not completely avoidable, working on negative thoughts and practising simple relaxation techniques can help you cope with and manage your worry better."));
        } else if (courseById.getCourseName().equals(Constants.COURSE_ANGER)) {
            arrayList.add(new e(false, true, "Expressing your anger is a healthy way of controlling it."));
            arrayList.add(new e(false, false, "The way in which you express your anger determines whether or not you are able to control it. For instance, expressing anger by being aggressive can have negative consequences, and can even worsen your anger."));
            arrayList.add(new e(true, true, "Anger can increase the risk of heart disease."));
            arrayList.add(new e(true, false, "Studies have shown that anger and hostility can increase the chances of developing heart disease. Anger triggers a number of bodily changes, which can negatively impact your breathing and blood circulation."));
            arrayList.add(new e(false, true, "Anger can sometimes be helpful."));
            arrayList.add(new e(true, false, "While anger is often thought of as a negative emotion, it can sometimes be helpful. For instance, it can help you identify danger and encourage you to seek positive change and experiences."));
            arrayList.add(new e(true, true, "Your anger is in your head."));
            arrayList.add(new e(false, false, "Anger can lead you to experience several changes in your body. Your heart might race, your body could tremble and you might experience significant distress."));
            arrayList.add(new e(false, true, "Anger is not as serious an issue as other emotional difficulties."));
            arrayList.add(new e(false, false, "If you find it difficult to manage your anger, you might experience a lot of distress. Anger can negatively impact your relationships and negatively affect your physical or mental health."));
        }
        this.f3445v = (ImageView) inflate.findViewById(R.id.img);
        this.f3446w = (RobertoTextView) inflate.findViewById(R.id.sleepQuizLeftCTA);
        this.f3447x = (RobertoTextView) inflate.findViewById(R.id.sleepQuizRightCTA);
        this.f3448y = (RobertoTextView) inflate.findViewById(R.id.sleepQuizLinearText);
        this.f3449z = (RobertoTextView) inflate.findViewById(R.id.sleepQuizCardText);
        this.A = (LinearLayout) inflate.findViewById(R.id.sleepQuizLinear);
        this.F = (RobertoButton) inflate.findViewById(R.id.btnNext);
        this.B = (LinearLayout) inflate.findViewById(R.id.ll_fact);
        this.E = (LinearLayout) inflate.findViewById(R.id.gradient_background);
        this.f3446w.setOnClickListener(new View$OnClickListenerC0052a());
        this.f3447x.setOnClickListener(new b());
        this.F.setOnClickListener(new c());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        J();
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.D = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.D.setOnClickListener(new d());
        this.D.setColorFilter(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorWhite, getContext()));
    }
}
