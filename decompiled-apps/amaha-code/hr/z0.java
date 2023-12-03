package hr;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.Screen136Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19429u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ rr.b f19430v;

    public /* synthetic */ z0(rr.b bVar, int i6) {
        this.f19429u = i6;
        this.f19430v = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x025a A[SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        rr.b f2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i6 = this.f19429u;
        boolean z14 = false;
        rr.b bVar = this.f19430v;
        switch (i6) {
            case 0:
                a1 this$0 = (a1) bVar;
                int i10 = a1.f18121z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity = this$0.f18124w;
                if (templateActivity != null) {
                    templateActivity.onBackPressed();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 1:
                c1 this$02 = (c1) bVar;
                int i11 = c1.f18223w;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                androidx.fragment.app.p activity = this$02.getActivity();
                kotlin.jvm.internal.i.d(activity);
                activity.onBackPressed();
                return;
            case 2:
                d1 this$03 = (d1) bVar;
                int i12 = d1.f18278y;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                this$03.requireActivity().onBackPressed();
                return;
            case 3:
                l1 this$04 = (l1) bVar;
                int i13 = l1.f18722w;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                androidx.fragment.app.p activity2 = this$04.getActivity();
                kotlin.jvm.internal.i.d(activity2);
                activity2.onBackPressed();
                return;
            case 4:
                m1 this$05 = (m1) bVar;
                int i14 = m1.f18785z;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                this$05.requireActivity().onBackPressed();
                return;
            case 5:
                u1 this$06 = (u1) bVar;
                int i15 = u1.f19230x;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                Context context = this$06.getContext();
                kotlin.jvm.internal.i.d(context);
                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$06._$_findCachedViewById(R.id.ivEllipses));
                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                a1Var.f1346d = new fq.s(this$06, 13);
                a1Var.b();
                return;
            case 6:
                f2 this$07 = (f2) bVar;
                int i16 = f2.f18362w;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                androidx.fragment.app.p activity3 = this$07.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity3).I = false;
                androidx.fragment.app.p activity4 = this$07.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity4).R = true;
                androidx.fragment.app.p activity5 = this$07.getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity5).onBackPressed();
                androidx.fragment.app.p activity6 = this$07.getActivity();
                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity6).onBackPressed();
                androidx.fragment.app.p activity7 = this$07.getActivity();
                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity7).onBackPressed();
                androidx.fragment.app.p activity8 = this$07.getActivity();
                kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity8).onBackPressed();
                return;
            case 7:
                j2 this$08 = (j2) bVar;
                int i17 = j2.f18612w;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                try {
                    androidx.fragment.app.p activity9 = this$08.getActivity();
                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                    ((rr.a) activity9).t0();
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$08.f18613u, "exception on click listener", e10);
                    return;
                }
            case 8:
                o2 this$09 = (o2) bVar;
                int i18 = o2.f18909w;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                androidx.fragment.app.p activity10 = this$09.getActivity();
                kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity10).I = false;
                androidx.fragment.app.p activity11 = this$09.getActivity();
                kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity11).R = true;
                androidx.fragment.app.p activity12 = this$09.getActivity();
                kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity12).onBackPressed();
                return;
            case 9:
                l3 this$010 = (l3) bVar;
                int i19 = l3.f18737w;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                androidx.fragment.app.p activity13 = this$010.getActivity();
                if (activity13 != null) {
                    activity13.onBackPressed();
                    return;
                }
                return;
            case 10:
                m3 this$011 = (m3) bVar;
                int i20 = m3.f18806z;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                TemplateActivity templateActivity2 = this$011.f18809w;
                if (templateActivity2 != null) {
                    templateActivity2.onBackPressed();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 11:
                z3 this$012 = (z3) bVar;
                int i21 = z3.f19436w;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                androidx.fragment.app.p activity14 = this$012.getActivity();
                if (activity14 != null) {
                    activity14.finish();
                    return;
                }
                return;
            case 12:
                j4 this$013 = (j4) bVar;
                int i22 = j4.f18616w;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                androidx.fragment.app.p activity15 = this$013.getActivity();
                kotlin.jvm.internal.i.e(activity15, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                rr.a aVar = (rr.a) activity15;
                androidx.fragment.app.p activity16 = this$013.getActivity();
                kotlin.jvm.internal.i.e(activity16, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity16).W) {
                    f2Var = new h2();
                } else {
                    f2Var = new f2();
                }
                aVar.s0(f2Var);
                return;
            case 13:
                k4 this$014 = (k4) bVar;
                int i23 = k4.f18677x;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                androidx.fragment.app.p activity17 = this$014.getActivity();
                kotlin.jvm.internal.i.e(activity17, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity17).getIntent().hasExtra("source")) {
                    androidx.fragment.app.p activity18 = this$014.getActivity();
                    kotlin.jvm.internal.i.e(activity18, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (r1.b0.c((TemplateActivity) activity18, "source", "goals")) {
                        androidx.fragment.app.p activity19 = this$014.getActivity();
                        kotlin.jvm.internal.i.e(activity19, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        Goal y02 = ((TemplateActivity) activity19).y0();
                        kotlin.jvm.internal.i.d(y02);
                        if (!is.k.Q1(y02.getGoalId(), new String[]{"pIjSaq3mFoJJuwZZr1BW", "hFSM0DtKqmPlpmt7bTE4"})) {
                            androidx.fragment.app.p activity20 = this$014.getActivity();
                            kotlin.jvm.internal.i.e(activity20, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity20).Q = true;
                            androidx.fragment.app.p activity21 = this$014.getActivity();
                            kotlin.jvm.internal.i.e(activity21, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity21).s0(new m4());
                            return;
                        }
                    }
                }
                TemplateActivity templateActivity3 = this$014.f18679v;
                if (templateActivity3 != null) {
                    templateActivity3.onBackPressed();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 14:
                m4 this$015 = (m4) bVar;
                int i24 = m4.f18820z;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                this$015.J().getOnBackPressedDispatcher().b();
                return;
            case 15:
                s4 this$016 = (s4) bVar;
                int i25 = s4.f19143z;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                this$016.f19145v++;
                this$016.K();
                return;
            case 16:
                t4 this$017 = (t4) bVar;
                int i26 = t4.f19199w;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                androidx.fragment.app.p activity22 = this$017.getActivity();
                kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity22).s0(new u4());
                return;
            case 17:
                w4 this$018 = (w4) bVar;
                int i27 = w4.f19344w;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                androidx.fragment.app.p activity23 = this$018.getActivity();
                kotlin.jvm.internal.i.e(activity23, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity23).onBackPressed();
                return;
            case 18:
                f5 this$019 = (f5) bVar;
                int i28 = f5.E;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                boolean z15 = !this$019.f18373w;
                this$019.f18373w = z15;
                try {
                    if (z15) {
                        g5 g5Var = new g5(this$019, this$019.f18374x);
                        this$019.f18372v = g5Var;
                        g5Var.start();
                        ((AppCompatImageView) this$019._$_findCachedViewById(R.id.img_play_pause)).setImageResource(R.drawable.anim_play_to_pause);
                    } else {
                        g5 g5Var2 = this$019.f18372v;
                        kotlin.jvm.internal.i.d(g5Var2);
                        g5Var2.cancel();
                        ((AppCompatImageView) this$019._$_findCachedViewById(R.id.img_play_pause)).setImageResource(R.drawable.anim_pause_to_play);
                    }
                    if (((AppCompatImageView) this$019._$_findCachedViewById(R.id.img_play_pause)).getDrawable() instanceof Animatable) {
                        Drawable drawable = ((AppCompatImageView) this$019._$_findCachedViewById(R.id.img_play_pause)).getDrawable();
                        kotlin.jvm.internal.i.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
                        ((Animatable) drawable).start();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$019.f18371u, "exception in change count down state", e11);
                    return;
                }
            case 19:
                i5 this$020 = (i5) bVar;
                int i29 = i5.A;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                String valueOf = String.valueOf(((RobertoEditText) this$020._$_findCachedViewById(R.id.etS12Edit)).getText());
                if (valueOf.length() == 0) {
                    z14 = true;
                }
                if (z14) {
                    Utils.INSTANCE.showCustomToast(this$020.getActivity(), "Enter Text");
                    return;
                }
                ((RobertoEditText) this$020._$_findCachedViewById(R.id.etS12Edit)).setText("");
                this$020.K(valueOf);
                return;
            case 20:
                k5 this$021 = (k5) bVar;
                int i30 = k5.B;
                kotlin.jvm.internal.i.g(this$021, "this$0");
                ArrayList<Integer> arrayList = this$021.f18685y;
                int size = arrayList.size();
                int i31 = this$021.f18682v;
                ArrayList<Screen136Model> arrayList2 = this$021.f18684x;
                if (size > i31) {
                    arrayList.set(i31, Integer.valueOf(((AppCompatSeekBar) this$021._$_findCachedViewById(R.id.S136Seekbar)).getProgress()));
                    arrayList2.get(this$021.f18682v).setRank(((AppCompatSeekBar) this$021._$_findCachedViewById(R.id.S136Seekbar)).getProgress());
                } else {
                    Screen136Model screen136Model = new Screen136Model();
                    screen136Model.setHeadingTxt(((RobertoTextView) this$021._$_findCachedViewById(R.id.tvS136Heading)).getText().toString());
                    screen136Model.setRank(((AppCompatSeekBar) this$021._$_findCachedViewById(R.id.S136Seekbar)).getProgress());
                    arrayList.add(Integer.valueOf(screen136Model.getRank()));
                    arrayList2.add(screen136Model);
                }
                int i32 = this$021.f18682v + 1;
                this$021.f18682v = i32;
                if (i32 < 4) {
                    this$021.O();
                    return;
                }
                try {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<Screen136Model> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(it.next().getHeadingTxt());
                    }
                    if (arrayList2.size() > 1) {
                        is.p.P1(arrayList2, new j5());
                    }
                    int rank = arrayList2.get(0).getRank();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<Screen136Model> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Screen136Model next = it2.next();
                        if (next.getRank() == rank) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            arrayList5.add(next);
                        }
                    }
                    arrayList4.addAll(arrayList5);
                    while (true) {
                        rank--;
                        if (rank > 0) {
                            if (!arrayList2.isEmpty()) {
                                Iterator<Screen136Model> it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    if (it3.next().getRank() == rank) {
                                        z10 = true;
                                        continue;
                                    } else {
                                        z10 = false;
                                        continue;
                                    }
                                    if (z10) {
                                        z11 = true;
                                        continue;
                                        if (z11) {
                                            ArrayList arrayList6 = new ArrayList();
                                            Iterator<Screen136Model> it4 = arrayList2.iterator();
                                            while (it4.hasNext()) {
                                                Screen136Model next2 = it4.next();
                                                if (next2.getRank() == rank) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (z12) {
                                                    arrayList6.add(next2);
                                                }
                                            }
                                            arrayList4.addAll(arrayList6);
                                        }
                                    }
                                }
                            }
                            z11 = false;
                            continue;
                            if (z11) {
                            }
                        }
                    }
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        ((Screen136Model) it5.next()).setIncluded(true);
                    }
                    this$021.f18682v = 0;
                    androidx.fragment.app.p activity24 = this$021.getActivity();
                    kotlin.jvm.internal.i.e(activity24, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    TemplateActivity templateActivity4 = (TemplateActivity) activity24;
                    templateActivity4.F.put("model_136_list", arrayList4);
                    templateActivity4.F.put("model_136_original_list", arrayList3);
                    templateActivity4.s0(new z6());
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$021.f18681u, "exception", e12);
                }
                arrayList2.clear();
                arrayList.clear();
                this$021.M();
                return;
            case 21:
                q5 this$022 = (q5) bVar;
                int i33 = q5.f19017w;
                kotlin.jvm.internal.i.g(this$022, "this$0");
                Context context2 = this$022.getContext();
                kotlin.jvm.internal.i.d(context2);
                androidx.appcompat.widget.a1 a1Var2 = new androidx.appcompat.widget.a1(context2, (ImageView) this$022._$_findCachedViewById(R.id.ivEllipses));
                a1Var2.a().inflate(R.menu.logs_menu, a1Var2.f1344b);
                a1Var2.f1346d = new fq.s(this$022, 24);
                a1Var2.b();
                return;
            case 22:
                s5 this$023 = (s5) bVar;
                int i34 = s5.f19149x;
                kotlin.jvm.internal.i.g(this$023, "this$0");
                String valueOf2 = String.valueOf(((RobertoEditText) this$023._$_findCachedViewById(R.id.etS145Edit)).getText());
                if (valueOf2.length() == 0) {
                    z14 = true;
                }
                if (z14) {
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity25 = this$023.getActivity();
                    String string = this$023.getString(R.string.enter_text);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.enter_text)");
                    utils.showCustomToast(activity25, string);
                    return;
                }
                ((RobertoEditText) this$023._$_findCachedViewById(R.id.etS145Edit)).setText("");
                this$023.J(valueOf2);
                return;
            case 23:
                w5 this$024 = (w5) bVar;
                int i35 = w5.f19347w;
                kotlin.jvm.internal.i.g(this$024, "this$0");
                Context context3 = this$024.getContext();
                kotlin.jvm.internal.i.d(context3);
                androidx.appcompat.widget.a1 a1Var3 = new androidx.appcompat.widget.a1(context3, (ImageView) this$024._$_findCachedViewById(R.id.ivEllipses));
                a1Var3.a().inflate(R.menu.logs_menu, a1Var3.f1344b);
                a1Var3.f1346d = new fq.s(this$024, 27);
                a1Var3.b();
                return;
            case 24:
                h6 this$025 = (h6) bVar;
                int i36 = h6.f18533w;
                kotlin.jvm.internal.i.g(this$025, "this$0");
                Context context4 = this$025.getContext();
                kotlin.jvm.internal.i.d(context4);
                androidx.appcompat.widget.a1 a1Var4 = new androidx.appcompat.widget.a1(context4, (ImageView) this$025._$_findCachedViewById(R.id.ivEllipses));
                a1Var4.a().inflate(R.menu.logs_menu, a1Var4.f1344b);
                a1Var4.f1346d = new hd.a(0, this$025);
                a1Var4.b();
                return;
            case 25:
                s6 this$026 = (s6) bVar;
                int i37 = s6.f19154z;
                kotlin.jvm.internal.i.g(this$026, "this$0");
                androidx.fragment.app.p activity26 = this$026.getActivity();
                if (activity26 != null) {
                    activity26.onBackPressed();
                    return;
                }
                return;
            case 26:
                z6 this$027 = (z6) bVar;
                int i38 = z6.f19444w;
                kotlin.jvm.internal.i.g(this$027, "this$0");
                Context context5 = this$027.getContext();
                kotlin.jvm.internal.i.d(context5);
                androidx.appcompat.widget.a1 a1Var5 = new androidx.appcompat.widget.a1(context5, (ImageView) this$027._$_findCachedViewById(R.id.ivEllipses));
                a1Var5.a().inflate(R.menu.logs_menu, a1Var5.f1344b);
                a1Var5.f1346d = new hd.a(2, this$027);
                a1Var5.b();
                return;
            case 27:
                h7 this$028 = (h7) bVar;
                int i39 = h7.B;
                kotlin.jvm.internal.i.g(this$028, "this$0");
                androidx.fragment.app.p activity27 = this$028.getActivity();
                kotlin.jvm.internal.i.e(activity27, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity27).o0();
                return;
            case 28:
                t7 this$029 = (t7) bVar;
                int i40 = t7.f19206w;
                kotlin.jvm.internal.i.g(this$029, "this$0");
                androidx.fragment.app.p activity28 = this$029.getActivity();
                if (activity28 != null) {
                    activity28.onBackPressed();
                    return;
                }
                return;
            default:
                c8 this$030 = (c8) bVar;
                int i41 = c8.f18261w;
                kotlin.jvm.internal.i.g(this$030, "this$0");
                Context context6 = this$030.getContext();
                kotlin.jvm.internal.i.d(context6);
                androidx.appcompat.widget.a1 a1Var6 = new androidx.appcompat.widget.a1(context6, (ImageView) this$030._$_findCachedViewById(R.id.ivEllipses));
                a1Var6.a().inflate(R.menu.logs_menu, a1Var6.f1344b);
                a1Var6.f1346d = new hd.a(7, this$030);
                a1Var6.b();
                return;
        }
    }
}
