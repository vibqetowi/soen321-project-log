package zk;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.conditionSelection.activity.ConditionSelectionA3Activity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import gv.r;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import r1.b0;
/* compiled from: ConditionSelectionA3CourseSelectionFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzk/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f39420x = 0;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f39422v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f39423w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public String f39421u = Constants.COURSE_DEPRESSION;

    public b() {
        Object obj;
        HashMap<String, Object> appConfig;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (appConfig = user.getAppConfig()) != null) {
            obj = appConfig.get(Constants.NEW_COURSES_EXPERIMENT);
        } else {
            obj = null;
        }
        String str = obj instanceof String ? (String) obj : null;
        this.f39422v = kotlin.jvm.internal.i.b(str == null ? "default" : str, "variant_a");
    }

    public final void J(String str) {
        String str2 = this.f39421u;
        MotionLayout motionLayout = null;
        switch (str2.hashCode()) {
            case -2114782937:
                if (str2.equals(Constants.COURSE_HAPPINESS)) {
                    View _$_findCachedViewById = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                    if (_$_findCachedViewById instanceof MotionLayout) {
                        motionLayout = (MotionLayout) _$_findCachedViewById;
                    }
                    if (motionLayout != null) {
                        motionLayout.A();
                        break;
                    }
                }
                break;
            case -1617042330:
                if (str2.equals(Constants.COURSE_DEPRESSION)) {
                    View _$_findCachedViewById2 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
                    if (_$_findCachedViewById2 instanceof MotionLayout) {
                        motionLayout = (MotionLayout) _$_findCachedViewById2;
                    }
                    if (motionLayout != null) {
                        motionLayout.A();
                        break;
                    }
                }
                break;
            case -891989580:
                if (str2.equals(Constants.COURSE_STRESS)) {
                    View _$_findCachedViewById3 = _$_findCachedViewById(R.id.rowCsaCourseStress);
                    if (_$_findCachedViewById3 instanceof MotionLayout) {
                        motionLayout = (MotionLayout) _$_findCachedViewById3;
                    }
                    if (motionLayout != null) {
                        motionLayout.A();
                        break;
                    }
                }
                break;
            case 109840:
                if (str2.equals(Constants.COURSE_OCD)) {
                    View _$_findCachedViewById4 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                    if (_$_findCachedViewById4 instanceof MotionLayout) {
                        motionLayout = (MotionLayout) _$_findCachedViewById4;
                    }
                    if (motionLayout != null) {
                        motionLayout.A();
                        break;
                    }
                }
                break;
            case 2989151:
                if (str2.equals(Constants.COURSE_ADHD)) {
                    View _$_findCachedViewById5 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                    if (_$_findCachedViewById5 instanceof MotionLayout) {
                        motionLayout = (MotionLayout) _$_findCachedViewById5;
                    }
                    if (motionLayout != null) {
                        motionLayout.A();
                        break;
                    }
                }
                break;
            case 92960775:
                if (str2.equals(Constants.COURSE_ANGER)) {
                    View _$_findCachedViewById6 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
                    if (_$_findCachedViewById6 instanceof MotionLayout) {
                        motionLayout = (MotionLayout) _$_findCachedViewById6;
                    }
                    if (motionLayout != null) {
                        motionLayout.A();
                        break;
                    }
                }
                break;
            case 109522647:
                if (str2.equals(Constants.COURSE_SLEEP)) {
                    View _$_findCachedViewById7 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                    if (_$_findCachedViewById7 instanceof MotionLayout) {
                        motionLayout = (MotionLayout) _$_findCachedViewById7;
                    }
                    if (motionLayout != null) {
                        motionLayout.A();
                        break;
                    }
                }
                break;
            case 113319009:
                if (str2.equals(Constants.COURSE_WORRY)) {
                    View _$_findCachedViewById8 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                    if (_$_findCachedViewById8 instanceof MotionLayout) {
                        motionLayout = (MotionLayout) _$_findCachedViewById8;
                    }
                    if (motionLayout != null) {
                        motionLayout.A();
                        break;
                    }
                }
                break;
        }
        this.f39421u = str;
        String str3 = gk.a.f16573a;
        Bundle f = defpackage.e.f("a3_variant", Constants.ONBOARDING_VARIANT, "course", str);
        hs.k kVar = hs.k.f19476a;
        gk.a.b(f, "onboarding_domain_click");
    }

    public final void K(String str) {
        Object obj;
        ConditionSelectionA3Activity conditionSelectionA3Activity;
        Object obj2;
        HashMap<String, Object> appConfig = FirebasePersistence.getInstance().getUser().getAppConfig();
        ConditionSelectionA3Activity conditionSelectionA3Activity2 = null;
        String str2 = null;
        if (appConfig != null) {
            obj = appConfig.get(Constants.NEW_COURSES_EXPERIMENT);
        } else {
            obj = null;
        }
        if (kotlin.jvm.internal.i.b(obj, "variant_a")) {
            p requireActivity = requireActivity();
            if (requireActivity instanceof ConditionSelectionA3Activity) {
                conditionSelectionA3Activity = (ConditionSelectionA3Activity) requireActivity;
            } else {
                conditionSelectionA3Activity = null;
            }
            if (conditionSelectionA3Activity != null) {
                conditionSelectionA3Activity.f10643y = str;
                String str3 = gk.a.f16573a;
                Bundle a10 = b0.a("a3_variant", Constants.ONBOARDING_VARIANT);
                HashMap<String, Object> appConfig2 = FirebasePersistence.getInstance().getUser().getAppConfig();
                if (appConfig2 != null) {
                    obj2 = appConfig2.get(Constants.NEW_COURSES_EXPERIMENT);
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str2 = obj2;
                }
                a10.putString(Constants.NEW_COURSES_EXPERIMENT, str2);
                a10.putString("course", str);
                Intent intent = conditionSelectionA3Activity.getIntent();
                boolean z10 = false;
                if (intent != null) {
                    z10 = intent.getBooleanExtra("reset_flag", false);
                }
                a10.putBoolean("reset_flow", z10);
                a10.putString("source", conditionSelectionA3Activity.E);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(a10, "pre_domain_selection_new");
                conditionSelectionA3Activity.t0();
                return;
            }
            return;
        }
        p requireActivity2 = requireActivity();
        if (requireActivity2 instanceof ConditionSelectionA3Activity) {
            conditionSelectionA3Activity2 = (ConditionSelectionA3Activity) requireActivity2;
        }
        if (conditionSelectionA3Activity2 != null) {
            conditionSelectionA3Activity2.w0(str);
        }
    }

    public final void M() {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f((ConstraintLayout) _$_findCachedViewById(R.id.clCsaA3CourseSelectionParentContainer));
        bVar.h(R.id.rowCsaCourseWorry, 3, R.id.rowCsaCourseDepression, 4);
        bVar.h(R.id.rowCsaCourseADHD, 3, R.id.rowCsaCourseWorry, 4);
        bVar.h(R.id.rowCsaCourseOCD, 3, R.id.rowCsaCourseADHD, 4);
        bVar.h(R.id.rowCsaCourseStress, 3, R.id.rowCsaCourseOCD, 4);
        bVar.h(R.id.rowCsaCourseSleep, 3, R.id.rowCsaCourseStress, 4);
        bVar.h(R.id.rowCsaCourseAnger, 3, R.id.rowCsaCourseSleep, 4);
        bVar.h(R.id.rowCsaCourseHappiness, 3, R.id.rowCsaCourseAnger, 4);
        bVar.b((ConstraintLayout) _$_findCachedViewById(R.id.clCsaA3CourseSelectionParentContainer));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f39423w;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_condition_selection_a3_course_selection, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f39423w.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r1 == null) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b7, code lost:
        if (kotlin.jvm.internal.i.b(r4, com.theinnerhour.b2b.utils.Constants.COURSE_STRESS) == false) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0298, code lost:
        if (kotlin.jvm.internal.i.b(r4, com.theinnerhour.b2b.utils.Constants.COURSE_ANGER) == false) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0379, code lost:
        if (kotlin.jvm.internal.i.b(r4, com.theinnerhour.b2b.utils.Constants.COURSE_WORRY) == false) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x045a, code lost:
        if (kotlin.jvm.internal.i.b(r4, com.theinnerhour.b2b.utils.Constants.COURSE_SLEEP) == false) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x053b, code lost:
        if (kotlin.jvm.internal.i.b(r4, com.theinnerhour.b2b.utils.Constants.COURSE_HAPPINESS) == false) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x084a, code lost:
        if (kotlin.jvm.internal.i.b(r4, com.theinnerhour.b2b.utils.Constants.COURSE_HAPPINESS) == false) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x091b, code lost:
        if (kotlin.jvm.internal.i.b(r4, com.theinnerhour.b2b.utils.Constants.COURSE_HAPPINESS) == false) goto L459;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:685:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String obj;
        ConditionSelectionA3Activity conditionSelectionA3Activity;
        String str;
        boolean z10;
        View view2;
        View view3;
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2;
        RobertoTextView robertoTextView3;
        boolean z11;
        MotionLayout motionLayout;
        View _$_findCachedViewById;
        View _$_findCachedViewById2;
        View _$_findCachedViewById3;
        View view4;
        View _$_findCachedViewById4;
        RobertoTextView robertoTextView4;
        View _$_findCachedViewById5;
        RobertoTextView robertoTextView5;
        View _$_findCachedViewById6;
        RobertoTextView robertoTextView6;
        boolean z12;
        View _$_findCachedViewById7;
        MotionLayout motionLayout2;
        View _$_findCachedViewById8;
        View _$_findCachedViewById9;
        View _$_findCachedViewById10;
        View view5;
        View _$_findCachedViewById11;
        RobertoTextView robertoTextView7;
        View _$_findCachedViewById12;
        RobertoTextView robertoTextView8;
        View _$_findCachedViewById13;
        RobertoTextView robertoTextView9;
        boolean z13;
        View _$_findCachedViewById14;
        MotionLayout motionLayout3;
        View _$_findCachedViewById15;
        View _$_findCachedViewById16;
        View _$_findCachedViewById17;
        View view6;
        View _$_findCachedViewById18;
        RobertoTextView robertoTextView10;
        View _$_findCachedViewById19;
        RobertoTextView robertoTextView11;
        View _$_findCachedViewById20;
        RobertoTextView robertoTextView12;
        boolean z14;
        View _$_findCachedViewById21;
        MotionLayout motionLayout4;
        View _$_findCachedViewById22;
        View _$_findCachedViewById23;
        View _$_findCachedViewById24;
        View view7;
        View _$_findCachedViewById25;
        RobertoTextView robertoTextView13;
        View _$_findCachedViewById26;
        RobertoTextView robertoTextView14;
        View _$_findCachedViewById27;
        RobertoTextView robertoTextView15;
        boolean z15;
        View _$_findCachedViewById28;
        MotionLayout motionLayout5;
        View _$_findCachedViewById29;
        View _$_findCachedViewById30;
        View _$_findCachedViewById31;
        View _$_findCachedViewById32;
        View _$_findCachedViewById33;
        View _$_findCachedViewById34;
        View _$_findCachedViewById35;
        View _$_findCachedViewById36;
        View _$_findCachedViewById37;
        View _$_findCachedViewById38;
        View _$_findCachedViewById39;
        View _$_findCachedViewById40;
        View _$_findCachedViewById41;
        View _$_findCachedViewById42;
        View _$_findCachedViewById43;
        View _$_findCachedViewById44;
        RobertoButton robertoButton;
        View findViewById;
        RobertoButton robertoButton2;
        View findViewById2;
        RobertoButton robertoButton3;
        View findViewById3;
        RobertoButton robertoButton4;
        View findViewById4;
        RobertoButton robertoButton5;
        View findViewById5;
        RobertoButton robertoButton6;
        View findViewById6;
        RobertoButton robertoButton7;
        View findViewById7;
        RobertoButton robertoButton8;
        View findViewById8;
        View view8;
        RobertoTextView robertoTextView16;
        RobertoTextView robertoTextView17;
        RobertoTextView robertoTextView18;
        boolean z16;
        MotionLayout motionLayout6;
        View _$_findCachedViewById45;
        View _$_findCachedViewById46;
        View _$_findCachedViewById47;
        View view9;
        View _$_findCachedViewById48;
        RobertoTextView robertoTextView19;
        View _$_findCachedViewById49;
        RobertoTextView robertoTextView20;
        View _$_findCachedViewById50;
        RobertoTextView robertoTextView21;
        boolean z17;
        View _$_findCachedViewById51;
        MotionLayout motionLayout7;
        boolean z18;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        boolean z19;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        RobertoTextView robertoTextView22;
        RobertoTextView robertoTextView23;
        RobertoTextView robertoTextView24;
        RobertoTextView robertoTextView25;
        RobertoTextView robertoTextView26;
        RobertoTextView robertoTextView27;
        RobertoTextView robertoTextView28;
        RobertoTextView robertoTextView29;
        RobertoTextView robertoTextView30;
        RobertoTextView robertoTextView31;
        RobertoTextView robertoTextView32;
        RobertoTextView robertoTextView33;
        RobertoTextView robertoTextView34;
        RobertoTextView robertoTextView35;
        RobertoTextView robertoTextView36;
        RobertoTextView robertoTextView37;
        RobertoTextView robertoTextView38;
        RobertoTextView robertoTextView39;
        boolean z20;
        ColorStateList c10;
        AppCompatImageView appCompatImageView5;
        AppCompatImageView appCompatImageView6;
        boolean z21;
        ColorStateList c11;
        AppCompatImageView appCompatImageView7;
        AppCompatImageView appCompatImageView8;
        boolean z22;
        ColorStateList c12;
        AppCompatImageView appCompatImageView9;
        AppCompatImageView appCompatImageView10;
        boolean z23;
        ColorStateList c13;
        AppCompatImageView appCompatImageView11;
        AppCompatImageView appCompatImageView12;
        boolean z24;
        ColorStateList c14;
        AppCompatImageView appCompatImageView13;
        AppCompatImageView appCompatImageView14;
        ColorStateList c15;
        MotionLayout motionLayout8;
        String string;
        kotlin.jvm.internal.i.g(view, "view");
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (obj = user.getFirstName()) != null) {
            if (n.B0(obj)) {
                obj = null;
            }
        }
        String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
        kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…ionManager.KEY_FIRSTNAME)");
        obj = r.i1(stringValue).toString();
        RobertoTextView robertoTextView40 = (RobertoTextView) _$_findCachedViewById(R.id.tvCsaA3CourseSelectionHeader);
        if (robertoTextView40 != null) {
            if (!n.B0(obj)) {
                string = getString(R.string.a3VarACourseSelectionTitle, obj);
            } else {
                string = getString(R.string.a3VarACourseSelectionTitleFallback);
            }
            robertoTextView40.setText(string);
        }
        boolean z25 = this.f39422v;
        if (z25) {
            M();
        }
        p requireActivity = requireActivity();
        if (requireActivity instanceof ConditionSelectionA3Activity) {
            conditionSelectionA3Activity = (ConditionSelectionA3Activity) requireActivity;
        } else {
            conditionSelectionA3Activity = null;
        }
        if (conditionSelectionA3Activity != null) {
            str = conditionSelectionA3Activity.f10643y;
        } else {
            str = null;
        }
        if (str != null && !n.B0(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !kotlin.jvm.internal.i.b(str, Constants.COURSE_DEPRESSION)) {
            View _$_findCachedViewById52 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
            if (_$_findCachedViewById52 instanceof MotionLayout) {
                motionLayout8 = (MotionLayout) _$_findCachedViewById52;
            } else {
                motionLayout8 = null;
            }
            if (motionLayout8 != null) {
                motionLayout8.setProgress(1.0f);
            }
            this.f39421u = str;
        }
        View _$_findCachedViewById53 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
        if (_$_findCachedViewById53 != null) {
            view2 = _$_findCachedViewById53.findViewById(R.id.tvCsaA3CourseSelectionCourseBg);
        } else {
            view2 = null;
        }
        if (view2 != null) {
            if (z25) {
                c15 = g0.a.c(R.color.onboardingAssessmentDepressionOnboardingExperiment, requireContext());
            } else {
                c15 = g0.a.c(R.color.onboardingAssessmentDepression, requireContext());
            }
            view2.setBackgroundTintList(c15);
        }
        View _$_findCachedViewById54 = _$_findCachedViewById(R.id.rowCsaCourseStress);
        if (_$_findCachedViewById54 != null && (appCompatImageView14 = (AppCompatImageView) _$_findCachedViewById54.findViewById(R.id.tvCsaA3CourseSelectionCourseImage1)) != null) {
            appCompatImageView14.setImageResource(R.drawable.ic_csa_a3_stress_1);
            hs.k kVar = hs.k.f19476a;
        }
        View _$_findCachedViewById55 = _$_findCachedViewById(R.id.rowCsaCourseStress);
        if (_$_findCachedViewById55 != null && (appCompatImageView13 = (AppCompatImageView) _$_findCachedViewById55.findViewById(R.id.tvCsaA3CourseSelectionCourseImage2)) != null) {
            appCompatImageView13.setImageResource(R.drawable.ic_csa_a3_stress_2);
            hs.k kVar2 = hs.k.f19476a;
        }
        View _$_findCachedViewById56 = _$_findCachedViewById(R.id.rowCsaCourseStress);
        if (_$_findCachedViewById56 != null) {
            view3 = _$_findCachedViewById56.findViewById(R.id.tvCsaA3CourseSelectionCourseBg);
        } else {
            view3 = null;
        }
        if (view3 != null) {
            if (z25) {
                c14 = g0.a.c(R.color.onboardingAssessmentStressOnboardingExperiment, requireContext());
            } else {
                c14 = g0.a.c(R.color.onboardingAssessmentStress, requireContext());
            }
            view3.setBackgroundTintList(c14);
        }
        View _$_findCachedViewById57 = _$_findCachedViewById(R.id.rowCsaCourseStress);
        if (_$_findCachedViewById57 != null) {
            robertoTextView = (RobertoTextView) _$_findCachedViewById57.findViewById(R.id.tvCsaA3CourseSelectionCourseHeader);
        } else {
            robertoTextView = null;
        }
        if (robertoTextView != null) {
            robertoTextView.setText(getString(R.string.a3VarACourseSelectionStressTitle));
        }
        View _$_findCachedViewById58 = _$_findCachedViewById(R.id.rowCsaCourseStress);
        if (_$_findCachedViewById58 != null) {
            robertoTextView2 = (RobertoTextView) _$_findCachedViewById58.findViewById(R.id.tvCsaA3CourseSelectionCourseBody1);
        } else {
            robertoTextView2 = null;
        }
        if (robertoTextView2 != null) {
            robertoTextView2.setText(getString(R.string.a3VarACourseSelectionStressSubTitle1));
        }
        View _$_findCachedViewById59 = _$_findCachedViewById(R.id.rowCsaCourseStress);
        if (_$_findCachedViewById59 != null) {
            robertoTextView3 = (RobertoTextView) _$_findCachedViewById59.findViewById(R.id.tvCsaA3CourseSelectionCourseBody2);
        } else {
            robertoTextView3 = null;
        }
        if (robertoTextView3 != null) {
            robertoTextView3.setText(getString(R.string.a3VarACourseSelectionStressSubTitle2));
        }
        if (str != null && !n.B0(str)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            if (str != null && !n.B0(str)) {
                z24 = false;
            } else {
                z24 = true;
            }
            if (!z24) {
            }
            _$_findCachedViewById = _$_findCachedViewById(R.id.rowCsaCourseAnger);
            if (_$_findCachedViewById != null && (appCompatImageView12 = (AppCompatImageView) _$_findCachedViewById.findViewById(R.id.tvCsaA3CourseSelectionCourseImage1)) != null) {
                appCompatImageView12.setImageResource(R.drawable.ic_csa_a3_anger_1);
                hs.k kVar3 = hs.k.f19476a;
            }
            _$_findCachedViewById2 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
            if (_$_findCachedViewById2 != null && (appCompatImageView11 = (AppCompatImageView) _$_findCachedViewById2.findViewById(R.id.tvCsaA3CourseSelectionCourseImage2)) != null) {
                appCompatImageView11.setImageResource(R.drawable.ic_csa_a3_anger_2);
                hs.k kVar4 = hs.k.f19476a;
            }
            _$_findCachedViewById3 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
            if (_$_findCachedViewById3 == null) {
                view4 = _$_findCachedViewById3.findViewById(R.id.tvCsaA3CourseSelectionCourseBg);
            } else {
                view4 = null;
            }
            if (view4 != null) {
                if (z25) {
                    c13 = g0.a.c(R.color.onboardingAssessmentAngerOnboardingExperiment, requireContext());
                } else {
                    c13 = g0.a.c(R.color.onboardingAssessmentAnger, requireContext());
                }
                view4.setBackgroundTintList(c13);
            }
            _$_findCachedViewById4 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
            if (_$_findCachedViewById4 == null) {
                robertoTextView4 = (RobertoTextView) _$_findCachedViewById4.findViewById(R.id.tvCsaA3CourseSelectionCourseHeader);
            } else {
                robertoTextView4 = null;
            }
            if (robertoTextView4 != null) {
                robertoTextView4.setText(getString(R.string.a3VarACourseSelectionAngerTitle));
            }
            _$_findCachedViewById5 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
            if (_$_findCachedViewById5 == null) {
                robertoTextView5 = (RobertoTextView) _$_findCachedViewById5.findViewById(R.id.tvCsaA3CourseSelectionCourseBody1);
            } else {
                robertoTextView5 = null;
            }
            if (robertoTextView5 != null) {
                robertoTextView5.setText(getString(R.string.a3VarACourseSelectionAngerSubTitle1));
            }
            _$_findCachedViewById6 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
            if (_$_findCachedViewById6 == null) {
                robertoTextView6 = (RobertoTextView) _$_findCachedViewById6.findViewById(R.id.tvCsaA3CourseSelectionCourseBody2);
            } else {
                robertoTextView6 = null;
            }
            if (robertoTextView6 != null) {
                robertoTextView6.setText(getString(R.string.a3VarACourseSelectionAngerSubTitle2));
            }
            if (str == null && !n.B0(str)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z12) {
                if (str != null && !n.B0(str)) {
                    z23 = false;
                } else {
                    z23 = true;
                }
                if (!z23) {
                }
                _$_findCachedViewById8 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                if (_$_findCachedViewById8 != null && (appCompatImageView10 = (AppCompatImageView) _$_findCachedViewById8.findViewById(R.id.tvCsaA3CourseSelectionCourseImage1)) != null) {
                    appCompatImageView10.setImageResource(R.drawable.ic_csa_a3_worry_1);
                    hs.k kVar5 = hs.k.f19476a;
                }
                _$_findCachedViewById9 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                if (_$_findCachedViewById9 != null && (appCompatImageView9 = (AppCompatImageView) _$_findCachedViewById9.findViewById(R.id.tvCsaA3CourseSelectionCourseImage2)) != null) {
                    appCompatImageView9.setImageResource(R.drawable.ic_csa_a3_worry_2);
                    hs.k kVar6 = hs.k.f19476a;
                }
                _$_findCachedViewById10 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                if (_$_findCachedViewById10 != null) {
                    view5 = _$_findCachedViewById10.findViewById(R.id.tvCsaA3CourseSelectionCourseBg);
                } else {
                    view5 = null;
                }
                if (view5 != null) {
                    if (z25) {
                        c12 = g0.a.c(R.color.onboardingAssessmentWorryOnboardingExperiment, requireContext());
                    } else {
                        c12 = g0.a.c(R.color.onboardingAssessmentWorry, requireContext());
                    }
                    view5.setBackgroundTintList(c12);
                }
                _$_findCachedViewById11 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                if (_$_findCachedViewById11 != null) {
                    robertoTextView7 = (RobertoTextView) _$_findCachedViewById11.findViewById(R.id.tvCsaA3CourseSelectionCourseHeader);
                } else {
                    robertoTextView7 = null;
                }
                if (robertoTextView7 != null) {
                    robertoTextView7.setText(getString(R.string.a3VarACourseSelectionWorryTitle));
                }
                _$_findCachedViewById12 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                if (_$_findCachedViewById12 != null) {
                    robertoTextView8 = (RobertoTextView) _$_findCachedViewById12.findViewById(R.id.tvCsaA3CourseSelectionCourseBody1);
                } else {
                    robertoTextView8 = null;
                }
                if (robertoTextView8 != null) {
                    robertoTextView8.setText(getString(R.string.a3VarACourseSelectionWorrySubTitle1));
                }
                _$_findCachedViewById13 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                if (_$_findCachedViewById13 != null) {
                    robertoTextView9 = (RobertoTextView) _$_findCachedViewById13.findViewById(R.id.tvCsaA3CourseSelectionCourseBody2);
                } else {
                    robertoTextView9 = null;
                }
                if (robertoTextView9 != null) {
                    robertoTextView9.setText(getString(R.string.a3VarACourseSelectionWorrySubTitle2));
                }
                if (str == null && !n.B0(str)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (!z13) {
                    if (str != null && !n.B0(str)) {
                        z22 = false;
                    } else {
                        z22 = true;
                    }
                    if (!z22) {
                    }
                    _$_findCachedViewById15 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                    if (_$_findCachedViewById15 != null && (appCompatImageView8 = (AppCompatImageView) _$_findCachedViewById15.findViewById(R.id.tvCsaA3CourseSelectionCourseImage1)) != null) {
                        appCompatImageView8.setImageResource(R.drawable.ic_csa_a3_sleep_1);
                        hs.k kVar7 = hs.k.f19476a;
                    }
                    _$_findCachedViewById16 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                    if (_$_findCachedViewById16 != null && (appCompatImageView7 = (AppCompatImageView) _$_findCachedViewById16.findViewById(R.id.tvCsaA3CourseSelectionCourseImage2)) != null) {
                        appCompatImageView7.setImageResource(R.drawable.ic_csa_a3_sleep_2);
                        hs.k kVar8 = hs.k.f19476a;
                    }
                    _$_findCachedViewById17 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                    if (_$_findCachedViewById17 == null) {
                        view6 = _$_findCachedViewById17.findViewById(R.id.tvCsaA3CourseSelectionCourseBg);
                    } else {
                        view6 = null;
                    }
                    if (view6 != null) {
                        if (z25) {
                            c11 = g0.a.c(R.color.onboardingAssessmentSleepOnboardingExperiment, requireContext());
                        } else {
                            c11 = g0.a.c(R.color.onboardingAssessmentSleep, requireContext());
                        }
                        view6.setBackgroundTintList(c11);
                    }
                    _$_findCachedViewById18 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                    if (_$_findCachedViewById18 == null) {
                        robertoTextView10 = (RobertoTextView) _$_findCachedViewById18.findViewById(R.id.tvCsaA3CourseSelectionCourseHeader);
                    } else {
                        robertoTextView10 = null;
                    }
                    if (robertoTextView10 != null) {
                        robertoTextView10.setText(getString(R.string.a3VarACourseSelectionSleepTitle));
                    }
                    _$_findCachedViewById19 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                    if (_$_findCachedViewById19 == null) {
                        robertoTextView11 = (RobertoTextView) _$_findCachedViewById19.findViewById(R.id.tvCsaA3CourseSelectionCourseBody1);
                    } else {
                        robertoTextView11 = null;
                    }
                    if (robertoTextView11 != null) {
                        robertoTextView11.setText(getString(R.string.a3VarACourseSelectionSleepSubTitle1));
                    }
                    _$_findCachedViewById20 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                    if (_$_findCachedViewById20 == null) {
                        robertoTextView12 = (RobertoTextView) _$_findCachedViewById20.findViewById(R.id.tvCsaA3CourseSelectionCourseBody2);
                    } else {
                        robertoTextView12 = null;
                    }
                    if (robertoTextView12 != null) {
                        robertoTextView12.setText(getString(R.string.a3VarACourseSelectionSleepSubTitle2));
                    }
                    if (str == null && !n.B0(str)) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (!z14) {
                        if (str != null && !n.B0(str)) {
                            z21 = false;
                        } else {
                            z21 = true;
                        }
                        if (!z21) {
                        }
                        _$_findCachedViewById22 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                        if (_$_findCachedViewById22 != null && (appCompatImageView6 = (AppCompatImageView) _$_findCachedViewById22.findViewById(R.id.tvCsaA3CourseSelectionCourseImage1)) != null) {
                            appCompatImageView6.setImageResource(R.drawable.ic_csa_a3_happiness_1);
                            hs.k kVar9 = hs.k.f19476a;
                        }
                        _$_findCachedViewById23 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                        if (_$_findCachedViewById23 != null && (appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById23.findViewById(R.id.tvCsaA3CourseSelectionCourseImage2)) != null) {
                            appCompatImageView5.setImageResource(R.drawable.ic_csa_a3_happiness_2);
                            hs.k kVar10 = hs.k.f19476a;
                        }
                        _$_findCachedViewById24 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                        if (_$_findCachedViewById24 != null) {
                            view7 = _$_findCachedViewById24.findViewById(R.id.tvCsaA3CourseSelectionCourseBg);
                        } else {
                            view7 = null;
                        }
                        if (view7 != null) {
                            if (z25) {
                                c10 = g0.a.c(R.color.onboardingAssessmentHappinessOnboardingExperiment, requireContext());
                            } else {
                                c10 = g0.a.c(R.color.onboardingAssessmentHappiness, requireContext());
                            }
                            view7.setBackgroundTintList(c10);
                        }
                        _$_findCachedViewById25 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                        if (_$_findCachedViewById25 != null) {
                            robertoTextView13 = (RobertoTextView) _$_findCachedViewById25.findViewById(R.id.tvCsaA3CourseSelectionCourseHeader);
                        } else {
                            robertoTextView13 = null;
                        }
                        if (robertoTextView13 != null) {
                            robertoTextView13.setText(getString(R.string.a3VarACourseSelectionHappinessTitle));
                        }
                        _$_findCachedViewById26 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                        if (_$_findCachedViewById26 != null) {
                            robertoTextView14 = (RobertoTextView) _$_findCachedViewById26.findViewById(R.id.tvCsaA3CourseSelectionCourseBody1);
                        } else {
                            robertoTextView14 = null;
                        }
                        if (robertoTextView14 != null) {
                            robertoTextView14.setText(getString(R.string.a3VarACourseSelectionHappinessSubTitle1));
                        }
                        _$_findCachedViewById27 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                        if (_$_findCachedViewById27 != null) {
                            robertoTextView15 = (RobertoTextView) _$_findCachedViewById27.findViewById(R.id.tvCsaA3CourseSelectionCourseBody2);
                        } else {
                            robertoTextView15 = null;
                        }
                        if (robertoTextView15 != null) {
                            robertoTextView15.setText(getString(R.string.a3VarACourseSelectionHappinessSubTitle2));
                        }
                        if (str == null && !n.B0(str)) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (!z15) {
                            if (str != null && !n.B0(str)) {
                                z20 = false;
                            } else {
                                z20 = true;
                            }
                            if (!z20) {
                            }
                            if (z25) {
                                View _$_findCachedViewById60 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                                if (_$_findCachedViewById60 != null) {
                                    _$_findCachedViewById60.setVisibility(0);
                                }
                                View _$_findCachedViewById61 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                if (_$_findCachedViewById61 != null) {
                                    _$_findCachedViewById61.setVisibility(0);
                                }
                                RobertoTextView robertoTextView41 = (RobertoTextView) _$_findCachedViewById(R.id.tvCsaA3CourseSelectionHeader);
                                if (robertoTextView41 != null) {
                                    robertoTextView41.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar11 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById62 = _$_findCachedViewById(R.id.rowCsaCourseStress);
                                if (_$_findCachedViewById62 != null && (robertoTextView39 = (RobertoTextView) _$_findCachedViewById62.findViewById(R.id.tvCsaA3CourseSelectionCourseHeader)) != null) {
                                    robertoTextView39.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar12 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById63 = _$_findCachedViewById(R.id.rowCsaCourseStress);
                                if (_$_findCachedViewById63 != null && (robertoTextView38 = (RobertoTextView) _$_findCachedViewById63.findViewById(R.id.tvCsaA3CourseSelectionCourseBody1)) != null) {
                                    robertoTextView38.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar13 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById64 = _$_findCachedViewById(R.id.rowCsaCourseStress);
                                if (_$_findCachedViewById64 != null && (robertoTextView37 = (RobertoTextView) _$_findCachedViewById64.findViewById(R.id.tvCsaA3CourseSelectionCourseBody2)) != null) {
                                    robertoTextView37.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar14 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById65 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
                                if (_$_findCachedViewById65 != null && (robertoTextView36 = (RobertoTextView) _$_findCachedViewById65.findViewById(R.id.tvCsaA3CourseSelectionCourseHeader)) != null) {
                                    robertoTextView36.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar15 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById66 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
                                if (_$_findCachedViewById66 != null && (robertoTextView35 = (RobertoTextView) _$_findCachedViewById66.findViewById(R.id.tvCsaA3CourseSelectionCourseBody1)) != null) {
                                    robertoTextView35.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar16 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById67 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
                                if (_$_findCachedViewById67 != null && (robertoTextView34 = (RobertoTextView) _$_findCachedViewById67.findViewById(R.id.tvCsaA3CourseSelectionCourseBody2)) != null) {
                                    robertoTextView34.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar17 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById68 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                if (_$_findCachedViewById68 != null && (robertoTextView33 = (RobertoTextView) _$_findCachedViewById68.findViewById(R.id.tvCsaA3CourseSelectionCourseHeader)) != null) {
                                    robertoTextView33.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar18 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById69 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                if (_$_findCachedViewById69 != null && (robertoTextView32 = (RobertoTextView) _$_findCachedViewById69.findViewById(R.id.tvCsaA3CourseSelectionCourseBody1)) != null) {
                                    robertoTextView32.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar19 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById70 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                if (_$_findCachedViewById70 != null && (robertoTextView31 = (RobertoTextView) _$_findCachedViewById70.findViewById(R.id.tvCsaA3CourseSelectionCourseBody2)) != null) {
                                    robertoTextView31.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar20 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById71 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                                if (_$_findCachedViewById71 != null && (robertoTextView30 = (RobertoTextView) _$_findCachedViewById71.findViewById(R.id.tvCsaA3CourseSelectionCourseHeader)) != null) {
                                    robertoTextView30.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar21 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById72 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                                if (_$_findCachedViewById72 != null && (robertoTextView29 = (RobertoTextView) _$_findCachedViewById72.findViewById(R.id.tvCsaA3CourseSelectionCourseBody1)) != null) {
                                    robertoTextView29.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar22 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById73 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                                if (_$_findCachedViewById73 != null && (robertoTextView28 = (RobertoTextView) _$_findCachedViewById73.findViewById(R.id.tvCsaA3CourseSelectionCourseBody2)) != null) {
                                    robertoTextView28.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar23 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById74 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                                if (_$_findCachedViewById74 != null && (robertoTextView27 = (RobertoTextView) _$_findCachedViewById74.findViewById(R.id.tvCsaA3CourseSelectionCourseHeader)) != null) {
                                    robertoTextView27.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar24 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById75 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                                if (_$_findCachedViewById75 != null && (robertoTextView26 = (RobertoTextView) _$_findCachedViewById75.findViewById(R.id.tvCsaA3CourseSelectionCourseBody1)) != null) {
                                    robertoTextView26.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar25 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById76 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                                if (_$_findCachedViewById76 != null && (robertoTextView25 = (RobertoTextView) _$_findCachedViewById76.findViewById(R.id.tvCsaA3CourseSelectionCourseBody2)) != null) {
                                    robertoTextView25.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar26 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById77 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
                                if (_$_findCachedViewById77 != null && (robertoTextView24 = (RobertoTextView) _$_findCachedViewById77.findViewById(R.id.tvCsaA3CourseSelectionCourseHeader)) != null) {
                                    robertoTextView24.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar27 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById78 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
                                if (_$_findCachedViewById78 != null && (robertoTextView23 = (RobertoTextView) _$_findCachedViewById78.findViewById(R.id.tvCsaA3CourseSelectionCourseBody1)) != null) {
                                    robertoTextView23.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar28 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById79 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
                                if (_$_findCachedViewById79 != null && (robertoTextView22 = (RobertoTextView) _$_findCachedViewById79.findViewById(R.id.tvCsaA3CourseSelectionCourseBody2)) != null) {
                                    robertoTextView22.setTextColor(g0.a.b(requireContext(), R.color.newTemplateDarkGrey));
                                    hs.k kVar29 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById80 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                                if (_$_findCachedViewById80 != null && (appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById80.findViewById(R.id.tvCsaA3CourseSelectionCourseImage1)) != null) {
                                    appCompatImageView4.setImageResource(R.drawable.ic_csa_a3_adhd_1);
                                    hs.k kVar30 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById81 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                                if (_$_findCachedViewById81 != null && (appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById81.findViewById(R.id.tvCsaA3CourseSelectionCourseImage2)) != null) {
                                    appCompatImageView3.setImageResource(R.drawable.ic_csa_a3_adhd_2);
                                    hs.k kVar31 = hs.k.f19476a;
                                }
                                View _$_findCachedViewById82 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                                if (_$_findCachedViewById82 != null) {
                                    view8 = _$_findCachedViewById82.findViewById(R.id.tvCsaA3CourseSelectionCourseBg);
                                } else {
                                    view8 = null;
                                }
                                if (view8 != null) {
                                    view8.setBackgroundTintList(g0.a.c(R.color.onboardingAssessmentADHD, requireContext()));
                                }
                                View _$_findCachedViewById83 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                                if (_$_findCachedViewById83 != null) {
                                    robertoTextView16 = (RobertoTextView) _$_findCachedViewById83.findViewById(R.id.tvCsaA3CourseSelectionCourseHeader);
                                } else {
                                    robertoTextView16 = null;
                                }
                                if (robertoTextView16 != null) {
                                    robertoTextView16.setText(getString(R.string.a3VarACourseSelectionADHDTitle));
                                }
                                View _$_findCachedViewById84 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                                if (_$_findCachedViewById84 != null) {
                                    robertoTextView17 = (RobertoTextView) _$_findCachedViewById84.findViewById(R.id.tvCsaA3CourseSelectionCourseBody1);
                                } else {
                                    robertoTextView17 = null;
                                }
                                if (robertoTextView17 != null) {
                                    robertoTextView17.setText(getString(R.string.a3VarACourseSelectionADHDSubTitle1));
                                }
                                View _$_findCachedViewById85 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                                if (_$_findCachedViewById85 != null) {
                                    robertoTextView18 = (RobertoTextView) _$_findCachedViewById85.findViewById(R.id.tvCsaA3CourseSelectionCourseBody2);
                                } else {
                                    robertoTextView18 = null;
                                }
                                if (robertoTextView18 != null) {
                                    robertoTextView18.setText(getString(R.string.a3VarACourseSelectionADHDSubTitle2));
                                }
                                if (str != null && !n.B0(str)) {
                                    z16 = false;
                                } else {
                                    z16 = true;
                                }
                                if (!z16) {
                                    if (str != null && !n.B0(str)) {
                                        z19 = false;
                                    } else {
                                        z19 = true;
                                    }
                                    if (!z19) {
                                    }
                                    _$_findCachedViewById45 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                    if (_$_findCachedViewById45 != null && (appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById45.findViewById(R.id.tvCsaA3CourseSelectionCourseImage1)) != null) {
                                        appCompatImageView2.setImageResource(R.drawable.ic_csa_a3_ocd_1);
                                        hs.k kVar32 = hs.k.f19476a;
                                    }
                                    _$_findCachedViewById46 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                    if (_$_findCachedViewById46 != null && (appCompatImageView = (AppCompatImageView) _$_findCachedViewById46.findViewById(R.id.tvCsaA3CourseSelectionCourseImage2)) != null) {
                                        appCompatImageView.setImageResource(R.drawable.ic_csa_a3_ocd_2);
                                        hs.k kVar33 = hs.k.f19476a;
                                    }
                                    _$_findCachedViewById47 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                    if (_$_findCachedViewById47 == null) {
                                        view9 = _$_findCachedViewById47.findViewById(R.id.tvCsaA3CourseSelectionCourseBg);
                                    } else {
                                        view9 = null;
                                    }
                                    if (view9 != null) {
                                        view9.setBackgroundTintList(g0.a.c(R.color.onboardingAssessmentOCD, requireContext()));
                                    }
                                    _$_findCachedViewById48 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                    if (_$_findCachedViewById48 == null) {
                                        robertoTextView19 = (RobertoTextView) _$_findCachedViewById48.findViewById(R.id.tvCsaA3CourseSelectionCourseHeader);
                                    } else {
                                        robertoTextView19 = null;
                                    }
                                    if (robertoTextView19 != null) {
                                        robertoTextView19.setText(getString(R.string.a3VarACourseSelectionOCDTitle));
                                    }
                                    _$_findCachedViewById49 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                    if (_$_findCachedViewById49 == null) {
                                        robertoTextView20 = (RobertoTextView) _$_findCachedViewById49.findViewById(R.id.tvCsaA3CourseSelectionCourseBody1);
                                    } else {
                                        robertoTextView20 = null;
                                    }
                                    if (robertoTextView20 != null) {
                                        robertoTextView20.setText(getString(R.string.a3VarACourseSelectionOCDSubTitle1));
                                    }
                                    _$_findCachedViewById50 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                    if (_$_findCachedViewById50 == null) {
                                        robertoTextView21 = (RobertoTextView) _$_findCachedViewById50.findViewById(R.id.tvCsaA3CourseSelectionCourseBody2);
                                    } else {
                                        robertoTextView21 = null;
                                    }
                                    if (robertoTextView21 != null) {
                                        robertoTextView21.setText(getString(R.string.a3VarACourseSelectionOCDSubTitle2));
                                    }
                                    if (str == null && !n.B0(str)) {
                                        z17 = false;
                                    } else {
                                        z17 = true;
                                    }
                                    if (!z17) {
                                        if (str != null && !n.B0(str)) {
                                            z18 = false;
                                        } else {
                                            z18 = true;
                                        }
                                        if (!z18) {
                                        }
                                    }
                                    _$_findCachedViewById51 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                    if (!(_$_findCachedViewById51 instanceof MotionLayout)) {
                                        motionLayout7 = (MotionLayout) _$_findCachedViewById51;
                                    } else {
                                        motionLayout7 = null;
                                    }
                                    if (motionLayout7 != null) {
                                        motionLayout7.setProgress(1.0f);
                                    }
                                }
                                View _$_findCachedViewById86 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                                if (_$_findCachedViewById86 instanceof MotionLayout) {
                                    motionLayout6 = (MotionLayout) _$_findCachedViewById86;
                                } else {
                                    motionLayout6 = null;
                                }
                                if (motionLayout6 != null) {
                                    motionLayout6.setProgress(1.0f);
                                }
                                _$_findCachedViewById45 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                if (_$_findCachedViewById45 != null) {
                                    appCompatImageView2.setImageResource(R.drawable.ic_csa_a3_ocd_1);
                                    hs.k kVar322 = hs.k.f19476a;
                                }
                                _$_findCachedViewById46 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                if (_$_findCachedViewById46 != null) {
                                    appCompatImageView.setImageResource(R.drawable.ic_csa_a3_ocd_2);
                                    hs.k kVar332 = hs.k.f19476a;
                                }
                                _$_findCachedViewById47 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                if (_$_findCachedViewById47 == null) {
                                }
                                if (view9 != null) {
                                }
                                _$_findCachedViewById48 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                if (_$_findCachedViewById48 == null) {
                                }
                                if (robertoTextView19 != null) {
                                }
                                _$_findCachedViewById49 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                if (_$_findCachedViewById49 == null) {
                                }
                                if (robertoTextView20 != null) {
                                }
                                _$_findCachedViewById50 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                if (_$_findCachedViewById50 == null) {
                                }
                                if (robertoTextView21 != null) {
                                }
                                if (str == null) {
                                }
                                z17 = true;
                                if (!z17) {
                                }
                                _$_findCachedViewById51 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                                if (!(_$_findCachedViewById51 instanceof MotionLayout)) {
                                }
                                if (motionLayout7 != null) {
                                }
                            }
                            _$_findCachedViewById29 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
                            if (_$_findCachedViewById29 != null && (findViewById8 = _$_findCachedViewById29.findViewById(R.id.viewCsaA3CourseSelectionClicker)) != null) {
                                findViewById8.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar34 = hs.k.f19476a;
                            }
                            _$_findCachedViewById30 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
                            if (_$_findCachedViewById30 != null && (robertoButton8 = (RobertoButton) _$_findCachedViewById30.findViewById(R.id.tvCsaA3CourseSelectionCourseCta)) != null) {
                                robertoButton8.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar35 = hs.k.f19476a;
                            }
                            _$_findCachedViewById31 = _$_findCachedViewById(R.id.rowCsaCourseStress);
                            if (_$_findCachedViewById31 != null && (findViewById7 = _$_findCachedViewById31.findViewById(R.id.viewCsaA3CourseSelectionClicker)) != null) {
                                findViewById7.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar36 = hs.k.f19476a;
                            }
                            _$_findCachedViewById32 = _$_findCachedViewById(R.id.rowCsaCourseStress);
                            if (_$_findCachedViewById32 != null && (robertoButton7 = (RobertoButton) _$_findCachedViewById32.findViewById(R.id.tvCsaA3CourseSelectionCourseCta)) != null) {
                                robertoButton7.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar37 = hs.k.f19476a;
                            }
                            _$_findCachedViewById33 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
                            if (_$_findCachedViewById33 != null && (findViewById6 = _$_findCachedViewById33.findViewById(R.id.viewCsaA3CourseSelectionClicker)) != null) {
                                findViewById6.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar38 = hs.k.f19476a;
                            }
                            _$_findCachedViewById34 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
                            if (_$_findCachedViewById34 != null && (robertoButton6 = (RobertoButton) _$_findCachedViewById34.findViewById(R.id.tvCsaA3CourseSelectionCourseCta)) != null) {
                                robertoButton6.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar39 = hs.k.f19476a;
                            }
                            _$_findCachedViewById35 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                            if (_$_findCachedViewById35 != null && (findViewById5 = _$_findCachedViewById35.findViewById(R.id.viewCsaA3CourseSelectionClicker)) != null) {
                                findViewById5.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar40 = hs.k.f19476a;
                            }
                            _$_findCachedViewById36 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                            if (_$_findCachedViewById36 != null && (robertoButton5 = (RobertoButton) _$_findCachedViewById36.findViewById(R.id.tvCsaA3CourseSelectionCourseCta)) != null) {
                                robertoButton5.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar41 = hs.k.f19476a;
                            }
                            _$_findCachedViewById37 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                            if (_$_findCachedViewById37 != null && (findViewById4 = _$_findCachedViewById37.findViewById(R.id.viewCsaA3CourseSelectionClicker)) != null) {
                                findViewById4.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar42 = hs.k.f19476a;
                            }
                            _$_findCachedViewById38 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                            if (_$_findCachedViewById38 != null && (robertoButton4 = (RobertoButton) _$_findCachedViewById38.findViewById(R.id.tvCsaA3CourseSelectionCourseCta)) != null) {
                                robertoButton4.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar43 = hs.k.f19476a;
                            }
                            _$_findCachedViewById39 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                            if (_$_findCachedViewById39 != null && (findViewById3 = _$_findCachedViewById39.findViewById(R.id.viewCsaA3CourseSelectionClicker)) != null) {
                                findViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar44 = hs.k.f19476a;
                            }
                            _$_findCachedViewById40 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                            if (_$_findCachedViewById40 != null && (robertoButton3 = (RobertoButton) _$_findCachedViewById40.findViewById(R.id.tvCsaA3CourseSelectionCourseCta)) != null) {
                                robertoButton3.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar45 = hs.k.f19476a;
                            }
                            _$_findCachedViewById41 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                            if (_$_findCachedViewById41 != null && (findViewById2 = _$_findCachedViewById41.findViewById(R.id.viewCsaA3CourseSelectionClicker)) != null) {
                                findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar46 = hs.k.f19476a;
                            }
                            _$_findCachedViewById42 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                            if (_$_findCachedViewById42 != null && (robertoButton2 = (RobertoButton) _$_findCachedViewById42.findViewById(R.id.tvCsaA3CourseSelectionCourseCta)) != null) {
                                robertoButton2.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar47 = hs.k.f19476a;
                            }
                            _$_findCachedViewById43 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                            if (_$_findCachedViewById43 != null && (findViewById = _$_findCachedViewById43.findViewById(R.id.viewCsaA3CourseSelectionClicker)) != null) {
                                findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar48 = hs.k.f19476a;
                            }
                            _$_findCachedViewById44 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                            if (_$_findCachedViewById44 == null && (robertoButton = (RobertoButton) _$_findCachedViewById44.findViewById(R.id.tvCsaA3CourseSelectionCourseCta)) != null) {
                                robertoButton.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ b f39419v;

                                    {
                                        this.f39419v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view10) {
                                        int i6 = r2;
                                        MotionLayout motionLayout9 = null;
                                        b this$0 = this.f39419v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                    if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                                }
                                                MotionLayout motionLayout10 = motionLayout9;
                                                if (motionLayout10 != null) {
                                                    motionLayout10.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 1:
                                                int i11 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                    if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                                }
                                                MotionLayout motionLayout11 = motionLayout9;
                                                if (motionLayout11 != null) {
                                                    motionLayout11.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 2:
                                                int i12 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                    this$0.K(Constants.COURSE_HAPPINESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                                }
                                                MotionLayout motionLayout12 = motionLayout9;
                                                if (motionLayout12 != null) {
                                                    motionLayout12.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_HAPPINESS);
                                                return;
                                            case 3:
                                                int i13 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                    if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                                }
                                                MotionLayout motionLayout13 = motionLayout9;
                                                if (motionLayout13 != null) {
                                                    motionLayout13.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 4:
                                                int i14 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                    this$0.K(Constants.COURSE_ADHD);
                                                    return;
                                                }
                                                View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                                }
                                                MotionLayout motionLayout14 = motionLayout9;
                                                if (motionLayout14 != null) {
                                                    motionLayout14.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ADHD);
                                                return;
                                            case 5:
                                                int i15 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                    if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                                }
                                                MotionLayout motionLayout15 = motionLayout9;
                                                if (motionLayout15 != null) {
                                                    motionLayout15.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 6:
                                                int i16 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                    this$0.K(Constants.COURSE_OCD);
                                                    return;
                                                }
                                                View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                                }
                                                MotionLayout motionLayout16 = motionLayout9;
                                                if (motionLayout16 != null) {
                                                    motionLayout16.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_OCD);
                                                return;
                                            case 7:
                                                int i17 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                    this$0.K(Constants.COURSE_DEPRESSION);
                                                    return;
                                                }
                                                View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                                }
                                                MotionLayout motionLayout17 = motionLayout9;
                                                if (motionLayout17 != null) {
                                                    motionLayout17.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_DEPRESSION);
                                                return;
                                            case 8:
                                                int i18 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                    if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                                }
                                                MotionLayout motionLayout18 = motionLayout9;
                                                if (motionLayout18 != null) {
                                                    motionLayout18.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 9:
                                                int i19 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                    this$0.K(Constants.COURSE_STRESS);
                                                    return;
                                                }
                                                View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                                }
                                                MotionLayout motionLayout19 = motionLayout9;
                                                if (motionLayout19 != null) {
                                                    motionLayout19.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_STRESS);
                                                return;
                                            case 10:
                                                int i20 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                    if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                                }
                                                MotionLayout motionLayout20 = motionLayout9;
                                                if (motionLayout20 != null) {
                                                    motionLayout20.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 11:
                                                int i21 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                    this$0.K(Constants.COURSE_ANGER);
                                                    return;
                                                }
                                                View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                                }
                                                MotionLayout motionLayout21 = motionLayout9;
                                                if (motionLayout21 != null) {
                                                    motionLayout21.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_ANGER);
                                                return;
                                            case 12:
                                                int i22 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                    if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                                }
                                                MotionLayout motionLayout22 = motionLayout9;
                                                if (motionLayout22 != null) {
                                                    motionLayout22.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 13:
                                                int i23 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                    this$0.K(Constants.COURSE_WORRY);
                                                    return;
                                                }
                                                View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                                }
                                                MotionLayout motionLayout23 = motionLayout9;
                                                if (motionLayout23 != null) {
                                                    motionLayout23.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_WORRY);
                                                return;
                                            case 14:
                                                int i24 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                    if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                        motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                    }
                                                    if (motionLayout9 != null) {
                                                        motionLayout9.A();
                                                    }
                                                    this$0.f39421u = "";
                                                    return;
                                                }
                                                View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                                }
                                                MotionLayout motionLayout24 = motionLayout9;
                                                if (motionLayout24 != null) {
                                                    motionLayout24.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                            default:
                                                int i25 = b.f39420x;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                    this$0.K(Constants.COURSE_SLEEP);
                                                    return;
                                                }
                                                View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                                }
                                                MotionLayout motionLayout25 = motionLayout9;
                                                if (motionLayout25 != null) {
                                                    motionLayout25.m(0.0f);
                                                }
                                                this$0.J(Constants.COURSE_SLEEP);
                                                return;
                                        }
                                    }
                                });
                                hs.k kVar49 = hs.k.f19476a;
                                return;
                            }
                            return;
                        }
                        _$_findCachedViewById28 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                        if (_$_findCachedViewById28 instanceof MotionLayout) {
                            motionLayout5 = (MotionLayout) _$_findCachedViewById28;
                        } else {
                            motionLayout5 = null;
                        }
                        if (motionLayout5 != null) {
                            motionLayout5.setProgress(1.0f);
                        }
                        if (z25) {
                        }
                        _$_findCachedViewById29 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
                        if (_$_findCachedViewById29 != null) {
                            findViewById8.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar342 = hs.k.f19476a;
                        }
                        _$_findCachedViewById30 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
                        if (_$_findCachedViewById30 != null) {
                            robertoButton8.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar352 = hs.k.f19476a;
                        }
                        _$_findCachedViewById31 = _$_findCachedViewById(R.id.rowCsaCourseStress);
                        if (_$_findCachedViewById31 != null) {
                            findViewById7.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar362 = hs.k.f19476a;
                        }
                        _$_findCachedViewById32 = _$_findCachedViewById(R.id.rowCsaCourseStress);
                        if (_$_findCachedViewById32 != null) {
                            robertoButton7.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar372 = hs.k.f19476a;
                        }
                        _$_findCachedViewById33 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
                        if (_$_findCachedViewById33 != null) {
                            findViewById6.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar382 = hs.k.f19476a;
                        }
                        _$_findCachedViewById34 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
                        if (_$_findCachedViewById34 != null) {
                            robertoButton6.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar392 = hs.k.f19476a;
                        }
                        _$_findCachedViewById35 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                        if (_$_findCachedViewById35 != null) {
                            findViewById5.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar402 = hs.k.f19476a;
                        }
                        _$_findCachedViewById36 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                        if (_$_findCachedViewById36 != null) {
                            robertoButton5.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar412 = hs.k.f19476a;
                        }
                        _$_findCachedViewById37 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                        if (_$_findCachedViewById37 != null) {
                            findViewById4.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar422 = hs.k.f19476a;
                        }
                        _$_findCachedViewById38 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                        if (_$_findCachedViewById38 != null) {
                            robertoButton4.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar432 = hs.k.f19476a;
                        }
                        _$_findCachedViewById39 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                        if (_$_findCachedViewById39 != null) {
                            findViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar442 = hs.k.f19476a;
                        }
                        _$_findCachedViewById40 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                        if (_$_findCachedViewById40 != null) {
                            robertoButton3.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar452 = hs.k.f19476a;
                        }
                        _$_findCachedViewById41 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                        if (_$_findCachedViewById41 != null) {
                            findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar462 = hs.k.f19476a;
                        }
                        _$_findCachedViewById42 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                        if (_$_findCachedViewById42 != null) {
                            robertoButton2.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar472 = hs.k.f19476a;
                        }
                        _$_findCachedViewById43 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                        if (_$_findCachedViewById43 != null) {
                            findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: zk.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ b f39419v;

                                {
                                    this.f39419v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view10) {
                                    int i6 = r2;
                                    MotionLayout motionLayout9 = null;
                                    b this$0 = this.f39419v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                View _$_findCachedViewById87 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                                if (_$_findCachedViewById87 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById87;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById88 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById88 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById88;
                                            }
                                            MotionLayout motionLayout10 = motionLayout9;
                                            if (motionLayout10 != null) {
                                                motionLayout10.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 1:
                                            int i11 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                View _$_findCachedViewById89 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                                if (_$_findCachedViewById89 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById89;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById90 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById90 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById90;
                                            }
                                            MotionLayout motionLayout11 = motionLayout9;
                                            if (motionLayout11 != null) {
                                                motionLayout11.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 2:
                                            int i12 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_HAPPINESS)) {
                                                this$0.K(Constants.COURSE_HAPPINESS);
                                                return;
                                            }
                                            View _$_findCachedViewById91 = this$0._$_findCachedViewById(R.id.rowCsaCourseHappiness);
                                            if (_$_findCachedViewById91 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById91;
                                            }
                                            MotionLayout motionLayout12 = motionLayout9;
                                            if (motionLayout12 != null) {
                                                motionLayout12.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_HAPPINESS);
                                            return;
                                        case 3:
                                            int i13 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                View _$_findCachedViewById92 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                                if (_$_findCachedViewById92 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById92;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById93 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById93 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById93;
                                            }
                                            MotionLayout motionLayout13 = motionLayout9;
                                            if (motionLayout13 != null) {
                                                motionLayout13.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 4:
                                            int i14 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ADHD)) {
                                                this$0.K(Constants.COURSE_ADHD);
                                                return;
                                            }
                                            View _$_findCachedViewById94 = this$0._$_findCachedViewById(R.id.rowCsaCourseADHD);
                                            if (_$_findCachedViewById94 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById94;
                                            }
                                            MotionLayout motionLayout14 = motionLayout9;
                                            if (motionLayout14 != null) {
                                                motionLayout14.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ADHD);
                                            return;
                                        case 5:
                                            int i15 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                View _$_findCachedViewById95 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                                if (_$_findCachedViewById95 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById95;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById96 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById96 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById96;
                                            }
                                            MotionLayout motionLayout15 = motionLayout9;
                                            if (motionLayout15 != null) {
                                                motionLayout15.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 6:
                                            int i16 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_OCD)) {
                                                this$0.K(Constants.COURSE_OCD);
                                                return;
                                            }
                                            View _$_findCachedViewById97 = this$0._$_findCachedViewById(R.id.rowCsaCourseOCD);
                                            if (_$_findCachedViewById97 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById97;
                                            }
                                            MotionLayout motionLayout16 = motionLayout9;
                                            if (motionLayout16 != null) {
                                                motionLayout16.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_OCD);
                                            return;
                                        case 7:
                                            int i17 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_DEPRESSION)) {
                                                this$0.K(Constants.COURSE_DEPRESSION);
                                                return;
                                            }
                                            View _$_findCachedViewById98 = this$0._$_findCachedViewById(R.id.rowCsaCourseDepression);
                                            if (_$_findCachedViewById98 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById98;
                                            }
                                            MotionLayout motionLayout17 = motionLayout9;
                                            if (motionLayout17 != null) {
                                                motionLayout17.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_DEPRESSION);
                                            return;
                                        case 8:
                                            int i18 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                View _$_findCachedViewById99 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                                if (_$_findCachedViewById99 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById99;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById100 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById100 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById100;
                                            }
                                            MotionLayout motionLayout18 = motionLayout9;
                                            if (motionLayout18 != null) {
                                                motionLayout18.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 9:
                                            int i19 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_STRESS)) {
                                                this$0.K(Constants.COURSE_STRESS);
                                                return;
                                            }
                                            View _$_findCachedViewById101 = this$0._$_findCachedViewById(R.id.rowCsaCourseStress);
                                            if (_$_findCachedViewById101 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById101;
                                            }
                                            MotionLayout motionLayout19 = motionLayout9;
                                            if (motionLayout19 != null) {
                                                motionLayout19.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_STRESS);
                                            return;
                                        case 10:
                                            int i20 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                View _$_findCachedViewById102 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                                if (_$_findCachedViewById102 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById102;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById103 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById103 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById103;
                                            }
                                            MotionLayout motionLayout20 = motionLayout9;
                                            if (motionLayout20 != null) {
                                                motionLayout20.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 11:
                                            int i21 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_ANGER)) {
                                                this$0.K(Constants.COURSE_ANGER);
                                                return;
                                            }
                                            View _$_findCachedViewById104 = this$0._$_findCachedViewById(R.id.rowCsaCourseAnger);
                                            if (_$_findCachedViewById104 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById104;
                                            }
                                            MotionLayout motionLayout21 = motionLayout9;
                                            if (motionLayout21 != null) {
                                                motionLayout21.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_ANGER);
                                            return;
                                        case 12:
                                            int i22 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                View _$_findCachedViewById105 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                                if (_$_findCachedViewById105 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById105;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById106 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById106 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById106;
                                            }
                                            MotionLayout motionLayout22 = motionLayout9;
                                            if (motionLayout22 != null) {
                                                motionLayout22.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 13:
                                            int i23 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_WORRY)) {
                                                this$0.K(Constants.COURSE_WORRY);
                                                return;
                                            }
                                            View _$_findCachedViewById107 = this$0._$_findCachedViewById(R.id.rowCsaCourseWorry);
                                            if (_$_findCachedViewById107 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById107;
                                            }
                                            MotionLayout motionLayout23 = motionLayout9;
                                            if (motionLayout23 != null) {
                                                motionLayout23.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_WORRY);
                                            return;
                                        case 14:
                                            int i24 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                View _$_findCachedViewById108 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                                if (_$_findCachedViewById108 instanceof MotionLayout) {
                                                    motionLayout9 = (MotionLayout) _$_findCachedViewById108;
                                                }
                                                if (motionLayout9 != null) {
                                                    motionLayout9.A();
                                                }
                                                this$0.f39421u = "";
                                                return;
                                            }
                                            View _$_findCachedViewById109 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById109 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById109;
                                            }
                                            MotionLayout motionLayout24 = motionLayout9;
                                            if (motionLayout24 != null) {
                                                motionLayout24.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                        default:
                                            int i25 = b.f39420x;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (kotlin.jvm.internal.i.b(this$0.f39421u, Constants.COURSE_SLEEP)) {
                                                this$0.K(Constants.COURSE_SLEEP);
                                                return;
                                            }
                                            View _$_findCachedViewById110 = this$0._$_findCachedViewById(R.id.rowCsaCourseSleep);
                                            if (_$_findCachedViewById110 instanceof MotionLayout) {
                                                motionLayout9 = (MotionLayout) _$_findCachedViewById110;
                                            }
                                            MotionLayout motionLayout25 = motionLayout9;
                                            if (motionLayout25 != null) {
                                                motionLayout25.m(0.0f);
                                            }
                                            this$0.J(Constants.COURSE_SLEEP);
                                            return;
                                    }
                                }
                            });
                            hs.k kVar482 = hs.k.f19476a;
                        }
                        _$_findCachedViewById44 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                        if (_$_findCachedViewById44 == null) {
                            return;
                        }
                        return;
                    }
                    _$_findCachedViewById21 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                    if (!(_$_findCachedViewById21 instanceof MotionLayout)) {
                        motionLayout4 = (MotionLayout) _$_findCachedViewById21;
                    } else {
                        motionLayout4 = null;
                    }
                    if (motionLayout4 != null) {
                        motionLayout4.setProgress(1.0f);
                    }
                    _$_findCachedViewById22 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                    if (_$_findCachedViewById22 != null) {
                        appCompatImageView6.setImageResource(R.drawable.ic_csa_a3_happiness_1);
                        hs.k kVar92 = hs.k.f19476a;
                    }
                    _$_findCachedViewById23 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                    if (_$_findCachedViewById23 != null) {
                        appCompatImageView5.setImageResource(R.drawable.ic_csa_a3_happiness_2);
                        hs.k kVar102 = hs.k.f19476a;
                    }
                    _$_findCachedViewById24 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                    if (_$_findCachedViewById24 != null) {
                    }
                    if (view7 != null) {
                    }
                    _$_findCachedViewById25 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                    if (_$_findCachedViewById25 != null) {
                    }
                    if (robertoTextView13 != null) {
                    }
                    _$_findCachedViewById26 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                    if (_$_findCachedViewById26 != null) {
                    }
                    if (robertoTextView14 != null) {
                    }
                    _$_findCachedViewById27 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                    if (_$_findCachedViewById27 != null) {
                    }
                    if (robertoTextView15 != null) {
                    }
                    if (str == null) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    _$_findCachedViewById28 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                    if (_$_findCachedViewById28 instanceof MotionLayout) {
                    }
                    if (motionLayout5 != null) {
                    }
                    if (z25) {
                    }
                    _$_findCachedViewById29 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
                    if (_$_findCachedViewById29 != null) {
                    }
                    _$_findCachedViewById30 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
                    if (_$_findCachedViewById30 != null) {
                    }
                    _$_findCachedViewById31 = _$_findCachedViewById(R.id.rowCsaCourseStress);
                    if (_$_findCachedViewById31 != null) {
                    }
                    _$_findCachedViewById32 = _$_findCachedViewById(R.id.rowCsaCourseStress);
                    if (_$_findCachedViewById32 != null) {
                    }
                    _$_findCachedViewById33 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
                    if (_$_findCachedViewById33 != null) {
                    }
                    _$_findCachedViewById34 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
                    if (_$_findCachedViewById34 != null) {
                    }
                    _$_findCachedViewById35 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                    if (_$_findCachedViewById35 != null) {
                    }
                    _$_findCachedViewById36 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                    if (_$_findCachedViewById36 != null) {
                    }
                    _$_findCachedViewById37 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                    if (_$_findCachedViewById37 != null) {
                    }
                    _$_findCachedViewById38 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                    if (_$_findCachedViewById38 != null) {
                    }
                    _$_findCachedViewById39 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                    if (_$_findCachedViewById39 != null) {
                    }
                    _$_findCachedViewById40 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                    if (_$_findCachedViewById40 != null) {
                    }
                    _$_findCachedViewById41 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                    if (_$_findCachedViewById41 != null) {
                    }
                    _$_findCachedViewById42 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                    if (_$_findCachedViewById42 != null) {
                    }
                    _$_findCachedViewById43 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                    if (_$_findCachedViewById43 != null) {
                    }
                    _$_findCachedViewById44 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                    if (_$_findCachedViewById44 == null) {
                    }
                }
                _$_findCachedViewById14 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                if (_$_findCachedViewById14 instanceof MotionLayout) {
                    motionLayout3 = (MotionLayout) _$_findCachedViewById14;
                } else {
                    motionLayout3 = null;
                }
                if (motionLayout3 != null) {
                    motionLayout3.setProgress(1.0f);
                }
                _$_findCachedViewById15 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                if (_$_findCachedViewById15 != null) {
                    appCompatImageView8.setImageResource(R.drawable.ic_csa_a3_sleep_1);
                    hs.k kVar72 = hs.k.f19476a;
                }
                _$_findCachedViewById16 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                if (_$_findCachedViewById16 != null) {
                    appCompatImageView7.setImageResource(R.drawable.ic_csa_a3_sleep_2);
                    hs.k kVar82 = hs.k.f19476a;
                }
                _$_findCachedViewById17 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                if (_$_findCachedViewById17 == null) {
                }
                if (view6 != null) {
                }
                _$_findCachedViewById18 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                if (_$_findCachedViewById18 == null) {
                }
                if (robertoTextView10 != null) {
                }
                _$_findCachedViewById19 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                if (_$_findCachedViewById19 == null) {
                }
                if (robertoTextView11 != null) {
                }
                _$_findCachedViewById20 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                if (_$_findCachedViewById20 == null) {
                }
                if (robertoTextView12 != null) {
                }
                if (str == null) {
                }
                z14 = true;
                if (!z14) {
                }
                _$_findCachedViewById21 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                if (!(_$_findCachedViewById21 instanceof MotionLayout)) {
                }
                if (motionLayout4 != null) {
                }
                _$_findCachedViewById22 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                if (_$_findCachedViewById22 != null) {
                }
                _$_findCachedViewById23 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                if (_$_findCachedViewById23 != null) {
                }
                _$_findCachedViewById24 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                if (_$_findCachedViewById24 != null) {
                }
                if (view7 != null) {
                }
                _$_findCachedViewById25 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                if (_$_findCachedViewById25 != null) {
                }
                if (robertoTextView13 != null) {
                }
                _$_findCachedViewById26 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                if (_$_findCachedViewById26 != null) {
                }
                if (robertoTextView14 != null) {
                }
                _$_findCachedViewById27 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                if (_$_findCachedViewById27 != null) {
                }
                if (robertoTextView15 != null) {
                }
                if (str == null) {
                }
                z15 = true;
                if (!z15) {
                }
                _$_findCachedViewById28 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                if (_$_findCachedViewById28 instanceof MotionLayout) {
                }
                if (motionLayout5 != null) {
                }
                if (z25) {
                }
                _$_findCachedViewById29 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
                if (_$_findCachedViewById29 != null) {
                }
                _$_findCachedViewById30 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
                if (_$_findCachedViewById30 != null) {
                }
                _$_findCachedViewById31 = _$_findCachedViewById(R.id.rowCsaCourseStress);
                if (_$_findCachedViewById31 != null) {
                }
                _$_findCachedViewById32 = _$_findCachedViewById(R.id.rowCsaCourseStress);
                if (_$_findCachedViewById32 != null) {
                }
                _$_findCachedViewById33 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
                if (_$_findCachedViewById33 != null) {
                }
                _$_findCachedViewById34 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
                if (_$_findCachedViewById34 != null) {
                }
                _$_findCachedViewById35 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                if (_$_findCachedViewById35 != null) {
                }
                _$_findCachedViewById36 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
                if (_$_findCachedViewById36 != null) {
                }
                _$_findCachedViewById37 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                if (_$_findCachedViewById37 != null) {
                }
                _$_findCachedViewById38 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
                if (_$_findCachedViewById38 != null) {
                }
                _$_findCachedViewById39 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                if (_$_findCachedViewById39 != null) {
                }
                _$_findCachedViewById40 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
                if (_$_findCachedViewById40 != null) {
                }
                _$_findCachedViewById41 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                if (_$_findCachedViewById41 != null) {
                }
                _$_findCachedViewById42 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
                if (_$_findCachedViewById42 != null) {
                }
                _$_findCachedViewById43 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                if (_$_findCachedViewById43 != null) {
                }
                _$_findCachedViewById44 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
                if (_$_findCachedViewById44 == null) {
                }
            }
            _$_findCachedViewById7 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
            if (!(_$_findCachedViewById7 instanceof MotionLayout)) {
                motionLayout2 = (MotionLayout) _$_findCachedViewById7;
            } else {
                motionLayout2 = null;
            }
            if (motionLayout2 != null) {
                motionLayout2.setProgress(1.0f);
            }
            _$_findCachedViewById8 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
            if (_$_findCachedViewById8 != null) {
                appCompatImageView10.setImageResource(R.drawable.ic_csa_a3_worry_1);
                hs.k kVar52 = hs.k.f19476a;
            }
            _$_findCachedViewById9 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
            if (_$_findCachedViewById9 != null) {
                appCompatImageView9.setImageResource(R.drawable.ic_csa_a3_worry_2);
                hs.k kVar62 = hs.k.f19476a;
            }
            _$_findCachedViewById10 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
            if (_$_findCachedViewById10 != null) {
            }
            if (view5 != null) {
            }
            _$_findCachedViewById11 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
            if (_$_findCachedViewById11 != null) {
            }
            if (robertoTextView7 != null) {
            }
            _$_findCachedViewById12 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
            if (_$_findCachedViewById12 != null) {
            }
            if (robertoTextView8 != null) {
            }
            _$_findCachedViewById13 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
            if (_$_findCachedViewById13 != null) {
            }
            if (robertoTextView9 != null) {
            }
            if (str == null) {
            }
            z13 = true;
            if (!z13) {
            }
            _$_findCachedViewById14 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
            if (_$_findCachedViewById14 instanceof MotionLayout) {
            }
            if (motionLayout3 != null) {
            }
            _$_findCachedViewById15 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
            if (_$_findCachedViewById15 != null) {
            }
            _$_findCachedViewById16 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
            if (_$_findCachedViewById16 != null) {
            }
            _$_findCachedViewById17 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
            if (_$_findCachedViewById17 == null) {
            }
            if (view6 != null) {
            }
            _$_findCachedViewById18 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
            if (_$_findCachedViewById18 == null) {
            }
            if (robertoTextView10 != null) {
            }
            _$_findCachedViewById19 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
            if (_$_findCachedViewById19 == null) {
            }
            if (robertoTextView11 != null) {
            }
            _$_findCachedViewById20 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
            if (_$_findCachedViewById20 == null) {
            }
            if (robertoTextView12 != null) {
            }
            if (str == null) {
            }
            z14 = true;
            if (!z14) {
            }
            _$_findCachedViewById21 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
            if (!(_$_findCachedViewById21 instanceof MotionLayout)) {
            }
            if (motionLayout4 != null) {
            }
            _$_findCachedViewById22 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
            if (_$_findCachedViewById22 != null) {
            }
            _$_findCachedViewById23 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
            if (_$_findCachedViewById23 != null) {
            }
            _$_findCachedViewById24 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
            if (_$_findCachedViewById24 != null) {
            }
            if (view7 != null) {
            }
            _$_findCachedViewById25 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
            if (_$_findCachedViewById25 != null) {
            }
            if (robertoTextView13 != null) {
            }
            _$_findCachedViewById26 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
            if (_$_findCachedViewById26 != null) {
            }
            if (robertoTextView14 != null) {
            }
            _$_findCachedViewById27 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
            if (_$_findCachedViewById27 != null) {
            }
            if (robertoTextView15 != null) {
            }
            if (str == null) {
            }
            z15 = true;
            if (!z15) {
            }
            _$_findCachedViewById28 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
            if (_$_findCachedViewById28 instanceof MotionLayout) {
            }
            if (motionLayout5 != null) {
            }
            if (z25) {
            }
            _$_findCachedViewById29 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
            if (_$_findCachedViewById29 != null) {
            }
            _$_findCachedViewById30 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
            if (_$_findCachedViewById30 != null) {
            }
            _$_findCachedViewById31 = _$_findCachedViewById(R.id.rowCsaCourseStress);
            if (_$_findCachedViewById31 != null) {
            }
            _$_findCachedViewById32 = _$_findCachedViewById(R.id.rowCsaCourseStress);
            if (_$_findCachedViewById32 != null) {
            }
            _$_findCachedViewById33 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
            if (_$_findCachedViewById33 != null) {
            }
            _$_findCachedViewById34 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
            if (_$_findCachedViewById34 != null) {
            }
            _$_findCachedViewById35 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
            if (_$_findCachedViewById35 != null) {
            }
            _$_findCachedViewById36 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
            if (_$_findCachedViewById36 != null) {
            }
            _$_findCachedViewById37 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
            if (_$_findCachedViewById37 != null) {
            }
            _$_findCachedViewById38 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
            if (_$_findCachedViewById38 != null) {
            }
            _$_findCachedViewById39 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
            if (_$_findCachedViewById39 != null) {
            }
            _$_findCachedViewById40 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
            if (_$_findCachedViewById40 != null) {
            }
            _$_findCachedViewById41 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
            if (_$_findCachedViewById41 != null) {
            }
            _$_findCachedViewById42 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
            if (_$_findCachedViewById42 != null) {
            }
            _$_findCachedViewById43 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
            if (_$_findCachedViewById43 != null) {
            }
            _$_findCachedViewById44 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
            if (_$_findCachedViewById44 == null) {
            }
        }
        View _$_findCachedViewById87 = _$_findCachedViewById(R.id.rowCsaCourseStress);
        if (_$_findCachedViewById87 instanceof MotionLayout) {
            motionLayout = (MotionLayout) _$_findCachedViewById87;
        } else {
            motionLayout = null;
        }
        if (motionLayout != null) {
            motionLayout.setProgress(1.0f);
        }
        _$_findCachedViewById = _$_findCachedViewById(R.id.rowCsaCourseAnger);
        if (_$_findCachedViewById != null) {
            appCompatImageView12.setImageResource(R.drawable.ic_csa_a3_anger_1);
            hs.k kVar310 = hs.k.f19476a;
        }
        _$_findCachedViewById2 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
        if (_$_findCachedViewById2 != null) {
            appCompatImageView11.setImageResource(R.drawable.ic_csa_a3_anger_2);
            hs.k kVar410 = hs.k.f19476a;
        }
        _$_findCachedViewById3 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
        if (_$_findCachedViewById3 == null) {
        }
        if (view4 != null) {
        }
        _$_findCachedViewById4 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
        if (_$_findCachedViewById4 == null) {
        }
        if (robertoTextView4 != null) {
        }
        _$_findCachedViewById5 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
        if (_$_findCachedViewById5 == null) {
        }
        if (robertoTextView5 != null) {
        }
        _$_findCachedViewById6 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
        if (_$_findCachedViewById6 == null) {
        }
        if (robertoTextView6 != null) {
        }
        if (str == null) {
        }
        z12 = true;
        if (!z12) {
        }
        _$_findCachedViewById7 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
        if (!(_$_findCachedViewById7 instanceof MotionLayout)) {
        }
        if (motionLayout2 != null) {
        }
        _$_findCachedViewById8 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
        if (_$_findCachedViewById8 != null) {
        }
        _$_findCachedViewById9 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
        if (_$_findCachedViewById9 != null) {
        }
        _$_findCachedViewById10 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
        if (_$_findCachedViewById10 != null) {
        }
        if (view5 != null) {
        }
        _$_findCachedViewById11 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
        if (_$_findCachedViewById11 != null) {
        }
        if (robertoTextView7 != null) {
        }
        _$_findCachedViewById12 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
        if (_$_findCachedViewById12 != null) {
        }
        if (robertoTextView8 != null) {
        }
        _$_findCachedViewById13 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
        if (_$_findCachedViewById13 != null) {
        }
        if (robertoTextView9 != null) {
        }
        if (str == null) {
        }
        z13 = true;
        if (!z13) {
        }
        _$_findCachedViewById14 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
        if (_$_findCachedViewById14 instanceof MotionLayout) {
        }
        if (motionLayout3 != null) {
        }
        _$_findCachedViewById15 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
        if (_$_findCachedViewById15 != null) {
        }
        _$_findCachedViewById16 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
        if (_$_findCachedViewById16 != null) {
        }
        _$_findCachedViewById17 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
        if (_$_findCachedViewById17 == null) {
        }
        if (view6 != null) {
        }
        _$_findCachedViewById18 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
        if (_$_findCachedViewById18 == null) {
        }
        if (robertoTextView10 != null) {
        }
        _$_findCachedViewById19 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
        if (_$_findCachedViewById19 == null) {
        }
        if (robertoTextView11 != null) {
        }
        _$_findCachedViewById20 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
        if (_$_findCachedViewById20 == null) {
        }
        if (robertoTextView12 != null) {
        }
        if (str == null) {
        }
        z14 = true;
        if (!z14) {
        }
        _$_findCachedViewById21 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
        if (!(_$_findCachedViewById21 instanceof MotionLayout)) {
        }
        if (motionLayout4 != null) {
        }
        _$_findCachedViewById22 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
        if (_$_findCachedViewById22 != null) {
        }
        _$_findCachedViewById23 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
        if (_$_findCachedViewById23 != null) {
        }
        _$_findCachedViewById24 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
        if (_$_findCachedViewById24 != null) {
        }
        if (view7 != null) {
        }
        _$_findCachedViewById25 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
        if (_$_findCachedViewById25 != null) {
        }
        if (robertoTextView13 != null) {
        }
        _$_findCachedViewById26 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
        if (_$_findCachedViewById26 != null) {
        }
        if (robertoTextView14 != null) {
        }
        _$_findCachedViewById27 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
        if (_$_findCachedViewById27 != null) {
        }
        if (robertoTextView15 != null) {
        }
        if (str == null) {
        }
        z15 = true;
        if (!z15) {
        }
        _$_findCachedViewById28 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
        if (_$_findCachedViewById28 instanceof MotionLayout) {
        }
        if (motionLayout5 != null) {
        }
        if (z25) {
        }
        _$_findCachedViewById29 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
        if (_$_findCachedViewById29 != null) {
        }
        _$_findCachedViewById30 = _$_findCachedViewById(R.id.rowCsaCourseDepression);
        if (_$_findCachedViewById30 != null) {
        }
        _$_findCachedViewById31 = _$_findCachedViewById(R.id.rowCsaCourseStress);
        if (_$_findCachedViewById31 != null) {
        }
        _$_findCachedViewById32 = _$_findCachedViewById(R.id.rowCsaCourseStress);
        if (_$_findCachedViewById32 != null) {
        }
        _$_findCachedViewById33 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
        if (_$_findCachedViewById33 != null) {
        }
        _$_findCachedViewById34 = _$_findCachedViewById(R.id.rowCsaCourseAnger);
        if (_$_findCachedViewById34 != null) {
        }
        _$_findCachedViewById35 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
        if (_$_findCachedViewById35 != null) {
        }
        _$_findCachedViewById36 = _$_findCachedViewById(R.id.rowCsaCourseWorry);
        if (_$_findCachedViewById36 != null) {
        }
        _$_findCachedViewById37 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
        if (_$_findCachedViewById37 != null) {
        }
        _$_findCachedViewById38 = _$_findCachedViewById(R.id.rowCsaCourseSleep);
        if (_$_findCachedViewById38 != null) {
        }
        _$_findCachedViewById39 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
        if (_$_findCachedViewById39 != null) {
        }
        _$_findCachedViewById40 = _$_findCachedViewById(R.id.rowCsaCourseHappiness);
        if (_$_findCachedViewById40 != null) {
        }
        _$_findCachedViewById41 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
        if (_$_findCachedViewById41 != null) {
        }
        _$_findCachedViewById42 = _$_findCachedViewById(R.id.rowCsaCourseADHD);
        if (_$_findCachedViewById42 != null) {
        }
        _$_findCachedViewById43 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
        if (_$_findCachedViewById43 != null) {
        }
        _$_findCachedViewById44 = _$_findCachedViewById(R.id.rowCsaCourseOCD);
        if (_$_findCachedViewById44 == null) {
        }
    }
}
