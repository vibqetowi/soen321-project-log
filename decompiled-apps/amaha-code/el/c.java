package el;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import bm.b;
import bm.d;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import el.d;
import gv.n;
import hr.k4;
import hr.r4;
import hs.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.x;
import nn.g1;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f14374u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f14375v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f14376w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f14377x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f14378y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f14379z;

    public /* synthetic */ c(Object obj, Object obj2, int i6, Object obj3, Object obj4, int i10) {
        this.f14374u = i10;
        this.f14377x = obj;
        this.f14378y = obj2;
        this.f14375v = i6;
        this.f14379z = obj3;
        this.f14376w = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        boolean z10;
        String str3;
        int i6 = this.f14374u;
        boolean z11 = false;
        int i10 = this.f14375v;
        Object obj = this.f14376w;
        Object obj2 = this.f14379z;
        Object obj3 = this.f14378y;
        Object obj4 = this.f14377x;
        switch (i6) {
            case 0:
                CourseDayModelV1 it = (CourseDayModelV1) obj4;
                d this$0 = (d) obj3;
                d.a this_apply = (d.a) obj2;
                u isTomorrow = (u) obj;
                i.g(it, "$it");
                i.g(this$0, "this$0");
                i.g(this_apply, "$this_apply");
                i.g(isTomorrow, "$isTomorrow");
                if (it.getPosition() != 0) {
                    CourseDayModelV1 v10 = this$0.v(i10 - 1);
                    if (v10 != null && v10.getStart_date() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && it.getPosition() == this$0.f14380x + 1 && !this$0.f14381y) {
                        this$0.D.invoke(it, Boolean.TRUE);
                        return;
                    }
                }
                SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                boolean subscriptionEnabled = subscriptionPersistence.getSubscriptionEnabled();
                View view2 = this_apply.f2751a;
                if (subscriptionEnabled) {
                    Context context = view2.getContext();
                    if (isTomorrow.f23466u) {
                        str2 = "Available tomorrow!";
                    } else {
                        str2 = "Available later!";
                    }
                    Toast.makeText(context, str2, 0).show();
                } else {
                    Toast.makeText(view2.getContext(), "Unlock to access", 0).show();
                }
                String str4 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                bundle.putString("plan_card_variant", "multi");
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str = user.getCurrentCourseName();
                } else {
                    str = null;
                }
                bundle.putString("course", str);
                bundle.putBoolean("subscriptionEnabled", subscriptionPersistence.getSubscriptionEnabled());
                bundle.putInt(Constants.DAYMODEL_POSITION, it.getPosition());
                bundle.putBoolean("future_card_click", true);
                bundle.putBoolean("sneak_peak_preview", false);
                k kVar = k.f19476a;
                gk.a.b(bundle, "my_plan_click");
                return;
            case 1:
                bm.b this$02 = (bm.b) obj4;
                FirestoreGoal goal = (FirestoreGoal) obj3;
                x dayOffset = (x) obj2;
                u isTracked = (u) obj;
                i.g(this$02, "this$0");
                i.g(goal, "$goal");
                i.g(dayOffset, "$dayOffset");
                i.g(isTracked, "$isTracked");
                Integer num = (Integer) dayOffset.f23469u;
                boolean z12 = isTracked.f23466u;
                boolean b10 = i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                b.c cVar = this$02.f4408z;
                if (b10) {
                    if (num != null) {
                        if (num.intValue() == 0) {
                            cVar.e(goal);
                            return;
                        } else if (num.intValue() > 0) {
                            if (z12) {
                                cVar.a();
                                return;
                            } else {
                                cVar.g(this$02.f4407y.getTime(), goal);
                                return;
                            }
                        } else if (num.intValue() < 0) {
                            if (z12) {
                                cVar.a();
                                return;
                            } else {
                                cVar.g(this$02.f4407y.getTime(), goal);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                cVar.e(goal);
                return;
            case 2:
                bm.d this$03 = (bm.d) obj4;
                FirestoreGoal goal2 = (FirestoreGoal) obj3;
                x dayOffset2 = (x) obj2;
                u isTracked2 = (u) obj;
                i.g(this$03, "this$0");
                i.g(goal2, "$goal");
                i.g(dayOffset2, "$dayOffset");
                i.g(isTracked2, "$isTracked");
                Integer num2 = (Integer) dayOffset2.f23469u;
                boolean z13 = isTracked2.f23466u;
                boolean b11 = i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                d.b bVar = this$03.A;
                if (b11) {
                    if (num2 != null) {
                        if (num2.intValue() == 0) {
                            bVar.e(goal2);
                            return;
                        } else if (num2.intValue() > 0) {
                            if (z13) {
                                bVar.a();
                                return;
                            } else {
                                bVar.f(goal2, this$03.f4432z.getTime());
                                return;
                            }
                        } else if (num2.intValue() < 0) {
                            if (z13) {
                                bVar.a();
                                return;
                            } else {
                                bVar.f(goal2, this$03.f4432z.getTime());
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                bVar.e(goal2);
                return;
            case 3:
                ConstraintLayout cardView = (ConstraintLayout) obj4;
                g1 this$04 = (g1) obj3;
                ArrayList faqQuestions = (ArrayList) obj2;
                Dialog dialog = (Dialog) obj;
                int i11 = g1.B;
                i.g(cardView, "$cardView");
                i.g(this$04, "this$0");
                i.g(faqQuestions, "$faqQuestions");
                i.g(dialog, "$dialog");
                if (((RobertoTextView) cardView.findViewById(R.id.faqText)).getVisibility() == 0) {
                    ((RobertoTextView) cardView.findViewById(R.id.faqText)).setVisibility(8);
                    this$04.I(cardView);
                } else {
                    ((RobertoTextView) cardView.findViewById(R.id.faqText)).setVisibility(0);
                    this$04.I(cardView);
                    if (i10 == faqQuestions.size() - 1) {
                        new Handler().postDelayed(new dl.d(dialog, 4), 250L);
                    }
                    z11 = true;
                }
                String str5 = gk.a.f16573a;
                Bundle f = e.f("variant", "0", "package", "plus");
                f.putString("screen", this$04.f26497z);
                f.putInt("itemNo", i10);
                if (z11) {
                    str3 = "open";
                } else {
                    str3 = "close";
                }
                f.putString("status", str3);
                k kVar2 = k.f19476a;
                gk.a.b(f, "monetization_faq_item_click");
                return;
            case 4:
                x selectedOptions = (x) obj4;
                String tt2 = (String) obj3;
                k4 this$05 = (k4) obj2;
                FrameLayout noneOfThese = (FrameLayout) obj;
                int i12 = k4.f18677x;
                i.g(selectedOptions, "$selectedOptions");
                i.g(tt2, "$tt");
                i.g(this$05, "this$0");
                i.g(noneOfThese, "$noneOfThese");
                if (((HashSet) selectedOptions.f23469u).contains(tt2)) {
                    this$05.M(i10);
                    ((HashSet) selectedOptions.f23469u).remove(tt2);
                    return;
                }
                ((HashSet) selectedOptions.f23469u).add(tt2);
                View childAt = ((LinearLayout) this$05._$_findCachedViewById(R.id.lls108List)).getChildAt(i10);
                p activity = this$05.getActivity();
                i.d(activity);
                Object obj5 = g0.a.f16164a;
                ((RobertoTextView) e.g(activity, R.drawable.ic_check_box_orange_24dp, (ImageView) childAt.findViewById(R.id.chkBxSelected), childAt, R.id.tvLabel)).setFont("Lato-Bold.ttf");
                p activity2 = this$05.getActivity();
                i.d(activity2);
                ((RobertoTextView) childAt.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.title_high_contrast));
                Object tag = noneOfThese.getTag();
                i.e(tag, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) tag).booleanValue()) {
                    noneOfThese.setTag(Boolean.FALSE);
                    this$05.O(noneOfThese);
                    return;
                }
                return;
            default:
                x selectedOptions2 = (x) obj4;
                ArrayList list1 = (ArrayList) obj3;
                r4 this$06 = (r4) obj2;
                HashMap params = (HashMap) obj;
                int i13 = r4.f19081w;
                i.g(selectedOptions2, "$selectedOptions");
                i.g(list1, "$list1");
                i.g(this$06, "this$0");
                i.g(params, "$params");
                try {
                    if (((HashSet) selectedOptions2.f23469u).contains(list1.get(i10))) {
                        ((HashSet) selectedOptions2.f23469u).remove(list1.get(i10));
                        this$06.O(i10);
                    } else if (((HashSet) selectedOptions2.f23469u).size() >= 2) {
                        if (params.containsKey("s113_error_2") && (!n.B0(UtilFunKt.paramsMapToString(params.get("s113_error_2"))))) {
                            Utils utils = Utils.INSTANCE;
                            p activity3 = this$06.getActivity();
                            i.d(activity3);
                            utils.showCustomToast(activity3, UtilFunKt.paramsMapToString(params.get("s113_error_2")));
                        } else {
                            Utils utils2 = Utils.INSTANCE;
                            p activity4 = this$06.getActivity();
                            i.d(activity4);
                            String string = this$06.getString(R.string.max_2_options_to_select);
                            i.f(string, "getString(R.string.max_2_options_to_select)");
                            utils2.showCustomToast(activity4, string);
                        }
                    } else {
                        ((HashSet) selectedOptions2.f23469u).add(list1.get(i10));
                        this$06.J(i10);
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$06.f19082u, "exception", e10);
                    return;
                }
        }
    }

    public /* synthetic */ c(x xVar, String str, k4 k4Var, int i6, FrameLayout frameLayout) {
        this.f14374u = 4;
        this.f14377x = xVar;
        this.f14378y = str;
        this.f14379z = k4Var;
        this.f14375v = i6;
        this.f14376w = frameLayout;
    }
}
