package com.theinnerhour.b2b.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import w5.i0;
/* compiled from: FAQActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/activity/FAQActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FAQActivity extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f10402x = 0;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f10403v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10404w;

    /* compiled from: FAQActivity.kt */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f10405a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10406b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10407c;

        public a(boolean z10, String str, String str2) {
            this.f10405a = z10;
            this.f10406b = str;
            this.f10407c = str2;
        }
    }

    public FAQActivity() {
        new LinkedHashMap();
    }

    public final ArrayList<a> n0() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ArrayList<a> arrayList = new ArrayList<>();
        arrayList.add(new a(true, "Getting Started", null));
        arrayList.add(new a(false, "What is Amaha?", "Amaha is an online platform for emotional and psychological well-being. We offer comprehensive online counselling and therapy, provide valuable information on psychological wellness, and work with organisations to meet similar goals. \n\nWe offer one-on-one sessions via phone, online chat and video consultation with our expert team of counsellors, psychologists and cognitive-behaviour and rational-emotive behaviour therapists. \n\nThe Amaha Wellness App is an all-in-one guide that has been developed with the inputs of experienced psychologists, psychiatrists, and other mental health-care experts. This app gives you the opportunity to access emotional support via customised programmes for various areas of concern, such as stress, anxiety, depression, sleep problems, and many more. We’ve incorporated research-based tools within a self-help framework so you can get started on your personal journey towards happiness. Happiness has no limits, and nothing should stop you from leading a healthier life."));
        arrayList.add(new a(false, "Who should use this app?", "This app is for anyone over the age of 18 years who would like to lead a happier and healthier life. You can use it to work on your emotional wellness, self improvement or find ways to cope with stress and other issues. \n\nIt is important to note however, that our experts recommend that people with severe emotional difficulties seek help from someone in person. We do not handle schizophrenia and psychotic conditions that may involve hallucinations, delusions, uncontrolled aggressive behaviour and threats to others. We also do not see clients during extreme crisis and emergencies like thoughts of self-harm, suicidal ideation and alcohol or drug intoxication or their withdrawal. If you feel you have any of the above symptoms, difficulties or concerns, we suggest you seek help at the nearest hospital or emergency room where you can connect with a psychiatrist, social worker, counsellor or therapist in person."));
        arrayList.add(new a(false, "What is the purpose of the Amaha Wellness App?", "We believe that happy people can proactively contribute to creating a happy world. Keeping that in mind, the Wellness App has been designed in order to help you work on your emotional wellness and find ways to cope with various issues that might prevent you from leading a more fulfilling life. It is important to note that the app is not a substitute for traditional, face to face therapy and severe clinical conditions would require face to face treatment."));
        arrayList.add(new a(false, "How do I access the Amaha app? Where or how can I get this app?", "The Amaha Wellness App is currently available for corporate clients. Once an organisation registers with us, access to the app will be sent to all the company employees. Each employee will have to download and install the app on their Android smartphone to access it. \n\nFor consumers who belong to non registered organisations, the app will be available on the Google Playstore."));
        if (this.f10404w) {
            str = "The Amaha Wellness App offers you a number of programmes. You can select from the following programmes: \n\n-Sleep Better\n-Stress Management\n-Mood Management\n-Happiness\n\nOnce you select a programme, you will be asked to take a quick assessment in order for us to curate a personalised plan for you. A guide will be assigned to you to help you throughout your journey.";
        } else {
            str = "The Amaha Wellness App offers you a number of programmes. You can select from the following programmes: \n\n-Sleep Better\n-Stress Management\n-Mood Management\n-Happiness\n\nOnce you select a programme, you will be asked to take a quick assessment in order for us to curate a 4-week plan for you. A guide will be assigned to you to help you throughout your journey.";
        }
        arrayList.add(new a(false, "What courses does the Amaha Wellness App offer?", str));
        arrayList.add(new a(false, "Can other members of my family use the app?", "Depending on the plan selected by your organisation, you will be able to add one or more family members. You can add a family member to your profile. Visit ‘My Profile’ within the app and click on ‘Add Member’. Once you fill in the required details, your family member will be able to access the app on their mobile phone as well. They will be sent a link to their email id and will have to download and install the app on their Android smartphone to start using it. \n"));
        arrayList.add(new a(true, "Benefits", null));
        arrayList.add(new a(false, "What are the benefits I can expect from using the Amaha Wellness App?", "The Amaha Wellness app offers different programmes to work on. Once you’ve selected a programme that you’d like to work on, you can begin learning important concepts and skills. You can also set daily goals, track your mood, set daily reminders, practise helpful relaxation activities and develop preventive strategies for dealing with a number of situations. \n"));
        if (this.f10404w) {
            str2 = "Each programme in the Amaha Wellness App has a personalised plan developed by experienced psychologists. You can continue using the app after you complete the programme in order to track goals and practise the activities and strategies you have learned. It is important to remember that everyone reacts and behaves differently and some of us may take more time to learn or benefit from certain activities. \n";
        } else {
            str2 = "Each programme in the Amaha Wellness App has a 4-week structured plan developed by experienced psychologists. You can continue using the app after you complete the programme in order to track goals and practise the activities and strategies you have learned. It is important to remember that everyone reacts and behaves differently and some of us may take more time to learn or benefit from certain activities. \n";
        }
        arrayList.add(new a(false, "How long should I be using this app?", str2));
        arrayList.add(new a(false, "Can I consume more than one programme?", "You can work on as many programmes as you would like to, but we recommend you to move on to a different programme after completing one programme completely. \n"));
        arrayList.add(new a(true, "About the Product", null));
        arrayList.add(new a(false, "Who developed the Amaha Wellness app?", "The Amaha Wellness App has been developed with the help of experienced psychologists, psychiatrists and wellness experts. While we believe that traditional therapy is important, the Wellness app is designed to allow people access to quality, research backed assistance in spite of stigma, cost and other logistical barriers. This is in line with our motto ‘Happier People, Happier World’.\n"));
        if (this.f10404w) {
            str3 = "Each programme begins with an initial assessment which is designed to gauge the intensity of a problem and help us develop a suitable programme plan for you. \nFor example, in the Stress Management programme, the initial assessment will assess your current stress levels in order to create a suitable personalised plan to tackle the problem.\n";
        } else {
            str3 = "Each programme begins with an initial assessment which is designed to gauge the intensity of a problem and help us develop a suitable programme plan for you. \nFor example, in the Stress Management programme, the initial assessment will assess your current stress levels in order to create a suitable 4-week plan to tackle the problem.\n";
        }
        arrayList.add(new a(false, "What is the purpose of an assessment?", str3));
        arrayList.add(new a(false, "What is the Daily Task?", "Each programme is designed in order to keep you engaged and excited about working on your wellness. There are certain activities that you must complete each day in order to ensure progress. This could be learning skills, coping techniques, reading an article or practising a relaxation exercise.\n"));
        arrayList.add(new a(false, "How do I complete the goals on the app?", "The Amaha Wellness App allows you to set goals for yourself. These goals will help you practise positive, helpful behaviours on a regular basis. You can use the app to track these behaviours on a daily basis and even get reminders to practise them. Certain behaviours act as preventive measures to help your body deal with stressful situations even before they occur. Hence, it is advisable that you continue tracking and practising them even after the completion of a particular programme.\n"));
        arrayList.add(new a(false, "What are my Happiness Goals?", "Research shows that there are certain behaviours you can practise in order to feel better and prevent your body and mind from experiencing the negative impact of stress, worry or low mood. It is important that you practise these behaviours on a regular basis in order to see noticeable changes in the way you deal with distressing events. The Amaha Wellness App not only teaches you about these behaviours but also allows you to track them on a daily basis.\n"));
        arrayList.add(new a(false, "Why do I have to work on my thoughts?", "Everyone faces distressing situations from time to time. These situations might cause us to start thinking negative and unhelpful thoughts. If this manner of thinking is not corrected, it could have a negative impact on your body and mind. The Amaha Wellness App includes a component which allows you to work on negative thinking patterns that might be affecting you. This module is designed to help you correct unhelpful thoughts and start thinking more positive, helpful thoughts.\n"));
        arrayList.add(new a(false, "How do Coping Activities help?", "Everyone is bound to get overwhelmed when situations are beyond our control and require more resources that we are prepared to give. Coping activities are designed to provide you with immediate relief in such circumstances. They help you cope better and manage the physical and emotional distress you might be feeling.\n"));
        arrayList.add(new a(false, "What is the Reading List?", "Our experts have created and curated a reading list of relevant articles for each programme in order to help you along your journey to wellness. Each article has been written after extensive research. These articles can be accessed under the Reading List within the app.\n"));
        arrayList.add(new a(false, "What if I have questions while completing the programme? Is there someone I can ask for help?", "Whenever you have any questions, you can write to us at support@amahahealth.com.\nIf your organisation has selected a premium plan, a guide will be assigned to you at the start of your journey in order to help you with any queries along the way. You can chat with the guide or even book a session with them if you need additional help.\n\n"));
        if (this.f10404w) {
            str4 = "The primary features which make the Amaha app unique are:\n\n1. Customised programmes: After assessing your symptoms or level of functioning in a particular area, we design a special programme for you.\n2. Tracking model: While you learn some activities that help you cope and build happiness goals, we also help you track them daily on the Amaha Wellness App. \n3. Personalised content, in the form of articles, in order to teach you new skills and strategies to cope. \n4. Complete Guidance: The assigned guide will keep helping you along your journey and you can converse with them about the difficulties you are facing\n";
        } else {
            str4 = "The primary features which make the Amaha app unique are:\n\n1. Customised programmes: After assessing your symptoms or level of functioning in a particular area, we design a special 4-week programme for you.\n2. Tracking model: While you learn some activities that help you cope and build happiness goals, we also help you track them daily on the Amaha Wellness App. \n3. Periodic Assessments: Assessments are conducted after specific intervals to evaluate and assess your progress.\n4. Personalised content, in the form of articles, in order to teach you new skills and strategies to cope. \n5. Complete Guidance: The assigned guide will keep helping you along your journey and you can converse with them about the difficulties you are facing\n";
        }
        arrayList.add(new a(false, "What are the primary features of this app?", str4));
        arrayList.add(new a(false, "Can I use the app when I am in a distressed state?", "Yes, you can use the app when  you are distressed. When you open the app you will find a ‘Cope’ option on your Home screen. This gives you access to some de-stressing activities. It is important to note however, that our experts recommend that people with more severe emotional difficulties seek help from someone in person.\n"));
        arrayList.add(new a(true, "Experience", null));
        if (this.f10404w) {
            str5 = "An ideal journey with Amaha, is a personalised plan created for you with the help of our experts. You learn useful information to work on your behaviour and thinking, read helpful content regarding the area you choose to work on and track your progress.\n";
        } else {
            str5 = "An ideal journey with Amaha, is a 4-week plan created for you with the help of our experts. You learn useful information to work on your behaviour and thinking, read helpful content regarding the area you choose to work on and track your progress.\n";
        }
        arrayList.add(new a(false, "What will my journey with Amaha look like?", str5));
        if (!this.f10404w) {
            arrayList.add(new a(false, "What if I miss a day in between the 4-week plan?", "We have created the programme in order that you learn something everyday. Your daily tasks are broken down and tailored for you based on psychological research. However, if you miss a particular day’s task, that task will be listed on your Home screen and will remain open for you to view on your own time.\n"));
        }
        if (this.f10404w) {
            str6 = "(1) Click on the downward chevron next to your selected programme on Home Screen\n(2) Now click on the new programme that you would like to start working on\n\n";
        } else {
            str6 = "(1) Click on the three dots beside the bell icon on your home screen\n(2) Then, click on the “Profile” option in this menu\n(3) Now, click on the “Settings” gear icon at the top\n(3) Choose the “Switch Programme” option\n(4) Finally, you land on a screen wherein you can choose the programme you would like to start working on.\n\n";
        }
        arrayList.add(new a(false, "Can I switch programmes before I complete the one I have already selected?", j.u0("\n     If you would like to change the programme you are currently working on, you can do so by:\n     \n     " + str6 + "\n     ")));
        arrayList.add(new a(false, "Can I track my progress over a period of time?", "The app allows you to track your progress on a daily basis in order for you to identify trends and patterns in the way you think and feel. There are also regular assessments for you to evaluate your progress over time.\n"));
        arrayList.add(new a(false, "What is the science behind the Amaha experience?", "Amaha is rooted in the science of Cognitive Behavioral Therapy, combined with relaxation and wellness techniques. These are recommended tools for managing stress, anxiety and depression. As an app, Amaha distills these techniques into simple daily activities that you can even practise in quick, 5 minute breaks during a busy day.\n"));
        arrayList.add(new a(false, "Shouldn’t I speak a therapist in a face-to-face setting? How effective are the app learning modules?", "Studies have shown that computerized or internet-based CBT is as effective as in-person therapy, with the same long lasting effects.\n"));
        if (this.f10404w) {
            str7 = "";
        } else {
            str7 = "However, if you are currently completing a 4-week plan, you will be asked to complete your Daily Task.\n";
        }
        arrayList.add(new a(false, "Can I log on to the app anytime?", "The Amaha Wellness App is accessible everyday and at all times.".concat(str7)));
        arrayList.add(new a(false, "What if I am not experiencing any difficulties right now?", "The Amaha Wellness App is designed to help people struggling with a number of difficulties but it also helps you engage in healthier habits, thinking and behaviour. You can use it to practise relaxation activities, read interesting articles or even track the way you are feeling.\n"));
        arrayList.add(new a(false, "Will my profile and inputs be private? Does Amaha take steps to secure my data?", "Yes. Amaha employs industry-standard Secure Socket Layer (SSL) and Hypertext Transfer Protocol Secure (HTTPS) encryption measures for all data exchanged between our clients and our application. For more information, please refer to our Privacy Policy.\n"));
        arrayList.add(new a(false, "Why isn’t Amaha app completely free?", "We understand that not everyone can afford access to counselling. However, Amaha has a small team that works hard to provide our users with a valuable product and experience. We are committed to build the best experience for you and help you live better. Unfortunately, we cannot do that unless we charge a nominal price for our effort.\n"));
        arrayList.add(new a(false, "What if I don’t find the App useful?", "You could try face-to-face sessions instead by booking a counselling session with any of our in-house therapists on our mobile application.\n"));
        arrayList.add(new a(false, "What are the additional features in the premium plan?", "If you are a user on the premium plan, you get the following additional features:\n\n(1) Expert Guidance: You can chat with an assigned guide who is trained to help you deal with any problems or questions you might have. \n(2) Personalisation: Amaha customises your journey within the app depending on your assessment results and your inputs.\n(3) Sessions: You can get a number of sessions via phone, online chat or video consultation with our expert team of counsellors\n"));
        return arrayList;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        super.onCreate(bundle);
        setContentView(R.layout.activity_faq);
        try {
            Window window = getWindow();
            if (Build.VERSION.SDK_INT >= 23) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
                window.setStatusBarColor(g0.a.b(this, R.color.white));
            } else {
                window.setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
            }
            if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT) && FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.DASHBOARD_LIBRARY_EXPERIMENT) != "default") {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10404w = z10;
            View findViewById = findViewById(R.id.ll_faq);
            i.e(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
            this.f10403v = (LinearLayout) findViewById;
            View findViewById2 = findViewById(R.id.header_arrow_back);
            i.e(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) findViewById2).setOnClickListener(new i0(10, this));
            Iterator<a> it = n0().iterator();
            while (it.hasNext()) {
                a next = it.next();
                boolean z11 = next.f10405a;
                String str = next.f10406b;
                if (z11) {
                    Object systemService = getSystemService("layout_inflater");
                    i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.row_community_title, (ViewGroup) null);
                    i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    View findViewById3 = constraintLayout.findViewById(R.id.faqTitle);
                    i.e(findViewById3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                    ((RobertoTextView) findViewById3).setText(str);
                    LinearLayout linearLayout = this.f10403v;
                    i.d(linearLayout);
                    linearLayout.addView(constraintLayout);
                } else {
                    Object systemService2 = getSystemService("layout_inflater");
                    i.e(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.row_faq, (ViewGroup) null);
                    i.e(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
                    LinearLayout linearLayout2 = (LinearLayout) inflate2;
                    View findViewById4 = linearLayout2.findViewById(R.id.faqQues);
                    i.e(findViewById4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                    ((RobertoTextView) findViewById4).setText(str);
                    View findViewById5 = linearLayout2.findViewById(R.id.faqAns);
                    i.e(findViewById5, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                    RobertoTextView robertoTextView = (RobertoTextView) findViewById5;
                    robertoTextView.setText(next.f10407c);
                    linearLayout2.setOnClickListener(new defpackage.a(robertoTextView, 5, this));
                    LinearLayout linearLayout3 = this.f10403v;
                    i.d(linearLayout3);
                    linearLayout3.addView(linearLayout2);
                }
            }
        } catch (Exception unused) {
            getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        }
    }
}
