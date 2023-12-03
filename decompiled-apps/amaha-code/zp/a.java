package zp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SymptomsActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.SleepCauseSummaryModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: StressImpactListSummaryFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RecyclerView f39782u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<SleepCauseSummaryModel> f39783v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f39784w;

    /* renamed from: x  reason: collision with root package name */
    public HashSet<Integer> f39785x = new HashSet<>();

    /* renamed from: y  reason: collision with root package name */
    public boolean f39786y;

    /* compiled from: StressImpactListSummaryFragment.java */
    /* renamed from: zp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0681a implements View.OnClickListener {
        public View$OnClickListenerC0681a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    /* compiled from: StressImpactListSummaryFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    /* compiled from: StressImpactListSummaryFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SymptomsActivity) a.this.getActivity()).o0();
        }
    }

    public a() {
        new HashSet();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stress_impact_list_summary, viewGroup, false);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.sleepCauseLinear);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        Iterator<Integer> it;
        Integer num;
        String str3;
        String str4;
        String str5;
        String str6;
        super.onViewCreated(view, bundle);
        int i6 = 1;
        this.f39786y = true;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f39782u = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f39782u.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f39782u.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f39784w = (RobertoTextView) view.findViewById(R.id.text_title);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new View$OnClickListenerC0681a());
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new b());
        ((RobertoButton) view.findViewById(R.id.ll_submit)).setOnClickListener(new c());
        this.f39783v = new ArrayList<>();
        this.f39785x = gr.c.f16711y;
        String str7 = SymptomsActivity.B;
        String str8 = Constants.COURSE_DEPRESSION;
        boolean equals = str7.equals(Constants.COURSE_DEPRESSION);
        Integer valueOf = Integer.valueOf((int) R.drawable.ic_feeling_sad);
        Integer valueOf2 = Integer.valueOf((int) R.drawable.ic_difficulty_remembering_things);
        Integer valueOf3 = Integer.valueOf((int) R.drawable.ic_feeling_tired);
        Integer valueOf4 = Integer.valueOf((int) R.drawable.ic_difficulty_concentrating);
        String str9 = Constants.COURSE_ANGER;
        String str10 = "Difficulty Making Decisions";
        String str11 = "Difficulty Remembering Things";
        if (equals) {
            Iterator<Integer> it2 = this.f39785x.iterator();
            while (it2.hasNext()) {
                Integer next = it2.next();
                Iterator<Integer> it3 = it2;
                if (next.intValue() == i6) {
                    this.f39783v.add(new SleepCauseSummaryModel("Difficulty Remembering Things", "You might find it difficult to remember things or learn new information. ", "Difficulty Remembering Things", valueOf2));
                    str4 = str8;
                } else if (next.intValue() == 2) {
                    str4 = str8;
                    this.f39783v.add(new SleepCauseSummaryModel("Difficulty Paying Attention", "You might find it difficult to pay attention or focus for long periods of time.", "Difficulty Paying Attention", valueOf4));
                } else {
                    str4 = str8;
                    if (next.intValue() == 3) {
                        this.f39783v.add(new SleepCauseSummaryModel(str10, "You might find yourself struggling to make even simple, everyday decisions that don't require a lot of thought and planning.", str10, valueOf2));
                    } else if (next.intValue() == 4) {
                        this.f39783v.add(new SleepCauseSummaryModel("Negative Thinking", "You might be more likely to view yourself and the world around you negatively, which can lower your self-esteem and further worsen your symptoms.", "Negative Thinking", valueOf4));
                    } else {
                        if (next.intValue() == 5) {
                            str5 = str9;
                            str6 = str10;
                            this.f39783v.add(new SleepCauseSummaryModel("Changes in Appetite", "You might have significantly lost your appetite. On the other hand, it is also possible that you have started to overeat.", "Changes in Appetite", Integer.valueOf((int) R.drawable.ic_changes_in_appetite)));
                        } else {
                            str5 = str9;
                            str6 = str10;
                            if (next.intValue() == 6) {
                                this.f39783v.add(new SleepCauseSummaryModel("Changes in Weight", "You could experience significant weight gain or weight loss.", "Changes in Weight", Integer.valueOf((int) R.drawable.ic_changes_in_weight)));
                            } else if (next.intValue() == 7) {
                                this.f39783v.add(new SleepCauseSummaryModel("Difficulty Sleeping", "You could be sleeping more or less than usual, as depression affects the overall quantity and quality of your sleep.", "Difficulty Sleeping", Integer.valueOf((int) R.drawable.ic_difficulty_sleeping)));
                            } else if (next.intValue() == 8) {
                                this.f39783v.add(new SleepCauseSummaryModel("Little Interest in Sexual Activities", "You could experience a lack of interest in sexual activities.", "Little Interest in Sexual Activities", Integer.valueOf((int) R.drawable.ic_little_interest_in_sexual_activities)));
                            } else if (next.intValue() == 9) {
                                this.f39783v.add(new SleepCauseSummaryModel("Feeling Tired", "You are constantly tired and feel low on energy, which makes it difficult for you to accomplish simple tasks.", "Feeling Tired", valueOf3));
                            } else if (next.intValue() == 10) {
                                this.f39783v.add(new SleepCauseSummaryModel("Aches and Pains", "You could experience a number of other bodily symptoms, such as headaches, body aches, and/or gastroinestinal problems.", "Aches and Pains", Integer.valueOf((int) R.drawable.ic_aches_and_pains)));
                            } else if (next.intValue() == 11) {
                                this.f39783v.add(new SleepCauseSummaryModel("Feeling Hopeless", "You are finding it difficult to see how you could possibly feel better, and you may feel discouraged about the future.", "Feeling Hopeless", Integer.valueOf((int) R.drawable.ic_feeling_hopeless)));
                            } else if (next.intValue() == 12) {
                                this.f39783v.add(new SleepCauseSummaryModel("Feeling Worthless", "You feel that you (or your work) don't have any importance and that you are disappointing those around you.", "Feeling Worthless", Integer.valueOf((int) R.drawable.ic_feeling_worthless)));
                            } else if (next.intValue() == 13) {
                                this.f39783v.add(new SleepCauseSummaryModel("Feeling Helpless", "You feel that a lot of situations are not in your control and you are unable to help yourself.", "Feeling Helpless", Integer.valueOf((int) R.drawable.ic_feeling_helpless)));
                            } else if (next.intValue() == 14) {
                                this.f39783v.add(new SleepCauseSummaryModel("Feeling Sad", "You could be feeling a constant sadness or emptiness that is difficult to shake off.", "Feeling Sad", valueOf));
                            } else if (next.intValue() == 15) {
                                this.f39783v.add(new SleepCauseSummaryModel("Feeling Angry or Irritable", "In addition to feeling sad, you could feel angry or irritable without any external causes or reasons.", "Feeling Angry or Irritable", Integer.valueOf((int) R.drawable.ic_feeling_angry_or_irritable)));
                            } else if (next.intValue() == 16) {
                                this.f39783v.add(new SleepCauseSummaryModel("Feeling Guilty", "You tend to blame yourself for anything that goes wrong in your life or around you.", "Feeling Guilty", Integer.valueOf((int) R.drawable.ic_feeling_guilty)));
                            } else if (next.intValue() == 17) {
                                this.f39783v.add(new SleepCauseSummaryModel("Little to No Social Interaction", "You could be feeling lonely or isolated; at the same time, you may find it difficult to speak to friends and family.", "Little to No Social Interaction", Integer.valueOf((int) R.drawable.ic_little_to_no_social_interaction)));
                            } else if (next.intValue() == 18) {
                                this.f39783v.add(new SleepCauseSummaryModel("Poor Self Care", "You might find it difficult to look after your personal needs, including getting dressed, eating well or sleeping on time.", "Poor Self Care", Integer.valueOf((int) R.drawable.ic_poor_self_care)));
                            } else if (next.intValue() == 19) {
                                this.f39783v.add(new SleepCauseSummaryModel("No Interest in Pleasurable Activities", "You don't find yourself enjoying activities you used to find fun or exciting.", "No Interest in Pleasurable Activities", Integer.valueOf((int) R.drawable.ic_no_interest_in_pleasurable_activities)));
                            } else if (next.intValue() == 20) {
                                this.f39783v.add(new SleepCauseSummaryModel("Lowered Activity Levels", "You might find it difficult to engage in routine, daily activities such as household tasks.", "Lowered Activity Levels", Integer.valueOf((int) R.drawable.ic_lowered_activity_levels)));
                            }
                        }
                        it2 = it3;
                        str8 = str4;
                        str9 = str5;
                        str10 = str6;
                        i6 = 1;
                    }
                }
                str5 = str9;
                str6 = str10;
                it2 = it3;
                str8 = str4;
                str9 = str5;
                str10 = str6;
                i6 = 1;
            }
            str = str8;
            str2 = str9;
        } else {
            str = Constants.COURSE_DEPRESSION;
            String str12 = "Difficulty Making Decisions";
            if (SymptomsActivity.B.equals(Constants.COURSE_STRESS)) {
                Iterator<Integer> it4 = this.f39785x.iterator();
                while (it4.hasNext()) {
                    Integer next2 = it4.next();
                    Iterator<Integer> it5 = it4;
                    if (next2.intValue() == 1) {
                        this.f39783v.add(new SleepCauseSummaryModel(str11, "When your brain is focussed on dealing with stress, it is less able to process, store and recall information from memory.", str11, valueOf2));
                        num = valueOf2;
                    } else if (next2.intValue() == 2) {
                        num = valueOf2;
                        this.f39783v.add(new SleepCauseSummaryModel("Difficulty Thinking Clearly", "When stressed, your body uses its energy to either fight or run away from the situation, making it difficult to think clearly or make rational decisions.", "Difficulty Thinking Clearly", Integer.valueOf((int) R.drawable.ic_difficulty_thinking_clearly)));
                    } else {
                        num = valueOf2;
                        if (next2.intValue() == 3) {
                            this.f39783v.add(new SleepCauseSummaryModel("Negative Thinking", "During times of stress, you might think of other situations in which you have been stressed. This gives rise to negative thinking patterns.", "Negative Thoughts", valueOf4));
                        } else if (next2.intValue() == 4) {
                            this.f39783v.add(new SleepCauseSummaryModel("Difficulty Concentrating", "When stressed, your brain's resources are focussed on negative thoughts, which makes it difficult for you to focus on problem solving and decision making.", "Difficulty Concentrating", valueOf4));
                        } else {
                            if (next2.intValue() == 5) {
                                str3 = str11;
                                this.f39783v.add(new SleepCauseSummaryModel("Rapid Thinking", "When stressed about something, you might often have speeding thoughts that are blown out of proportion, draining your energy and overwhelming you.", "Racing Thoughts", Integer.valueOf((int) R.drawable.ic_racing_thoughts)));
                            } else {
                                str3 = str11;
                                if (next2.intValue() == 6) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Difficulty Sleeping", "Stress makes your body alert and unable to relax, resulting in sleeping difficulties.", "Difficulty Sleeping", Integer.valueOf((int) R.drawable.ic_difficulty_sleeping)));
                                } else if (next2.intValue() == 7) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Body Aches", "A common response to stress is the tightening of muscles and increased production and build-up of lactic acid, a chemical that causes you to feel pain.", "Body Aches", Integer.valueOf((int) R.drawable.ic_body_aches)));
                                } else if (next2.intValue() == 8) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Increased Heart Rate, Shortness of Breath and Sweating", "Stress leads to release of adrenaline, which prepares you to face the situation by means of various physiological changes in the body.", "Increased Heart Rate, Shortness of Breath and Sweating", Integer.valueOf((int) R.drawable.ic_increased_heart_rate)));
                                } else if (next2.intValue() == 9) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Heart Problems", "Prolonged exposure to stressful situations can contribute to health problems such as high blood pressure and, in some cases, cardiovascular diseases.", "Heart Conditions", Integer.valueOf((int) R.drawable.ic_heart_problems)));
                                } else if (next2.intValue() == 10) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Skin Conditions", "Stress leads to the production of stress hormone cortisol, making your skin produce more oil and increasing the possibility of skin problems like acne.", "Skin Conditions", Integer.valueOf((int) R.drawable.ic_skin_conditions)));
                                } else if (next2.intValue() == 11) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Reduced Immunity", "When continually exposed to stress, your body has few resources left to protect itself from illnesses and diseases.", "Reduced Immunity", Integer.valueOf((int) R.drawable.ic_reduced_immunity)));
                                } else if (next2.intValue() == 12) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Sexual Problems and Difficulties", "Stress can hamper your sexual functioning, leading to erectile dysfunction and low sperm count in men and irregular periods and/or menstrual cramps in women.", "Sexual Problems", Integer.valueOf((int) R.drawable.ic_sexual_problems)));
                                } else if (next2.intValue() == 13) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Stomach Problems", "When stressed, your brain conserves energy by slowing digestion, often leading to nausea, diarrhoea, indigestion, muscle cramps and acidity.", "Stomach Problems", Integer.valueOf((int) R.drawable.ic_stomach_problems)));
                                } else if (next2.intValue() == 14) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Sadness", "Too much stress over time causes imbalances in the levels of cortisol and other brain chemicals, causing you to feel sad.", "Sadness", valueOf));
                                } else if (next2.intValue() == 15) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Worry and Nervousness", "In response to stress, your body can become alert and anxious. This can leave you feeling constantly worried.", "Worry and Nervousness", Integer.valueOf((int) R.drawable.ic_feeling_worried)));
                                } else if (next2.intValue() == 16) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Anger and Frustration", "When you feel stressed, you experience a lack of control. This may cause you to let out your anger in an unhealthy way.", "Anger and Frustration", Integer.valueOf((int) R.drawable.ic_feeling_angry)));
                                } else if (next2.intValue() == 17) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Feeling Tired", "Stress drains your energy and is responsible for a number of changes in the body, which, over time, can lead to tiredness and fatigue.", "Feeling Tired", valueOf3));
                                }
                            }
                            it4 = it5;
                            valueOf2 = num;
                            str11 = str3;
                        }
                    }
                    str3 = str11;
                    it4 = it5;
                    valueOf2 = num;
                    str11 = str3;
                }
            } else if (SymptomsActivity.B.equals(Constants.COURSE_WORRY)) {
                Iterator<Integer> it6 = this.f39785x.iterator();
                while (it6.hasNext()) {
                    Integer next3 = it6.next();
                    if (next3.intValue() == 1) {
                        this.f39783v.add(new SleepCauseSummaryModel("Frustration and Irritability", "If you are unable to focus on anything other than your worries, you might be unable to carry out your daily tasks. These tasks may then pile up and leave you feeling overwhelmed and frustrated.", "Frustration and Irritability", Integer.valueOf((int) R.drawable.ic_feeling_frustrated)));
                    } else if (next3.intValue() == 2) {
                        this.f39783v.add(new SleepCauseSummaryModel("Excessive Worrying", "You might find yourself worrying about situations more than you normally do - or even worrying about nothing at all - which in turn hampers your productivity.", "Excessive Worrying", Integer.valueOf((int) R.drawable.ic_feeling_worried)));
                    } else if (next3.intValue() == 3) {
                        this.f39783v.add(new SleepCauseSummaryModel("Sadness", "Worrying too much can make you overwhelmed about certain situations and make you feel like you cannot handle problems well. This causes you to feel distressed or unhappy.", "Sadness", valueOf));
                    } else if (next3.intValue() == 4) {
                        this.f39783v.add(new SleepCauseSummaryModel("Heavy Breathing", "Worrying might make you breathe heavily and take large amounts of air, which disturbs the balance of oxygen and carbon-dioxide in your body. This imbalance, in turn, can cause other distressing changes.", "Heavy Breathing", Integer.valueOf((int) R.drawable.ic_hyperventilation_heavy_breathing)));
                    } else if (next3.intValue() == 5) {
                        this.f39783v.add(new SleepCauseSummaryModel("Racing Heart", "At times, when you worry, you may start taking in too much oxygen (heavy breathing), which makes your heart beat faster.", "Racing Heart", Integer.valueOf((int) R.drawable.ic_racing_heart)));
                    } else if (next3.intValue() == 6) {
                        this.f39783v.add(new SleepCauseSummaryModel("Tiredness", "Your body requires more energy to function when it is constantly alert. Worrying all the time exhausts both your body and mind.", "Tiredness", valueOf3));
                    } else if (next3.intValue() == 7) {
                        this.f39783v.add(new SleepCauseSummaryModel("Muscle Tension", "The stress response that is triggered by your worry can cause your muscles to become tense.", "Muscle Tension", Integer.valueOf((int) R.drawable.ic_muscle_tension)));
                    } else if (next3.intValue() == 8) {
                        this.f39783v.add(new SleepCauseSummaryModel("Disturbed Sleep Patterns", "Worrying thoughts can directly disturb your sleeping patterns. Moreover, several symptoms of worry (such as headaches, trembling, a pounding heart) can negatively impact your sleep as well.", "Disturbed Sleep Patterns", Integer.valueOf((int) R.drawable.ic_disturbed_sleep_patterns)));
                    } else if (next3.intValue() == 9) {
                        this.f39783v.add(new SleepCauseSummaryModel("Dizziness", "Bodily changes that occur due to excessive worry also affect the part of your brain that is responsible for controlling balance - making you feel dizzy.", "Dizziness", valueOf3));
                    } else if (next3.intValue() == 10) {
                        this.f39783v.add(new SleepCauseSummaryModel("Headaches", "Worry might cause the muscles around your head to get tense. Moroever, as the stress response is triggered when you worry, the hormones released in your body can cause headaches as well.", "Headaches", Integer.valueOf((int) R.drawable.ic_headaches)));
                    } else if (next3.intValue() == 11) {
                        this.f39783v.add(new SleepCauseSummaryModel("Trembling", "Worrying activates the stress response, which triggers the release of hormones that stimulate your nervous system. This can cause you to tremble or feel nervous and jittery.", "Trembling", Integer.valueOf((int) R.drawable.ic_trembling)));
                    } else if (next3.intValue() == 12) {
                        this.f39783v.add(new SleepCauseSummaryModel("Frequent Urination", "When you worry, your stress response kicks in, causing your body to eliminate waste. This response also increases your body's metabolism, making your body process fluids more quickly than normal.", "Frequent Urination", Integer.valueOf((int) R.drawable.ic_frequent_urination)));
                    } else if (next3.intValue() == 13) {
                        this.f39783v.add(new SleepCauseSummaryModel("Restlessness", "The release of adrenaline by your body when you worry causes an increase in energy levels. When such energy is not really required, you may end up feeling restless.", "Restlessness", Integer.valueOf((int) R.drawable.ic_restlesness)));
                    } else if (next3.intValue() == 14) {
                        this.f39783v.add(new SleepCauseSummaryModel("Getting Easily Frightened", "When you worry, your body and mind are constantly on alert in order to help you deal with emergencies. This state can cause you to be easily startled or frightened.", "Getting Easily Frightened", Integer.valueOf((int) R.drawable.ic_easily_frightened)));
                    } else if (next3.intValue() == 15) {
                        this.f39783v.add(new SleepCauseSummaryModel("Procrastination", "If you are constantly worried, you may feel overwhelmed - and this may cause you to avoid tasks.", "Procrastination", Integer.valueOf((int) R.drawable.ic_procrastinating)));
                    } else if (next3.intValue() == 16) {
                        String str13 = str12;
                        this.f39783v.add(new SleepCauseSummaryModel(str13, "When you worry too much, you might be unable to focus on anything else. This can also cause you to experience difficulty in making decisions.", str13, Integer.valueOf((int) R.drawable.ic_trouble_making_decisions)));
                    } else {
                        String str14 = str12;
                        if (next3.intValue() == 17) {
                            this.f39783v.add(new SleepCauseSummaryModel("Difficulty Concentrating", "Excessive worry can take all of your attention, making it difficult for you to focus on anything else.", "Difficulty Concentrating", valueOf4));
                            str12 = str14;
                        } else {
                            if (next3.intValue() == 18) {
                                it = it6;
                                this.f39783v.add(new SleepCauseSummaryModel("Inability to Recall Events", "Worrying too much might make it impossible for you to process any other information making blackouts frequent.", "Inability to Recall Events", Integer.valueOf((int) R.drawable.difficult_to_remmember)));
                            } else {
                                it = it6;
                                if (next3.intValue() == 19) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Negative Thinking", "Excessive worry makes you view situations as being much worse than they actually are. You might also begin to take things personally and blame yourself for negative circumstances.", "Negative Thinking", Integer.valueOf((int) R.drawable.ic_negative_thinking)));
                                } else if (next3.intValue() == 20) {
                                    this.f39783v.add(new SleepCauseSummaryModel("Thinking That You Worry Too Much", "Worrying about possible negative outcomes might make you realise that your worry is excessive. Even with this realisation, however, you might find it dificult to stop worrying.", "Thinking That You Worry Too Much", Integer.valueOf((int) R.drawable.ic_thinking_that_you_worry_too_much)));
                                }
                            }
                            str12 = str14;
                            it6 = it;
                        }
                    }
                }
            } else {
                String str15 = SymptomsActivity.B;
                str2 = Constants.COURSE_ANGER;
                if (str15.equals(str2)) {
                    Iterator<Integer> it7 = this.f39785x.iterator();
                    while (it7.hasNext()) {
                        Integer next4 = it7.next();
                        if (next4.intValue() == 1) {
                            this.f39783v.add(new SleepCauseSummaryModel("Feeling Irritable", "You might feel annoyed easily, even under normal circumstances.", "Feeling Irritable", Integer.valueOf((int) R.drawable.ic_feeling_irritable)));
                        } else if (next4.intValue() == 2) {
                            this.f39783v.add(new SleepCauseSummaryModel("Feeling Angry Easily and Frequently", "You feel angry quickly, even in situations that would otherwise not anger you.", "Feeling Angry Easily and Frequently", Integer.valueOf((int) R.drawable.ic_feeling_angry_easilyand_frequently)));
                        } else if (next4.intValue() == 3) {
                            this.f39783v.add(new SleepCauseSummaryModel("Feeling Worried about Your Anger", "You are worried that your anger is affecting you or others around you.", "Feeling Worried about Your Anger", Integer.valueOf((int) R.drawable.ic_feeling_worried_about_your_anger)));
                        } else if (next4.intValue() == 4) {
                            this.f39783v.add(new SleepCauseSummaryModel("Venting on Friends or Family", "You might not be able to control your anger, instead taking your frustration out on others around you.", "Venting on Friends or Family", Integer.valueOf((int) R.drawable.ic_taking_your_frustration_out_on_friends_and_family)));
                        } else if (next4.intValue() == 5) {
                            this.f39783v.add(new SleepCauseSummaryModel("Problems in Relationships", "Striking out at friends and family might lead to conflict in your relationships with them.", "Problems in Relationships", Integer.valueOf((int) R.drawable.ic_racing_thoughts)));
                        } else if (next4.intValue() == 6) {
                            this.f39783v.add(new SleepCauseSummaryModel("Tense Muscles", "Frequent outbursts of anger could lead you to experience muscle tension in your neck, shoulders, or even your back.", "Tense Muscles", Integer.valueOf((int) R.drawable.ic_muscle_tension)));
                        } else if (next4.intValue() == 7) {
                            this.f39783v.add(new SleepCauseSummaryModel("Racing Heartbeat", "When you are angry, you may start breathing heavily and may take in too much oxygen. This may cause your heart to beat faster.", "Racing Heartbeat", Integer.valueOf((int) R.drawable.ic_racing_heart_beats)));
                        } else if (next4.intValue() == 8) {
                            this.f39783v.add(new SleepCauseSummaryModel("Disturbed Breathing Patterns", "Getting angry might make you breathe heavily and take in large amounts of air. This may disturb the balance of oxygen and carbon-dioxide in your body.", "Disturbed Sleep Patterns", Integer.valueOf((int) R.drawable.ic_disturbed_breathing_pattern)));
                        } else if (next4.intValue() == 9) {
                            this.f39783v.add(new SleepCauseSummaryModel("Increased Blood Pressure", "Anger can trigger a series of changes in your body, causing your blood vessels to tighten - which in turn leads to elevated blood pressure.", "Increased Blood Pressure", Integer.valueOf((int) R.drawable.ic_heart_problems)));
                        } else if (next4.intValue() == 10) {
                            this.f39783v.add(new SleepCauseSummaryModel("Frequent Headaches", "Feeling angry might cause the muscles around your head to get tense. Moroever, the hormones released in your body in response to anger can cause headaches as well.", "Frequent Headaches", Integer.valueOf((int) R.drawable.ic_frequent_headaches)));
                        }
                    }
                }
            }
            str2 = Constants.COURSE_ANGER;
        }
        this.f39782u.setAdapter(new o(this.f39786y, this.f39783v, getActivity()));
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.f39783v.size(); i10++) {
            hashSet.add(this.f39783v.get(i10).getTitleText());
        }
        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        if (courseById.getCourseName().equals(Constants.COURSE_STRESS)) {
            this.f39784w.setText("Click on each of your symptoms of stress to learn more about them.");
            hashSet.addAll(FirebasePersistence.getInstance().getUser().getStress().getStressSymptoms());
            FirebasePersistence.getInstance().getUser().getStress().getStressSymptoms().clear();
            FirebasePersistence.getInstance().getUser().getStress().getStressSymptoms().addAll(hashSet);
        } else if (courseById.getCourseName().equals(str)) {
            this.f39784w.setText("Click on each of your symptoms of depression to learn more about them.");
            hashSet.addAll(FirebasePersistence.getInstance().getUser().getDepression().getDepressionSymptoms());
            FirebasePersistence.getInstance().getUser().getDepression().getDepressionSymptoms().clear();
            FirebasePersistence.getInstance().getUser().getDepression().getDepressionSymptoms().addAll(hashSet);
        } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
            this.f39784w.setText("Click on each of your symptoms of worry to learn more about them.");
            hashSet.addAll(FirebasePersistence.getInstance().getUser().getWorry().getWorrySymptoms());
            FirebasePersistence.getInstance().getUser().getWorry().getWorrySymptoms().clear();
            FirebasePersistence.getInstance().getUser().getWorry().getWorrySymptoms().addAll(hashSet);
        } else if (courseById.getCourseName().equals(str2)) {
            this.f39784w.setText("Click on each of your symptoms of anger to learn more about them.");
            hashSet.addAll(FirebasePersistence.getInstance().getUser().getAnger().getAngerSymptoms());
            FirebasePersistence.getInstance().getUser().getAnger().getAngerSymptoms().clear();
            FirebasePersistence.getInstance().getUser().getAnger().getAngerSymptoms().addAll(hashSet);
        }
        FirebasePersistence.getInstance().updateUserOnFirebase();
    }
}
